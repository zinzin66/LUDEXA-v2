
import java.util.UUID;
import java.util.ArrayList;

public class NoeudActionDeplacer extends NoeudBase {

    public NoeudActionDeplacer() {
        super();
        
        this.id = UUID.randomUUID().toString();
        this.type = "ActionDeplacer";
        this.nom = "Déplacer Objet";
        
        // Ports d'entrée : Un pour l'exécution, deux pour les données (X et Y)
        this.portsEntree = new ArrayList<>();
        this.portsEntree.add(new Port("entree_execution", "execution"));
        this.portsEntree.add(new Port("X", "float"));
        this.portsEntree.add(new Port("Y", "float"));
        
        // Port de sortie : Pour continuer la chaîne après le déplacement
        this.portsSortie = new ArrayList<>();
        this.portsSortie.add(new Port("sortie_execution", "execution"));
    }
    
    public void executer() {
        // La logique de déplacement réelle sera gérée par le MoteurLogique
        // en lisant les valeurs fournies aux ports X et Y.
    }
}
