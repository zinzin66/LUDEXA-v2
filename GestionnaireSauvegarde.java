// Fichier : GestionnaireSauvegarde.java
// Nécessitera plus tard d'importer la librairie Gson : import com.google.gson.Gson;

public class GestionnaireSauvegarde {

    // public Gson gson; // Décommenté quand la librairie sera installée

    public GestionnaireSauvegarde() {
        // La logique future dira : 
        // this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    // Prend un Blueprint et le transforme en fichier texte
    public void sauvegarderBlueprint(Blueprint blueprintASauver, String cheminFichier) {
        // La logique future dira :
        // 1. "Transforme l'objet blueprintASauver en chaîne de caractères JSON avec gson.toJson()"
        // 2. "Ouvre le fichier situé à cheminFichier"
        // 3. "Écris le texte JSON dedans et ferme le fichier"
    }

    // Lit un fichier texte et recrée les nœuds visuels
    public Blueprint chargerBlueprint(String cheminFichier) {
        Blueprint blueprintCharge = null;
        
        // La logique future dira :
        // 1. "Lis le texte du fichier situé à cheminFichier"
        // 2. "Transforme le texte JSON en objet Java Blueprint avec gson.fromJson()"
        // 3. blueprintCharge = resultatDeGson;
        
        return blueprintCharge;
    }
}
