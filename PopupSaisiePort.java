// Fichier : PopupSaisiePort.java

public class PopupSaisiePort {

    private Port portCible;

    public PopupSaisiePort() {
        // Initialisation de la fenêtre (masquée par défaut)
    }

    public void ouvrirPopup(Port portClique) {
        // Logique future : "Affiche la fenêtre au-dessus de l'écran avec un champ texte adapté au type du port (ex: clavier numérique si on attend un chiffre)."
        this.portCible = portClique;
    }

    public void validerSaisie(String nouvelleValeur) {
        // Logique future : "Sauvegarde la valeur tapée dans le port et referme la fenêtre."
        this.portCible = null;
    }
}
