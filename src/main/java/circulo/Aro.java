package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author David Fernández Teijeiro
 */
public class Aro {

    /**
     * Limite del radio
     */
    public static final double LIMITERADIO = 0.0;
    
    /**
     * Minimo del radio
     */
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    
    /**
     *@Aro
     */
    public Aro() {
    }

    /**
     * Valores de las coordenadas X e Y y del radio
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Obtiene el diametro
     * @return
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Obtiene la circunferencia
     * @return
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Obtiene la superficie
     * @return
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Obtiene el centro
     * @return
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Desplaza las cordenadas del centro
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
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
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}