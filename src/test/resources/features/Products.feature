Feature: Products


Scenario: Browse products

  Given the user is on the Online-Shop menu,
  When the user chose browse products in the menu,
  Then the user should be able to se a list of products.

Scenario: View product information

  Given the user sees the list of products,
  When the user select a specific product,
  Then the user should be able to see detailed information about the product.

