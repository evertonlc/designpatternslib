package org.econfortin.designpatternslib.structural.decorator.report;

import java.io.File;

/**
 * Created by evertonc on 16/08/2016.
 * Este cara vai ser um decorator do Report que adiciona a validação de arquivo nulo.
 * Esta é a responsabilidade dele.
 */
public class NotNullReporter implements Report {
    private final Report origin;

    public NotNullReporter(Report report) {
        this.origin = report;
    }

    @Override
    public void export(File file) {
        if(file == null) {
            throw new IllegalArgumentException("Null file.");
        }
        this.origin.export(file);
    }
}
