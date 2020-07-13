#Author: cefit.pablo@gmail.com


Feature: I as a user of vivanda
  I want to add a product to the shopping cart
  

  Scenario: Add a product to the shopping cart and validate that it is added correctly
    Given User open website
    When I add a product to the shopping cart
    Then I should see that the product was added successfully