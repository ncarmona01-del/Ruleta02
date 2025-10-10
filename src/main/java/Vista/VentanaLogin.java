package Vista;
import Controlador;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaLogin {

    static void main(String[] args) {
        JFrame ventana = new JFrame("Inicio de Sesion - Casino Black Cat");
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.getContentPane().setBackground(Color.darkGray);

        JLabel labelUsuario = new JLabel("Usuario:");
        labelUsuario.setBounds(50, 40, 100, 25);
        labelUsuario.setForeground(Color.WHITE);
        ventana.add(labelUsuario);

        JLabel labelContrasena = new JLabel("Contraseña:");
        labelContrasena.setBounds(50, 80, 100, 25);
        labelContrasena.setForeground(Color.WHITE);
        ventana.add(labelContrasena);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(150, 40, 200, 25);
        ventana.add(campoUsuario);

        JPasswordField campoContraseña = new JPasswordField(); // Use JPasswordField for security
        campoContraseña.setBounds(150, 80, 200, 25);
        ventana.add(campoContraseña);

        JButton botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.setBounds(150, 130, 150, 30);
        ventana.add(botonIniciarSesion);

        JLabel inicioLogrado = new JLabel("Inicio de de Sesion Exitoso");
        inicioLogrado.setBounds(50, 180, 300, 25);
        inicioLogrado.setForeground(Color.GREEN);

        JLabel inicioFallido = new JLabel("Usuario o Contraseña incorrectos");
        inicioFallido.setBounds(50, 180, 300, 25);
        inicioFallido.setForeground(Color.RED);

        JButton botonRegistrar = new JButton("Registrar Nueva Cuenta");
        botonRegistrar.setBounds(50, 200, 150, 30);
        botonRegistrar.setForeground(Color.WHITE);
        ventana.add(botonRegistrar);
        KeyAdapter enterKeyAdapter = new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonIniciarSesion.doClick();
                }
            }
        };
    }
}