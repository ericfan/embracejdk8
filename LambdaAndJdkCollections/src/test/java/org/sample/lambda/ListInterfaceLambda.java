package org.sample.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

public class ListInterfaceLambda {

	Logger logger = Logger.getAnonymousLogger();

	private List<String> sampleStringList = new ArrayList<>(
			Arrays.asList("You", "must", "be", "a", "professional", "guy"));

	@Test
	public void loopListForJdk7() {
		for (String str : sampleStringList) {
			if (str.length() < 4)
				logger.log(Level.INFO, str);
		}
	}

	@Test
	public void loopListForJdk8() {
		sampleStringList.forEach(str -> {
			if (str.length() > 4)
				logger.log(Level.INFO, str);
		});
	}

}
