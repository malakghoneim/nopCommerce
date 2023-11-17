@smoke
  Feature: Search
    Scenario Outline: search using product name
      Given user navigates to home page
      When searching for product using product name "<productname>"
      Then search shows relevant results "<productname>"
      Examples:
        | productname |
        | book        |
        | laptop      |
        | nike        |

    Scenario Outline: search using product sku
      Given user navigates to home page
      When searching for product using product sku "<productsku>"
      Then search shows relevant products "<productsku>"
      Examples:
        | productsku |
        | SCI_FAITH  |
        | APPLE_CAM  |
        | SF_PRO_11  |
