// Capte les interactions du joueur ou du créateur
public class GestionnaireEntrees {
    
    public float positionX;
    public float positionY;
    public boolean estPresse;

    public GestionnaireEntrees() {
        this.positionX = 0f;
        this.positionY = 0f;
        this.estPresse = false;
    }

    public void enregistrerPression(float x, float y) {
        this.positionX = x;
        this.positionY = y;
        this.estPresse = true;
    }

    public void enregistrerRelachement() {
        this.estPresse = false;
    }
}
