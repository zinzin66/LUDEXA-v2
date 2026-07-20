// Fichier : BouclePrincipale.java

public class BouclePrincipale {

    // Indique si le jeu est actuellement en train de tourner
    public boolean estEnMarche;

    // Références aux éléments que la boucle doit mettre à jour et dessiner
    public CanvasScene canvasActif;
    public MoteurLogique moteurLogique;

    public BouclePrincipale() {
        this.estEnMarche = false;
        this.canvasActif = null;
        this.moteurLogique = null;
    }

    // Méthode pour allumer le moteur (bouton Play)
    public void demarrer() {
        this.estEnMarche = true;
        // La logique future dira : "Lance cette boucle dans un processus (Thread) séparé pour ne pas bloquer l'interface du téléphone"
    }

    // Méthode pour éteindre le moteur (bouton Stop)
    public void arreter() {
        this.estEnMarche = false;
    }

    // C'est ici que la magie opère en continu
    public void executerBoucle() {
        while (this.estEnMarche) {
            
            // Étape 1 : On calcule tout (les maths, les déplacements, les nœuds)
            this.mettreAJour();

            // Étape 2 : On affiche le résultat à l'écran
            this.dessiner();

            // Étape 3 : On patiente (ex: 16 millisecondes) pour stabiliser à 60 images par seconde
            // La logique future dira : "Thread.sleep(16);"
        }
    }

    // Gère uniquement les calculs
    public void mettreAJour() {
        // La logique future dira : 
        // 1. "Est-ce qu'un objet est en train de tomber avec la gravité ?"
        // 2. "Est-ce que deux objets se touchent (collision) ?"
    }

    // Gère uniquement l'affichage
    public void dessiner() {
        if (this.canvasActif != null) {
            // La logique future dira : 
            // 1. "Efface l'image précédente (peins tout en noir)"
            // 2. "Demande au canvasActif de redessiner tous les objets à leurs nouvelles coordonnées"
        }
    }
}

