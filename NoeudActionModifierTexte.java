import java.util.UUID;
import java.util.ArrayList;

public class NoeudActionModifierTexte extends NoeudBase {

    public NoeudActionModifierTexte() {
        super(); // Appelle le constructeur de NoeudBase
        
        this.id = UUID.randomUUID().toString();
        this.type = "ActionModifierTexte";
        this.nom = "Modifier Texte";
        
        // Ports d'entrée : Exécution + Données (ID du texte cible et le nouveau contenu)
        this.portsEntree = new ArrayList<>();
        this.portsEntree.add(new Port("entree_execution", "execution"));
        this.portsEntree.add(new Port("cible", "string"));
        this.portsEntree.add(new Port("nouveau_texte", "string"));
        
        // Port de sortie : Pour continuer la chaîne après la modification
        this.portsSortie = new ArrayList<>();
        this.portsSortie.add(new Port("sortie_execution", "execution"));
    }
    
    // Cette méthode sera lue plus tard par le MoteurLogique
    public void executer() {
        // La logique de modification sera gérée par le MoteurLogique
        // en remplaçant la valeur du composant Texte ciblé.
    }
}

