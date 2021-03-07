package com.javaReactJsUploadAndStore.utils;

import com.javaReactJsUploadAndStore.entity.UserFileRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReadHelper {

    public static List<UserFileRow> excelToUserFileRowObject(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);

            //Can be modified to get data fron multiple sheets in excel file
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();

            List<UserFileRow> rowEntriesFromUserFile = new ArrayList<UserFileRow>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // Skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                UserFileRow userFile = new UserFileRow();

                int cellIndex = 0;

                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    switch (cellIndex) {
                        case 0:
                            userFile.setField1(currentCell.getStringCellValue());
                            break;

                        case 1:
                            userFile.setField2(currentCell.getStringCellValue());
                            break;

                        case 2:
                            userFile.setField3(currentCell.getStringCellValue());
                            break;

                        case 3:
                            userFile.setField4(currentCell.getStringCellValue());
                            break;

                        case 4:
                            userFile.setField5(currentCell.getStringCellValue());
                            break;

                        case 5:
                            userFile.setField6(currentCell.getStringCellValue());
                            break;

                        case 6:
                            userFile.setField7(currentCell.getStringCellValue());
                            break;

                        case 7:
                            userFile.setField8(currentCell.getStringCellValue());
                            break;

                        case 8:
                            userFile.setField9(currentCell.getStringCellValue());
                            break;

                        case 9:
                            userFile.setField10(currentCell.getStringCellValue());
                            break;


                        default:
                            break;
                    }

                    cellIndex++;
                }

                rowEntriesFromUserFile.add(userFile);
            }

            workbook.close();

            return rowEntriesFromUserFile;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }


}
