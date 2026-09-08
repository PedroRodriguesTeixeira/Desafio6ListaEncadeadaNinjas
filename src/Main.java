import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int qntDeNinjasCadastrados = 7;

        // Iniciar um LinkedList com 7 ninjas
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        listaDeNinjas.add(new Ninja("Vila da folha", "Naruto Uzumaki", 17));
        listaDeNinjas.add(new Ninja("Vila da folha", "Sasuke Uchiha", 17));
        listaDeNinjas.add(new Ninja("Vila da folha", "Sakura Haruno", 17));
        listaDeNinjas.add(new Ninja("Vila da folha", "Kakashi Hatake", 38));
        listaDeNinjas.add(new Ninja("Vila da folha", "Jiraya", 57));
        listaDeNinjas.add(new Ninja("Vila da folha", "Obito Uchiha", 37));
        listaDeNinjas.add(new Ninja("Vila da folha", "Hinata Hyuga", 17));


        // Adicionar o ninja no início da lista
        System.out.println("-----Adicionando no inicio da lista-----");
        listaDeNinjas.addFirst(new Ninja("Vila da folha", "Boruto Uzumaki", 3));
        System.out.println("listaDeNinjas = " + listaDeNinjas);
        System.out.println();

        //Remover o ninja no início da lista
        System.out.println("-----Removendo no inicio da lista-----");
        Ninja removido = listaDeNinjas.removeFirst();
        System.out.println("Ninja removido foi: " + removido);
        System.out.println();

        //Listar os ninjas
        //Comexidade o(n)
        System.out.println("-----Lista de ninjas------");

        for(Ninja n: listaDeNinjas) {
            System.out.println(n);
        }

        System.out.println();

        //Procurar um ninja por indice
        for (int i = 0; i < listaDeNinjas.size(); i++) {
            int index = listaDeNinjas.indexOf(listaDeNinjas.get(i));
            System.out.println("O index do ninja " + listaDeNinjas.get(i).getNome() + " foi encontrada " + index);
        }

    }
}
