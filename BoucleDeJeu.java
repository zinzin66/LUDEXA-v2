// Le cœur du moteur qui tourne en continu quand le jeu est lancé
public class BoucleDeJeu {
    
    public boolean jeuEnCours;
    public Scene sceneActive;

    public BoucleDeJeu() {
        this.jeuEnCours = false;
    }

    // 1. ÉTAPE DE MISE À JOUR (Logique)
    // deltaTime représente le temps écoulé depuis la dernière image
    public void update(float deltaTime) {
        if (!jeuEnCours || sceneActive == null) return;
        
        // Ici, le moteur lira le Blueprint de la scène
        // et mettra à jour les positions X/Y des objets, les chronomètres, etc.
    }

    // 2. ÉTAPE DE RENDU (Visuel)
    public void render() {
        if (!jeuEnCours || sceneActive == null) return;
        
        // Ici, le moteur parcourt la liste des objets de la scène
        // et les dessine à l'écran (Sprites, Textes, Boutons...)
    }
}
