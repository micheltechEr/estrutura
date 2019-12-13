package main;
public class ListaSimples<T extends Comparable<T>>{
No<T> primeiro;
No<T> atual;
public void inserirFrente(T valor){  
No<T> novo = new No<T>(valor);
if(this.primeiro == null){
this.primeiro = novo;
    }
    novo.setProximo(this.primeiro);
    this.primeiro = novo;
  }
  public void inserirFinal(T valor){
  No<T> novo = new No<T>(valor);
    if(this.primeiro == null){
    this.primeiro = novo;
    }
    No<T> aux = this.primeiro;
    while(aux.getProximo()!=null){
    aux = aux.getProximo();
    }
    aux.setProximo(novo);
  }
  public T removerFrente(){
  No<T> aux = primeiro;
  primeiro = primeiro.getProximo();
  return aux;
  }
}
//Em andamento....esse codigo foi feito apenas para revisão para a prova
