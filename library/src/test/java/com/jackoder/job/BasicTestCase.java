package com.jackoder.job;

import android.util.Log;

import com.jackoder.job.base.BaseTestCase;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jackoder
 * @version 2015/12/30.
 */
public class BasicTestCase extends BaseTestCase {

    private static final String TAG = "BasicTestCase";

    @Test
    public void testEquals() {
        Log.d(TAG, "test equals");
        Assert.assertEquals(1 + 1, 2);
    }

    @Before
    public void setUp() throws Exception {
        configLog();
        //set up
    }

    @After
    public void tearDown() throws Exception {
        //tear down
    }
}
