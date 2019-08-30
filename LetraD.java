/*package questao01;
public class LetraD {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        Pilha p2 = new Pilha(5);
        for (int o = 1; o < 6; o++) {
            p.inserir(o);
        }
        System.out.println(p);
         int n= 3;
         int i =100;
        for ( int j = 1; j <=n; j++) { //For inicializado com 1
            // Nesse campo com "*" será feita a parte principal,que vai necessitar de outra pilha
            //*
            int rem= p.remover(); 
                if(n!=j) 
                p2.inserir(rem);
        }
          p.inserir(i);
          //*
        while(p.inserir(p2.remover())){
    }   
         System.out.println(p);
}
}
/*Explicação do "*".
 [1,2,3,4] Pilha inicial Após isso,é lançado um for,em que realizada a seguinte operação:
 A estrutura de repetição,remove os elementos e guarda em uma variave,logo depois verifica se o "n" é diferente  do número removido/guardado.
 Caso o numero for diferente,ele insere na segunda pilha,porém,caso o número for === n(igual),ele insere o valor  definido na variavel "i",esse valor ocupada a posição indicada.
Ex:
n =5
[1,2,3,4,5,6,7,8,9]
var = 1!=5 insere na segunda pilha
var = 2!=5 insere na segunda pilha
var = 3 !=5 insere na segunda pilha
var = 4!=5 insere na segunda pilha
var =5 !=5 ERRO,descarta
insere outro valor na posição
var = 6!=5 insere na segunda pilha
var = 7!=5 insere na segunda pilha
var = 8!=5 insere na segunda pilha
var = 9!=5 insere na segunda pilha
*/