public class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado;
    }

    @Override
    public double getArea(){
        return lado * lado;
    }
    @Override
    public String getDescricao(){
        return String.format("Quadrado: lado = %.2f", lado);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
