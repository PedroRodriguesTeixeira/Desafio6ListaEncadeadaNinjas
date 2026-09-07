import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int qntDeNinjasCadastrados = 7;

        // Iniciar um LinkedList com 7 ninjas
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();
        Ninja naruto = new Ninja("Vila da folha", "Naruto Uzumaki", 17);
        Ninja sasuke = new Ninja("Vila da folha", "Sasuke Uchiha", 17);
        Ninja sakura = new Ninja("Vila da folha", "Sakura Haruno", 17);
        Ninja kakashi = new Ninja("Vila da folha", "Kakashi Hatake", 38);
        Ninja jiraya = new Ninja("Vila da folha", "Jiraya", 57);
        Ninja obito = new Ninja("Vila da folha", "Obito Uchiha", 37);
        Ninja hinata = new Ninja("Vila da folha", "Hinata Hyuga", 17);

        listaDeNinjas.add(naruto);
        listaDeNinjas.add(sasuke);
        listaDeNinjas.add(sakura);
        listaDeNinjas.add(kakashi);
        listaDeNinjas.add(jiraya);
        listaDeNinjas.add(obito);
        listaDeNinjas.add(hinata);

        System.out.println("Lista de ninjas cadastradas:" + listaDeNinjas);


        // Adicionar o ninja no início da lista
        listaDeNinjas.addFirst(hinata);
        listaDeNinjas.removeLast();


        //Listar os ninjas
        for(Ninja n: listaDeNinjas) {
            System.out.println(n);
        }

        //Procurar um ninja por indice
        for (int i = 0; i < listaDeNinjas.size(); i++) {
            int index = listaDeNinjas.indexOf(listaDeNinjas.get(i));
            System.out.println("O index do ninja " + listaDeNinjas.get(i).getNome() + " foi encontrada " + index);
        }

    }
}
