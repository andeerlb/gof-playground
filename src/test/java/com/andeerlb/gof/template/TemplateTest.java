package com.andeerlb.gof.template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class TemplateTest {
    private SalesReportGenerator spyReportGenerator;

    @BeforeEach
    void setUp() {
        spyReportGenerator = spy(new SalesReportGenerator());
    }

    @Test
    void testGenerateReportTemplatePattern() {
        spyReportGenerator.generateReport();

        verify(spyReportGenerator).fetchData();
        verify(spyReportGenerator).formatReport();
        verify(spyReportGenerator).exportReport();

        verify(spyReportGenerator).processData();
    }

    @Test
    void shouldCheckTemplateMethodStructure() {
        SalesReportGenerator customReport = spy(new SalesReportGenerator() {
            @Override
            protected void processData() {
                System.out.println("Custom processing of data...");
            }
        });

        customReport.generateReport();

        verify(customReport).processData();
        verify(customReport, times(1)).formatReport();
        verify(customReport, times(1)).exportReport();
    }
}
