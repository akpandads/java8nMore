package com.collectors;

import org.junit.Assert;
import org.junit.Test;

public class TestMethodReference {

    @Test
    public void testMapToUpperCase(){
        String result = new MethodReferences().mapToUpperCase("abc");
        Assert.assertEquals("ABC",result);
    }
}
