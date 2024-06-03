import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Retangulo retangulo = new Retangulo("Retangulo exemplo",5.0 ,8.0 );
    Triangulo triangulo = new Triangulo("Triangulo exemplo",6.0 ,5.0 );
    Circulo circulo = new Circulo("Circulo exemplo", 4.0 );
    Losango losango = new Losango("Losango exemplo", 5.0, 4.0);
    Quadrado quadrado = new Quadrado("Quadrado exemplo", 5.0);
    Trapezio trapezio = new Trapezio("Trapezio exemplo", 6.0, 4.0, 3.0);

    retangulo.setBase(4.0);
    retangulo.setAltura(6.0);

    triangulo.setBase(5.0);
    triangulo.setAltura(9.0);

    circulo.setRaio(6.0);

    losango.setDiagonalMaior(5.0);
    losango.setDiagonalMenor(3.0);

    quadrado.setLado(4.5);

    trapezio.setBase(5.0);
    trapezio.setBaseMaior(7.0);
    trapezio.setAltura(4.0);

        List<FiguraGeometrica> listaFiguraGeometricas = new ArrayList<>();
        listaFiguraGeometricas.add(retangulo);
        listaFiguraGeometricas.add(triangulo);
        listaFiguraGeometricas.add(circulo);
        listaFiguraGeometricas.add(losango);
        listaFiguraGeometricas.add(quadrado);
        listaFiguraGeometricas.add(trapezio);

        for (FiguraGeometrica figuraGeometrica : listaFiguraGeometricas){
            System.out.println(figuraGeometrica.getDescricao());
            System.out.printf("Área da figura: %.2f \n", figuraGeometrica.getArea());
        }
    }
}