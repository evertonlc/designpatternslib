package org.econfortin.designpatternslib.structural.decorator.report;

import java.io.File;

/**
 * Exemplo extraído de
 * http://www.yegor256.com/2016/01/26/defensive-programming.html
 */

/**
 * Created by evertonc on 16/08/2016.
 */
public interface Report {
    void export(File file);
}
