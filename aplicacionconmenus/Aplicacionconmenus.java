/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

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
