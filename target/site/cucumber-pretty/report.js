$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Company.feature");
formatter.feature({
  "line": 2,
  "name": "Company Feature",
  "description": "",
  "id": "company-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 413333,
  "status": "passed"
});
formatter.before({
  "duration": 6573853203,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Company page",
  "keyword": "Given "
});
formatter.match({
  "location": "CompanySD.setCompanyPage()"
});
formatter.result({
  "duration": 8818548838,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify that I can select a company name",
  "description": "",
  "id": "company-feature;verify-that-i-can-select-a-company-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@company"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I select a company name",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify that company selection is enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "CompanySD.selectACompany()"
});
formatter.result({
  "duration": 3777265486,
  "status": "passed"
});
formatter.match({
  "location": "CompanySD.verifyEnableCompanySelection()"
});
formatter.result({
  "duration": 5344612022,
  "status": "passed"
});
formatter.after({
  "duration": 580684,
  "status": "passed"
});
formatter.after({
  "duration": 322673673,
  "status": "passed"
});
formatter.uri("LoanManager.feature");
formatter.feature({
  "line": 2,
  "name": "LoanManager feature",
  "description": "",
  "id": "loanmanager-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 285809,
  "status": "passed"
});
formatter.before({
  "duration": 2720513111,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify results that is selected a loan status",
  "description": "",
  "id": "loanmanager-feature;verify-results-that-is-selected-a-loan-status",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@loanManager"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I login to the Loan manager page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I verify \"Loans\",Profile picture,\"New Loan\",\"Reports\",\"Loan Status\" is enabled",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify \"Loans\",Profile picture,\"New Loan\",\"Reports\",\"Loan Status\" is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select \"Approved\" as the loan status",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I validate amount of Approved loan status is 59",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "All results that loans displayed are with status approved",
  "keyword": "Then "
});
formatter.match({
  "location": "LoanManagerSD.setLoanManagerPage()"
});
formatter.result({
  "duration": 11976841706,
  "status": "passed"
});
formatter.match({
  "location": "LoanManagerSD.enableLoansProfilepictureNewloanReportLoanStatus()"
});
formatter.result({
  "duration": 14827693837,
  "status": "passed"
});
formatter.match({
  "location": "LoanManagerSD.displayedLoansProfilepictureNewloanReportLoanStatus()"
});
formatter.result({
  "duration": 10135899632,
  "status": "passed"
});
formatter.match({
  "location": "LoanManagerSD.approvedLoanStatus()"
});
formatter.result({
  "duration": 7699369776,
  "status": "passed"
});
formatter.match({
  "location": "LoanManagerSD.validateAmount()"
});
formatter.result({
  "duration": 2036119083,
  "status": "passed"
});
formatter.match({
  "location": "LoanManagerSD.check()"
});
formatter.result({
  "duration": 24447905813,
  "status": "passed"
});
formatter.after({
  "duration": 180423,
  "status": "passed"
});
formatter.after({
  "duration": 300472088,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 154522,
  "status": "passed"
});
formatter.before({
  "duration": 2745458444,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.setLoginPage()"
});
formatter.result({
  "duration": 6961919,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify valid login to LoadPro",
  "description": "",
  "id": "login-feature;verify-valid-login-to-loadpro",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I enter tomasg+betaagent2@simnang.com  into username field on the login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter LoginLp!334 into password field on the login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button on login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify that login button is enable at Login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "tomasg+betaagent2@simnang.com ",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 44
    }
  ],
  "location": "LoginSD.enterDataUserAndPassField(String,String)"
});
formatter.result({
  "duration": 2302521638,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LoginLp!334",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 25
    }
  ],
  "location": "LoginSD.enterDataUserAndPassField(String,String)"
});
formatter.result({
  "duration": 2101829315,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.pressLoginButton()"
});
formatter.result({
  "duration": 2082780324,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.verifyEnableLoginButton()"
});
formatter.result({
  "duration": 5365705786,
  "status": "passed"
});
formatter.after({
  "duration": 183588,
  "status": "passed"
});
formatter.after({
  "duration": 303848976,
  "status": "passed"
});
});