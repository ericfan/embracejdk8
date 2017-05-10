package org.sample.lambda;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortElementTest extends PopulateTest{

	/**
	 * Collections sort method will sort the list element uppercase firstly.
	 */
	@Test
	public void sortElementForJdk7() {
		Collections.sort(sampleStringList);
		Assert.assertEquals(6, sampleStringList.size());
		sampleStringList.forEach(str -> {log.info(str);});
	}
	
	/**
	 * 
	 */
	@Test
	public void sortElementForJdk8() {
		sampleStringList.sort((str1, str2) -> str1.toLowerCase().compareTo(str2.toLowerCase()));
		Assert.assertEquals(6, sampleStringList.size());
		sampleStringList.forEach(str -> {log.info(str);});
	}
	
}
