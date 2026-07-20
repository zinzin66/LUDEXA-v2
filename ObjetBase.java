import java.util.ArrayList;[span_14](start_span)[span_14](end_span)
import java.util.List;[span_15](start_span)[span_15](end_span)
import java.util.UUID;[span_16](start_span)[span_16](end_span)

// C'est la fondation de tous les objets de ta scène.[span_17](start_span)[span_17](end_span)
public abstract class ObjetBase {
    
    // Identifiants[span_18](start_span)[span_18](end_span)
    public String id;[span_19](start_span)[span_19](end_span)
    public String nom;[span_20](start_span)[span_20](end_span)
    public String type;[span_21](start_span)[span_21](end_span)

    // Hiérarchie (Arborescence) pour la modularité[span_22](start_span)[span_22](end_span)
    public ObjetBase parent;[span_23](start_span)[span_23](end_span)
    public List<ObjetBase> enfants;[span_24](start_span)[span_24](end_span)

    // Propriétés visuelles et spatiales[span_25](start_span)[span_25](end_span)
    public float x;[span_26](start_span)[span_26](end_span)
    public float y;[span_27](start_span)[span_27](end_span)
    public float largeur;[span_28](start_span)[span_28](end_span)
    public float hauteur;[span_29](start_span)[span_29](end_span)
    public float rotation;[span_30](start_span)[span_30](end_span)
    public int zIndex;[span_31](start_span)[span_31](end_span)
    
    public boolean visible;[span_32](start_span)[span_32](end_span)
    public boolean verrouille;[span_33](start_span)[span_33](end_span)
    public float opacite;[span_34](start_span)[span_34](end_span)

    // Constructeur : ce qui est appelé quand on crée un nouvel objet[span_35](start_span)[span_35](end_span)
    public ObjetBase(String nom, String type, float x, float y) {
        this.id = UUID.randomUUID().toString(); // Génère un ID unique automatiquement[span_36](start_span)[span_36](end_span)
        this.nom = nom;[span_37](start_span)[span_37](end_span)
        this.type = type;[span_38](start_span)[span_38](end_span)
        this.x = x;[span_39](start_span)[span_39](end_span)
        this.y = y;[span_40](start_span)[span_40](end_span)
        
        // Valeurs par défaut[span_41](start_span)[span_41](end_span)
        this.rotation = 0f;[span_42](start_span)[span_42](end_span)
        this.zIndex = 1;[span_43](start_span)[span_43](end_span)
        this.visible = true;[span_44](start_span)[span_44](end_span)
        this.verrouille = false;[span_45](start_span)[span_45](end_span)
        this.opacite = 1f;[span_46](start_span)[span_46](end_span)
        
        this.enfants = new ArrayList<>();[span_47](start_span)[span_47](end_span)
    }
    
    // Permet d'attacher un enfant à cet objet (fusion de scènes/groupes)[span_48](start_span)[span_48](end_span)
    public void ajouterEnfant(ObjetBase enfant) {
        enfant.parent = this;[span_49](start_span)[span_49](end_span)
        this.enfants.add(enfant);[span_50](start_span)[span_50](end_span)
    }

    // Permet de détacher un objet[span_51](start_span)[span_51](end_span)
    public void retirerEnfant(ObjetBase enfant) {
        enfant.parent = null;[span_52](start_span)[span_52](end_span)
        this.enfants.remove(enfant);[span_53](start_span)[span_53](end_span)
    }
}

