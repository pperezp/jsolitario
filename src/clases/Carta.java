/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pato
 */
public class Carta implements java.io.Serializable {

    private int pinta;
    private int numero;
//    private Carta siguiente;
//    private Carta anterior;
    private boolean jocker;
    private int colorCarta;

    public Carta(int pinta, int numero, int colorCarta/*, Carta siguiente, Carta anterior*/) {
        this.pinta = pinta;
        this.numero = numero;
//        this.siguiente = siguiente;
//        this.anterior = anterior;
        this.colorCarta = colorCarta;
        this.jocker = false;
    }

    public Carta(int color) {
        this.jocker = true;
        this.colorCarta = color;
    }

    /**
     * @return the pinta
     */
    public String getPinta() {
        switch(pinta){
            case Pinta.CORAZON:{
                return "Corazon";
            }
            case Pinta.DIAMANTE:{
                return "Diamante";
            }
            case Pinta.PICA:{
                return "Pica";
            }
            case Pinta.TREBOL:{
                return "Trebol";
            }
        }
        return null;
    }

    /**
     * @param pinta the pinta to set
     */
    public void setPinta(int pinta) {
        this.pinta = pinta;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the siguiente
     */
//    public Carta getSiguiente() {
//        return siguiente;
//    }
//
//    /**
//     * @param siguiente the siguiente to set
//     */
//    public void setSiguiente(Carta siguiente) {
//        this.siguiente = siguiente;
//    }
//
//    /**
//     * @return the anterior
//     */
//    public Carta getAnterior() {
//        return anterior;
//    }
//
//    /**
//     * @param anterior the anterior to set
//     */
//    public void setAnterior(Carta anterior) {
//        this.anterior = anterior;
//    }

    /**
     * @return the jocker
     */
    public boolean isJocker() {
        return jocker;
    }

    /**
     * @param jocker the jocker to set
     */
    public void setJocker(boolean jocker) {
        this.jocker = jocker;
    }


    /**
     * @return the colorCarta
     */
    public String getColorCarta() {
        switch(colorCarta){
            case ColorCarta.AZUL:{
                return "azul";
            }
            case ColorCarta.ROJA:{
                return "roja";
            }
        }
        return null;
    }
    

    /**
     * @param colorCarta the colorCarta to set
     */
    public void setColorCarta(int colorCarta) {
        this.colorCarta = colorCarta;
    }

    public String getNombreCompletoDeCarta(){
        return getNumero() + " de " + this.getPinta();
    }
}
