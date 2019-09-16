package torrehanoi;
import java.util.Scanner;
public class TorredeHanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pilha p = new Pilha(5);
        Pilha p2 = new Pilha(5);
        Pilha p3 = new Pilha(5);
        //As 3 Pilhas representam os Pinos
        System.out.println("Informe o disco 1");
          int disco1 = s.nextInt();
            p.inserir(disco1);
            System.out.println("Informe o disco 2");
             int disco2 = s.nextInt();
            p.inserir(disco2);
            System.out.println("Informe o disco 3 ");
            int disco3 = s.nextInt();
            p.inserir(disco3);
           //JOGADAS/MOVIMENTOS
           //2 Movimentos
          int dest = p.remover(); //Remove o disco1 e guarda na variavel
          int aux = p.remover(); //Remove o disco2 e guarda na variavel
          p3.inserir(dest); //Insere na Pilha de destino,o disco1
          p2.inserir(aux); //Insere na Pilha auxiliar,o disco2
          //2 Movimentos
         int aux2= p3.remover(); //Remove o disco1 e guarda em outra variavel
          p2.inserir(aux2); //Insere o disco1 na pilha auxiliar,com o disco2
         int dest2 =  p.remover(); //Remove o disco3 da pilha original
         p3.inserir(dest2); //Insere na pilha destino
         // 2 Movimentos
        int original = p2.remover(); // Remove o disco1 e guarda em outra variavel
        p.inserir(original); //Insere o disco1 na Pilha original
        int dest3 = p2.remover(); // Remove o disco2 e guarda em outra variavel
        p3.inserir(dest3); //Insere o disco2 na Pilha destino
        //1 Movimento,totalizando 7 movimentos
        int dest4 = p.remover(); //Remove o disco1 da Pilha original,guardando em outra variavel
        p3.inserir(dest4); //Insere ele na Pilha destino,finalizando a jogada.
       System.out.println("--------------------------------");
            System.out.println("Original :" +dest+","+aux+","+dest2);
            System.out.println("Auxiliar : ");
            System.out.println("Destino: ");
        System.out.println("--------------------------------");
            System.out.println("Original :" +dest);
            System.out.println("Auxiliar : "+aux);
            System.out.println("Destino: "+dest2);
            System.out.println("-------------------------");
            System.out.println("Original :" +dest);
            System.out.println("Auxiliar: "+aux+","+dest2);
            System.out.println("Destino: ");
        System.out.println("-------------------------");
            System.out.println("Original :");
            System.out.println("Auxiliar: "+aux+","+dest2);
            System.out.println("Destino: "+dest);
            System.out.println("-------------------------");
            System.out.println("Original :" +dest2);
            System.out.println("Auxiliar: "+aux);
            System.out.println("Destino: "+dest);
        System.out.println("-------------------------");
            System.out.println("Original :" +dest2);
            System.out.println("Auxiliar: ");
            System.out.println("Destino: "+aux+","+dest);
        System.out.println("-------------------------");
            System.out.println("Original :");
            System.out.println("Auxiliar: ");
            System.out.println("Destino: "+dest+","+aux+","+dest2);
        }
}

