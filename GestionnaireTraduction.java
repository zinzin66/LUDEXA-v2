import java.util.HashMap;
import java.util.Map;

// S'occupe de stocker et de fournir les textes dans la langue choisie
public class GestionnaireTraduction {
    
    public String langueActuelle;
    public String langueParDefaut;
    
    // Dictionnaire associant une clé (ex: "Bouton_Jouer") à sa traduction (ex: "Play")
    public Map<String, String> textesTraduits;

    public GestionnaireTraduction() {
        this.langueActuelle = "fr";
        this.langueParDefaut = "en";
        this.textesTraduits = new HashMap<>();
    }

    // Étape 1 : Charger le fichier de la langue demandée
    public void définirLangue(String codeLangue) {
        this.langueActuelle = codeLangue;
        this.textesTraduits.clear();
        
        // Logique future : 
        // 1. Lire le fichier assets/i18n/[codeLangue].json
        // 2. Remplir le dictionnaire 'textesTraduits' avec les paires clé/valeur
    }

    // Étape 2 : Récupérer un texte pour l'afficher à l'écran
    public String getTexte(String cle) {
        if (textesTraduits.containsKey(cle)) {
            return textesTraduits.get(cle);
        }
        
        // Sécurité : si la traduction manque, on affiche la clé pour faciliter le débogage
        return "[" + cle + "]"; 
    }
}
