package org.sample.lambda;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoopMapTest {

	private static final Logger logger = LoggerFactory.getLogger(LoopMapTest.class);

	private Map<Integer, String> sampleMap;

	@Before
	public void setup() {
		sampleMap = new HashMap<>();
		sampleMap.put(1, "u");
		sampleMap.put(2, "r");
		sampleMap.put(3, "not");
		sampleMap.put(4, "a");
		sampleMap.put(5, "girl");
		sampleMap.put(6, "without");
		sampleMap.put(7, "story");
	}

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
