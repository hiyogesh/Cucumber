Feature: Bookcart Application Demo

  @Examples
  Scenario Outline: Add To Cart Should be Success
    Given user should be login by "<User name>" and "<Password>"
    And user search the book "<Book>"
    When user Add to Cart
    Then user get the updated badge

    Examples: 
      | User name | Password   | Book                                     |
      | Yogesh    | Yogesh@123 | Harry Potter and the Prisoner of Azkaban |
      | Yogesh    | Yogesh@123 | Rot & Ruin                               |
      | Yogesh    | Yogesh@123 | The Simple Wild                          |
