// Fichier : GestionnaireVariables.java
import java.util.ArrayList;
import java.util.List;

public class GestionnaireVariables {

    // Deux boîtes séparées pour classer nos données
    private List<Variable> variablesGlobales;
    private List<Variable> variablesLocales;

    public GestionnaireVariables() {
        this.variablesGlobales = new ArrayList<>();
        this.variablesLocales = new ArrayList<>();
    }

    public void enregistrerVariableGlobale(Variable var) {
        // Ajoute une variable qui ne sera jamais effacée pendant la session
    }

    public void enregistrerVariableLocale(Variable var) {
        // Ajoute une variable propre au niveau actuel
    }

    public Variable trouverVariable(String nom) {
        // La logique future dira :
        // 1. "Cherche d'abord dans les variables locales."
        // 2. "Si introuvable, cherche dans les globales."
        // 3. "Renvoie la variable trouvée."
        return null; 
    }

    public void viderMemoireLocale() {
        // Sera appelé par le NoeudActionChargerScene !
        // Logique : "Efface toute la liste des variables locales pour faire place nette."
    }
}

