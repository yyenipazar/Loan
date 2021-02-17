@web
Feature: Company Feature

  Background:
    Given I am on Company page

  @company
  Scenario: Verify that I can select a company name
    When I select a company name
    Then I verify that company selection is enabled
