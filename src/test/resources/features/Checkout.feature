Feature: Checkout

Scenario: Complete an Order


Given that the user is in the shopping cart,
When the user chose alternative Proceed to Checkout,
Then the user should be able to complete the order and receive an order confirmation.

Scenario: Enter Payment Information
Given that the user is on the payment page,
When the user fills in correct payment information,
Then the user should be able to complete the payment and receive a confirmation.