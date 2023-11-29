Scenario: Add Product to the Shopping Cart

Given that the user has product ID.
When the user adds the product to the shopping cart with product ID,
Then the user should see a confirmation and an updated Shopping cart content.


Scenario: Change the Quantity of Products in the Shopping Cart

Given that the user is in the shopping cart,
When the user changes the quantity of a specific product,
Then the user should see the updated quantity of products in the shopping cart.