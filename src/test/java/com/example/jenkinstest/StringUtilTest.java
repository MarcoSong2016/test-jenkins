package com.example.jenkinstest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Marco Song
 * @since 1.0.0
 */
public class StringUtilTest {

    @Test
    public void getUppercaseIsValid() {
        String result = StringUtil.getUpcase("hi");
        Assert.assertEquals("HI", result);
    }

//    @Test
//    public void getUppercaseIsNotValid() {
//        String result = StringUtil.getUpcase("hi");
//        Assert.assertEquals("hi", result);
//    }
}