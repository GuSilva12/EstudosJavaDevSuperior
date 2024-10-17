package Util;

import java.util.ArrayList;

public class List {

    private Node head;  //cabeça da lista - primeiro elemento


    public void add(double value){

        // se a lista estiver vazia, instancia-se um novo nó, que passa a ser a cabeça
        Node node = new Node();

        //atribuimos o valor a ser inserido no novo nó - valor que estamos inserindo
        node.setValue(value);

        // caso a lista já tenha algum elemento, conectamos o novo nó ao que até então era a cabeça
        node.setNext(head);

        // atualizamos a cabeça da lista para o novo nó
        head = node;
    }



    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        //Nó "p" recebe "head", apontando para ele
        Node p = head;
        while (p != null) { //se 'p' não é NULL, há um nó para um elemento seguinte
            sb.append(p.getValue()).append(" ");
            p = p.getNext();    //p desloca para apontar para o valor do elemento seguinte
        }
        //QUANDO p NULO, BLOCO 'WHILE' PARA DE SER EXECUTADO

        sb.append("]");
        return sb.toString();
    }
}
