package org.sample.lambda;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * To demonstrate how to use lambda in jdk8. also compare the difference with
 * jdk7 or apache commons-collections.
 * 
 * @author Eric.F
 * @since 20170504
 *
 */
@Slf4j
public class LoopElementTest extends PopulateTest{

	/**
	 * Loop method using before jdk8
	 */
	@Test
	public void loopListForJdk7() {
		for (String str : sampleStringList) {
			if (str.length() < 4)
				log.info(str);
		}
	}

	/**
	 * new foreach method in jdk8 with lambda.
	 */
	@Test
	public void loopListForJdk8() {
		sampleStringList.forEach(str -> {
			if (str.length() > 4)
				log.info(str);
		});
	}

}
