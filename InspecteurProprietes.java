// Fichier : InspecteurProprietes.java

public class InspecteurProprietes {

    // L'objet actuellement sélectionné dans le Canvas (qui hérite de ObjetBase)
    public ObjetBase objetCible;

    public InspecteurProprietes() {
        this.objetCible = null;
    }

    // Méthode appelée quand l'utilisateur touche un objet sur le Canvas
    public void chargerObjet(ObjetBase nouvelObjet) {
        this.objetCible = nouvelObjet;
        
        // La logique future dira : 
        // "Récupère objetCible.nom, objetCible.x, objetCible.y"
        // "Affiche ces valeurs dans les champs de texte de l'interface Android"
    }

    // Méthode appelée quand l'utilisateur valide une nouvelle position X dans le menu
    public void mettreAJourPositionX(float nouveauX) {
        if (this.objetCible != null) {
            this.objetCible.x = nouveauX;
            // La logique future dira : "Notifie le CanvasScene qu'il doit se redessiner"
        }
    }

    // Méthode appelée quand l'utilisateur valide un nouveau nom
    public void mettreAJourNom(String nouveauNom) {
        if (this.objetCible != null) {
            this.objetCible.nom = nouveauNom;
        }
    }
    
    // Méthode pour désélectionner (quand on clique dans le vide sur le Canvas)
    public void viderInspecteur() {
        this.objetCible = null;
        // La logique future dira : "Gise ou masque les champs de texte de l'interface"
    }
}
