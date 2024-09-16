package io.github.annekarolinneds;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("Deseja publicar no Instagram(1) ou Threads(2)? Digite Apenas 1 ou 2");
        String username = JOptionPane.showInputDialog("Digite - Username: ");
        String password = JOptionPane.showInputDialog("Digite - Password: ");
        String msg = JOptionPane.showInputDialog("Digite sua mensagem: ");

        Meta socialMeta;
        switch (Integer.parseInt(option)) {
            case 1:
                socialMeta = new Instagram(username, password);
                socialMeta.post(msg);  // Passando a mensagem como argumento
                break;
            case 2:
                socialMeta = new Threads(username, password);
                socialMeta.post(msg);  // Passando a mensagem como argumento
                break;
        }
    }
}
