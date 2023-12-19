Feature: Post Request Swagger

  Background:
    Given url "https://petstore.swagger.io/v2/"
    And print "======= This is Post Request ======="
    * def body = {"id": 10,"username": "jpoole","firstName": "Nurul","lastName": "A","email": "jpoole@gmail.com","password": "123","phone": "789","userStatus": 0}
    * def headers = {Accept: 'application/json'}

  Scenario: User get list users
    When path "/user"
    And request body
    And headers headers
    And method post
    Then status 200
    And print response

