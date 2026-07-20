import java.util.ArrayList;[span_62](start_span)[span_62](end_span)
import java.util.List;[span_63](start_span)[span_63](end_span)

// Le conteneur principal qui représente un jeu complet créé dans Ludexa[span_64](start_span)[span_64](end_span)
public class Projet {
    
    public String nomDuJeu;[span_65](start_span)[span_65](end_span)
    public String version;[span_66](start_span)[span_66](end_span)
    public int resolutionLargeur;[span_67](start_span)[span_67](end_span)
    public int resolutionHauteur;[span_68](start_span)[span_68](end_span)
    
    public List<Scene> scenes;[span_69](start_span)[span_69](end_span)
    public List<Blueprint> blueprints;[span_70](start_span)[span_70](end_span)

    public Projet(String nom) {
        this.nomDuJeu = nom;[span_71](start_span)[span_71](end_span)
        this.version = "1.0.0";[span_72](start_span)[span_72](end_span)
        
        // Résolution mobile par défaut (ex: mode portrait)[span_73](start_span)[span_73](end_span)
        this.resolutionLargeur = 1080;[span_74](start_span)[span_74](end_span)
        this.resolutionHauteur = 1920;[span_75](start_span)[span_75](end_span)
        
        this.scenes = new ArrayList<>();[span_76](start_span)[span_76](end_span)
        this.blueprints = new ArrayList<>();[span_77](start_span)[span_77](end_span)
    }

    public void ajouterScene(Scene scene) {
        this.scenes.add(scene);[span_78](start_span)[span_78](end_span)
    }

    public void ajouterBlueprint(Blueprint blueprint) {
        this.blueprints.add(blueprint);[span_79](start_span)[span_79](end_span)
    }
}

