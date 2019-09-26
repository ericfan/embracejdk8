package org.sample.stream;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DistinctStreamTest extends PopulateTest {

	/**
	 * distinct is a intermediate oper.
	 */
	@Test
	public void test() {
		this.strStreamList.stream().distinct().forEach(str -> log.info(str));
	}

}
