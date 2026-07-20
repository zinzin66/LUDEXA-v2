// Fichier : NoeudEventCollision.java

public class NoeudEventCollision extends NoeudBase {

    public NoeudEventCollision() {
        super("Event_Collision", "En cas de Collision", "Événement");
        
        // 1. Ports d'entrée (Données) : Les deux objets qui doivent se toucher
        this.ajouterPort(new Port("Objet A", Port.TYPE_DONNEE_ENTREE));
        this.ajouterPort(new Port("Objet B", Port.TYPE_DONNEE_ENTREE));
        
        // 2. Port de sortie (Exécution) : Le câble qui lance la suite
        this.ajouterPort(new Port("Suivant", Port.TYPE_EXECUTION_SORTIE));
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Vérifie dans le MoteurGraphique si les boîtes (hitboxes) de A et B se superposent"
        // 2. "Si c'est le cas, déclenche le port 'Suivant'"
    }
}
