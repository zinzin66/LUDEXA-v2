import java.util.HashMap;
import java.util.Map;

// S'occupe de charger et de stocker les fichiers lourds (Images, Sons, Polices)
public class GestionnaireAssets {
    
    // Un dictionnaire qui associe un nom (ex: "hero.png") à ses données brutes
    public Map<String, Object> imagesChargees;
    public Map<String, Object> sonsCharges;

    public GestionnaireAssets() {
        this.imagesChargees = new HashMap<>();
        this.sonsCharges = new HashMap<>();
    }

    // Méthode pour demander une image
    public void chargerImage(String assetId, String cheminFichier) {
        // Si l'image n'est pas déjà en mémoire, on la charge
        if (!imagesChargees.containsKey(assetId)) {
            // Logique future d'importation du fichier
            Object donneesImage = new Object(); 
            imagesChargees.put(assetId, donneesImage);
        }
    }
    
    // Méthode pour vider la mémoire lors d'un changement de scène
    public void viderMemoire() {
        imagesChargees.clear();
        sonsCharges.clear();
    }
}
