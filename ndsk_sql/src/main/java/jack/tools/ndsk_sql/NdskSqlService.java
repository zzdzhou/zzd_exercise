package jack.tools.ndsk_sql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NdskSqlService {

    private String sourceExcelName;
    public final static String xlsxSuffix = ".xlsx";

    public void xlsxToSql() {
        // check the excel format
        if (!sourceExcelName.endsWith(xlsxSuffix)) {
//            throw
            return;
        }
        try {

            new FileInputStream(sourceExcelName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
