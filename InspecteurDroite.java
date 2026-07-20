// Fichier : InspecteurDroite.java

public class InspecteurDroite {

    // L'objet dont on affiche les caractéristiques
    private ObjetBase objetCible;

    public InspecteurDroite() {
        this.objetCible = null;
    }

    public void afficherProprietes(ObjetBase objetSelectionne) {
        // Logique future : 
        // 1. "Récupère l'objet cliqué dans le Canvas."
        // 2. "Génère des champs de texte pour son Nom, ses coordonnées X/Y, sa taille."
        this.objetCible = objetSelectionne;
    }

    public void viderInspecteur() {
        // Logique future : "Si l'utilisateur clique dans le vide sur le Canvas, on vide l'inspecteur."
        this.objetCible = null;
    }

    public void modifierPropriete(String nomPropriete, Object nouvelleValeur) {
        // Logique future : 
        // "Applique la nouvelle valeur (ex: X = 150) à l'objetCible et prévient le GestionnaireHistorique pour que l'action soit annulable avec le Undo."
    }
}
