package com.leandro.submarine.submarine;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SubmarineDirectionTest.class, SubmarineMoveDownTest.class, SubmarineMoveUpTest.class,
                SubmarineNavigateInXAxisTest.class, SubmarineNavigateInXYAxisTest.class, SubmarineNavigateInYAxisTest.class,
                SubmarineNegativeMovementInXAxisTest.class,
                SubmarineNegativeMovementInYAxisTest.class, SubmarinePositiveMovementInXAxisTest.class, SubmarinePositiveMovementInYAxisTest.class,
                SubmarineBuscapeTest.class })
public class SubmarineTestSuit {

}
