
// Champ de saisie utilisateur[span_54](start_span)[span_54](end_span)
public class Input extends ObjetBase {
    
    public String texte;[span_55](start_span)[span_55](end_span)
    public float[] couleurTexte;[span_56](start_span)[span_56](end_span)
    public boolean estActif;[span_57](start_span)[span_57](end_span)
    public boolean fondTransparent;[span_58](start_span)[span_58](end_span)

    public Input(String nom, float x, float y) {
        super(nom, "input", x, y);[span_59](start_span)[span_59](end_span)
        
        this.texte = ""; // Vide au départ[span_60](start_span)[span_60](end_span)
        this.largeur = 180f;[span_61](start_span)[span_61](end_span)
        this.hauteur = 30f;[span_62](start_span)[span_62](end_span)
        this.couleurTexte = new float[]{1f, 1f, 1f};[span_63](start_span)[span_63](end_span)
        this.estActif = false;[span_64](start_span)[span_64](end_span)
        this.fondTransparent = false;[span_65](start_span)[span_65](end_span)
    }
}
