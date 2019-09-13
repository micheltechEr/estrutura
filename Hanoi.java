package torrehanoi;
public class TorreHanoi {
    public static void main(String[] args) {
       Pilha p1 = new Pilha<>(8);
       Pilha <Integer>p2 = new Pilha<>(8);
       Pilha<Integer> p3 = new Pilha<>(8);
       p1.inserir(3);
       p1.inserir(2);
       p1.inserir(1); 
          torreHanoi(p1.tamanho, p1, p2, p3);
    }
    public static void torreHanoi(int n,Pilha<Integer> p1,Pilha <Integer>p2,Pilha <Integer>p3 ){
        if(n>0){
            torreHanoi(n-1, p1, p3, p2);
         p3.inserir(p1.remover());
            System.out.println("-----");
            System.out.println("Original: "+p1);
            System.out.println("Destino: "+p3);
            System.out.println("Auxiliar: "+p2);
            torreHanoi(n-1, p2, p3, p1);
           
        }
        
}
}
