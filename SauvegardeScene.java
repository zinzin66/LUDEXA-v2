// Traduit les éléments visuels en texte de sauvegarde
public class SauvegardeScene {
    
    public String genererJSON(InterfacePrincipale editeur) {
        // 1. On prépare un conteneur JSON vide
        // 2. On boucle sur tous les objets posés sur le Canvas (Sprites, Textes...)
        // 3. Pour chaque objet, on note méthodiquement :
        //    - Son type
        //    - Sa position X et Y
        //    - Ses dimensions
        //    - Les réglages de l'Inspecteur (Couleur, Opacité, Clé de traduction)
        // 4. On récupère et ajoute les Variables Locales de la scène
        // 5. On retourne le tout sous forme de texte structuré
        return "texte_json_final";
    }
}
