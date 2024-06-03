public class Trapezio extends FiguraGeometrica{
    private double baseMaior;
    private double base;
    private double altura;

    public Trapezio(String nome, double baseMaior, double base, double altura){
        super(nome);
        this.altura = altura;
        this.base = base;
        this.baseMaior = baseMaior;
    }

    @Override
    public double getArea(){
        return (base + baseMaior) * altura / 2;
    }

    @Override
    public String getDescricao(){
        return String.format("Trapezio: base menor = %.2f, base maior = %.2f, altura = %.2f", base, baseMaior, altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getBaseMaior() {
        return baseMaior;
    }
}
