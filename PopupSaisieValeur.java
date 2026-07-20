// Fichier : PopupSaisieValeur.java

public class PopupSaisieValeur {

    // Le port spécifique (entrée de donnée) que l'utilisateur veut modifier
    public Port portCible;
    
    // Gère l'affichage de la fenêtre flottante
    public boolean estVisible;

    public PopupSaisieValeur() {
        this.portCible = null;
        this.estVisible = false;
    }

    // Méthode appelée quand on clique (Tap) sur un port libre dans le Blueprint
    public void ouvrirPour(Port port) {
        this.portCible = port;
        this.estVisible = true;
        
        // La logique future dira : 
        // "Vérifie le type du port (ex: float, string)"
        // "Affiche le bon clavier Android (numérique pour float, complet pour string)"
        // "Pré-remplis le champ avec la valeur manuelle actuelle du port"
    }

    // Méthode appelée quand l'utilisateur appuie sur "Valider" ou "Entrée" sur son clavier
    public void validerSaisie(String nouvelleValeur) {
        if (this.portCible != null) {
            // Assigne le texte tapé directement à la propriété du port
            this.portCible.valeurManuelle = nouvelleValeur;
        }
        
        // Une fois validé, on cache la popup
        this.fermer();
    }

    // Méthode pour annuler ou masquer la fenêtre
    public void fermer() {
        this.portCible = null;
        this.estVisible = false;
        // La logique future dira : "Masque l'élément d'interface Android et cache le clavier"
    }
}
