@smoke
  Feature: User can add products to the wishlist
    Scenario: Add product to wishlist
      When user clicks on wishlist button
      Then product is added to wishlist

    Scenario: Add product to wishlist Qty
      When user clicks on wishlist button
      Then product is added to wishlist and Qty updated