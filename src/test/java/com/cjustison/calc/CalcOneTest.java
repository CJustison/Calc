package com.cjustison.calc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcOneTest {
    
@Test
    public void CheckAdd() {
       CalcOne calcone = new CalcOne(6, 2);
       int result = calcone.getResultAdd();
       assertTrue("Result(" + result + ") not equal to 8", result == 8);
    }

@Test
    public void CheckSub() {
       CalcOne calcone = new CalcOne(6, 2);
       int result = calcone.getResultSub();
       assertTrue("Result(" + result + ") not equal to 4", result == 4);
    }
@Test
    public void CheckMult() {
       CalcOne calcone = new CalcOne(6, 2);
       int result = calcone.getResultMult();
       assertTrue("Result(" + result + ") not equal to 12", result == 12);
    }
@Test
    public void CheckDiv() {
       CalcOne calcone = new CalcOne(6, 2);
       int result = calcone.getResultDiv();
       assertTrue("Result(" + result + ") not equal to 3", result == 3);
    }
}