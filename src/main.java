
public class main {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrado(4);
        FiguraGeometrica triangulo = new Triangulo(5, 3, 5, 4, 3);
        FiguraGeometrica rectangulo = new Rectangulo(6, 2);
        FiguraGeometrica rombo = new Rombo(3, 5, 4);

        System.out.println("==========================================================");
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
        
        System.out.println("==========================================================");
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        
        System.out.println("==========================================================");
        System.out.println("Figura: " + rectangulo.getNombre());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("==========================================================");
        System.out.println("Figura: " + rombo.getNombre());
        System.out.println("Área del rombo: " + rombo.calcularArea());
        System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());
        System.out.println("==========================================================");
    }

    }
