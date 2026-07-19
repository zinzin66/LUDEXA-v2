// Contient les réglages spécifiques pour la création de l'application Android
public class ParametresExport {
    
    public String nomApplication;
    public String nomPackage; // Identifiant unique (ex: com.tonnom.monjeu)
    public String orientation; // "portrait" ou "paysage"
    public String cheminIcone;
    public int codeVersion;

    public ParametresExport(String nomApp, String nomPackage) {
        this.nomApplication = nomApp;
        this.nomPackage = nomPackage;
        this.orientation = "portrait";
        this.cheminIcone = "assets/icone.png";
        this.codeVersion = 1;
    }
}
