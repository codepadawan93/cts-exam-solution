package S4.G1078.KOVACS_ERIK_ROBERT.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

// This suite runs 3 tests, one from each case

@IncludeCategory(Include.class)
@RunWith(Categories.class)
@SuiteClasses({TestIsInspectionNecessary.class, TestSetNoDays.class, TestTotalCost.class})
public class SelectedTests {}
