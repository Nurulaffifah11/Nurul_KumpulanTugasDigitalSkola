Feature: Delete Request Swagger

  Background: Preparation
    Given url "https://petstore.swagger.io/v2/"
    And print "======= This is Delete Request ======="

  Scenario: Test Delete data in regress
    When path '/user/nurul'
    And method delete
    Then status 404
    And print response