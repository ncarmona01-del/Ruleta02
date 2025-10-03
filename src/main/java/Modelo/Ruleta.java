package Modelo;

import java.util.*;

public class Ruleta {
    private List<Integer> numeros;
    private List<String> colores;
    private Random random;


    public Ruleta() {
        numeros = new ArrayList<>();
        for (int i = 0; i <= 36; i++) {
            numeros.add(i);
        }
        colores = Arrays.asList("Rojo", "Negro");

        random = new Random();
    }

    public int numeroAlAzar() {
        return numeros.get(random.nextInt(numeros.size()));
    }

    public String colorAlAzar() {
        return colores.get(random.nextInt(colores.size()));
    }
}
