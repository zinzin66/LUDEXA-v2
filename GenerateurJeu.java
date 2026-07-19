// S'occupe de rassembler les données du projet pour préparer la compilation
public class GenerateurJeu {
    
    public Projet projetCible;
    public ParametresExport parametres;

    public GenerateurJeu(Projet projet, ParametresExport params) {
        this.projetCible = projet;
        this.parametres = params;
    }

    // Étape 1 : Préparer le dossier de construction
    public void preparerDossierBuild() {
        // - Créer le dossier d'export
        // - Copier le fichier project.json et les dossiers scenes/ et logique/
        // - Copier les assets
        // - Générer le fichier AndroidManifest.xml
    }

    // Étape 2 : Lancer la compilation (sera implémenté plus tard)
    public void compilerAPK() {
        // Connexion future aux outils de compilation Android (Gradle/SDK)
    }
}
