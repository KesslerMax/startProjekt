import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JPanel mainPanel;
    private JTextField tfEingabe;
    private JButton buttonOk;
    private JLabel label;

    public Gui() {
        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String text = tfEingabe.getText();
               label.setText(text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("erste Schritte mit IJ");
        frame.setContentPane(new Gui().mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
