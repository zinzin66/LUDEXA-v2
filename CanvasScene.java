
import java.util.List;

// Classe représentant la zone de dessin centrale de l'éditeur
public class CanvasScene {
    
    // Le Canvas a besoin de savoir quelle scène il doit afficher
    public Scene sceneActive;
    
    // Variables pour l'état de l'éditeur (ex: objet en cours de déplacement)
    public ObjetBase objetSelectionne;

    public CanvasScene() {
        this.sceneActive = null;
        this.objetSelectionne = null;
    }

    // Permet de lier une scène créée ou chargée au Canvas
    public void chargerScene(Scene scene) {
        this.sceneActive = scene;
    }

    // Méthode appelée lorsque l'utilisateur glisse un asset depuis le panneau de gauche
    public void ajouterNouvelObjet(String typeObjet, float positionX, float positionY) {
        // Vérification de sécurité : on s'assure qu'une scène est bien ouverte
        if (this.sceneActive != null) {
            // La logique future dira :
            // 1. Instancier la classe spécifique (Sprite, Texte...) qui hérite d'ObjetBase
            // 2. Lui assigner les coordonnées X et Y
            // 3. Ajouter ce nouvel objet à la liste de sceneActive
            // 4. Appeler dessiner() pour rafraîchir l'écran
        }
    }

    // Méthode de rendu (appelée par la future interface native)
    public void dessiner() {
        if (this.sceneActive != null) {
            // La logique future dira : 
            // "Parcours la liste d'ObjetBase de la sceneActive et dessine-les"
        }
    }
    
    // Méthode pour gérer les interactions tactiles de l'utilisateur
    public void auToucher(float x, float y) {
        // La logique future dira : 
        // "Vérifie si le clic correspond à un ObjetBase pour le sélectionner"
    }
}
