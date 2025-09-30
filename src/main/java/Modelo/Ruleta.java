package Modelo;

import java.util.Random;

public class Ruleta {

    private static final String[] COLORES = {"Rojo", "Negro"};
    private static final int NUMEROS_MAX = 36;
    private static final Random random = new Random();

    public String girar() {
        int numero = random.nextInt(NUMEROS_MAX + 1); // Números de 0 a 36
        String color = (numero == 0) ? "Verde" : COLORES[random.nextInt(COLORES.length)];
        return "Número: " + numero + ", Color: " + color;
    }
}