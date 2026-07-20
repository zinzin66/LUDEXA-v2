// Fichier : Main.java
// C'est le chef d'orchestre global de ton application LUDEXA

public class Main {

    // 1. Nos éléments d'interface (Vues)
    public static CanvasScene canvasPrincipal;
    public static PlanTravailBlueprint editeurBlueprint;
    public static PanneauRessources panneauRessources;

    // 2. Nos gestionnaires (Cerveaux)
    public static GestionnaireEntrees systemeTactile;
    public static GestionnaireHistorique systemeUndoRedo;
    public static GestionnaireSauvegarde systemeSauvegarde;
    public static MoteurLogique moteurExecution;
    public static BouclePrincipale boucleDeJeu;

    // La méthode 'main' est toujours la première appelée par Java au lancement
    public static void main(String[] args) {
        initialiserMoteur();
        lancerApplication();
    }

    // Création et liaison de tous nos modules
    public static void initialiserMoteur() {
        // --- ÉTAPE 1 : Création des interfaces ---
        canvasPrincipal = new CanvasScene();
        editeurBlueprint = new PlanTravailBlueprint();
        panneauRessources = new PanneauRessources();

        // --- ÉTAPE 2 : Création des gestionnaires ---
        systemeTactile = new GestionnaireEntrees();
        systemeUndoRedo = new GestionnaireHistorique();
        systemeSauvegarde = new GestionnaireSauvegarde();
        moteurExecution = new MoteurLogique();
        boucleDeJeu = new BouclePrincipale();

        // --- ÉTAPE 3 : Le Câblage (très important !) ---
        // On donne au système tactile les références de nos écrans pour qu'il sache sur quoi on clique
        systemeTactile.canvasActif = canvasPrincipal;
        systemeTactile.blueprintActif = editeurBlueprint;

        // On connecte la boucle de jeu au moteur logique et à l'écran
        boucleDeJeu.moteurLogique = moteurExecution;
        boucleDeJeu.canvasActif = canvasPrincipal;

        // La logique future dira : "Initialise l'interface native Android et attache ces classes Java aux vrais menus du téléphone"
    }

    // Démarre les processus de fond une fois que tout est prêt
    public static void lancerApplication() {
        // On pourrait par exemple charger le dernier projet ouvert par l'utilisateur
        // systemeSauvegarde.chargerBlueprint("dernier_projet.json");

        // Et on allume le cœur du moteur (en pause par défaut dans l'éditeur)
        boucleDeJeu.demarrer();
    }
}
