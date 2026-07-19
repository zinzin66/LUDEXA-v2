// La classe Sprite "étend" (hérite de) ObjetBase
public class Sprite extends ObjetBase {
    
    // Propriétés spécifiques au Sprite
    public String assetId; // Le nom ou l'ID de l'image (ex: "hero.png")
    public boolean flipX;  // Inversion horizontale
    public boolean flipY;  // Inversion verticale

    // Constructeur du Sprite
    public Sprite(String nom, float x, float y, String assetId) {
        // "super" appelle le constructeur de ObjetBase pour remplir les infos de base
        super(nom, "sprite", x, y);
        
        this.assetId = assetId;
        
        // Tailles par défaut pour un sprite
        this.largeur = 64f; 
        this.hauteur = 64f;
        
        this.flipX = false;
        this.flipY = false;
    }
}
