package com.cloudant.basictest;

import org.junit.Test;
import junit.framework.TestCase;
import java.lang.Override;
import android.test.AndroidTestCase;

public class BasicTest extends AndroidTestCase
{

    @Override
    protected void setUp() {
        android.util.Log.d("BasicTest", "******* START *******");
    }

    @Test
    public void testDTest1() {
        android.util.Log.d("BasicTest", "******* TEST *******");
    }
}
