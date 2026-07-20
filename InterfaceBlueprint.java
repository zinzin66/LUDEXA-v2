// L'écran où l'on relie les comportements et conditions[span_140](start_span)[span_140](end_span)
public class InterfaceBlueprint {
    
    // Bandeau Supérieur
    public Object controlesHaut; // Contient Voir le Code, Undo/Redo, Zoom...[span_141](start_span)[span_141](end_span)
    
    // Panneau Gauche
    public Object panneauGauche; // La liste de tous les nœuds disponibles[span_142](start_span)[span_142](end_span)
    
    // Zone Centrale
    public Object espaceTravail; // Le plan infini où l'on relie les câbles[span_143](start_span)[span_143](end_span)
    
    // Fenêtre Contextuelle (Pop-up)
    public Object popupSaisieValeur; // Le clavier numérique et choix des variables[span_144](start_span)[span_144](end_span)

    public InterfaceBlueprint() {
        // Initialisation[span_145](start_span)[span_145](end_span)
    }

    public void ouvrirPopupSaisie(Port entreeCible) {
        // Affiche la fenêtre avec les variables, la scène et le clavier numérique[span_146](start_span)[span_146](end_span)
    }
}

