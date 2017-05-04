package org.sample.lambda;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * To demonstrate how to use lambda in jdk8. also compare the difference with
 * jdk7 or apache commons-collections.
 * 
 * @author Eric.F
 * @since 20170504
 *
 */
public class LoopElementTest extends PopulateTest{

	private static final Logger logger = LoggerFactory.getLogger(LoopElementTest.class);

	/**
	 * Loop method using before jdk8
	 */
	@Test
	public void loopListForJdk7() {
		for (String str : sampleStringList) {
			if (str.length() < 4)
				logger.info(str);
		}
	}

	/**
	 * new foreach method in jdk8 with lambda.
	 */
	@Test
	public void loopListForJdk8() {
		sampleStringList.forEach(str -> {
			if (str.length() > 4)
				logger.info(str);
		});
	}

}
