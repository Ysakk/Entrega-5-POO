package carreraciclistica.aplicacionconmenus;   

import javax.swing.JFrame;

/**
 *
 * @author Isaac
 */
public class Aplicacionconmenus {

    public static void main(String[] args) {
        VentanaPrincipal principal = new VentanaPrincipal();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.show(true);
    }
}
