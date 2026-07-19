public class NoeudEventStart extends NoeudBase {
    
    public NoeudEventStart(float x, float y) {
        // On appelle le constructeur parent : Nom, Catégorie, Position X, Position Y
        super("Au démarrage", "event", x, y);
        
        // Un événement de départ n'a pas d'entrée, il a seulement une sortie d'exécution
        ajouterSortie("Suivant", "exec");
    }
}
