import java.util.ArrayList;[span_28](start_span)[span_28](end_span)
import java.util.List;[span_29](start_span)[span_29](end_span)

// Le tableau de bord qui contient toute la logique d'une scène spécifique[span_30](start_span)[span_30](end_span)
public class Blueprint {
    
    public List<NoeudBase> noeuds;[span_31](start_span)[span_31](end_span)
    public List<Lien> liens;[span_32](start_span)[span_32](end_span)

    public Blueprint() {
        this.noeuds = new ArrayList<>();[span_33](start_span)[span_33](end_span)
        this.liens = new ArrayList<>();[span_34](start_span)[span_34](end_span)
    }

    // Ajouter un nœud (événement, action, math, etc.) au graphe[span_35](start_span)[span_35](end_span)
    public void ajouterNoeud(NoeudBase noeud) {
        this.noeuds.add(noeud);[span_36](start_span)[span_36](end_span)
    }

    // Connecter deux nœuds ensemble[span_37](start_span)[span_37](end_span)
    public void ajouterLien(Lien lien) {
        this.liens.add(lien);[span_38](start_span)[span_38](end_span)
    }
}

