import java.util.ArrayList;[span_69](start_span)[span_69](end_span)
import java.util.List;[span_70](start_span)[span_70](end_span)
import java.util.UUID;[span_71](start_span)[span_71](end_span)

// C'est la fondation de tous les blocs logiques de ton éditeur.[span_72](start_span)[span_72](end_span)
public abstract class NoeudBase {
    
    public String id;[span_73](start_span)[span_73](end_span)
    public String nom;[span_74](start_span)[span_74](end_span)
    public String categorie; // "event", "action", "math", "variable", etc.[span_75](start_span)[span_75](end_span)
    
    // Position dans l'espace logique[span_76](start_span)[span_76](end_span)
    public float x;[span_77](start_span)[span_77](end_span)
    public float y;[span_78](start_span)[span_78](end_span)
    
    // Les listes de connecteurs[span_79](start_span)[span_79](end_span)
    public List<Port> entrees;[span_80](start_span)[span_80](end_span)
    public List<Port> sorties;[span_81](start_span)[span_81](end_span)

    public NoeudBase(String nom, String categorie, float x, float y) {
        this.id = UUID.randomUUID().toString();[span_82](start_span)[span_82](end_span)
        this.nom = nom;[span_83](start_span)[span_83](end_span)
        this.categorie = categorie;[span_84](start_span)[span_84](end_span)
        this.x = x;[span_85](start_span)[span_85](end_span)
        this.y = y;[span_86](start_span)[span_86](end_span)
        
        this.entrees = new ArrayList<>();[span_87](start_span)[span_87](end_span)
        this.sorties = new ArrayList<>();[span_88](start_span)[span_88](end_span)
    }
    
    // Méthodes simples pour préparer le nœud[span_89](start_span)[span_89](end_span)
    public void ajouterEntree(String nomPort, String typePort) {
        this.entrees.add(new Port(nomPort, typePort));[span_90](start_span)[span_90](end_span)
    }

    public void ajouterSortie(String nomPort, String typePort) {
        this.sorties.add(new Port(nomPort, typePort));[span_91](start_span)[span_91](end_span)
    }
}

