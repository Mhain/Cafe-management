
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class CustomerManagement extends JFrame {

    
 JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6, jtf7, jtf8, jtf9, jtf10, jtf11, jtf12;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15;
    JPanel jp1, jp2, jp3, jp4, jp5, jp6, jp7, jp8, jp9, jp10, jp11, jp12, jp13, jp14, jp15, jp16, jp17, jp18, jp19, jp20;
    JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8;
    JTable jt1, jt2, jt3, jt4, jt5, jt6, jt7, jt8;
    JCheckBox jckb1, jckb2;
    JPasswordField jpf1, jpf2, jpf3, jpf4, jpf5, jpf6;
    JScrollPane jsp1, jsp2, jsp3, jsp4;
    public CustomerManagement() {
        super("Customer Control Panel");
        this.setSize(900, 600);
        this.setLocation(200, 100);
        this.setResizable(false);
        this.setLayout(null);
         this.getContentPane().setBackground(Color.ORANGE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void addComponents() {
        jp1 = new JPanel();//upper panel
        jp1.setBackground(Color.YELLOW);
        jp1.setBounds(1, 1, 899, 75);
        this.add(jp1);
         jb10 = new JButton("Customer");
        jb10.setBounds(20, 250, 125, 40);
        this.add(jb10);
        
        
        
          jb1 = new JButton("Logout");
        jb1.setBounds(20, 490, 90, 40);
        this.add(jb1);
         jb3 = new JButton("Food");
        jb3.setBounds(20, 190, 90, 40);
        this.add(jb3);
        
    }

    public void setButtonFunctionality() {

    }
}
