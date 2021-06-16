package Logica;

import IGU.Vista;
import IGU.VistaAdd;

public class Main {

    public static void main(String[] args) {

        VistaAdd pantalla = new VistaAdd();
        Vista vista = new Vista();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
       vista.setLocationRelativeTo(null);
        pantalla.setResizable(false);
        vista.setResizable(false);

    }

}
