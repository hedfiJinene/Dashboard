@tag
Feature: Connexion Admin Valide
  je veux connecter en tant que Admin Dashboard web

 @tag1
  Scenario: Connexion Admin Valide
    Given Saisir le lien "https://test.dashboard.u-smile.app/login"
    When Saisir E-mail "derouichewifek88@gmail.com"
    And Saisir le mot de passe1 "$2y$10$8JbJh84fJAOAer01mzFbPOpEuzw/n3eKmLiKdATT1fQvLFLWOucXq"
    And Cliquer sur le bouton login.login
    And Cliquer sur le bouton Dashboard 
    And Vérifier l'url obtenue "https://test.dashboard.u-smile.app/dashboards/analytics"
 