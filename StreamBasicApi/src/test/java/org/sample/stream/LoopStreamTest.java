package org.sample.stream;

import java.util.stream.Stream;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoopStreamTest extends PopulateTest {

	@Test
	public void loopIntStreamTest() {
		intStreamList.stream().forEach(i -> log.info(String.valueOf(i)));
	}

	@Test
	public void loopLongStreamTest() {
		longStreamList.stream().forEach(l -> log.info(String.valueOf(l)));
	}

	@Test
	public void loopObjectStreamTest() {
		objStreamList.stream().forEach(obj -> log.info(obj.toString()));
	}

	/**
	 * results will be [1,2,3,....] actually it will just print the object
	 * itself, stream will not loop the list element.
	 */
	@Test
	public void commonLoopStreamTest() {
		Stream.of(intStreamList).forEach(i -> log.info(String.valueOf(i)));
		Stream.of(longStreamList).forEach(l -> log.info(String.valueOf(l)));
		Stream.of(doubleStreamList).forEach(d -> log.info(String.valueOf(d)));
	}

}
