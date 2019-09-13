package questão01;
public class Questão01 {
    public static void main(String[] args) {
    Pilha p = new Pilha(4);
     Pilha p2 = new Pilha(4);
     p.inserir(4);
     p.inserir(3);
     p.inserir(2);
     p.inserir(1);
     p.remover();
     p.remover();
    int aux= p.remover();
     int aux2=p.remover();
          p.inserir(100);
          p.inserir(aux);
          p.inserir(aux2);
                  System.out.println(p);
}
}
