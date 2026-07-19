public class Checkbox extends ObjetBase {
    
    public boolean coche;

    public Checkbox(String nom, float x, float y) {
        super(nom, "checkbox", x, y);
        
        this.largeur = 24f;
        this.hauteur = 24f;
        this.coche = false; // Décochée par défaut
    }
}
