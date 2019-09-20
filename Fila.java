package questao020;
public class Fila<T> {
    T[] ell;
        int inicio;
        int fim;
        public Fila(int size){
            ell =  (T[])new Object[size];
            inicio = fim=0;
                    }
       public boolean estaCheia(){
           if(fim == ell.length)
	               System.out.println("NÃO INSERIDO");
                                  return true;
       }
        public void inserir(T elemento){
        if(!this.estaCheia())
            ell[fim++] = elemento;
       }
        public boolean estaVazia(){
            if(fim<0){
                       System.out.println("NÃO REMOVIDO");
            }
            return true;
        }
        public T remover(){
            if(!this.estaVazia())
               ell[0] = null;
               for(int x = 0;x<fim;x++){
                   ell[x] = ell[x+1];
               }
               ell[fim] = null;
               --fim;
                          return null;
           }
        
       public void imprime(){
            for (T ell1 : ell) {
                if (ell1 != null) {
                    System.out.print("[" + ell1 + "]" + ",");
                } 
            }
       }
}
