
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.*;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class TermsOfService extends JFrame {

    JButton jb1;
    JTextArea jta1;
    JScrollPane jsp11;

    TermsOfService() {
        super("Terms of Service");
        this.setSize(400, 400);
        this.setLocation(300, 150);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    }

    void addComponents() {
        jb1 = new JButton("Ok");
        jb1.setBounds(180, 325, 50, 30);
        this.add(jb1);
        jta1 = new JTextArea(readTermsOfServiceFile(), 10, 20);
        jta1.setFont(new Font("Serif", Font.BOLD, 20));
        jta1.setLineWrap(true);
        jta1.setWrapStyleWord(true);
        jta1.setEditable(false);
        //  jta1.setBounds(1, 1, 200, 200);
        jta1.setBackground(Color.orange);
//this.add(jta1);
        jsp11 = new JScrollPane(jta1);
        jsp11.setBounds(1, 1, 400, 300);
        jsp11.setAutoscrolls(true);
        jsp11.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(jsp11);
    }

    void setButtonFunctionality() {
        ActionListener a = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                disposeWork();
            }
        };
        jb1.addActionListener(a);
    }

    void disposeWork() {
        this.dispose();
    }

    String readTermsOfServiceFile() {
        FileReader fr = null;
        BufferedReader br = null;
        String l="";
        try {

            fr = new FileReader("tof.txt");
            br = new BufferedReader(fr);
            String s = br.readLine();
             while (s != null) {
                l += s;
                s = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return l;
    }

}
