
Feature: verifier inscription de l utilisateur
 

  @register
  Scenario: verifier inscription de l utilisateur
    Given Je me connecte sur l'application Mercury 
    When je clique sur Register
    When Je saisie first Name "Ghada"
    And Je saisie Last Name "Mestiri"
    And Je saisie phone "58073907"
    And Je saisie Email "mestirighada@gmail.com"
    And Je saisie Adress "Khaznadar"
    And Je saisie city "Tunis"
    And Je saisie State "Tunis"
    And Je saisie postal code "25478"
    And Je saisie phone "58073907"
    And Je selectionnne Tunisie
    And Je saisie userName "ghada123"
    And Je saisie  password "120"
    And je saisie confirm password "120"
    And Je clique sur le boutton envoyer
    Then je verifie lenregistrement "Dear Ghada Mestiri,"
    

  
