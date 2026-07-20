// Se charge uniquement d'afficher les éléments visuels[span_120](start_span)[span_120](end_span)
public class MoteurGraphique {
    
    // Remarque : La classe 'Canvas' devra être importée ou définie plus tard selon le framework utilisé
    public void rendre(Object canvas, Scene sceneActuelle) {
        // 1. Nettoyer l'écran (effacer l'image précédente pour éviter les bavures)[span_121](start_span)[span_121](end_span)
        
        // 2. Trier les objets de la scène par ordre de superposition (Z-Index)[span_122](start_span)[span_122](end_span)
        //    (Pour s'assurer que le fond reste derrière et le joueur devant)[span_123](start_span)[span_123](end_span)
        
        // 3. Boucler sur tous les objets visibles :[span_124](start_span)[span_124](end_span)
        //    - Dessiner les Sprites (Images)[span_125](start_span)[span_125](end_span)
        //    - Dessiner les Textes (Scores, Dialogues)[span_126](start_span)[span_126](end_span)
        //    - Appliquer les filtres d'Opacité ou de Couleur si définis dans l'Inspecteur[span_127](start_span)[span_127](end_span)
    }
}

