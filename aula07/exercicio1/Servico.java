package aula07.exercicio1;

import java.time.LocalDate;

public class Servico {
    private Veiculo veiculo;
    private LocalDate data;
    private double precoBase; 


    Servico(Veiculo veiculo, LocalDate data, double precoBase){
        this.veiculo = veiculo;
        this.data = data;
        this.precoBase = precoBase;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public LocalDate getData(){
        return data;
    }

    public double getPrecoBase(){
        return precoBase;
    }



    
}
