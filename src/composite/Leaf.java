package composite;

public class Leaf implements Component {
    private String nome;
    private double custo;
    private int funcionarios;

    public Leaf(String nome, double custo, int funcionarios) {
        this.nome = nome;
        this.custo = custo;
        this.funcionarios = funcionarios;
    }

    public double getCusto() {
        return this.custo;
    }

    public int getFuncionarios() {
        return this.funcionarios;
    }

    @Override
    public String toString() {
        return "Leaf [custo=" + custo + ", funcionarios=" + funcionarios + ", nome=" + nome + "]";
    }

}
