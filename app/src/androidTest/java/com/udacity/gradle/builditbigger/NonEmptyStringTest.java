package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(AndroidJUnit4.class)
public class NonEmptyStringTest {

    @Test
    public void testJoke() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext ();

        String result = null;

        try {
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask (appContext);
            endpointsAsyncTask.execute ();
            result = endpointsAsyncTask.get (30, TimeUnit.SECONDS);
            assertNotNull (result, notNullValue());
            assertTrue(result.length () > 0);

        } catch (Exception e) {
            fail("Operation timed out");
        }
    }
}