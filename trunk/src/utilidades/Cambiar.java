package utilidades;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pato
 */
public class Cambiar {

    /**
     *
     * @param form
     * @param rutaIcono
     */
    public static void iconoDeFormulario(javax.swing.JFrame form, String rutaIcono) {
        form.setIconImage(new javax.swing.ImageIcon(form.getClass().getResource(rutaIcono)).getImage());
    }

    /**
     *
     * @param form
     * @param redimensionable
     * @param titulo
     */
    public static void tamañoDeFormulario(javax.swing.JFrame form, boolean redimensionable, String titulo) {
        form.setBounds(0, 0, (int) form.getPreferredSize().getWidth() + 20, (int) form.getPreferredSize().getHeight() + 50);
        form.setLocationRelativeTo(null);
        form.setResizable(redimensionable);
        form.setTitle(titulo);
    }

    public static void fondoDeLabel(javax.swing.JFrame form, javax.swing.JLabel lbl, String rutaImagen){
        lbl.setIcon(new javax.swing.ImageIcon(form.getClass().getResource(rutaImagen)));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        lbl.setBounds(5, 5, new javax.swing.ImageIcon(form.getClass().getResource(rutaImagen)).getIconWidth(), new javax.swing.ImageIcon(form.getClass().getResource(rutaImagen)).getIconHeight());
    }

    public static void fondoDeLabel(javax.swing.JLabel lbl, java.awt.Color color){
        lbl.setBackground(color);
    }
}
