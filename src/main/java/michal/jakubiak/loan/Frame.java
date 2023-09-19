package michal.jakubiak.loan;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;


public class Frame extends JFrame {

    private JTextField inputField;
    public Frame(String title) {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);

        JTextArea textArea = new JTextArea();
        inputField = new JTextField("Commands...");
        textArea.setEditable(false);
        textArea.setSelectionColor(Color.cyan);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        add(inputField, BorderLayout.SOUTH);

        setVisible(true);

        PrintStream printStream = new PrintStream(new TextAreaOutputStream(textArea));
        System.setOut(printStream);

    }
    public JTextField getField(){ return inputField;}

}

class TextAreaOutputStream extends OutputStream {
    private JTextArea textArea;

    public TextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        textArea.append(String.valueOf((char) b));
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}



