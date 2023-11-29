
Scenario: Return a product

  Given that the user has a previous order,
  When the user initiates a return for a specific product,
  Then the user should receive confirmation and information about the return process.


Scenario: Receive Refund for a Return

 Given that the return has been approved,
 When the user selects a refund as the desired resolution,
 Then the user should receive confirmation and see that the refund is in progress.





