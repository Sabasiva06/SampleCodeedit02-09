package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.MediaSize.Other;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	@Test
	private void tc01() {
		System.out.println("Method 1");

	}

	@Test
	private void tc02() {
		Assert.assertTrue(false);
		System.out.println("Method 2");

	}

	@Test
	private void tc03() {
		System.out.println("Method 3");

	}

	@Test
	private void tc04() {
		System.out.println("Method 4");

	}

	@Test
	private void tc05() {
		System.out.println("Method 5");

	}

	@Test
	private void tc06() {
		System.out.println("Method 6");

	}

}
