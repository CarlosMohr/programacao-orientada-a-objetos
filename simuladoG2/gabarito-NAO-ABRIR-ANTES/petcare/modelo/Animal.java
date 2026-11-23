package petcare.modelo;

// Todo animal tem um tutor (associação: Animal "tem um" Tutor)
public class Animal {
    private String nome;
    private String especie;
    private Tutor tutor;

    public Animal(String nome, String especie, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
