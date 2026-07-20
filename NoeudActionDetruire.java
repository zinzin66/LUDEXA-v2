// Fichier : NoeudActionDetruire.java

public class NoeudActionDetruire extends NoeudBase {

    public NoeudActionDetruire() {
        super("Action_Detruire", "Détruire un Objet", "Action");
        
        // 1. Entrée (Exécution)
        this.ajouterPort(new Port("Entrer", Port.TYPE_EXECUTION_ENTREE));
        
        // 2. Entrée (Donnée) : L'objet spécifique à supprimer
        this.ajouterPort(new Port("Cible", Port.TYPE_DONNEE_ENTREE));
        
        // 3. Sortie (Exécution) : La suite du script
        this.ajouterPort(new Port("Suivant", Port.TYPE_EXECUTION_SORTIE));
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Demande à la Scene active de retirer cet objet de sa liste d'affichage."
        // 2. "Déclenche le port 'Suivant'."
    }
}
