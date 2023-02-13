@smoke
  Feature: F05_HoverCategories Hover over a category to select a sub category
    Scenario: User hovers over the category and selects a sub category
      Given User hovers over a random the category
      When User clicks on one of the sub categories
      Then User is navigated to the sub category page


