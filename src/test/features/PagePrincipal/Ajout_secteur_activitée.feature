@tag
Feature: Ajouter un secteur d'activitée
 je veux ajouter un secteur d'activitée
Background:
 Given Saisir le lien "https://test.dashboard.u-smile.app/login"
    When Saisir E-mail "derouichewifek88@gmail.com"
    And Saisir le mot de passe1 "$2y$10$8JbJh84fJAOAer01mzFbPOpEuzw/n3eKmLiKdATT1fQvLFLWOucXq"
    And Cliquer sur le bouton login.login
@tag1
  Scenario: Ajouter un secteur d'activitée
    Given cliquer sur le menu Echanges
    And cliquer sur le menu secteur d'activitée
    When cliquer sur le bouton ajouter
    And remplir le champ clé_nom
    And remplir le champ clé_description
    Then cliquer sur le bouton save 
    And confirmer l'ajout 
    And vérifier l'ajout de secteur 