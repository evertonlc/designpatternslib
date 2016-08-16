package org.econfortin.designpatternslib.structural.decorator.report;

import org.junit.Test;

/**
 * Created by evertonc on 16/08/2016.
 */
public class ReportTestClass {

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarIllegalArgumentExceptionQuandoArquivoNulo() {
        /**
         * Agora é possível compor objetos para incrementar o comportamento de qualquer objeto report.
         */
        final Report report =
                new NotNullReporter(new DefaultReporter());
        report.export(null);
    }
}
