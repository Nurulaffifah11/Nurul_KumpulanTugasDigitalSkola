Feature: Get Request Swagger

  Background:
    Given url "https://petstore.swagger.io/v2/"
    And print "======= This is Get Request ======="

  Scenario: User get list users page 1
    When path "/user/jpoole"
    And method get
    Then print response
    And status 200
