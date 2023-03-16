package composite;

import java.util.*;

public class Composite implements Component {
    private List<Component> lista;
    private String nome;

    public Composite(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public void add(Component c) {
        this.lista.add(c);
    }

    public void remove(Component c) {
        this.lista.remove(c);
    }

    @Override
    public double getCusto() {
        double custo = 0;
        for (Component c : this.lista) {
            custo += c.getCusto();
        }
        return custo;
    }

    @Override
    public int getFuncionarios() {
        int funcionarios = 0;
        for (Component c : this.lista) {
            funcionarios += c.getFuncionarios();
        }
        return funcionarios;
    }

    @Override
    public String toString() {
        return "Composite [lista=" + lista + ", nome=" + nome + "]";
    }

}
