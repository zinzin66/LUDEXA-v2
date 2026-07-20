// Représente un objet visuel tel qu'il est lu ou sauvegardé dans le JSON[span_7](start_span)[span_7](end_span)
public class ObjetSceneData {
    public String id;[span_8](start_span)[span_8](end_span)
    public String type;[span_9](start_span)[span_9](end_span)
    public float x;[span_10](start_span)[span_10](end_span)
    public float y;[span_11](start_span)[span_11](end_span)
    
    // L'utilisation de "Float" (avec majuscule) permet d'avoir une valeur null
    // si l'objet n'a pas de largeur/hauteur définie dans le JSON (ex: le Texte)[span_12](start_span)[span_12](end_span)
    public Float largeur;[span_13](start_span)[span_13](end_span)
    public Float hauteur;[span_14](start_span)[span_14](end_span)
    
    // Propriétés spécifiques
    public String cleTraduction;[span_15](start_span)[span_15](end_span)
    public String blueprintId; // Pour relier un bouton à sa logique[span_16](start_span)[span_16](end_span)
}
