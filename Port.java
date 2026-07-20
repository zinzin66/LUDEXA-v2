// Représente une entrée ou une sortie sur un nœud[span_89](start_span)[span_89](end_span)
public class Port {
    
    public String nom;[span_90](start_span)[span_90](end_span)
    public String type; // "exec" (le fil d'exécution blanc) ou "data" (le fil de donnée couleur)[span_91](start_span)[span_91](end_span)
    public String valeurSaisie; // Si l'utilisateur tape une valeur manuellement dans l'éditeur[span_92](start_span)[span_92](end_span)

    public Port(String nom, String type) {
        this.nom = nom;[span_93](start_span)[span_93](end_span)
        this.type = type;[span_94](start_span)[span_94](end_span)
        this.valeurSaisie = ""; // Vide par défaut[span_95](start_span)[span_95](end_span)
    }
}

