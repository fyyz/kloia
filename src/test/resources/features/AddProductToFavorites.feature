Feature: Favorites

  @wip

  Scenario: Add product to the ‘Favorites’

  Given user navigates to url
  And user clicks Giris Yap
  Then user clicks Facebook ile giris yap
  #Then user accepts all cookies in the new page
  And user enters email and password and clicks login

  And user Navigate to Perfume & Deodorant under the Cosmetic & Personal Care tab.
  And Search for "Lacoste" in Brand filter
  And Select Lacoste
  And Click 7th product on the search result page
  When Add product to the ‘Favorites'
  And Navigate to Favorites
  Then Verify the product title is the same as with the product details page