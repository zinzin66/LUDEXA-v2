// La classe Texte hérite également de ObjetBase
public class Texte extends ObjetBase {
    
    // Propriétés spécifiques au Texte
    public String contenu;
    public String policeId; // Référence au fichier de police (ex: "arial.ttf")
    public int taillePolice;
    public float[] couleurTexte; // Tableau contenant les valeurs Rouge, Vert, Bleu

    // Constructeur du Texte
    public Texte(String nom, float x, float y, String contenu) {
        super(nom, "texte", x, y);
        
        this.contenu = contenu;
        
        // Valeurs par défaut pour le texte
        this.largeur = 100f; 
        this.hauteur = 20f;
        this.taillePolice = 16;
        this.couleurTexte = new float[]{1f, 1f, 1f}; // Blanc par défaut [R, G, B]
    }
}
