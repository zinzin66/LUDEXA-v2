// Fichier : NoeudActionChargerScene.java

public class NoeudActionChargerScene extends NoeudBase {

    public NoeudActionChargerScene() {
        super("Action_ChargerScene", "Charger une Scène", "Action");
        
        // 1. Entrée (Exécution)
        this.ajouterPort(new Port("Entrer", Port.TYPE_EXECUTION_ENTREE));
        
        // 2. Entrée (Donnée) : Le nom (ou l'ID) du niveau à charger
        this.ajouterPort(new Port("Nom de la Scène", Port.TYPE_DONNEE_ENTREE));
        
        // Attention : Pas de port de sortie d'exécution ici !
        // Charger une nouvelle scène arrête instantanément le script en cours.
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Demande à la BouclePrincipale de mettre le jeu en pause."
        // 2. "Efface la mémoire visuelle actuelle."
        // 3. "Charge le nouveau fichier .json de la scène demandée."
    }
}
