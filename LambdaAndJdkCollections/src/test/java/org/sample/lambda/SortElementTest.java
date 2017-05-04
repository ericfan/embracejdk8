package org.sample.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortElementTest {

	private List<String> sampleStringList;

	private static final Logger logger = LoggerFactory.getLogger(SortElementTest.class);

	@Before
	public void beforeTest() {
		sampleStringList = new ArrayList<>(Arrays.asList("You", "must", "be", "a", "professional", "guy"));
	}

	/**
	 * Collections sort method will sort the list element uppercase firstly.
	 */
	@Test
	public void sortElementForJdk7() {
		Collections.sort(sampleStringList);
		Assert.assertEquals(6, sampleStringList.size());
		sampleStringList.forEach(str -> {logger.info(str);});
	}
	
	/**
	 * 
	 */
	@Test
	public void sortElementForJdk8() {
		sampleStringList.sort((str1, str2) -> str1.toLowerCase().compareTo(str2.toLowerCase()));
		Assert.assertEquals(6, sampleStringList.size());
		sampleStringList.forEach(str -> {logger.info(str);});
	}
	
}
