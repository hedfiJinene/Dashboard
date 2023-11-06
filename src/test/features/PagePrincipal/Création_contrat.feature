
@tag
Feature: Création d'un contrat pour un lead
Je veux créer un contrat pour un lead
Background:
 Given Saisir le lien "https://test.dashboard.u-smile.app/login"
    When Saisir E-mail "derouichewifek88@gmail.com"
    And Saisir le mot de passe1 "$2y$10$8JbJh84fJAOAer01mzFbPOpEuzw/n3eKmLiKdATT1fQvLFLWOucXq"
    And Cliquer sur le bouton login.login

 @tag1
  Scenario:  Création d'un contrat pour un lead
    Given Cliquer sur le menu Backoffice
    And Cliquer sur le sous menu Répertoire leads
    And Cliquer sur le menu Urne des leads
    When Cliquer sur le bouton Actions
    And Cliquer sur le bouton nouveau contrat U_Telecom
    And Naviguer sur Iframe proximus
    And Cliquer sur le bouton suivant
    And Cliquer sur le pack flex netflix
    And Choisir  donné1
    And Choisir donné2
    And Choisir donné3
    And Cocher l'état_vérification_client
    And Cliquer sur suivant
    Then Cliquer sur finaliser 
 
    

 