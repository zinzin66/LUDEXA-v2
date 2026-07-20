import java.util.ArrayList;[span_47](start_span)[span_47](end_span)
import java.util.List;[span_48](start_span)[span_48](end_span)
import java.util.UUID;[span_49](start_span)[span_49](end_span)

// Cette classe représente un écran de jeu (Menu, Niveau 1, HUD, etc.)[span_50](start_span)[span_50](end_span)
public class Scene {
    
    public String id;[span_51](start_span)[span_51](end_span)
    public String nom;[span_52](start_span)[span_52](end_span)
    
    // La liste qui contient TOUS les objets de cette scène (Sprites, Textes, etc.)[span_53](start_span)[span_53](end_span)
    public List<ObjetBase> objets;[span_54](start_span)[span_54](end_span)

    public Scene(String nom) {
        this.id = UUID.randomUUID().toString();[span_55](start_span)[span_55](end_span)
        this.nom = nom;[span_56](start_span)[span_56](end_span)
        this.objets = new ArrayList<>();[span_57](start_span)[span_57](end_span)
    }

    // Ajouter un objet (quel qu'il soit, grâce au moule ObjetBase) à la scène[span_58](start_span)[span_58](end_span)
    public void ajouterObjet(ObjetBase objet) {
        this.objets.add(objet);[span_59](start_span)[span_59](end_span)
    }

    // Retirer un objet de la scène[span_60](start_span)[span_60](end_span)
    public void retirerObjet(ObjetBase objet) {
        this.objets.remove(objet);[span_61](start_span)[span_61](end_span)
    }
}

