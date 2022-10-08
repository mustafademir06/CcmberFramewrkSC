@us1003
Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given Kullanici amazon sayfasina gider
    And  kullanici "Nutella" icin arama yapar
    And  sonuclarin "Nutella" icerdigini test eder
    Then sayfayi kapatir
