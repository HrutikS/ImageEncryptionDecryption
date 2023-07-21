import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Application Started");
        ImageOperation io = new ImageOperation();
        
        JFrame f = new JFrame();
        f.setTitle("Image Encryption and Decryption");
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating Font
        Font font = new Font("Roboto",Font.BOLD,25);

        //Creating button
        JButton button1 = new JButton();
        button1.setText("Open Image");
        button1.setFont(font);
        // JButton button2 = new JButton();
        // button2.setText("Decrypt");
        // button2.setFont(font);

        //Creating text field
        JTextField textField = new JTextField(10);
        textField.setFont(font);

        //Adding Ation Listener
        button1.addActionListener(e->{
            // System.out.println("Button clicked");
            String text = textField.getText();
            int temp = Integer.parseInt(text);
            io.operate(temp);
        });

        f.setLayout(new FlowLayout());

        f.add(textField);
        // f.add(button2);
        f.add(button1);
        f.setVisible(true);

    }
}