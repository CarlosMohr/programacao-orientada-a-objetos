package simuladoG2.PetCare.pet;
import simuladoG2.PetCare.tutor.Tutor;

public class Pet {
    private String nome;
    private String especie;
    private Tutor tutor;

    public Pet(String nome, String especie, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.tutor = tutor;
    }


    public String getNome(){
        return nome;
    }
    public String getEspecie(){
        return especie;
    }
    public Tutor getTutor(){
        return tutor;
    }
}
