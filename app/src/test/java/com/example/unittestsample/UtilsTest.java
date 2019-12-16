package com.example.unittestsample;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Test
    public void testIsEmailValid(){
        String email="sureshpgg1@gmail.com";

        Assert.assertThat(String.format("Email Validity Test failed for %s ", email),Utils.checkEmailForValidity(email),is(true));

    }

    @Test
    public void testCheckDateWasConvertedCorrectly() {
        long inMillis = System.currentTimeMillis();
        Date date = Utils.calendarDate(inMillis);
        assertEquals("Date time in millis is wrong",
                inMillis * 100, date.getTime());
    }
    @Test
    public void testEmailValidityPartTwo() {
        String testEmail = "   sureshpgg1@gmail.com  ";
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), Utils.checkEmailForValidity(testEmail), is(true));
    }
}
