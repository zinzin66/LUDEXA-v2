public class NoeudActionDeplacer extends NoeudBase {
    
    public NoeudActionDeplacer(float x, float y) {
        super("Déplacer Objet", "action", x, y);
        
        // Ce dont le nœud a besoin pour fonctionner (Entrées)
        ajouterEntree("Déclencheur", "exec"); // Le fil blanc qui lance l'action
        ajouterEntree("Objet", "data");       // L'objet visuel cible
        ajouterEntree("X", "data");           // La position cible X
        ajouterEntree("Y", "data");           // La position cible Y
        
        // Ce que le nœud renvoie une fois terminé (Sorties)
        ajouterSortie("Terminé", "exec");     // Le fil blanc pour passer à l'action suivante
    }
}
