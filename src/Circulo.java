public class Circulo extends FiguraGeometrica{
    private double raio;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    @Override
    public double getArea(){
        return Math.PI * raio * raio;
    }
    @Override
    public String getDescricao(){
        return String.format("Circulo: raio = %.2f", raio);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
}
