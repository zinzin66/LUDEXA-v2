public class Slider extends ObjetBase {
    
    public float valeur;
    public float minVal;
    public float maxVal;

    public Slider(String nom, float x, float y) {
        super(nom, "slider", x, y);
        
        this.largeur = 150f;
        this.hauteur = 15f;
        this.valeur = 0.5f; // Moitié par défaut
        this.minVal = 0f;
        this.maxVal = 1f;
    }
}
