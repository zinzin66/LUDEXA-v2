// Fichier : NoeudEventUpdate.java

public class NoeudEventUpdate extends NoeudBase {

    public NoeudEventUpdate() {
        super("Event_Update", "À chaque image (Tick)", "Événement");
        
        // Pas d'entrée de donnée nécessaire, il tourne tout seul

        // 1. Port de sortie (Exécution) : Déclenché 60 fois par seconde
        this.ajouterPort(new Port("Suivant", Port.TYPE_EXECUTION_SORTIE));
        
        // 2. Port de sortie (Donnée) : Le "Delta Time" (le temps écoulé depuis la dernière image)
        // Très utile pour calculer des déplacements fluides quel que soit le téléphone
        this.ajouterPort(new Port("Temps Écoulé", Port.TYPE_DONNEE_SORTIE));
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Récupère le temps exact depuis la BouclePrincipale"
        // 2. "Mets cette valeur dans le port 'Temps Écoulé'"
        // 3. "Déclenche le port 'Suivant'"
    }
}
