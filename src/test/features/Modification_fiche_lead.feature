@tag
Feature: Modifier les informations d'un lead
 je veux modifier ou completer des informations de lead 
Background:
 Given Saisir le lien "https://test.dashboard.u-smile.app/login"
    When Saisir E-mail "derouichewifek88@gmail.com"
    And Saisir le mot de passe1 "$2y$10$8JbJh84fJAOAer01mzFbPOpEuzw/n3eKmLiKdATT1fQvLFLWOucXq"
    And Cliquer sur le bouton login.login
  @tag1
  Scenario: Modifier les informations d'un lead
    Given Cliquer sur le menu backoffice1
    And Cliquer sur le menu répertoire de lead1
    When Cliquer sur le menu Urne des leads2
    And Cliquer sur le bouton Actions1 
    Then Cliquer sur le bouton "Mettre à jour"
     And Remplir le champ piece carte d'identitée
      And Remplir les champs de l'adresse habitation
    And Cliquer sur le bouton btn_enregistrer
    And Vérifier que test ok
  