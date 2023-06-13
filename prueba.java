import java.util.ArrayList;


public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> listaFiguras = new ArrayList<>();

        listaFiguras.add(new Circulo("Circulo1", 1.0));
        listaFiguras.add(new Triangulo("Triangulo1", 2.0, 3.0, 4.0));

        Rectangulo r1 = new Rectangulo("Rectangulo1", 2.5, 4.8);
        listaFiguras.add(r1);

        Circulo c1 = new Circulo("Circulo2", 2.0);
        listaFiguras.add(c1);

        //for (int i=0; i<listaFiguras.size(); i++) {
        for (Figura2D f : listaFiguras) {
            // Figura2D f = listaFiguras.elementAt(i);
            System.out.println("Nombre: " + f.getNombre());
            System.out.println("Perimetro: " + f.calcularPerimetro());
        }
    }
}
