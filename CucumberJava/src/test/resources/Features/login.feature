Feature: Login to OHRM Functionlity

  Scenario: Succsesfully Login with valid credintial
    Given User Launch chrome Browser
    When User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User enter email as "Admin" and password as "admin123"
    And User click on Login
