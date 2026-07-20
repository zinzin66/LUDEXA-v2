// Objet d'interface utilisateur[span_37](start_span)[span_37](end_span)
public class Slider extends ObjetBase {
    
    public float valeur;[span_38](start_span)[span_38](end_span)
    public float minVal;[span_39](start_span)[span_39](end_span)
    public float maxVal;[span_40](start_span)[span_40](end_span)

    public Slider(String nom, float x, float y) {
        super(nom, "slider", x, y);[span_41](start_span)[span_41](end_span)
        
        this.largeur = 150f;[span_42](start_span)[span_42](end_span)
        this.hauteur = 15f;[span_43](start_span)[span_43](end_span)
        this.valeur = 0.5f; // Moitié par défaut[span_44](start_span)[span_44](end_span)
        this.minVal = 0f;[span_45](start_span)[span_45](end_span)
        this.maxVal = 1f;[span_46](start_span)[span_46](end_span)
    }
}

