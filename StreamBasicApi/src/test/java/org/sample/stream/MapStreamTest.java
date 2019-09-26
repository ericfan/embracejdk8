package org.sample.stream;

import java.util.Random;

import org.junit.Test;
import org.sample.bean.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapStreamTest extends PopulateTest {

	/**
	 * map is also a intermediate oper, but it can be used to transfer the object type.
	 */
	@Test
	public void test() {
		objStreamList.stream().map(obj -> {
			Employee e = new Employee();
			e.setAnum(new Random().nextLong());
			e.setFullName(obj.getFirstName() + obj.getLastName());
			return e;
		}).forEach(o -> log.info(o.toString()));
	}

}
