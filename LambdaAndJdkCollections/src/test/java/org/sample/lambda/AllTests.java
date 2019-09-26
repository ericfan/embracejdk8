package org.sample.lambda;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoopElementTest.class, RemoveElementTest.class, ReplaceElementTest.class, SortElementTest.class })
public class AllTests {

}
