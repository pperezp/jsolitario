/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author pato
 */
public class Mazo implements Serializable{

    private java.util.Random r = new java.util.Random();
    private List mazo = new ArrayList();

    public Mazo(boolean mazoOrdenado) {
        Carta[] m = new Carta[104];

        if(!mazoOrdenado){
            int i;
            for(int color = 0; color < 2; color++){
                for(int pinta = 1; pinta <= 4; pinta++){
                    for(int numero = 1; numero <= 13 ; numero++){
                        do{
                            i = r.nextInt(104);
                        }while(m[i] != null);

                        m[i] = new Carta(pinta, numero, color);
                    }
                }
            }

/*              For para inicializar los Jockers random                */
//            for (int color = 0; color < 2; color++) {
//                for (int pinta = 0; pinta < 2; pinta++) {
//                    do {
//                        i = r.nextInt(108);
//                    } while (mazo[i] != null);
//                    mazo[i] = new Carta(color);
//                }
//            }
        }else{
            int i=0;
            for(int color = 0; color < 2; color++){
                for(int pinta = 1; pinta <= 4; pinta++){
                    for(int numero = 1; numero <= 13 ; numero++){
                        m[i] = new Carta(pinta, numero, color);
                        i++;
                    }
                }
            }

/*              For para inicializar los jockers ordenadamente*/
//            for (int color = 0; color < 2; color++) {
//                for (int pinta = 0; pinta < 2; pinta++) {
//                    m[i] = new Carta(color);
//                }
//            }
        }
        mazo = deArregloAList(m);
        imprimirCartas();
    }

    private void imprimirCartas() {
        int ca = 0, cr = 0, cj = 0;
        for(int i=0; i<getMazo().size();i++){
            System.out.println("Color Carta: "+getCarta(i).getColorCarta());
            System.out.println("Pinta: "+getCarta(i).getPinta());
            System.out.println("Número: "+getCarta(i).getNumero());
            System.out.println("---------------------------");
            if(getCarta(i).getColorCarta().equalsIgnoreCase("azul"))ca++; else cr++;
            if(getCarta(i).isJocker()) cj++;
        }
        System.out.println("CANTIDAD DE CARTAS: "+ getMazo().size());
        System.out.println("CANTIDAD DE CARTAS ROJAS: "+cr);
        System.out.println("CANTIDAD DE CARTAS AZULES: "+ca);
        System.out.println("CANTIDAD DE JOCKERS: "+cj);
    }

    /**
     * @return the mazo
     */
    public Carta getCarta(int indice) {
        return (Carta)mazo.get(indice);
    }

    public List getMazo(){
        return mazo;
    }

    private List deArregloAList(Carta[] m) {
        List lista = new ArrayList();
        lista.addAll(Arrays.asList(m));
        return lista;
    }

//    private boolean isCarta(int numero, int pinta, int colorCarta) {
//        int cont = 0;
//        for (int i = 0; i < mazo.length; i++) {
//            if (mazo[i] != null) {
//                if (mazo[i].getNumero() == numero && mazo[i].getPinta() == pinta && mazo[i].getColorCarta() == colorCarta) {
//                    return true;
//                }
//                if (mazo[i].isJocker() && mazo[i].getColorCarta() == colorCarta) {
//                    cont++;
//                    if (cont == 2) {
//                        return true;
//                    }
//                }
//            }else{
//                break;
//            }
//        }
//        return false;
//    }
}
