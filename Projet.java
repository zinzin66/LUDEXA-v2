import java.util.ArrayList;
import java.util.List;

// Le conteneur principal qui représente un jeu complet créé dans Ludexa
public class Projet {
    
    // Informations globales
    public String nomDuJeu;
    public String version;
    public int resolutionLargeur;
    public int resolutionHauteur;
    
    // Le contenu du jeu
    public List<Scene> scenes;
    public List<Blueprint> blueprints;

    public Projet(String nom) {
        this.nomDuJeu = nom;
        this.version = "1.0.0";
        
        // Résolution mobile par défaut (ex: mode portrait)
        this.resolutionLargeur = 1080;
        this.resolutionHauteur = 1920;
        
        // Initialisation des listes vides
        this.scenes = new ArrayList<>();
        this.blueprints = new ArrayList<>();
    }

    public void ajouterScene(Scene scene) {
        this.scenes.add(scene);
    }

    public void ajouterBlueprint(Blueprint blueprint) {
        this.blueprints.add(blueprint);
    }
}
