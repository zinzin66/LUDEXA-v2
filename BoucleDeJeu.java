// Le cœur du moteur qui tourne en continu quand le jeu est lancé[span_48](start_span)[span_48](end_span)
public class BoucleDeJeu {
    
    public boolean jeuEnCours;[span_49](start_span)[span_49](end_span)
    public Scene sceneActive;[span_50](start_span)[span_50](end_span)

    public BoucleDeJeu() {
        this.jeuEnCours = false;[span_51](start_span)[span_51](end_span)
    }

    // 1. ÉTAPE DE MISE À JOUR (Logique)[span_52](start_span)[span_52](end_span)
    // deltaTime représente le temps écoulé depuis la dernière image[span_53](start_span)[span_53](end_span)
    public void update(float deltaTime) {
        if (!jeuEnCours || sceneActive == null) return;[span_54](start_span)[span_54](end_span)
        
        // Ici, le moteur lira le Blueprint de la scène[span_55](start_span)[span_55](end_span)
        // et mettra à jour les positions X/Y des objets, les chronomètres, etc.[span_56](start_span)[span_56](end_span)
    }

    // 2. ÉTAPE DE RENDU (Visuel)[span_57](start_span)[span_57](end_span)
    public void render() {
        if (!jeuEnCours || sceneActive == null) return;[span_58](start_span)[span_58](end_span)
        
        // Ici, le moteur parcourt la liste des objets de la scène[span_59](start_span)[span_59](end_span)
        // et les dessine à l'écran (Sprites, Textes, Boutons...)[span_60](start_span)[span_60](end_span)
    }
}

