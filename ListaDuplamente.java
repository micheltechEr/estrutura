package main;
public class ListaDuplamente<T extends Comparable<T>>{    
No<T> primeiro;
No<T> atual;
public void inserirFrente(T valor){
No<T> novo = new No<T>(valor);
if(this.primeiro == null){
this.primeiro = novo;
    }
novo.setProximo(this.primeiro);
this.primeiro.setAnterior(novo);
this.primeiro = novo;
  }
  public void inserirFinal(T valor){  
  No<T> novo = new No<T>(valor);
  if(this.primeiro == null){
     this.primeiro = novo;
  }
  No<T> aux  this.primeiro;
  while(aux.getProximo() != null){
    aux =  aux.getProximo();
  }
  // É possivel observar que a unica coisa que muda da Duplamente para a Simplesmente é a adição do setAnterior
  aux.setProximo(novo.getProximo());
  novo.setAnterior(aux);
  
 publ T removerFrente(){
 No<T> aux = this.primeiro;
 primeiro = primeiro.getProximo();
 primeiro.setAnterior(null);
 primeiro.setProximo(null);
 return aux;
 }
}
