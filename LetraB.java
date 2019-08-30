/*package questao01;
public class LetraB {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(6);
              int i = 100;
        for (int o = 1; o < 5; o++) { //Empilha 
            pilha.inserir(o);
        }
              System.out.println(pilha); //Imprime a pilha inicial
  int aux1 = pilha.remover();// Remove o topo  e guarda
  int aux2 = pilha.remover(); //Remove o primeiro elemento e guarda
  pilha.remover(); // Remove o segundo elemento,mas não guarda,pois será substituido por "i"
  pilha.inserir(i); //Insere o segundo elemento
   pilha.inserir(aux2);  //Insere o primeiro
          pilha.inserir(aux1);   //Insere o topo
          System.out.println(pilha); //Imprime a pilha  final
    }
} */
