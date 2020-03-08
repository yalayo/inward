Feature: App's main activity
  The activity that handles what happens before and after authentication, registration of users

  Scenario: The app is opened
    Given the app is opened by a not authenticated user
    When the main activity is shown
    Then there should be a link to  sing in
    And there should be a link to sign up

  Scenario: The sing in button is clicked
    Given the main activity is shown
    When the sign in link is tapped
    Then the sign in activity should be shown