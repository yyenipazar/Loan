@web
Feature: LoanManager feature

  @loanManager
  Scenario: Verify results that is selected a loan status

    When I login to the Loan manager page
    And I verify "Loans",Profile picture,"New Loan","Reports","Loan Status" is enabled
    And I verify "Loans",Profile picture,"New Loan","Reports","Loan Status" is displayed
    And I select "Approved" as the loan status
    Then I validate amount of Approved loan status is 59
    Then All results that loans displayed are with status approved


