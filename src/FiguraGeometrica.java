//  o que desenvolver****
// 1.atributo nome para guardar o nome da figura
// 2.getArea abstrato que retorna um valor double
// 3.getDescricao abstrato que retorna um valor String
public abstract class FiguraGeometrica {
    private String nome;

    public FiguraGeometrica(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getArea();
    public abstract String getDescricao();
}


