package questão01;
public class Questão01 {
    public static void main(String[] args) {
    Pilha p = new Pilha(4);
     Pilha p2 = new Pilha(4);
     Pilha p = new Pilha(4);
     Pilha p2 = new Pilha(4);
     p.inserir(1);
     p.inserir(2);
     p.inserir(3);
     p.inserir(4);
     int aux =p.remover();
     p2.inserir(aux);
     p2.inserir(2);
     p2.inserir(1);
     p.inserir(100);
     p.inserir(p2.remover());
        System.out.println(p);
   }
}
