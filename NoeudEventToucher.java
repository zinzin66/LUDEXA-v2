// Fichier : NoeudEventToucher.java

public class NoeudEventToucher extends NoeudBase {

    public NoeudEventToucher() {
        super("Event_Touch", "Quand Touché", "Événement");
        
        // 1. Port d'entrée (Donnée) : On doit dire au nœud quel objet écouter
        this.ajouterPort(new Port("Objet Cible", Port.TYPE_DONNEE_ENTREE));
        
        // 2. Port de sortie (Exécution) : Le câble qui part pour déclencher l'action
        this.ajouterPort(new Port("Suivant", Port.TYPE_EXECUTION_SORTIE));
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Demande au GestionnaireEntrees si l'Objet Cible vient d'être touché"
        // 2. "Si oui, dis au MoteurLogique de lire le nœud branché sur le port 'Suivant'"
    }
}
