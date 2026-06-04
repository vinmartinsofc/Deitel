package Deitel.ChapterIII;

import javax.swing.*;

public class JOptionPane2 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Whats your name?");

        String msg = String.format("Welcome, %s, to java programming! %n", name);

        JOptionPane.showMessageDialog(null, msg);

    }
}
