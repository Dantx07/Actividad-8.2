package Notas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana_principal extends JFrame implements ActionListener{

    private Container Contenedor;
    private JLabel Nota1,  Nota2, Nota3, Nota4, Nota5, Promedio, Desviacion, Valor_mayor, Valor_menor;
    private JTextField Campo_Nota1, Campo_Nota2, Campo_Nota3, Campo_Nota4, Campo_Nota5;
    private JButton Calcular, Eliminar;

    public Ventana_principal()  {
        Inicio();
        setTitle("Notas");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void Inicio()   {
        Contenedor = getContentPane();
        Contenedor.setLayout(null);
        Nota1 = new JLabel();
        Nota1.setText("Primera nota");
        Nota1.setBounds(20, 20, 135, 23);
        Campo_Nota1 = new JTextField();
        Campo_Nota1.setBounds(105, 20, 135, 23);
        Nota2 = new JLabel();
        Nota2.setText("Segunda nota");
        Nota2.setBounds(20, 50, 135, 23);
        Campo_Nota2 = new JTextField();
        Campo_Nota2.setBounds(105, 50, 135, 23);
        Nota3 = new JLabel();
        Nota3.setText("Tercera nota");
        Nota3.setBounds(20, 80, 135, 23);
        Campo_Nota3 = new JTextField();
        Campo_Nota3.setBounds(105, 80, 135, 23);
        Nota4 = new JLabel();
        Nota4.setText("Cuarta nota");
        Nota4.setBounds(20, 110, 135, 23);
        Campo_Nota4 = new JTextField();
        Campo_Nota4.setBounds(105, 110, 135, 23);
        Nota5 = new JLabel();
        Nota5.setText("Quinta nota");
        Nota5.setBounds(20, 140, 135, 23);
        Campo_Nota5 = new JTextField();
        Campo_Nota5.setBounds(105, 140, 135, 23);
        Promedio = new JLabel();
        Promedio.setText("Promedio:");
        Promedio.setBounds(20, 230, 135, 23);
        Desviacion = new JLabel();
        Desviacion.setText("Desviacion:");
        Desviacion.setBounds(20, 260, 135, 23);
        Valor_mayor = new JLabel();
        Valor_mayor.setText("Nota mayor:");
        Valor_mayor.setBounds(20, 290, 135, 23);
        Valor_menor = new JLabel();
        Valor_menor.setText("Nota menor:");
        Valor_menor.setBounds(20, 320, 135, 23);
        Calcular = new JButton();
        Calcular.setText("Calcular");
        Calcular.setBounds(105, 170, 135, 23);
        Calcular.addActionListener(this);
        Eliminar = new JButton();
        Eliminar.setText("Eliminar");
        Eliminar.setBounds(105, 200, 135, 23);
        Eliminar.addActionListener(this);
        Contenedor.add(Nota1);
        Contenedor.add(Campo_Nota1);
        Contenedor.add(Nota2);
        Contenedor.add(Campo_Nota2);
        Contenedor.add(Nota3);
        Contenedor.add(Campo_Nota3);
        Contenedor.add(Nota4);
        Contenedor.add(Campo_Nota4);
        Contenedor.add(Nota5);
        Contenedor.add(Campo_Nota5);
        Contenedor.add(Promedio);
        Contenedor.add(Desviacion);
        Contenedor.add(Valor_mayor);
        Contenedor.add(Valor_menor);
        Contenedor.add(Calcular);
        Contenedor.add(Eliminar);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == Calcular)   {
            if (Campo_Nota1.getText().trim().isEmpty() || Campo_Nota2.getText().trim().isEmpty() || Campo_Nota3.getText().trim().isEmpty() || Campo_Nota4.getText().trim().isEmpty() || Campo_Nota5.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Error", JOptionPane.ERROR_MESSAGE);
            }   else {
                Notas notas = new Notas();
                notas.Lista_notas[0] = Double.parseDouble(Campo_Nota1.getText());
                notas.Lista_notas[1] = Double.parseDouble(Campo_Nota2.getText());
                notas.Lista_notas[2] = Double.parseDouble(Campo_Nota3.getText());
                notas.Lista_notas[3] = Double.parseDouble(Campo_Nota4.getText());
                notas.Lista_notas[4] = Double.parseDouble(Campo_Nota5.getText());
                Promedio.setText("Promedio: " + String.format("%.2f", notas.Promedio()));
                Desviacion.setText("Desviacion: " + String.format("%.2f", notas.Desviacion()));
                Valor_menor.setText("Nota menor: " + String.format("%.2f", notas.Minimo()));
                Valor_mayor.setText("Nota mayor: " + String.format("%.2f", notas.Maximo()));
            }

        }
        if (evento.getSource() == Eliminar)   {
            Campo_Nota1.setText("");
            Campo_Nota2.setText("");
            Campo_Nota3.setText("");
            Campo_Nota4.setText("");
            Campo_Nota5.setText("");
        }
    }
}
