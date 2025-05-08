public class Rombo implements FiguraGeometrica {
    private double lado, diagonalMayor, diagonalMenor;

    public Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
    public String getNombre() {
        return "Rombo";
    }
}