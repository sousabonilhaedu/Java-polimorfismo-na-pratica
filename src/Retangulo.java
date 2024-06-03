public class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(String nome, double base, double altura){
        super(nome);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double getArea(){
        return base * altura;
    }

    @Override
    public String getDescricao(){
        return String.format("Retangulo: base = %.2f, altura = %.2f", base, altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
}
