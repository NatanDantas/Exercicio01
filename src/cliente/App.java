package cliente;

import composite.Component;
import composite.Composite;
import composite.Leaf;

public class App {
    public static void main(String[] args) throws Exception {

        Composite c1 = new Composite("Departamento de TI");
        Composite c2 = new Composite("Departamento de RH");
        Composite c3 = new Composite("Departamento de Vendas");
        Composite c4 = new Composite("Departamento de Marketing");
        Composite c5 = new Composite("Departamento de Compras");

        Component l1 = new Leaf("Departamento de TI", 1000, 10);
        Component l2 = new Leaf("Departamento de RH", 2000, 20);
        Component l3 = new Leaf("Departamento de Vendas", 3000, 30);
        Component l4 = new Leaf("Departamento de Marketing", 4000, 40);
        Component l5 = new Leaf("Departamento de Compras", 5000, 50);

        c1.add(l1);
        c2.add(l2);
        c3.add(l3);
        c4.add(l4);
        c5.add(l5);

        System.out.println(c1);
        
    }
}
