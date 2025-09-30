package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaMenu {

    static void main(String[] args) {
        JFrame ventanaMenu = new JFrame("Menu - Casino Black Cat");
        ventanaMenu.setSize(600, 600);
        ventanaMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaMenu.setLayout(null);
        ventanaMenu.getContentPane().setBackground(Color.gray);

        JButton botonRuleta = new JButton("Jugar Ruleta");
        botonRuleta.setBounds(100, 400, 100, 50);
        botonRuleta.setForeground(Color.WHITE);
        ventanaMenu.add(botonRuleta);

        JButton botonPerfil = new JButton("Ver Perfil");
        botonPerfil.setBounds(100, 200, 100, 50);
        botonPerfil.setForeground(Color.WHITE);
        ventanaMenu.add(botonPerfil);

        JButton botonCerrar = new JButton("Salir Del Casino");




    }
}
