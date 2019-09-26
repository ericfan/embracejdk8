package org.sample.lambda;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;

public class PopulateTest {

	protected Map<Integer, String> sampleMap;

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
}
