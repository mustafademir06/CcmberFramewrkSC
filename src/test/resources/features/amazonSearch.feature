Feature: Amazon Search

  Scenario: TC01 Kullanici amazonda nutella aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici Nutella aratir
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir