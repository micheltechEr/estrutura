package questa010;
public class Questao10c {
    public static void main(String[] args) {
       Fila f = new Fila(5);
       int n = 2;
       for(int i = 1;i<f.ell.length;i++){ //Enche a fila
           f.inserir(i);
       }
       f.imprime(); //Imprime
        System.out.println("\n");
       for(int j = 1;j<=n;j++){ //Esse for serve para remover os elementos anteriores
           f.remover();
       }
       f.imprime();
    }
    }
