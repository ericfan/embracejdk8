package org.sample.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

/**
 * To demonstrate how to use lambda in jdk8. also compare the difference with
 * jdk7 or apache commons-collections.
 * 
 * @author Eric.F
 * @since 20170504
 *
 */
public class ListInterfaceLambdaTest {

	private static final Logger logger = LoggerFactory.getLogger(ListInterfaceLambdaTest.class);

	private List<String> sampleStringList;

	@Before
	public void beforeTest() {
		sampleStringList = new ArrayList<>(Arrays.asList("You", "must", "be", "a", "professional", "guy"));
	}

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

	/**
	 * Iterator will operate the collection itself.
	 */
	@Test
	public void removeElementForJdk7() {
		Iterator<String> it = sampleStringList.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 3)
				it.remove();
		}
		Assert.assertEquals(4, sampleStringList.size());
	}

	/**
	 * lambda removeif also will operate the collection itself.
	 */
	@Test
	public void removeElementForJdk8() {
		sampleStringList.removeIf(str -> str.length() < 3);
		Assert.assertEquals(4, sampleStringList.size());
	}

	/**
	 * Apache collectionUtils will remove the elements that not satisfy the
	 * condition.
	 */
	@Test
	public void removeElementForApacheCommons() {
		CollectionUtils.filter(sampleStringList, new Predicate<String>() { // 删除长度大于3的元素
			@Override
			public boolean evaluate(String obj) {
				return obj.length() < 3;
			}
		});
		Assert.assertEquals(2, sampleStringList.size());
	}

}
