
package Controlador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import Controlador.Constantes;
import Vista.Escenario;

/**
 *
 * 
 */
public class IniciarEscenario extends Escenario {

    private Image imgStart;
    private Image imgExit;
    private Image fondo;

    public IniciarEscenario() {
        try {
            this.imgStart = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Constantes.CAMINO + "button_start.png");
            this.imgExit = Toolkit.getDefaultToolkit().getImage(new File(".").getCanonicalPath() + Constantes.CAMINO + "button_exit.png");
            this.fondo = Toolkit.getDefaultToolkit().getImage(new File(".").getCanonicalPath() + Constantes.CAMINO + "background_pacman1.png");
        } catch (IOException e) {
            System.err.println("Erro: Imagenes de pantalla no encontradas\n " + e.getMessage());
        }
    }

    @Override
    public void paintScene(Graphics g) {
        int aux = Constantes.TAMANIO_CELDA * Constantes.NUM_CELDA;
        g.fillRect(0, 0, aux, aux + 50);
        g.drawImage(fondo, 0, 0, aux, aux+50, null);
        g.drawImage(imgStart, (aux/2)-120,240,220,60, null);
        g.drawImage(imgExit, (aux/2)-120,300, 220, 70, null);
    }

    @Override
    protected void drawSceneFinal() {
    }

}
