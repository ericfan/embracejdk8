package org.sample.newdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateStringConvertTest {

	@Test
	public void simpleStringToDateTest() {
		// must start with 0 if less than 10 as default
		String str = "2017-05-23";
		LocalDate date = LocalDate.parse(str);
		Assert.assertEquals("2017-05-23", date.toString());
		log.info(date.toString());
	}

	@Test
	public void simpleStringToDateTimeTest() {
		String str = "2017-04-01T03:41:02";
		LocalDateTime dateTime = LocalDateTime.parse(str);
		log.info(dateTime.toString());
	}

	@Test
	public void customDateFormatTest() {
		String str1 = "2017/04/02";
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date1 = LocalDate.parse(str1, df1);
		log.info(date1.toString());
		
		String str2 = "2017/4/9";
		String str3 = "2017/11/21";
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy/M/d");
		LocalDate date2 = LocalDate.parse(str2, df2);
		LocalDate date3 = LocalDate.parse(str3, df2);
		log.info(date2.toString());
		log.info(date3.toString());
		
		
	}

}
