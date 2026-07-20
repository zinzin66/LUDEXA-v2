// Contient les réglages spécifiques pour la création de l'application Android[span_109](start_span)[span_109](end_span)
public class ParametresExport {
    
    public String nomApplication;[span_110](start_span)[span_110](end_span)
    public String nomPackage; // Identifiant unique (ex: com.tonnom.monjeu)[span_111](start_span)[span_111](end_span)
    public String orientation; // "portrait" ou "paysage[span_112](start_span)"[span_112](end_span)
    public String cheminIcone;[span_113](start_span)[span_113](end_span)
    public int codeVersion;[span_114](start_span)[span_114](end_span)

    public ParametresExport(String nomApp, String nomPackage) {
        this.nomApplication = nomApp;[span_115](start_span)[span_115](end_span)
        this.nomPackage = nomPackage;[span_116](start_span)[span_116](end_span)
        this.orientation = "portrait";[span_117](start_span)[span_117](end_span)
        this.cheminIcone = "assets/icone.png";[span_118](start_span)[span_118](end_span)
        this.codeVersion = 1;[span_119](start_span)[span_119](end_span)
    }
}

