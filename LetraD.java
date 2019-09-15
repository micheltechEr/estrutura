package questao01;
public class LetraD {
    public static void main(String[] args) {
   Pilha<Integer>p = new Pilha<>(5);
   Pilha<Integer>p2 = new Pilha<>(5);
    p.inserir(5);
    p.inserir(4);
    p.inserir(3);
    p.inserir(2);
    p.inserir(1);
           int n= 4;
           int i =100;     
            for(int j = 0;j<=n;j++){
                if(n!=j){
             p.remover();
             p2.inserir(j);
                }
         }
          p.inserir(i);
         while(p.inserir(p2.remover())){}
         while(p2.inserir(p.remover())){}
                for(int j = 0;j<=n;j++){
             p.remover();
             p2.inserir(j);
         }         
          System.out.println(p2);
    }
}
