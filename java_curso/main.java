package java_curso;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) { 
        byte b = 100;
        short s = 10000;
        //int i = 100000;
        long l = 10000000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Carlos";
        boolean bool = true;

        ArrayList<String> nomes = new ArrayList<>();

        String[] nomesArray = new String[5];
        nomes.add("Carlos");
        nomes.add("Brenda");
        nomes.add("Bituca");

        //System.out.println(nomes.get(1));

        //nomes.remove(0);
        //System.out.println(nomes.get(1));

        for (String nome : nomesArray) {
            System.out.println(nome);
        }

        int contador = 0;
        while (contador < 10){
            System.out.println("Estou no while");
            contador++;
        }


        double resultado = 0.0;
        int resultadoint = (int) resultado;

        String meuString = "10";
        int meuInt = Integer.parseInt(meuString);
    }
}
