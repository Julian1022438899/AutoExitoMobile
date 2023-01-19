
@stories
Feature: App Exito Mobile
  I as a user enter the exito application,
  where I go to register in the Exito application,
  then I go to login in the Exito application,
  and add a product to the shopping cart.

  Background:
    Given that user to enter the exito application

  @Scenario1
  Scenario: Create a new user
    When he enters the information in the register form
    Then he verifies the register

  @Scenario2
  Scenario: Log in and agregate product
    When log in and I add a product to the shopping cart
    Then he verifies that the product was added to the shopping cart




