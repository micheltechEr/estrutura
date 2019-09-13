package estacionamento;
import java.util.Scanner;
public class Estacionamento {
     //Os atributos estão visiveis apenas para a classe
    private final Pilha<String>p; 
    private final Pilha<String>p2;
    private int conter;
    //Inicialização dos atributos
    public Estacionamento(int max){
         this.p = new Pilha<>(max);
         this.p2=new Pilha<>(max);
         }

    public static void main(String[] args) {
        Estacionamento e = new Estacionamento(5);//Instancia do objeto Estacionamento,que tem seus propios metodos e se for requerido,tem acesso aos metodos da Pilha
        while(e.selec()){} //A estrutura de repetição serve para aposentar o do-while,deixando o código mais limpo.
        System.out.println(e.impressao()); //Chama o metodo de impressão
        System.out.println("Foi removido "+e.conter+" vezes"); //Mostra quantas vezes foi removido
    }
    private boolean selec(){
        Estacionamento e = new Estacionamento(5);
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a sua operação: E/S/X");
        char op = s.nextLine().charAt(0);
          switch(op){
            case 'E':
                System.out.print("Informe a placa do veiculo :"); //Leitura da placa
                 String placa = s.nextLine();
                 p.inserir(placa); //Inserindo na Pilha...
                 System.out.println(placa+" Carro inserido");
                 return true;
            case 'S':
                e.remover(); //Como a função é extensa,usei um metodo,para deixar mais limpo
                return true;
            case 'X':
                 default: System.out.println("Saindo..."); //Caso a opção for X,ele sai do programa
                 return false;
        } 
    } 
    private void remover(){
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a posição: ");
           int pos = Integer.parseInt(s.nextLine());
           for(int j = 0;j<=pos;j++){
               String removido= p.remover();
                 p2.inserir(removido);
                 conter++;
           }
           for(int j = 0;j<=pos;j++){
           String placaRem = p.remover();
              while(p.inserir(p2.remover())){}
              p.remover();
              System.out.println("O carro "+placaRem+" foi removido!");
           break;
           }
    }
    public boolean impressao(){
        System.out.println(p);
         return true;
    }
    //Código sujeito a modificações futuras.

