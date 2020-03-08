package com.onmycrowd.recharge.users.ui

import android.content.Intent
import android.provider.ContactsContract
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables
import androidx.test.espresso.matcher.ViewMatchers.*
import com.onmycrowd.recharge.R
import com.onmycrowd.recharge.main.ui.MainActivity
import cucumber.api.PendingException
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class MainActivityStepDefs {
    private val activityScenario = ActivityScenario.launch(MainActivity::class.java)

    @Given("the app is opened by a not authenticated user")
    fun the_app_is_opened_by_a_not_authenticated_user() {
    }

    @When("the main activity is shown")
    fun the_main_activity_is_shown() {
        onView(withId(R.id.main_activity)).check(matches(isDisplayed()))
    }

    @Then("there should be a link to  sing in")
    fun there_should_be_a_link_to_sing_in() {
        onView(withText("Sign In")).check(matches(isDisplayed()))
    }

    @Then("there should be a link to sign up")
    fun there_should_be_a_link_to_sign_up() {
        onView(withText("Sign Up")).check(matches(isDisplayed()))
    }

    @Then("the sign in link is tapped")
    fun the_sign_in_link_is_tapped() {
        onView(withId(R.id.signin)).perform(click())

        //val receivedIntent = Iterables.getOnlyElement(Intents.getIntents());
        //assertThat(receivedIntent).hasAction(Intent.ACTION_CALL)
    }

    @Then("the sign in activity should be shown")
    fun the_sign_in_activity_should_be_shown() {
    }
}