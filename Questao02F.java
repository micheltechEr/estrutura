package questao020;
import java.util.Scanner;
public class Questao020 {
 public static void main(String[] args) {      
       char ch1, ch2;
         Fila<Character> f = new Fila<>(26);
         Scanner s = new Scanner(System.in);
         for (int i = 0;i<25;i++) { //Tamanho da Pilha +1
         System.out.println("Por favor,digite as letras,em ORDEM CRESCENTE.");
         ch1 = s.nextLine().charAt(0); // Leitura do primeiro caracter
         ch2 = s.nextLine().charAt(0);// Leitura do segundo caracter
         f.inserir(ch1); //Inserindo os valores
         f.inserir(ch2);
         int i1 = Character.getNumericValue(ch1);//Usa o metodo  getNumericValue(),para pegar um número equivalente
         // ao caracter.
         int i2 = Character.getNumericValue(ch1); 
         if(ch1<ch2){  //Nesse caso,com os valores armazenados,verifica caso o  ch1 é menor que ch2
             System.out.println("OK,Está na ordem,prossiga");
         }
         else{
             System.out.println("Não está na ordem,aceito apenas valores na ordem,por favor tente novamente");
              break; //Sai do loop
         }
     }
 } 
 //Lógica do algoritimo:
 //Ele lê apenas dois elementos,já que o alfabeto latino,possui 26 letras,logo são realizadas 13 operações(13*2=26)
 // A cada duas leituras,é feito dois processamentos,que retorna se as letas estão na ordem crescente ou não
 // Caso a letra estiver fora da ordem,ele sai do loop e informa uma mensagem para informar as letras na ordem correta
/*
 A
 B
 A = 10(no get char) B= 11(no get char)
  se 10<11
 ou
  se A<B
   Está na ordem,prossiga.
 */
}
