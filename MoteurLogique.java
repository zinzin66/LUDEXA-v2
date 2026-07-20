// Fichier : MoteurLogique.java

public class MoteurLogique {

    // Le Blueprint (la scène) actuellement en train d'être joué
    public Blueprint blueprintEnCours;

    public MoteurLogique() {
        this.blueprintEnCours = null;
    }

    // Méthode appelée quand on clique sur le bouton "Play"
    public void demarrerExecution(Blueprint blueprint) {
        this.blueprintEnCours = blueprint;
        
        // La logique future dira :
        // 1. "Parcours la liste des nœuds du blueprintEnCours"
        // 2. "Trouve le nœud qui s'appelle NoeudEventStart"
        // 3. "Passe ce nœud à la méthode executerNoeud()"
    }

    // Le moteur lit un nœud, fait l'action, et cherche le suivant
    public void executerNoeud(NoeudBase noeudActuel) {
        // Sécurité de base
        if (noeudActuel == null) return;
        
        // La logique future dira :
        // 1. "Récupère les données des Ports d'entrée (ex: texte, coordonnées)"
        // 2. "Exécute la vraie action du nœud (ex: modifier le texte à l'écran)"
        // 3. "Regarde le Port de sortie (le port 'Next')"
        // 4. "Vérifie dans LienData quel est le nœud branché au bout de ce câble"
        // 5. "S'il y a un nœud suivant, rappelle executerNoeud(noeudSuivant)"
    }
}

