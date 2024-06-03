public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea(){
        return (base * altura) / 2;
    }
    @Override
    public String getDescricao(){
        return String.format("Triangulo: base = %.2f, altura = %.2f", base, altura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
}
