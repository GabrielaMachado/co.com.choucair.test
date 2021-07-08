# Autor: User

  @stories
  Feature: uTest
    As a user, I want to register on the uTest page
    @scenario1
    Scenario: Create a new user on uTest
      Given than User wants to register on the uTest page
      When he find and fill out the form
      | firstName | lastName  |           email         | month     | day |year  | zip    | password           |
      |Gabriela   | Machado   | gabimachadop@hotmail.com| September | 19  | 1999 | 630002 | Gabriela199Machado |
      Then he login and enter to the page