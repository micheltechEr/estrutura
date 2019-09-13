public class Questao03 {
    public static void main(String[] args) {
        Pilha<Character> pilha = new Pilha<Character>(100);
        Scanner s =  new Scanner(System.in);
        System.out.println("Informe os elementos :");
String x = s.nextLine(); //Leitura do elemento X
String y = s.nextLine(); //Leitura do elemento Y
for (int i = 0; i < x.length(); i++) { //Varredura da Pilha
    Character c = x.charAt(i); //O elemento "c",armazena o elemento da posição "i" de X
    pilha.inserir(c); // Empilha os  elementos.
}
String reversed = new String();
while (!pilha.estaVazia()) { //Enquanto a pilha não estiver vazia,reversed é adicionado com o elemento que foi desempilhado
    reversed += pilha.remover();
}
System.out.println("Elemento X é o inverso de Y?" + reversed.equals(y));
   
//Na impressão,verifica se o elemento reversed,é igual ao elemento y.
    }
    //Basicamente ele empilhou tudo,e depois desempilhou,porém verificando as String´s,retornando um true ou false.
}
