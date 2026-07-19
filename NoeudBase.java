import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// C'est la fondation de tous les blocs logiques de ton éditeur.
public abstract class NoeudBase {
    
    public String id;
    public String nom;
    public String categorie; // "event", "action", "math", "variable", etc.
    
    // Position dans l'espace logique
    public float x;
    public float y;
    
    // Les listes de connecteurs
    public List<Port> entrees;
    public List<Port> sorties;

    public NoeudBase(String nom, String categorie, float x, float y) {
        this.id = UUID.randomUUID().toString();
        this.nom = nom;
        this.categorie = categorie;
        this.x = x;
        this.y = y;
        
        this.entrees = new ArrayList<>();
        this.sorties = new ArrayList<>();
    }
    
    // Méthodes simples pour préparer le nœud
    public void ajouterEntree(String nomPort, String typePort) {
        this.entrees.add(new Port(nomPort, typePort));
    }

    public void ajouterSortie(String nomPort, String typePort) {
        this.sorties.add(new Port(nomPort, typePort));
    }
}
