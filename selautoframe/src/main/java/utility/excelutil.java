package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil {
	public static Object[][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount - 1][colCount];
        for (int i = 1; i < rowCount; i++) { // skip header row
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                if (cell == null) {
                    data[i - 1][j] = "";  // default empty string for blank cells
                } else {
                    data[i - 1][j] = cell.toString();
                }
            }
        }
        workbook.close();
        fis.close();
        return data;
    }
}


