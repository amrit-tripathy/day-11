package com.grayMatter;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//whatever test classes you have mentioned in suiteclass(in parameters ) everything will be executed

@SuiteClasses({AppTest.class,CalculatorTest.class})
@IncludeCategory(MarkerInterface.class)
@RunWith(Categories.class)
public class TestRunner {

}
