public class Bouton extends ObjetBase {
    
    public String texte;
    public int taillePolice;
    public float[] couleurTexte;
    public boolean estPresse;
    public boolean fondTransparent;

    public Bouton(String nom, float x, float y, String texte) {
        super(nom, "bouton", x, y);
        
        this.texte = texte;
        this.largeur = 120f;
        this.hauteur = 40f;
        this.taillePolice = 16;
        this.couleurTexte = new float[]{1f, 1f, 1f}; // Blanc
        this.estPresse = false;
        this.fondTransparent = false;
    }
}
