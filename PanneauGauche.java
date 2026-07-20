// Fichier : PanneauGauche.java

public class PanneauGauche {

    private boolean estOuvert;
    private String ongletActif; // "Scenes", "Assets" ou "Variables"

    public PanneauGauche() {
        this.estOuvert = true; // Ouvert par défaut
        this.ongletActif = "Scenes"; // Onglet par défaut
    }

    public void basculerAffichage() {
        // Logique future : "Si le panneau est ouvert, ferme-le. S'il est fermé, ouvre-le."
        this.estOuvert = !this.estOuvert;
    }

    public void changerOnglet(String nomOnglet) {
        // Logique future : "Passe de la liste des scènes à la galerie d'images, etc."
        this.ongletActif = nomOnglet;
    }

    public void glisserElementVersCanvas(Object element) {
        // Logique future : "L'utilisateur prend une image depuis le panneau et la dépose sur le CanvasCentral pour créer un nouvel objet."
    }
}
