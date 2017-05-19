package org.sample.stream;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FilterStreamTest extends PopulateTest {

	@Test
	public void test() {
		objStreamList.stream().filter(obj -> obj.getFirstName().equals("Eric"))
				.forEach(obj -> log.info(obj.toString()));
	}

}
