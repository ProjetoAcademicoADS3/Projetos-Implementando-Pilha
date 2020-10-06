/*
 * 1. Utilizando as operações de manipulação de pilhas vistas em sala, uma pilha
 * auxiliar e uma variável do tipo int, escreva um procedimento que remove
 * um número elemento dado de uma posição qualquer de uma pilha. Note que
 * você não tem acesso à estrutura interna da pilha, apenas às operações de
 * manipulação.
 */
package modelo;

/**
 *
 * @author roger
 */
public class Pilha01 {

    int tamanho;
    int[] elemento;
    int topo;

    public Pilha01(int tamanho) {
        this.tamanho = tamanho;
        elemento = new int[tamanho];
        topo = -1;
    }

    public void push(int elemento) throws Exception {
        if (isFull()) {
            throw new Exception("A pilha está cheia!\n");
        }
        topo++;
        this.elemento[topo] = elemento;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia!\n");
        }
        int elemento;
        elemento = this.elemento[topo];
        topo--;
        return elemento;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == elemento.length - 1;
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia!\n");
        }
        return elemento[topo];
    }
    
    public int quantElementos(){
        return topo +1;
    }

}
