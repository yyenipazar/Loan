@web
Feature: Login Feature

  Background:
    Given I am on login page

  @login
  Scenario: Verify valid login to LoadPro
    When I enter tomasg+betaagent2@simnang.com  into username field on the login page
    And  I enter LoginLp!334 into password field on the login page
    And  I click on login button on login page
    Then I verify that login button is enable at Login page
