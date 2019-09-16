package estacionamento;
import java.util.Scanner;
public class Estacionamento {
     //Os atributos estão visiveis apenas para a classe
    private final Pilha<String>p; 
    private final Pilha<String>p2;
    private int cont_ador;
    //Inicialização dos atributos
    public Estacionamento(int max){
         this.p = new Pilha<>(max);
         this.p2=new Pilha<>(max);
         }
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento(5);//Instancia do objeto Estacionamento,que tem seus propios metodos e se for requerido,tem acesso aos metodos da Pilha
        while(e.selec()){} //A estrutura de repetição while,nesse caso, serve para aposentar o do-while,deixando o código mais limpo.
        System.out.println(e.impressao()); //Chama o metodo de impressão
        System.out.println("Foi removido "+e.cont_ador+" vezes"); //Mostra quantas vezes foi removido
      }
    private boolean selec(){
        Estacionamento e = new Estacionamento(5);
        Scanner s = new Scanner(System.in); //Leitura dos dados
        System.out.println("Informe a sua operação: E/S/X");
        char op = s.nextLine().charAt(0);
          switch(op){
            case 'E':
                if(p.estaCheia()){
                    System.out.println("Estacionamento cheio");
                }
                else{
                System.out.print("Informe a placa do veiculo :"); //Leitura da placa
                 String placa = s.nextLine();
                 p.inserir(placa); //Inserindo na Pilha...
                 System.out.println(placa+" Carro inserido");
                 return true;
                }
            case 'S':
                e.remover(); //Como a função é extensa,usei um metodo,para deixar mais limpo
                return true;
            case 'X':
                 default: System.out.println("Saindo..."); //Caso a opção for X,ele sai do programa e executa o metodo para mostrar os carros do estacionamento
                 return false;
        } 
    } 
    private void remover(){
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a posição: "); //Pede a posição do carro
           int pos = Integer.parseInt(s.nextLine()); //Conversão da posição digitada,que é um inteiro,para uma String
           for(int j = 0;j<=pos;j++){ //Varredura da Pilha
           String placaRem = p.remover(); 
           p2.inserir(placaRem);
           System.out.println("O carro "+placaRem+" foi removido!");
           cont_ador++;
           break;
           }
    }
    public boolean impressao(){
        System.out.println("Os carros disponiveis são : \n"+p);
         return true;
    }
}
//Quando o estacionamento estiver cheio,ele irá remover algum carro,e pedira para inserir outro
/* O código apresenta alguns defeitos,como por exemplo ele aparenta remover,permitindo que outros carros possam entrar.
   Porém,quando exibe os dados,o carro continua na Pilha*/
