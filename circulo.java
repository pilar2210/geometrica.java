public class Circulo extends Figura2D {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [nombre=" + getNombre() + ", radio=" + radio + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circulo other = (Circulo) obj;
        if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
            return false;
        return true;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    
}
