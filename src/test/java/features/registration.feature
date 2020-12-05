Feature: Sign Up
  Background:
    Given User is on HomePage
    When User navigates to RegistrationPage

  @Registration @Birsen
    Scenario Outline: Create a new user account following registration process
      When User enters <email> into email box on the registration page
      And User enters <firstname> into firstname box on the registration page
      And User enters <lastname> into lastname box on the registration page
      And User enters <password> into password box on the registration page
      And User enters <confirmPassword> into confirmPassword box on the registration page
      And User enters <phoneNumber> into phoneNumber box on the registration page
      Then User enters <address> into address box on the registration page
      And User enters <city> into city box on the registration page
      And User selects <state> from stateDropDownMenu
      And User enters <zipCode> into zipCode box on the registration page
      Then User selects <country> from countryDropDownMenu
      And User clicks on investor
      And User clicks on aggreementCheckBox
      And User clicks on understandCheckBox
      Then User checkmarks on captchaBox
      When User completes the signUp by clicking signUpButton
      Then User verifiyes the success registration

      Examples:
      |email                      |firstname|lastname |password   |confirmPassword|phoneNumber|address           |city   |state  |zipCode|country                 |
      |rhsneoyt@gmail.com|birsen   | yildirim|B5058yldrm.|B5058yldrm.    |1234567890 |123 Lincoln Street|Atlanta|Georgia|12345  |Unated States of America|
#Please change the email address for every test run



