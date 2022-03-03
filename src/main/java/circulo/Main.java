package circulo;

import java.text.DecimalFormat;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Pruebas de refactorización en NetBeans con la clase Aro
 * @author Ricardo Sans
 */
public class Main {
    /**
     * Implementacion de la clase Aro
     * @param args
     */
    public static void main(String[] args) {
        
        Aro circulo = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+circulo.getCoordenadaX()+
                "\nA coordenada Y é "+circulo.getCoordenadaY()+
                "\nO radio é "+circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.setRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(circulo.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(circulo.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(circulo.obterSuperficie());
        
        String texto="";
        String logmensaje=texto + saida;
        final Logger mensaje;
        mensaje = Logger.getLogger("objeto");
       
        mensaje.log(Level.INFO,logmensaje);
        System.exit(0);
    }

}