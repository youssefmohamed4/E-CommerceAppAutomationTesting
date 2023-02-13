@smoke
Feature: User follows the website's social media profiles
  Scenario: User navigates to the Facebook to follow the page
    When User clicks the facebook logo
    Then User is directed to the "https://www.facebook.com/nopCommerce" facebook page

  Scenario: User navigates to the Facebook to follow the page
    When User clicks the twitter logo
    Then User is directed to the "https://twitter.com/nopCommerce" twitter page

  Scenario: User navigates to the Facebook to follow the page
    When User clicks the rss logo
    Then User is directed to the "https://demo.nopcommerce.com/new-online-store-is-open" rss page

  Scenario: User navigates to the Facebook to follow the page
    When User clicks the youtube logo
    Then User is directed to the "https://www.youtube.com/user/nopCommerce" youtube page