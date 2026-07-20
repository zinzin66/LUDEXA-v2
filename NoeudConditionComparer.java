// Fichier : NoeudConditionComparer.java

public class NoeudConditionComparer extends NoeudBase {

    public NoeudConditionComparer() {
        super("Cond_Comparer", "Comparer deux valeurs", "Condition");
        
        // 1. Entrées (Données) : Les deux choses à comparer (ex: "Score" et "100")
        this.ajouterPort(new Port("Valeur A", Port.TYPE_DONNEE_ENTREE));
        this.ajouterPort(new Port("Valeur B", Port.TYPE_DONNEE_ENTREE));
        
        // La logique future ajoutera un menu déroulant visuel pour choisir l'opérateur : (Égal à, Plus grand que, Plus petit que...)

        // 2. Sortie (Donnée) : La réponse à la question (Vrai ou Faux)
        this.ajouterPort(new Port("Résultat", Port.TYPE_DONNEE_SORTIE));
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Fais le calcul mathématique entre A et B."
        // 2. "Stocke la réponse (Vrai ou Faux) dans le port 'Résultat' pour que le Nœud 'Si' puisse s'en servir."
    }
}
