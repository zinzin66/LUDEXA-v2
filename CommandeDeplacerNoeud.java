// Fichier : CommandeDeplacerNoeud.java

public class CommandeDeplacerNoeud implements Commande {

    // Le nœud concerné par l'action
    public NoeudBase noeudCible;
    
    // Mémorisation des coordonnées
    public float ancienX;
    public float ancienY;
    public float nouveauX;
    public float nouveauY;

    // Constructeur : on prépare la "boîte" avec toutes les infos au moment du mouvement
    public CommandeDeplacerNoeud(NoeudBase noeud, float depX, float depY, float arrX, float arrY) {
        this.noeudCible = noeud;
        this.ancienX = depX;
        this.ancienY = depY;
        this.nouveauX = arrX;
        this.nouveauY = arrY;
    }

    // Ce qui se passe quand l'action est validée (ou refaite via Redo)
    @Override
    public void executer() {
        if (this.noeudCible != null) {
            this.noeudCible.x = this.nouveauX;
            this.noeudCible.y = this.nouveauY;
        }
    }

    // Ce qui se passe quand l'utilisateur clique sur "Annuler" (Undo)
    @Override
    public void annuler() {
        if (this.noeudCible != null) {
            this.noeudCible.x = this.ancienX;
            this.noeudCible.y = this.ancienY;
        }
    }
}
