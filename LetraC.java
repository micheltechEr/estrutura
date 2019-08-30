package questao01;
public class LetraC {
    public static void main(String[] args) {
          Pilha p = new Pilha(5);
          Pilha paux = new Pilha(5);
          for (int i = 1; i < 6; i++) {
            p.inserir(i);
        }
          System.out.println(p);
          
           int n= 4;
         int i =100;
           for ( int j = 1; j <6; j++) {
            p.remover();
             paux.inserir(j);
        }
        while(p.inserir(paux.remover())){
    }
        
        for (int j = 1; j <=n; j++) {
            p.remover();
        }
        p.inserir(i);
         System.out.println(p);
    }
}
