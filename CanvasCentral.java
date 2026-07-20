// Fichier : CanvasCentral.java

public class CanvasCentral {

    // Référence à la scène actuellement affichée
    private Scene sceneActive;
    
    // L'objet que l'utilisateur est en train de manipuler
    private ObjetBase objetSelectionne;

    public CanvasCentral() {
        // Initialisation de la zone de dessin vide
    }

    public void chargerScene(Scene nouvelleScene) {
        // Logique future : "Remplace la scène active par la nouvelle et redessine l'écran."
        this.sceneActive = nouvelleScene;
    }

    public void dessinerRendu() {
        // Logique future : 
        // 1. "Dessine le fond du niveau."
        // 2. "Parcourt tous les objets de la sceneActive et les affiche."
        // 3. "Si un objet est sélectionné, dessine une bordure de sélection autour."
    }

    public void gererInteractionTactile(float x, float y, String typeAction) {
        // Logique future : "Détecte si l'utilisateur a cliqué sur un objet, s'il le glisse, ou s'il clique dans le vide pour le désélectionner."
    }
}
