// Fichier : NoeudActionChangerVariable.java

public class NoeudActionChangerVariable extends NoeudBase {

    public NoeudActionChangerVariable() {
        super("Action_ChangerVar", "Modifier une Variable", "Action");
        
        // 1. Entrée (Exécution) : Le câble qui déclenche l'action
        this.ajouterPort(new Port("Entrer", Port.TYPE_EXECUTION_ENTREE));
        
        // 2. Entrées (Données) : Le nom de la variable à modifier et sa nouvelle valeur
        this.ajouterPort(new Port("Nom Variable", Port.TYPE_DONNEE_ENTREE));
        this.ajouterPort(new Port("Nouvelle Valeur", Port.TYPE_DONNEE_ENTREE));
        
        // 3. Sortie (Exécution) : Le câble pour continuer le script après modification
        this.ajouterPort(new Port("Suivant", Port.TYPE_EXECUTION_SORTIE));
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Demande au GestionnaireVariables de trouver la variable ciblée."
        // 2. "Remplace son ancienne valeur par la 'Nouvelle Valeur'."
        // 3. "Déclenche le port 'Suivant'."
    }
}
