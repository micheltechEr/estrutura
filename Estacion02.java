package estacionamento02;
import java.util.Scanner;
public class Estacionamento02 {
    private final Fila<Carro> f;
    private final Fila<Carro> f2;
    public Estacionamento02(int size){
        this.f = new Fila<>(size);
        this.f2 = new Fila<>(size);
    }
    public static void main(String[] args) {
        Estacionamento02 es  = new Estacionamento02(10);   
           while(es.selec()){}
    }
    public boolean selec(){
          String placa;
       Estacionamento02 es  = new Estacionamento02(10);
        Scanner s = new Scanner(System.in); //Leitura dos dados
        System.out.println("Informe a operação C/P/X");
         char op = s.nextLine().charAt(0);
        switch(op){
            case 'C':
   
   if(!f.isFull()){
      System.out.println("Digite o numero da placa");
        placa = s.nextLine();
       Carro c = new Carro(placa);
       c.placa = placa;
    }else{
       System.out.println("Esta cheio");
   }
            case 'P':
                 Carro c = new Carro(placa);
                 boolean achou = false;
                System.out.println("Digite o numero da Placa:");
String placa2 = s.nextLine();
                while(!f.isEmpty()) {
               c.placa = f.pop();
                if( c.getPlaca().equals(placa2) ) {
                        achou = true;
                        break;
                }else {
                        f2.push(c);
                }
                while(!f2.isEmpty()) {
                Carro c1 = f2.pop();
                c1.addVezes_contorno();
                f.push( c1 );
        }
        }
                                return true;
        }
        return true;
   }
     public boolean impressao(){
        System.out.println("Os carros disponiveis são : \n"+f);
         return true;
    }
} 

