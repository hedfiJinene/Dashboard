
@tag
Feature: Changer le statut de lead
 je veux changer le statut de lead à partir fiche lead
Background:
 Given Saisir le lien "https://test.dashboard.u-smile.app/login"
    When Saisir E-mail "derouichewifek88@gmail.com"
    And Saisir le mot de passe1 "$2y$10$8JbJh84fJAOAer01mzFbPOpEuzw/n3eKmLiKdATT1fQvLFLWOucXq"
    And Cliquer sur le bouton login.login
  @tag1
  Scenario: Changer le statut de lead
    Given Cliquer sur le menu backoffice
    And Cliquer sur le menu répertoire de lead
    When Cliquer sur le menu Urne des leads1
    And Cliquer sur le bouton Actions 
    Then Cliquer sur le bouton New
     And Cliquer sur la liste déroulante status
      And Choisir le status "En cours"
    And Cliquer sur le bouton Enregistrer1 
    And Vérifier le changement de status de lead
    

 