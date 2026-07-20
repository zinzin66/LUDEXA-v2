// L'écran où l'on place les objets visuels[span_133](start_span)[span_133](end_span)
public class InterfacePrincipale {
    
    // Bandeau Supérieur
    public Object controlesHaut; // Contient Play, Build, Undo/Redo, Zoom, etc.[span_134](start_span)[span_134](end_span)
    
    // Zone Centrale
    public Object canvas; // La zone où l'on glisse-dépose les objets[span_135](start_span)[span_135](end_span)
    
    // Panneau Gauche (Rétractable et Accordéon)
    public Object panneauGauche; // Contient : Liste des scènes, Catalogue d'objets, Import Assets, Variables[span_136](start_span)[span_136](end_span)
    
    // Panneau Droit (Rétractable)
    public Object panneauDroit; // Contient : Les réglages de l'objet sélectionné (X, Y, Couleur, Texte...)[span_137](start_span)[span_137](end_span)

    public InterfacePrincipale() {
        // Le mode paysage est forcé ici[span_138](start_span)[span_138](end_span)
    }

    public void basculerVersBlueprint() {
        // Masque cet écran et affiche InterfaceBlueprint[span_139](start_span)[span_139](end_span)
    }
}

