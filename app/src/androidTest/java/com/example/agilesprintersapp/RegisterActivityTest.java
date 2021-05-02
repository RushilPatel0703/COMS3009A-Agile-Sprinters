package com.example.agilesprintersapp;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.allOf;

public class RegisterActivityTest {

    @Rule
    public ActivityTestRule<RegisterActivity> registerActivityTestRule = new ActivityTestRule<>(
            RegisterActivity.class);


    private RegisterActivity registerActivity = null;

    @Before
    public void setUp() throws Exception {
        registerActivity = registerActivityTestRule.getActivity();
    }


    @Test
    public void testLaunchTextView7(){
        //View view = registerActivity.findViewById(R.id.textView7);
        onView(withId(R.id.textView7)).check(matches((isDisplayed())));
        //assertNotNull(view);
    }

    @Test
    public void testLaunchTextView11(){
        View view = registerActivity.findViewById(R.id.textView11);
        assertNotNull(view);
    }

    @Test
    public void testLaunchTextView16(){
        View view = registerActivity.findViewById(R.id.textView16);
        assertNotNull(view);
    }

    @Test
    public void testLaunchTextView9(){
        View view = registerActivity.findViewById(R.id.textView9);
        assertNotNull(view);
    }

    @Test
    public void testLaunchTextView8(){
        View view = registerActivity.findViewById(R.id.textView8);
        assertNotNull(view);
    }

    @Test
    public void testLaunchTextView10(){
        View view = registerActivity.findViewById(R.id.textView10);
        assertNotNull(view);
    }

    @Test
    public void testLaunchTextView12(){
        View view = registerActivity.findViewById(R.id.textView12);
        assertNotNull(view);
    }

    @Test
    public void testLaunchTextView13(){
        View view = registerActivity.findViewById(R.id.textView13);
        assertNotNull(view);
    }

    @Test
    public void testLaunchTextView6(){
        View view = registerActivity.findViewById(R.id.textView6);
        assertNotNull(view);
    }

    @Test
    public void testLaunchFirstNameTextView(){
        View view = registerActivity.findViewById(R.id.FName);
        assertNotNull(view);
    }

    @Test
    public void testLaunchLastNameTextView(){
        View view = registerActivity.findViewById(R.id.LName);
        assertNotNull(view);
    }

    @Test
    public void testLaunchEditTextUsername(){
        View view = registerActivity.findViewById(R.id.editTextUsername);
        assertNotNull(view);
    }

    @Test
    public void testLaunchEditTextEmailAddress(){
        View view = registerActivity.findViewById(R.id.editTextEmailAddress);
        assertNotNull(view);
    }

    @Test
    public void testLaunchEditTextPhone(){
        View view = registerActivity.findViewById(R.id.editTextPhone);
        assertNotNull(view);
    }

    @Test
    public void testLaunchEditTextTextPassword2(){
        View view = registerActivity.findViewById(R.id.editTextTextPassword2);
        assertNotNull(view);
    }

    @Test
    public void testLaunchEditTextTextPassword3(){
        View view = registerActivity.findViewById(R.id.editTextTextPassword3);
        assertNotNull(view);
    }

    @Test
    public void testLaunchCheckBoxPwd(){
        View view = registerActivity.findViewById(R.id.checkBoxPwd);
        assertNotNull(view);
    }

    @Test
    public void testLaunchButton2(){
        View view = registerActivity.findViewById(R.id.button2);
        assertNotNull(view);
    }

    @Test
    public void testLaunchButton4(){
        View view = registerActivity.findViewById(R.id.button4);
        assertNotNull(view);
    }


    @After
    public void tearDown() throws Exception {
        registerActivity = null;
    }
}
