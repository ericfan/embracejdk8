package org.sample.stream;

import java.util.stream.Stream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoopStreamTest extends PopulateTest {

	private static final Logger logger = LoggerFactory.getLogger(LoopStreamTest.class);

	@Test
	public void loopIntStreamTest() {
		intStreamList.stream().forEach(i -> logger.info(String.valueOf(i)));
	}

	@Test
	public void loopLongStreamTest() {
		longStreamList.stream().forEach(l -> logger.info(String.valueOf(l)));
	}

	@Test
	public void loopObjectStreamTest() {
		objStreamList.stream().forEach(obj -> logger.info(obj.toString()));
	}

	/**
	 * results will be [1,2,3,....] actually it will just print the object
	 * itself, stream will not loop the list element.
	 */
	@Test
	public void commonLoopStreamTest() {
		Stream.of(intStreamList).forEach(i -> logger.info(String.valueOf(i)));
		Stream.of(longStreamList).forEach(l -> logger.info(String.valueOf(l)));
		Stream.of(doubleStreamList).forEach(d -> logger.info(String.valueOf(d)));
	}

}
