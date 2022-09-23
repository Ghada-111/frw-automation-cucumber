Feature: verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_register
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l'application Mercury
    When je clique sur le module register
    And je saisie un data dans le champ First name "<username>"
    And je saisie un data dans le champ Last name "<lastname>"

    Examples: 
      | username | lastname |
      | Ghada    | Mestiri  |
      | Rim      | Khedhri  |
