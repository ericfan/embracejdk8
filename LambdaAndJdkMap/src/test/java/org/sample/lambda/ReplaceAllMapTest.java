package org.sample.lambda;

import java.util.Map;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReplaceAllMapTest extends PopulateTest{

	/**
	 * replace all the value in map with uppercase.
	 */
	@Test
	public void replaceAllValueForJdk7() {
		for(Map.Entry<Integer, String> entry : sampleMap.entrySet()){
			entry.setValue(entry.getValue().toUpperCase());
		}
		sampleMap.forEach((k,v) -> log.info(v));
	}
	
	/**
	 * Amazing way in jdk8
	 */
	@Test
	public void replaceAllValueForJdk8() {
		sampleMap.replaceAll((k,v) -> v.toUpperCase());
		sampleMap.forEach((k,v) -> log.info(v));
	}

}
