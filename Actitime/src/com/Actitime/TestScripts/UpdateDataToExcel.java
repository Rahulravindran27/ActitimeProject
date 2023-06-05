package com.Actitime.TestScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpdateDataToExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./Testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	 wb.getSheet("Data").getRow(5).getCell(1).setCellValue("Modi");
	 FileOutputStream fos= new FileOutputStream("./Testdata/Testdata.xlsx");
	 wb.write(fos);
}}
