package org.sample.lambda;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContainsMapTest extends PopulateTest {

	private static final Logger logger = LoggerFactory.getLogger(ContainsMapTest.class);

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
			logger.info(sampleMap.get(8));
		} else {
			logger.info("DefaultValue");
		}
	}

	@Test
	public void containsKeyForJdk8() {
		Assert.assertEquals("DefaultValue", sampleMap.getOrDefault(8, "DefaultValue"));
		;
	}

}
