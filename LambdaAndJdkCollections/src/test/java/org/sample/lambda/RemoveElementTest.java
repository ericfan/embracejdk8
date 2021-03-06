package org.sample.lambda;

import java.util.Iterator;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest extends PopulateTest{
	
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
	 * Apache collectionUtils filter method will filter the list with evaluate condition.
	 */
	@Test
	public void removeElementForApacheCommons() {
		CollectionUtils.filter(sampleStringList, new Predicate<String>() {
			@Override
			public boolean evaluate(String obj) {
				return obj.length() < 3;
			}
		});
		//be, a will be left
		Assert.assertEquals(2, sampleStringList.size());
	}

	/**
	 * lambda removeif also will operate the collection itself.
	 */
	@Test
	public void removeElementForJdk8() {
		sampleStringList.removeIf(str -> str.length() < 3);
		// be, a will be removed
		Assert.assertEquals(4, sampleStringList.size());
	}

}
