package michal.jakubiak.loan;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class UserInputManager {
    private String inputText;
    private JTextField field;
    private Scanner scanner;

    public UserInputManager() {
        scanner = new Scanner(System.in);


    }

    public UserInputManager(JTextField field) {
            //this.field = field;
        field.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    inputText = field.getText();
                    System.out.println("Wprowadzono: " + inputText + "\n");
                    field.setText(""); // Wyczyść pole tekstowe
                }
            }
        });


    }

    public UserInputCommand nextCommand() {

        if (scanner != null) {
            return new UserInputCommand(scanner.nextLine());
        } else {

            return new UserInputCommand(inputText);
        }
    }


}