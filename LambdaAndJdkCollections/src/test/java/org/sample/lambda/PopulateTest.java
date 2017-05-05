package org.sample.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;

public class PopulateTest {

	protected List<String> sampleStringList;

	@Before
	public void setup() {
		sampleStringList = new ArrayList<>(Arrays.asList("You", "must", "be", "a", "professional", "guy"));
	}
}
