package com.org.MavenGroup.MavenArtifactID.Tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestRunner {
	
	static TestNG testNg;
	

	public static void main(String[] args) throws IOException 
	{
		testNg = new TestNG();		
		testNg.setTestClasses(new Class[] {SmokeTests.class});		
		testNg.run();
	}

}
