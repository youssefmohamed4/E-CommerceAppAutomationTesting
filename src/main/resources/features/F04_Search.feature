@smoke
  Feature: F04_Search | Users can search for the products they need
    Scenario Outline: User can search using product name
      Given user types a product name "<productName>" in search bar
      When user clicks search button
      Then search shows relevant product name "<productName>" results
      Examples:
        | productName |
        |book|
        |laptop|
        |nike|

    Scenario Outline: User can search using sku
      Given user types a sku "<sku>" in search bar
      When user clicks search button
      Then search shows relevant sku "<sku>" results
      Examples:
        | sku |
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|
