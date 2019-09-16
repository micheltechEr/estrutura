package questao01;
public class LetraG {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(4);
        for (int i = 1; i < 5; i++) {
            pilha.inserir(i);
        }
              System.out.println(pilha);
              for (int i = 1; i < 5; i++) {
                    pilha.remover();
        }
    pilha.inserir(100);
        System.out.print(pilha); 
    }
}
