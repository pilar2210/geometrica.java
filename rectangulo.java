public class Rectangulo extends Figura2D{
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [nombre=" + getNombre() + ", base=" + base + ", altura=" + altura + "]";
    }
    
  
    
  
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangulo other = (Rectangulo) obj;
        if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base))
            return false;
        if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
            return false;
        return true;
    }
    @Override
    public double calcularPerimetro() {
        return 2*base + 2*altura;
    }
    
    
    
}
