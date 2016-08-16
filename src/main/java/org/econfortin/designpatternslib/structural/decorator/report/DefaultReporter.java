package org.econfortin.designpatternslib.structural.decorator.report;

import java.io.File;

/**
 * Created by evertonc on 16/08/2016.
 * Este é o cara que vai ter o comportamento padrão de um Reporter, sem nenhuma validação.
 * Este é o objetivo desta classe, fazer o export.
 */
public class DefaultReporter implements Report {
    @Override
    public void export(File file) {
        // Export the report to the file
    }
}
