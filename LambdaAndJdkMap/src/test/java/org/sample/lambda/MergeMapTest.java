package org.sample.lambda;

import org.junit.Assert;
import org.junit.Test;

/**
 * merge method is a new method introduced in jdk8 for map.
 * 
 * @author Eric.F
 *
 */
public class MergeMapTest extends PopulateTest {

	/**
	 * quite similar with oracle merge function.
	 */
	@Test
	public void mergeMapForJdk8() {
		sampleMap.merge(8, "!", (legacyV, newV) -> legacyV.concat(newV));
		Assert.assertEquals(8, sampleMap.size());
		Assert.assertEquals("!", sampleMap.getOrDefault(8, "DefaultValue"));

		sampleMap.merge(8, "aaa", (legacyV, newV) -> legacyV.concat(newV));
		Assert.assertEquals(8, sampleMap.size());
		Assert.assertEquals("!aaa", sampleMap.getOrDefault(8, "DefaultValue"));
	}

}
