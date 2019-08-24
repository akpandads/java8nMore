package com.streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStreamClass {

    @Test
    public void testNumberOfLowerCharacher(){
        String testStr = "poiusQwerty";
        Assert.assertEquals(10,CommonOperations.getNumberOfLowerCaseChars(testStr));
    }

    @Test
    public void testStringWithMaxLowerCase(){
        String[] strArray = {"qwerty","as","ASDFghjklods"};
        List<String> stringList = Arrays.asList(strArray);
        Assert.assertEquals("ASDFghjklods",new CommonOperations().getStringWithMostLowerCaseCharachters(stringList));
    }
}
