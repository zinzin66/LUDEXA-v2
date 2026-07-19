public class Input extends ObjetBase {
    
    public String texte;
    public float[] couleurTexte;
    public boolean estActif; 
    public boolean fondTransparent;

    public Input(String nom, float x, float y) {
        super(nom, "input", x, y);
        
        this.texte = ""; // Vide au départ
        this.largeur = 180f;
        this.hauteur = 30f;
        this.couleurTexte = new float[]{1f, 1f, 1f};
        this.estActif = false;
        this.fondTransparent = false;
    }
}
