
// Fichier : Variable.java

public class Variable {
    
    // Les informations de base de notre variable
    private String nom;
    private String type; // Exemple : "Entier", "Texte", "Booleen"
    private Object valeur; // "Object" permet de stocker n'importe quel type pour le moment

    public Variable(String nom, String type, Object valeurParDefaut) {
        this.nom = nom;
        this.type = type;
        this.valeur = valeurParDefaut;
    }

    // Coquilles des méthodes pour lire ou modifier la donnée
    public Object getValeur() {
        return this.valeur;
    }

    public void setValeur(Object nouvelleValeur) {
        // La logique future dira :
        // 1. "Vérifie si la nouvelle valeur correspond bien au type défini (ex: on ne met pas du texte dans un Entier)."
        // 2. "Si c'est bon, remplace l'ancienne valeur."
    }
}
