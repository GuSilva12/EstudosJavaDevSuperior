package Util;

public class Node {

    //declaração de variáveis
    private double value;   //armazena o valor do nó
    private Node next;  //referência para o próximo nó da lista


    //getters e seteers
    public void setValue(double value) {
        //  define o valor do nó
        // udado para modificar o valor armazenado no nó
        this.value = value;
    }

    public Node getNext() {
        //  retorna uma referencia para o proximo no da lista
        //  permite percorrer a lista encadeada
        return next;
    }

    public void setNext(Node next) {
        //  define o proximo no da lista
        //  usado para conectar nós e construir a lista encadeada
        this.next = next;
    }

    public double getValue() {
        //  retorna o valor do nó
        //  permite acessar o valor armazenado no nó, sem modificá-lo
        return value;
    }
}
