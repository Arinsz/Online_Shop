Feature: User Registration

Scenario: User Registration

  Given the user is on the registration page,
  When the user fills in valid registration details,
  Then an account should have been created and confirmation will be printed to the user.


Scenario: User login

  Given The user is on the login page,
  When the user fills in correct login details,
  Then the user should be able to login and get a login confirmation.

