import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Cette classe représente un écran de jeu (Menu, Niveau 1, HUD, etc.)
public class Scene {
    
    public String id;
    public String nom;
    
    // La liste qui contient TOUS les objets de cette scène (Sprites, Textes, etc.)
    public List<ObjetBase> objets;

    public Scene(String nom) {
        this.id = UUID.randomUUID().toString();
        this.nom = nom;
        
        // Initialisation de la liste vide
        this.objets = new ArrayList<>();
    }

    // Ajouter un objet (quel qu'il soit, grâce au moule ObjetBase) à la scène
    public void ajouterObjet(ObjetBase objet) {
        this.objets.add(objet);
    }

    // Retirer un objet de la scène
    public void retirerObjet(ObjetBase objet) {
        this.objets.remove(objet);
    }
}
