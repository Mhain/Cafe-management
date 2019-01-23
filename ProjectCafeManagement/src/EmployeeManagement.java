import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
public class EmployeeManagement extends JFrame {
     JTextField jtf1;
      JButton jb1;
     JButton jb2;
    public EmployeeManagement()
    {
         super("Employee Settings");
        this.setSize(900, 600);
        this.setLocation(200, 100);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void addComponents()
    {
         jtf1 = new JTextField();
        jtf1.setBounds(150, 150, 250, 30);
        jtf1.setFont(new Font("SansSerif", Font.BOLD, 15));
        this.add(jtf1);
        jb1=new JButton("Logout");
         jb1.setBounds(650, 325, 70, 40);
         this.add(jb1);
         jb2=new JButton("Employee Details");
         jb2.setBounds(350, 325, 130, 40);
         this.add(jb2);
    }
    public void setButtonFunctionality()
    {
        ActionListener a = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ManagementLoginSystem mls=new ManagementLoginSystem();
               mls.addComponents();
               mls.setButtonFunctionality();
               mls.setVisible(true);
               disposeWorker();
            }
        };
        jb1.addActionListener(a);
       /* ActionListener b= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              
            }
        };
        jb2.addActionListener(b);*/
    }
    public void disposeWorker()
    {
        this.dispose();
    }
    
}
