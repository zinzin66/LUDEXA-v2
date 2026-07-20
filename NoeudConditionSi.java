// Fichier : NoeudConditionSi.java

public class NoeudConditionSi extends NoeudBase {

    public NoeudConditionSi() {
        super("Cond_Si", "Branchement (Si... Sinon)", "Condition");
        
        // 1. Entrée (Exécution) : Le câble qui vient d'un événement pour lancer la vérification
        this.ajouterPort(new Port("Entrer", Port.TYPE_EXECUTION_ENTREE));

        // 2. Entrée (Donnée) : L'affirmation à vérifier (ex: un câble qui apporte un "Vrai" ou "Faux")
        this.ajouterPort(new Port("Condition", Port.TYPE_DONNEE_ENTREE));
        
        // 3. Sorties (Exécution) : Les deux chemins possibles
        this.ajouterPort(new Port("Si Vrai", Port.TYPE_EXECUTION_SORTIE));
        this.ajouterPort(new Port("Si Faux", Port.TYPE_EXECUTION_SORTIE));
    }

    @Override
    public void executer() {
        // La logique future dira :
        // 1. "Regarde ce qui arrive dans le port 'Condition'."
        // 2. "Si c'est VRAI, dis au MoteurLogique de lire la suite sur le câble 'Si Vrai'."
        // 3. "Si c'est FAUX, lis la suite sur le câble 'Si Faux'."
    }
}
