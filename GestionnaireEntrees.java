// Fichier : GestionnaireEntrees.java

public class GestionnaireEntrees {

    // Références vers nos espaces de travail pour leur envoyer les commandes
    public CanvasScene canvasActif;
    public PlanTravailBlueprint blueprintActif;

    // Variables pour mémoriser l'état du tactile
    public boolean estEnTrainDeGlisser;
    public float dernierX;
    public float dernierY;

    public GestionnaireEntrees() {
        this.canvasActif = null;
        this.blueprintActif = null;
        this.estEnTrainDeGlisser = false;
    }

    // Méthode appelée quand l'utilisateur pose UN doigt sur l'écran
    public void gererAppui(float x, float y) {
        this.dernierX = x;
        this.dernierY = y;
        this.estEnTrainDeGlisser = true;
        
        // La logique future dira : 
        // 1. "Est-ce qu'on est sur le Canvas ou le Blueprint ?"
        // 2. "Vérifie s'il y a un NoeudBase ou un ObjetBase sous ces coordonnées (x, y)"
        // 3. "Si oui, sélectionne-le."
    }

    // Méthode appelée quand l'utilisateur bouge son doigt (Drag / Pan)
    public void gererGlissement(float x, float y) {
        if (this.estEnTrainDeGlisser) {
            float deplacementX = x - this.dernierX;
            float deplacementY = y - this.dernierY;

            // Si un Blueprint est actif, on déplace la caméra
            if (this.blueprintActif != null) {
                this.blueprintActif.deplacerCamera(deplacementX, deplacementY);
            }

            // Mise à jour des coordonnées pour la prochaine image
            this.dernierX = x;
            this.dernierY = y;
        }
    }

    // Méthode appelée quand l'utilisateur retire son doigt de l'écran
    public void gererRelachement() {
        this.estEnTrainDeGlisser = false;
        
        // La logique future dira : 
        // "Si on était en train de tirer un câble depuis un Port, vérifie si on l'a lâché sur un autre Port compatible, sinon détruis le câble."
    }

    // Méthode appelée quand l'utilisateur utilise DEUX doigts (Pinch-to-zoom)
    public void gererZoom(float facteurZoom) {
        if (this.blueprintActif != null) {
            this.blueprintActif.ajusterZoom(facteurZoom);
        }
        
        if (this.canvasActif != null) {
            // Le Canvas pourra aussi avoir une méthode ajusterZoom à l'avenir !
        }
    }
}

