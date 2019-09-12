package estacionamento;
import java.util.Scanner;
public class Estacionamento {
    public static void main(String[] args) {
      Pilha p = new Pilha(4);
      Pilha p2 = new Pilha(4);
      char mov = 0;
      int placa =0;
              Scanner s= new Scanner(System.in);
      for(int i = 0;i<p.ele.length;i++){
      do{
        System.out.println("Informe a movimentação do carro : ");
  mov=s.next().charAt(0);
     switch(mov){
         case 'E':
                 if(p.estaCheia()){
                     System.out.println("Estacionamento cheio!");    
                 }
                 else {
                     System.out.println("Por favor,informe a placa");
                  placa =s.nextInt();
              p.inserir(placa);
                     System.out.println(placa+" foi inserido");
                 }
            break;
         case 'S':
             System.out.println("Informe a posição do carro a ser retirado");
            int e = s.nextInt();
           while(i!=e){
               Object rem = p.remover();
               p2.inserir(rem);
           }
             
           while(p.inserir(p2.remover())){
           }
           System.out.println("Carro da posição "+e+" sendo removido....");
   }
       break;
   }  while(!p.estaCheia());
    }
            System.out.println(p);
}
}

