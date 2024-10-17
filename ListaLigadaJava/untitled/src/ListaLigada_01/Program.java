package ListaLigada_01;

import Util.List;

import java.util.Locale;    //classe para formatar a entrada de dados, usando uma região como base
import java.util.Scanner;   //classe para instanciar uma entrada de dados primitivos

public class  Program {

    // INICIO DO PROGRAMA
    public static void main (String[] args){

        Locale.setDefault(Locale.US);   //usa as características de grafia da região "US"
        Scanner sc = new Scanner(System.in);    //instancia um objeto do tipo scanner

        List list = new List();

        //Armazena o valor da opção fornecida na entrada do método "showMenu"
        int op;


        //realiza uma ação enquanto a opção selecionada não for "3"
        do {
            //método invocado exibe um meu com opçoes
            showMenu();

            //scanner lê a opçao selecionada e armazena na variável "op"
            op = sc.nextInt();


            //Toma-se uma decisão com base no valor fornecido
            switch (op){
                case 1:{    //Caso valor = 1, executar comando 1 e sair do bloco
                    System.out.println("Digite um número: ");
                    double value = sc.nextDouble();
                    list.add(value);
                    break;
                }
                case 2:{    //Caso valor = 2, executar comando 2 e sair do bloco
                    System.out.println(list.toString());
                    break;
                }
                case 3:{    //Caso valor = 3, executar comando 3 e sair do bloco
                    System.out.println("Fim do programa");
                    break;
                }
                default:    //Se nenhum dos casos especificados correspondem ao valor da expressão avaliada

                    //sinaliza que há um erro com os dados que foram passados para o switch-case
                    throw new IllegalArgumentException("Opção inválida");
            }

            //condição que deve ser atendida para que o loop While seja executado
        }while (op !=3);



        sc.close(); //fecha o objeto scanner
    }

    //exibe as opcoes de menu
    public static void showMenu(){
        System.out.println("1 - Inserir elemento na lista");
        System.out.println("2 - Mostrar a lista");
        System.out.println("3 - Sair");
    }
}
