// La classe Texte hérite également de ObjetBase[span_26](start_span)[span_26](end_span)
public class Texte extends ObjetBase {
    
    public String contenu;[span_27](start_span)[span_27](end_span)
    public String policeId; // Référence au fichier de police (ex: "arial.ttf")[span_28](start_span)[span_28](end_span)
    public int taillePolice;[span_29](start_span)[span_29](end_span)
    public float[] couleurTexte; // Tableau contenant les valeurs Rouge, Vert, Bleu[span_30](start_span)[span_30](end_span)

    public Texte(String nom, float x, float y, String contenu) {
        super(nom, "texte", x, y);[span_31](start_span)[span_31](end_span)
        
        this.contenu = contenu;[span_32](start_span)[span_32](end_span)
        this.largeur = 100f;[span_33](start_span)[span_33](end_span)
        this.hauteur = 20f;[span_34](start_span)[span_34](end_span)
        this.taillePolice = 16;[span_35](start_span)[span_35](end_span)
        this.couleurTexte = new float[]{1f, 1f, 1f}; // Blanc par défaut [R, G, B][span_36](start_span)[span_36](end_span)
    }
}

