package questa010;
public class Questa010a {
    public static void main(String[] args) {
        Fila f = new Fila(5);
             f.inserir(1);
             f.inserir(2);
             f.inserir(3);
             f.inserir(4);
              f.imprime();
             System.out.println("\n"); 
             f.remover();
             f.remover();
             f.imprime();
       }
}
