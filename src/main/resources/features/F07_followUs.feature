@smoke
  Feature: Follow us
    Scenario Outline: user opens follow us link
      Given user navigates to home page
      When clicking on link "<link>"
      Then url is changed "<url>"
      Examples:
        | link        | url                                                 |
        | facebook    |https://www.facebook.com/nopCommerce                 |
        | twitter     |https://twitter.com/nopCommerce                      |
        | rss         |https://demo.nopcommerce.com/new-online-store-is-open|
        |youtube      |https://www.youtube.com/user/nopCommerce             |