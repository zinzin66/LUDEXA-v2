import java.util.ArrayList;
import java.util.List;

// Le tableau de bord qui contient toute la logique d'une scène spécifique
public class Blueprint {
    
    public List<NoeudBase> noeuds;
    public List<Lien> liens;

    public Blueprint() {
        this.noeuds = new ArrayList<>();
        this.liens = new ArrayList<>();
    }

    // Ajouter un nœud (événement, action, math, etc.) au graphe
    public void ajouterNoeud(NoeudBase noeud) {
        this.noeuds.add(noeud);
    }

    // Connecter deux nœuds ensemble
    public void ajouterLien(Lien lien) {
        this.liens.add(lien);
    }
}
