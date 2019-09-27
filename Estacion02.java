/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento02;
import java.util.Scanner;
public class Estacionamento02 {
    public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
Fila<Carro> f = new Fila<>(3); 
int saida = f.inicio =f.fim=0;
        System.out.println("Bem vindo");
    while(true){
        System.out.println("Informe sua operação: ");
   char menu = sc.nextLine().charAt(0);
  if(menu == 'X'){
      break;
  }
  if(menu == 'C'){
            System.out.println("Digite a placa");
       String placa = sc.nextLine();
        Carro c  = new Carro(placa);
           if(!f.isFull()){
               f.push(c);
               System.out.println("Carro "+placa+" inserido");
           }else{
               System.out.println("SEM VAGAS!");
           }
  }else if(menu =='P'){
      Fila<Carro> f2 =  new Fila<Carro>(11);     
      System.out.println("Digite a Placa:");
  String placa = sc.nextLine();
  Carro c = procurar(f,placa);
  if(c!=null){
       System.out.println("Foi Achado:"+ c.getVezes_contorno());
  }
        if(!f2.isEmpty()){
              Carro c2 = procurar(f,placa); 
          c2 = f.pop();
            f2.push(c2);
               System.out.println("O carro "+c2.getPlaca()+" foi inserido");
   }else{
              Carro c2 = procurar(f,placa); 
            if(c2!=null){
                System.out.println("Ele foi deslocado "+c.getVezes_contorno());
            }
        }
    }
    }
    }
    public static Carro procurar( Fila<Carro> fila, String placa) {
        Fila<Carro> aux = new Fila<Carro>(11);
        Carro c = null;
        Boolean achou = false;
        while(!fila.isEmpty()) {
                c = fila.pop();
                if( c.getPlaca().equals(placa) ) {
                        achou = true;
                        break;
                }else {
                        aux.push(c);
                }
        }

        while(!aux.isEmpty()) {
                Carro c1 = aux.pop();
                c1.addVezes_contorno();
                fila.push( c1 );
        }

        if(achou)
                return c;

        return null;

} 
    
}




   






