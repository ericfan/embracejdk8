package org.sample.lambda;

import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReplaceAllMapTest extends PopulateTest{

	private static final Logger logger = LoggerFactory.getLogger(ReplaceAllMapTest.class);
	
	/**
	 * replace all the value in map with uppercase.
	 */
	@Test
	public void replaceAllValueForJdk7() {
		for(Map.Entry<Integer, String> entry : sampleMap.entrySet()){
			entry.setValue(entry.getValue().toUpperCase());
		}
		sampleMap.forEach((k,v) -> logger.info(v));
	}
	
	/**
	 * Amazing way in jdk8
	 */
	@Test
	public void replaceAllValueForJdk8() {
		sampleMap.replaceAll((k,v) -> v.toUpperCase());
		sampleMap.forEach((k,v) -> logger.info(v));
	}

}
