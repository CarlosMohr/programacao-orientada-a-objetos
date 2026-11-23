package aula07.exercicio1;

public class Veiculo {
    private String placa;
    private String modelo;
    private String porte;
    private Cliente cliente;


Veiculo(String placa, String modelo, String porte, Cliente cliente){
    this.placa = placa;
    this.modelo = modelo;
    this.porte = porte;
    this.cliente = cliente;
}

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPorte(){
        return porte;
    }

    public Cliente getCliente(){
        return cliente;
    }



}
