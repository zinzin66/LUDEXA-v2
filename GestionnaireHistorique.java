// Fichier : GestionnaireHistorique.java
import java.util.Stack;

public class GestionnaireHistorique {

    // Deux piles pour mémoriser le passé et le futur possible
    private Stack<Commande> pileAnnuler;
    private Stack<Commande> pileRetablir;

    public GestionnaireHistorique() {
        this.pileAnnuler = new Stack<>();
        this.pileRetablir = new Stack<>();
    }

    public void enregistrerEtExecuter(Commande nouvelleCommande) {
        // La logique future dira :
        // 1. "Exécute la commande."
        // 2. "Pose cette commande sur le dessus de la pileAnnuler."
        // 3. "Vide la pileRetablir (car en faisant une nouvelle action, on casse la ligne temporelle du 'Redo')."
    }

    public void annuler() {
        // La logique future dira :
        // 1. "S'il y a des commandes dans la pileAnnuler..."
        // 2. "Prends celle du dessus, appelle sa méthode annuler()."
        // 3. "Déplace cette commande vers la pileRetablir."
    }

    public void retablir() {
        // La logique future dira :
        // 1. "S'il y a des commandes dans la pileRetablir..."
        // 2. "Prends celle du dessus, appelle sa méthode executer()."
        // 3. "Remets cette commande sur la pileAnnuler."
    }
}

