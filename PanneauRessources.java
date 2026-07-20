import java.util.ArrayList;
import java.util.List;

// Fichier : PanneauRessources.java
// Représente le menu gauche rétractable de l'éditeur de scène
public class PanneauRessources {
    
    // Listes simulées pour l'interface de l'éditeur
    public List<String> listeScenes;
    public List<String> listeAssets;
    public List<String> listeVariables;

    // Gère l'état du panneau (déployé ou caché)
    public boolean estOuvert;

    public PanneauRessources() {
        this.listeScenes = new ArrayList<>();
        this.listeAssets = new ArrayList<>();
        this.listeVariables = new ArrayList<>();
        
        // Fermé par défaut pour laisser un maximum de place au Canvas central
        this.estOuvert = false; 
    }

    // Méthode pour ouvrir ou fermer le menu via un bouton
    public void basculerPanneau() {
        this.estOuvert = !this.estOuvert;
        // La logique future dira : "Déclenche l'animation d'ouverture/fermeture dans l'interface Android native"
    }

    // Simule le chargement des données depuis les dossiers de sauvegarde
    public void chargerDonneesProjet() {
        // La logique future dira : 
        // 1. "Lis le dossier de sauvegarde des assets et remplis listeAssets"
        // 2. "Lis le dossier scenes/ et remplis listeScenes"
        // 3. "Récupère les variables créées dans le projet et remplis listeVariables"
    }

    // Appelée quand l'utilisateur maintient son doigt sur un élément de la liste
    public void debuterGlisserDeposer(String nomAsset) {
        // La logique future dira : 
        // "Prépare l'asset visuel pour le Drag & Drop natif vers le CanvasScene"
    }
}
