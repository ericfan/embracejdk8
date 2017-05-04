package org.sample.lambda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ComputeIfAbsentMapTest extends PopulateTest{

	/**
	 * similar with merge method...
	 */
	@Test
	public void computeIfAbsentMapForJdk8() {
		sampleMap.computeIfAbsent(1, v -> "lalala");
		Assert.assertEquals("u", sampleMap.get(1));
		
		sampleMap.computeIfAbsent(8, v -> "8888");
		Assert.assertEquals("8888", sampleMap.get(8));
		
		//cannot do other operation if you put primary object in computeIfAbsent...
		sampleMap.computeIfAbsent(9, v -> "lalala").toUpperCase();
		Assert.assertEquals("lalala", sampleMap.get(9));
		
		//actually, computeifAbsent will used in initialize the complex data structure in map.
		Map<Integer, Set<String>> map = new HashMap<>();
		map.computeIfAbsent(1, v -> new HashSet<String>()).add("one");
		Assert.assertTrue(map.get(1).contains("one"));
		
		map.computeIfAbsent(1, v -> new HashSet<String>()).add("two");
		Assert.assertTrue(map.get(1).contains("two"));
	}
	
	

}
