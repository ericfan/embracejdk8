package org.sample.lambda;

import org.junit.Assert;
import org.junit.Test;


public class ComputeIfPresentMapTest extends PopulateTest{

	@Test
	public void computeIfPresentMapTest() {
		sampleMap.computeIfPresent(8, (k,v) -> v.toUpperCase());
		Assert.assertEquals(7, sampleMap.size());
		
		sampleMap.computeIfPresent(1, (k,v) -> "test");
		Assert.assertEquals("test", sampleMap.get(1));
	}

}
