@wip
Feature: US1002 kullanici ortak adimlari Background ile calistirir

  Background: ortak adim
    Given Kullanici amazon sayfasina gider

    Scenario: TC04 amazon nutella arama
      And Kullanici Nutella aratir
      Then sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

      Scenario: TC05 amazon java arama
        And Kullanici Java icin arama yapar
        Then Sonuclarin Java icerdigini test eder
        And sayfayi kapatir