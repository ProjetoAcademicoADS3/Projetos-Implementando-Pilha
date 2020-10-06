package modelo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author roger
 */
public class Pilha01Main {

    public static void main(String[] args) throws Exception {
        int tamanho = 10;
        int numero = 0;
        Scanner scan = new Scanner(System.in);
        Pilha01 p = new Pilha01(tamanho);
        Random rd = new Random();
        System.out.println("Pilha atual empilhada com inteiros");
        while(!p.isFull()){
            int elem = rd.nextInt(100) + 1;
            p.push(elem);
            System.out.println(p.top());
        }
        System.out.println("Informe o número a ser retirado: ");
        numero = scan.nextInt();
        remover(p, numero);

    }

    public static void remover(Pilha01 p, int item) throws Exception {
        Pilha01 nova = new Pilha01(10);
        if (p.isEmpty()) {
            throw new Exception("A pilha informada está vazia\n");
        }
        System.out.println("Copiando elementos da pilha de origem para uma "
                + "pilha aux removendo o elemento informado.");
        while (!p.isEmpty()) {
            if (p.top() == item) {
                p.pop();
            } else {
                nova.push(p.pop());
                System.out.println(nova.top());
            }
        }

        System.out.println("Retornando os elementos para a pilha de origem");
        while (!nova.isEmpty()) {
            p.push(nova.pop());
            System.out.println(p.top());
        }
    }
}
