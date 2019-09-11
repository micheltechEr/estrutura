package estacionamento;
import java.util.Scanner;
public class Estacionamento {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      Pilha p = new Pilha(5);
      char mov = 0;
      int placa =0;
      int contador_vezes= 0;
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
                 else{
                     System.out.println("Por favor,informe a placa");
                  placa =s.nextInt();
              p.inserir(placa);
                     System.out.println(placa+" foi inserido");
                 } 
         case 'S':
             p.remover();
   
    }
    }while(!p.estaCheia());
}
}
}
