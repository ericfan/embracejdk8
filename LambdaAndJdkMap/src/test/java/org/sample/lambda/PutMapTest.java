package org.sample.lambda;

import org.junit.Assert;
import org.junit.Test;

public class PutMapTest extends PopulateTest {

	/**
	 * if you use default put method in jdk, it will replace the value with
	 * specified key.
	 */
	@Test
	public void putKeyForJdk7() {
		sampleMap.put(1, "she");
		Assert.assertEquals("she", sampleMap.get(1));
	}
	
	@Test
	public void putKeyForJdk8() {
		//putIfAbsent will not replace the value if key is already exist.
		sampleMap.putIfAbsent(1, "she");
		Assert.assertEquals("u", sampleMap.get(1));
		
		sampleMap.putIfAbsent(8, "hello");
		Assert.assertEquals("hello", sampleMap.get(8));
	}

}
