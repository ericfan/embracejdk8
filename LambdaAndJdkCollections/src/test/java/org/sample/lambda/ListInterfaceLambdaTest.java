package org.sample.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ListInterfaceLambdaTest {

	private static final Logger logger = LoggerFactory.getLogger(ListInterfaceLambdaTest.class);

	private List<String> sampleStringList = new ArrayList<>(
			Arrays.asList("You", "must", "be", "a", "professional", "guy"));

	@Test
	public void loopListForJdk7() {
		for (String str : sampleStringList) {
			if (str.length() < 4)
				logger.info(str);
		}
	}

	@Test
	public void loopListForJdk8() {
		sampleStringList.forEach(str -> {
			if (str.length() > 4)
				logger.info(str);
		});
	}

}
