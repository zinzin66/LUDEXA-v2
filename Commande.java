// Fichier : Commande.java

public interface Commande {
    
    // Le code pour effectuer l'action (ex: ajouter un noeud)
    void executer();

    // Le code pour faire exactement l'inverse (ex: supprimer ce même noeud)
    void annuler();
}

