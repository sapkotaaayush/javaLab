import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {

    private static JLabel label1;
    private static JLabel label2;
    private static JTextField userField;
    private static JPasswordField passwordField;
    private static JButton btn1;
    private static JLabel success;



    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setSize(400, 350);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        JPanel jpanel = new JPanel();
        jpanel.setLayout(null);
        jframe.add(jpanel);


        label1 = new JLabel("User");
        label1.setBounds(10,20,80,25);
        jpanel.add(label1);

        label2 = new JLabel("Password");
        label2.setBounds(10,60,80,25);
        jpanel.add(label2);

       userField = new JTextField();
        jpanel.add(userField);
        userField.setBounds(100,20,165,25);


         passwordField = new JPasswordField();
        jpanel.add(passwordField);
        passwordField.setBounds(100,60,165,25);


        btn1 = new JButton("Login");
        btn1.setBounds(10,100,80, 25);
        btn1.addActionListener(new Main());
        jpanel.add(btn1);

         success = new JLabel();
        success.setBounds(10,150,300,25);
        jpanel.add(success);


    }

    @Override
    public void actionPerformed (ActionEvent e){
        String user = userField.getText();
        String password = passwordField.getText();
        System.out.println(user + " "+ password);

            if(user.equals("admin") && password.equals("root")){
                success.setText(("Welcome NS !!! "));
            }

    }
}
