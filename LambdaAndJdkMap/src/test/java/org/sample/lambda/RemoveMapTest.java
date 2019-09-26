package org.sample.lambda;

import org.junit.Assert;
import org.junit.Test;

public class RemoveMapTest extends PopulateTest{

	/**
	 * 
	 */
	@Test
	public void removeKeyForJdk7() {
		sampleMap.remove(1);
		Assert.assertEquals(6, sampleMap.size());
	}
	
	/**
	 * remove(key, value) is a new method added in jdk8.
	 */
	@Test
	public void removeKeyForJdk8() {
		sampleMap.remove(1, "test");
		Assert.assertEquals(7, sampleMap.size());
		
		sampleMap.remove(1, "u");
		Assert.assertEquals(6, sampleMap.size());
	}

}
