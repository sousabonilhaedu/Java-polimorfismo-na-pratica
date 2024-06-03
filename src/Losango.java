public class Losango extends FiguraGeometrica{
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(String nome, double diagonalMaior, double diagonalMenor){
        super(nome);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double getArea(){
        return (diagonalMaior * diagonalMenor) / 2;
    }

    @Override
    public String getDescricao(){
        return String.format("Losango: diagonal maior = %.2f, diagonal menor = %.2f", diagonalMaior, diagonalMenor);
    }

    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }
}
