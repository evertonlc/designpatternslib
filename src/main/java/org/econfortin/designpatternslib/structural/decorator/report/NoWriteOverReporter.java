package org.econfortin.designpatternslib.structural.decorator.report;

import java.io.File;

/**
 * Created by evertonc on 16/08/2016.
 * Este cara vai ser um decorator do Report que adiciona a validação de arquivo existente.
 * Esta é a responsabilidade dele.
 */
public class NoWriteOverReporter implements Report {
    private final Report origin;

    NoWriteOverReporter(Report report) {
        this.origin = report;
    }

    @Override
    public void export(File file) {
        if(file.exists()) {
            throw new IllegalArgumentException("File already exists.");
        }
        this.origin.export(file);
    }
}
