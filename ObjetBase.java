import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// C'est la fondation de tous les objets de ta scène.
public abstract class ObjetBase {
    
    // Identifiants
    public String id;
    public String nom;
    public String type;

    // Hiérarchie (Arborescence) pour la modularité
    public ObjetBase parent;
    public List<ObjetBase> enfants;

    // Propriétés visuelles et spatiales
    public float x;
    public float y;
    public float largeur;
    public float hauteur;
    public float rotation;
    public int zIndex;
    
    public boolean visible;
    public boolean verrouille;
    public float opacite;

    // Constructeur : ce qui est appelé quand on crée un nouvel objet
    public ObjetBase(String nom, String type, float x, float y) {
        this.id = UUID.randomUUID().toString(); // Génère un ID unique automatiquement
        this.nom = nom;
        this.type = type;
        this.x = x;
        this.y = y;
        
        // Valeurs par défaut
        this.rotation = 0f;
        this.zIndex = 1;
        this.visible = true;
        this.verrouille = false;
        this.opacite = 1f;
        
        this.enfants = new ArrayList<>();
    }

    // --- Méthodes de modularité (Hiérarchie) ---
    
    // Permet d'attacher un enfant à cet objet (fusion de scènes/groupes)
    public void ajouterEnfant(ObjetBase enfant) {
        enfant.parent = this;
        this.enfants.add(enfant);
    }

    // Permet de détacher un objet
    public void retirerEnfant(ObjetBase enfant) {
        enfant.parent = null;
        this.enfants.remove(enfant);
    }
}
