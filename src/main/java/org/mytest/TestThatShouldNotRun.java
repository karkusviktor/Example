package org.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestThatShouldNotRun {

    @Test
    public void testThatShouldNotRun()
    {
        Assert.fail("It should NOT run.");
    }
}
