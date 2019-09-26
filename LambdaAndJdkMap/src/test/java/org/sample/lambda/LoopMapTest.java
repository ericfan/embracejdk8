package org.sample.lambda;

import java.util.Map;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoopMapTest extends PopulateTest{

	@Test
	public void loopMapForJdk7() {
		for (Map.Entry<Integer, String> entry : sampleMap.entrySet()) {
			log.info(entry.getKey() + "-" + entry.getValue());
		}
	}

	@Test
	public void loopMapForJdk8() {
		sampleMap.forEach((k,v) -> log.info(k + "- " + v));
	}

}
