package org.sample.lambda;

import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoopMapTest extends PopulateTest{

	private static final Logger logger = LoggerFactory.getLogger(LoopMapTest.class);

	@Test
	public void loopMapForJdk7() {
		for (Map.Entry<Integer, String> entry : sampleMap.entrySet()) {
			logger.info(entry.getKey() + "-" + entry.getValue());
		}
	}

	@Test
	public void loopMapForJdk8() {
		sampleMap.forEach((k,v) -> logger.info(k + "- " + v));
	}

}
