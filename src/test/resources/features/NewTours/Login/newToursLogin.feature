Feature: Login to NewTour
  As a customer
  I want to be able
  to login using my own profile
  if the credentials are correct

@issue: TES-3
  Scenario Outline: Login to new Tours profile
    When the user logs in using <userid> and <password>
    Then the user is logged in with <login-status> to the newTours
    Examples:
      | userid                      | password | login-status     |
      | abhay.kumar.rai@gmail.com | success  | successful_login |
      | abhay.kumar.rai@zapak.com   | success  | failed_login     |