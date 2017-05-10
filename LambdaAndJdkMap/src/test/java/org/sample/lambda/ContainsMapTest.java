package org.sample.lambda;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContainsMapTest extends PopulateTest {

	/**
	 * need to check nullpoint when you get value with key from a map for jdk7.
	 */
	@Test(expected = NullPointerException.class)
	public void containsKeyForJdk7Exception() {
		sampleMap.get(8).toString();
	}

	@Test
	public void containsKeyForJdk7() {
		if (sampleMap.containsKey(8)) {
			log.info(sampleMap.get(8));
		} else {
			log.info("DefaultValue");
		}
	}

	@Test
	public void containsKeyForJdk8() {
		Assert.assertEquals("DefaultValue", sampleMap.getOrDefault(8, "DefaultValue"));
	}

}
