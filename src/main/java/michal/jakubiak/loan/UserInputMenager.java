package michal.jakubiak.loan;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class UserInputMenager {
    UserInputMenager(JTextField field)
    {
        field.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String inputText = field.getText();
                    System.out.println("Wprowadzono: " + inputText + "\n");
                    field.setText(""); // Wyczyść pole tekstowe
                }
            }
        });
    }


}
