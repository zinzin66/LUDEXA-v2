// La classe Sprite "étend" (hérite de) ObjetBase[span_16](start_span)[span_16](end_span)
public class Sprite extends ObjetBase {
    
    public String assetId; // Le nom ou l'ID de l'image (ex: "hero.png")[span_17](start_span)[span_17](end_span)
    public boolean flipX;  // Inversion horizontale[span_18](start_span)[span_18](end_span)
    public boolean flipY;  // Inversion verticale[span_19](start_span)[span_19](end_span)

    public Sprite(String nom, float x, float y, String assetId) {
        // "super" appelle le constructeur de ObjetBase pour remplir les infos de base[span_20](start_span)[span_20](end_span)
        super(nom, "sprite", x, y);
        
        this.assetId = assetId;[span_21](start_span)[span_21](end_span)
        this.largeur = 64f;[span_22](start_span)[span_22](end_span)
        this.hauteur = 64f;[span_23](start_span)[span_23](end_span)
        this.flipX = false;[span_24](start_span)[span_24](end_span)
        this.flipY = false;[span_25](start_span)[span_25](end_span)
    }
}

