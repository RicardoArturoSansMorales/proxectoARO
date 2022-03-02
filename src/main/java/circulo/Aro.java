package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Ricardo Sans
 */
public class Aro {
    /**
     * MINIMO valor minimo del radio
     */
    public static final double MINIMO = 0.0;
    /**
     *LIMITERADIO valor minimo del radio
     */
    public static final double LIMITERADIO=0.0; 
    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    /**
     * Constructor sin parametros de la clase Aro
     */
    public Aro() {
    }
    /**
     * Constructor de la clase Aro
     * @param valorX valor coordenada x del centro del aro
     * @param valorY valor coordenada y del centro del aro
     * @param valorRadio valor del radio del aro
     */

    public Aro(int valorX, int valorY, double valorRadio) {
        setCoordenadaX(valorX);
        setCoordenadaY(valorY);
        setRadio(valorRadio);
    }


/**
 * Proporciona el diametro de un aro
 * @return devuelve un double
 */
    public double obterDiametro() {
        return getRadio() * 2;
    }
    /**
     * Optiene el perimetro del aro
     * @return devuelve un double
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
    /**
     * Devuelve el area del aro
     * @return devuelve un double
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
    /**
     * desplaza el aro segun el nuevo centro
     * @param trasladarX movimiento en X
     * @param trasladarY movimiento en Y
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(trasladarX + getCoordenadaX());
        setCoordenadaY(trasladarY + getCoordenadaY());
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return this.radio;
    }

    /**
     * @param valorRadio es el valor al que setearemos el radio del aro
     */
    public void setRadio(double valorRadio) {

        this.radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }
    
    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }
}