// Représente une case à cocher[span_21](start_span)[span_21](end_span)
public class Checkbox extends ObjetBase {
    
    public boolean coche;[span_22](start_span)[span_22](end_span)

    public Checkbox(String nom, float x, float y) {
        super(nom, "checkbox", x, y);[span_23](start_span)[span_23](end_span)
        
        this.largeur = 24f;[span_24](start_span)[span_24](end_span)
        this.hauteur = 24f;[span_25](start_span)[span_25](end_span)
        this.coche = false; // Décochée par défaut[span_26](start_span)[span_26](end_span)
    }
}

