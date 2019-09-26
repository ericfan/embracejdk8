package org.sample.lambda;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceMapTest extends PopulateTest{

	/**
	 * we can use put method directly before jdk8 if we want to replace the
	 * value.
	 */
	@Test
	public void replaceValueForJdk7() {
		sampleMap.put(1, "she");
		Assert.assertEquals("she", sampleMap.get(1));
	}

	/**
	 * jdk8 introduce 2 new method.
	 * replace(K key, V value) 
	 * replace(K key, V oldValue, V newValue)
	 */
	@Test
	public void replaceValueForJdk8() {
		//replace(K key, V value) 
		sampleMap.replace(1, "her");
		Assert.assertEquals("her", sampleMap.get(1));
		sampleMap.replace(8, "hello");
		Assert.assertEquals(7, sampleMap.size());
		
		//replace(K key, V oldValue, V newValue)
		sampleMap.replace(2, "test", "oooo");
		Assert.assertEquals("r", sampleMap.get(2));
		sampleMap.replace(2, "r", "oooo");
		Assert.assertEquals("oooo", sampleMap.get(2));
	}

}
