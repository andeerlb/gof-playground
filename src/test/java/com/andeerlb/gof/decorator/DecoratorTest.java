package com.andeerlb.gof.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecoratorTest {

    @DisplayName("Should check if decorators applied corretly")
    @Test
    void shouldCheckDecoratorsAppliedCorrectly() {
        Datasource fileDataSource = new FileDataSource("test.txt");

        Datasource decorated = new CompressionDecorator(
                new EncryptionDecorator(fileDataSource));

        decorated.writeData("PII data");

        String resultado = decorated.readData();

        assertTrue(resultado.contains("DECOMPRESSED"), "Data must be decompressed");
        assertTrue(resultado.contains("DECRYPTED"), "Data must be decrypted");
    }
}
