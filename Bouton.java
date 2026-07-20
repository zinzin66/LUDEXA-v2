// Représente un bouton cliquable dans l'interface[span_7](start_span)[span_7](end_span)
public class Bouton extends ObjetBase {
    
    public String texte;[span_8](start_span)[span_8](end_span)
    public int taillePolice;[span_9](start_span)[span_9](end_span)
    public float[] couleurTexte;[span_10](start_span)[span_10](end_span)
    public boolean estPresse;[span_11](start_span)[span_11](end_span)
    public boolean fondTransparent;[span_12](start_span)[span_12](end_span)

    public Bouton(String nom, float x, float y, String texte) {
        super(nom, "bouton", x, y);[span_13](start_span)[span_13](end_span)
        
        this.texte = texte;[span_14](start_span)[span_14](end_span)
        this.largeur = 120f;[span_15](start_span)[span_15](end_span)
        this.hauteur = 40f;[span_16](start_span)[span_16](end_span)
        this.taillePolice = 16;[span_17](start_span)[span_17](end_span)
        this.couleurTexte = new float[]{1f, 1f, 1f}; // Blanc[span_18](start_span)[span_18](end_span)
        this.estPresse = false;[span_19](start_span)[span_19](end_span)
        this.fondTransparent = false;[span_20](start_span)[span_20](end_span)
    }
}

