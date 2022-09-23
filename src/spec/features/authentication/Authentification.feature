Feature: je verifie la page de la connexion
En tant que utilisateur je souhaite me connecter au site mercury
  @connexion
  Scenario: je verifie la page de la connexion
    Given Je me connecte sur l'application Mercury 
    When Je saisie le username "test"
    And Je saisie le password "test"
    And Je clique sur le boutton submit
    Then Je me redirige vers la page Home "Login Successfully"
    