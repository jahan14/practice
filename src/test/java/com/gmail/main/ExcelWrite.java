package com.gmail.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite 
{
	public static void main(String[]args)
	{
	
		try
		{
			File file=new File("D:\\dataa.xlsx");
			
			FileInputStream fis=new FileInputStream(file);
			
			Workbook book=new XSSFWorkbook(fis);
			
			Sheet createSheet = book.createSheet("Saleem");
			
			Row createRow = createSheet.createRow(0);
			
			Cell createCell = createRow.createCell(0);
			
			createCell.setCellValue("ABULHASAN ASINAA");
			
			FileOutputStream fos=new FileOutputStream(file);
			
			book.write(fos);
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
