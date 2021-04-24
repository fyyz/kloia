Feature: Footer Links



  Scenario: Verify FooterLinks with the text file

    Given user navigates to url
    And user clicks Giris Yap
    Then user clicks Facebook ile giris yap
  #Then user accepts all cookies in the new page
    And user enters email and password and clicks login

    And Write all the links at the footer to the text file (About us, help, etc)
    When Click Brands (Markalar) at the footer
    Then Verify the footer links with the text file
