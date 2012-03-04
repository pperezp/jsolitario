/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Point;
import javax.swing.JLabel;

/**
 *
 * @author pato
 */
public class Pixel {

    public static Point getXy1(JLabel lbl) {
        return new Point(lbl.getX(), lbl.getY());
    }

    public static Point getXy2(JLabel lbl) {
        return new Point(lbl.getX() + 120, lbl.getY() + 170);
    }

    public static void imprimirXy(javax.swing.JLabel lbl) {
        System.out.println("---------------------------------");
        System.out.println("x1 = " + getXy1(lbl).getX() + " y1 = " + getXy1(lbl).getY());
        System.out.println("x2 = " + getXy2(lbl).getX() + " y2 = " + getXy2(lbl).getY());
        System.out.println("---------------------------------");
    }

    public static boolean puntoEstaDentro(Point p, JLabel lbl) {
        if ((p.getX() >= getXy1(lbl).getX() && p.getX() <= getXy2(lbl).getX())
                && (p.getY() >= getXy1(lbl).getY() && p.getY() <= getXy2(lbl).getY())) {
            return true;
        } else {
            return false;
        }
    }
}
