Feature: New User Registeration
  As a new user
  I should register
  to create my profile
  inorder to be able to do the bookings

  @issue #TES-4

  Scenario Outline:Create a new profile using a new emailId
    Given The user is on the newToursPage
    When The user clicks on the registration link
    And enters the <Name>,<Address>, <username> , <email> and <password> in the registration page
    Then the user profile is created successfully

    Examples:
      | Name | Address | username | email | password |
      | aaa  | aaa     | aaaa     | aaa   | aaaa     |
      | bbb  | bbb     | bbbb     | bbb   | bbbb     |
