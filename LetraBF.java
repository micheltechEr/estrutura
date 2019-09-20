package questa010;
public class Questao010b {
    public static void main(String[] args) {
        Fila f = new Fila(5);
        for(int i =1;i<f.ell.length;i++){ //Enfileira
            f.inserir(i);
        }
             f.imprime();
              System.out.println("\n");
 for(int i =1;i<f.ell.length;i++){  //Desenfileira
            f.remover();
        }
  for(int i =1;i<f.ell.length;i++){ //Enfileira novamente,porém sem adicionar o "2"
      if(i!=2){ // "2" é o elemento a ser removido,caso quiser remover outro,so informar
            f.inserir(i);
        }
    }
              f.imprime();
     }
 
}
