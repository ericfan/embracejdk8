package org.sample.lambda;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceElementTest extends PopulateTest{

	@Test
	public void replaceElementForApacheCommons() {
		CollectionUtils.transform(sampleStringList, new Transformer<String, String>() {
			@Override
			public String transform(String input) {
				if (input.length() > 3)
					return input.toUpperCase();
				return input;
			}

		});
		Assert.assertEquals(6, sampleStringList.size());
		Assert.assertEquals("MUST", sampleStringList.get(1));
	}
	
	@Test
	public void replaceElementForJdk8(){
		sampleStringList.replaceAll(str -> {
			if(str.length()>3)
				return str.toUpperCase();
			return str;
		});
		Assert.assertEquals(6, sampleStringList.size());
		Assert.assertEquals("MUST", sampleStringList.get(1));
	}
	
	

}
