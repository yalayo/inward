Feature: App's main activity
  The activity that handles what happens before and after authentication, registration of users

  Scenario: The app is opened
    Given the app is opened by a not authenticated user
    When the main activity is shown
    Then there should be a link to  sing in
    And there should be a link to sign up