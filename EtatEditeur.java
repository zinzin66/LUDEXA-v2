// Mémorise ce que l'utilisateur est en train de faire dans l'éditeur
public class EtatEditeur {
    
    public String modeActuel; // "edition_scene", "edition_logique", "test_jeu"
    public ObjetBase objetSelectionne;
    public NoeudBase noeudSelectionne;

    public EtatEditeur() {
        this.modeActuel = "edition_scene"; // Mode par défaut
        this.objetSelectionne = null;
        this.noeudSelectionne = null;
    }

    public void changerMode(String nouveauMode) {
        this.modeActuel = nouveauMode;
        this.objetSelectionne = null;
        this.noeudSelectionne = null;
    }
}
