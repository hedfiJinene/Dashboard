@tag
Feature: Validation d'une commande
  je veux valider une commande d'un client
  Background:
 Given Saisir le lien "https://test.dashboard.u-smile.app/login"
    When Saisir E-mail "derouichewifek88@gmail.com"
    And Saisir le mot de passe1 "$2y$10$8JbJh84fJAOAer01mzFbPOpEuzw/n3eKmLiKdATT1fQvLFLWOucXq"
    And Cliquer sur le bouton login.login
  @tag1
  Scenario: Validation d'une commande
    Given Cliquer sur le menu Dashboard
    And 	Cliquer sur le menu Echanges1
   And Cliquer sur le menu Produit Exchanges
    When Cliquer sur le menu commandes en attentes
    And Cliquer sur le menu Détails
    And Cliquer sur le bouton provisionner
   Then Choisir l'option code
  # And Saisir le code 
   #And Cliquer sur btn registre
   #And cliquer sur oui pour confirmer la validation
   #And vérifier que la validation est fait
