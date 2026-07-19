// Représente une entrée ou une sortie sur un nœud
public class Port {
    
    public String nom;
    public String type; // "exec" (le fil d'exécution blanc) ou "data" (le fil de donnée couleur)
    public String valeurSaisie; // Si l'utilisateur tape une valeur manuellement dans l'éditeur

    public Port(String nom, String type) {
        this.nom = nom;
        this.type = type;
        this.valeurSaisie = ""; // Vide par défaut
    }
}
