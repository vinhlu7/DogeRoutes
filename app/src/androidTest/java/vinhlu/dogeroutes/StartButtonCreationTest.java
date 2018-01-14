package vinhlu.dogeroutes;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;


/**
 * Created by vinhlu on 12/24/17.
 */

@RunWith(AndroidJUnit4.class)
public class StartButtonCreationTest {
    @Rule
    public ActivityTestRule<WalkActivity> walkActivityTestRule =
            new ActivityTestRule<>(WalkActivity.class);

    @Test
    public void createStartButton() {
        onView(withId(R.id.startStopButton)).perform(click());
        onView(withId(R.id.startStopButton)).check(matches(withContentDescription("stop")));
        onView(withId(R.id.startStopButton)).perform(click());
        onView(withId(R.id.startStopButton)).check(matches(withContentDescription("start")));
    }

}