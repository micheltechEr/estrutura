package estacionamento02;
public class Carro {
    String placa;
    int cont_vezes;
    public Carro(String rs){
      this.placa =placa;
      cont_vezes = 0;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCont_vezes() {
        return cont_vezes;
    }

    public void setCont_vezes(int cont_vezes) {
        this.cont_vezes = cont_vezes;
    }
    public void addVezes_contorno() {
		this.cont_vezes++;
}
}
