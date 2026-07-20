import java.util.UUID;
import java.util.ArrayList;

public class NoeudEventClick extends NoeudBase {

    public NoeudEventClick() {
        super(); // Appelle le constructeur de NoeudBase
        
        this.id = UUID.randomUUID().toString();
        this.type = "EventClick";
        this.nom = "Au Clique";
        
        // Initialisation des listes de ports
        this.portsEntree = new ArrayList<>();
        this.portsSortie = new ArrayList<>();
        
        // Un événement n'a pas besoin de port d'entrée d'exécution.
        // On lui ajoute uniquement un port de sortie pour propager l'exécution.
        this.portsSortie.add(new Port("sortie_execution", "execution"));
    }
    
    // Cette méthode servira plus tard au MoteurLogique pour démarrer la lecture
    public void declencher() {
        // La logique future dira : "Si l'objet est cliqué, active le nœud suivant"
    }
}

