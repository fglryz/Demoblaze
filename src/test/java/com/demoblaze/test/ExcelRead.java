package com.demoblaze.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    @Test
    public void read_from_excel_file() throws IOException {
        String path = "Sample Data.xlsx";
        //to read from excel we need to load to FileInput Stream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook>sheet>cell
        //<1>create workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        //<2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employee");
        //<3> select row and cell
        //print out marrys cell
        //indexes  start from 0
        System.out.println(sheet.getRow(1).getCell(0));

//print out developer
        System.out.println(sheet.getRow(3).getCell(2));
        //Return the count of used cells only
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        //return the number from top cell to buttom cell.it dodes not care cell is empty or not
        //start counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("lastUsedRow = " + lastUsedRow);

        //TODO:create a logic to print Vindo's name
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")) {
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }

         //TODO:create a logic to print Linda's jobID

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Linda")) {
                System.out.println("Linda's jon Id="+ sheet.getRow(rowNum).getCell(2));
            }

        }
    }
}