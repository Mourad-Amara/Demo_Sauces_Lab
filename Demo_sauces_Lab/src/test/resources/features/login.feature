Feature: User Login to Saucedemo website

  Scenario Outline: Successful login with valid credentials
    Given the user navigates to the login page
    When the user enters "<username>" and "<password>"
    And clicks on the login button
    Then the user should see the homepage

    Examples:
      | username       | password     |
      | standard_user  | secret_sauce |
      | problem_user   | secret_sauce |
      | performance_glitch_user | secret_sauce |