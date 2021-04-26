Feature: Login

  @login
  Scenario: Login with facebook Test Automation Case Study-1 (Web)

    Given user navigates to url
    And user clicks Giris Yap
    Then user clicks Facebook ile giris yap
#    Then user accepts all cookies in the new page
    And user enters email and password and clicks login
#    Then if it is first time user clicks $userName olarak devam et
#    Then user clicks Uyelik Sözlesmesi sartlarını okudum ve kabul ediyorum
    And verify that user logged in successfully
