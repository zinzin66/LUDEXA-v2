// Écran d'accueil de Ludexa en mode paysage
public class EcranDemarrage {
    
    // Composants visuels de l'écran
    public SelecteurLangue selecteurLangue;
    public ChampTexte champNomNouveauProjet;
    public Bouton boutonCreerProjet;
    public ListeProjets listeProjetsExistants;

    public EcranDemarrage() {
        // Initialisation de l'interface
    }

    public void creerNouveauProjet(String nom) {
        // Logique pour générer le fichier project.json à la racine
    }

    public void chargerProjet(String cheminProjet) {
        // Logique pour lire un projet existant et passer à l'InterfacePrincipale
    }
}
