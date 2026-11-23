package aula07.exercicio1;

import java.time.LocalDate;

public class LavagemSimples extends Servico {

    LavagemSimples(Veiculo veiculo, LocalDate data, double precoBase){
        super(veiculo, data, precoBase);
    }

        public double calcularPreco(){
        if (getVeiculo().getPorte().equals("grande")){
                return getPrecoBase() + 15;
        }
        else{
            return getPrecoBase();
        }
    }
}
    

