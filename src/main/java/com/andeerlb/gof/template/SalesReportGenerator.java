package com.andeerlb.gof.template;

public class SalesReportGenerator extends ReportGenerator {

    @Override
    protected void processData() {
        System.out.println("Processing sales dat aggregating totals and computing trends...");
    }
}
