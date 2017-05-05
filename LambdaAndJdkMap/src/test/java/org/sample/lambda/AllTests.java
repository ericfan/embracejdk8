package org.sample.lambda;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComputeIfAbsentMapTest.class, ComputeIfPresentMapTest.class, ContainsMapTest.class, LoopMapTest.class,
		MergeMapTest.class, PutMapTest.class, RemoveMapTest.class, ReplaceAllMapTest.class, ReplaceMapTest.class })
public class AllTests {

}
