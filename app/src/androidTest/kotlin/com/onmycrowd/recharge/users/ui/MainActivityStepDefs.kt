package com.onmycrowd.recharge.users.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
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
        ActivityScenario.launch(MainActivity::class.java)
    }

    @When("the main activity is shown")
    fun the_main_activity_is_shown() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main_activity)).check(matches(isDisplayed()))
    }

    @Then("there should be a link to  sing in")
    fun there_should_be_a_link_to_sing_in() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withText("Sign Up")).check(matches(isDisplayed()))
    }

    @Then("there should be a link to sign up")
    fun there_should_be_a_link_to_sign_up() {
        ActivityScenario.launch(MainActivity::class.java)
    }
}