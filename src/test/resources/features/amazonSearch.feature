Feature: US_01
  Scenario: Kullanici kayit aninda SSN kismini bos birakamaz
    Given kullanici medunna anasayfasinda
    Then Kullanici simgesine tiklar
    And register butonuna tiklar
    And SSN numarasi bos birakildigi icin "Your SSN is required" yazisi cikmali