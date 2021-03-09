Feature: Create new user account
  @WestMarineRegistration  @Birsen
  Scenario: Register with invalid credentials
    Given I am on the WestMarine website
    When I click on sign in button
    And I enter orhan@gmail.com into emailbox
    Then I enter 123 into passwordBox
    Then I want to see warning message

  @WestMarineSearch  @Birsen
    Scenario: I am able to search a required item
      Given I am on the WestMarine website
      When I type "women shoes" in search box
      Then I click search button
      Then I validate to women shoes department

    #mvn clean test verify -Dcucumber.options="--tags @WestMarine"