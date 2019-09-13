package questao02;
public class Pilha<T> {
    T[]arrayelem;
    int topo;
    int index = 0;
    public Pilha(int max){
        this.arrayelem = (T[]) new Object[max];
        this.topo = -1;
    }
    public boolean estaCheia(){
      return this.topo == this.arrayelem.length-1;
    }
    public boolean estaVazia(){
        return this.topo == -1;
    }
    public boolean inserir(T elem){
        if(!this.estaCheia()){
            this.arrayelem[++ this.topo] = elem;
            return true;
        }
        return false;
    }
    public T remover(){
        if(!this.estaVazia()){
           T aux = this.arrayelem[this.topo];
            this.topo--;
            return aux;
        }
        return null;
    }
public  boolean verificadordeEquilibrio(String s) {
        Pilha <Character> p1  = new Pilha<>(55);
        for (int i = 0; i < s.length(); i++) { //For para  fazer a varredura dos caracteres
            char c = s.charAt(i); // O char.At  para pegar determinada posição do caracter
            switch (c) {
                case '[':
                case '(':
                case '{':
                    //Caso o caracter de abertura lido,for equivalente aos determinados,ele insere na Pilha.
                    p1.inserir(c);
                    break;
                case ']':
                    //Caso o caracter lido,for de fechamento,ele entra em uma condição,se a pilha estiver vazia,ou o metodo de remover for diferente do caracter de abertura,ele retorna falso
                    if(p1.estaVazia() || p1.remover()!= '[') {
                        return false;
                    }
                    break;
                case ')':
                    if(p1.estaVazia()  || p1.remover() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if(p1.estaVazia()|| p1.remover()!= '{') {
                        return false;
                    }   break;
                default:
                    break;
            }
        }
        return p1.estaVazia();
    }
}
//Foi feito de forma original na forma de vários if´s,o NetBeans recomendou convertesse para switch.
/*
Exemplo:
(A+B)=Deve retornar verdadeiro
(A+B]=Deve retornar falso,pois foi definido no metodo,que os parenteses de abertura,devem ser equivalentes aos de fechamento
Como é uma Pilha,o ultimo elemento lido,se torna o topo:
Ex:
   (Y+Z)
         )=Topo,ultimo elemento inserido
             (= Base da Pilha
                 Caso  )!=(
                       retorna falso
                         senão ele insere na Pilha
                            ESTRUTURA DO CÓDIGO
                                BASE =  ( Y = 3 + = 2 Z = 1) =TOPO
*/
