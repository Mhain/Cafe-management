//lock,message

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

public class ManagementLoginSystem extends JFrame {

    JTextField jtf1;
    JPasswordField jpf1;
    JComboBox jcb1;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4, jl5;
    JTextArea jta1;
    JScrollPane jsp1;

   // public String user, secretWord;

    public ManagementLoginSystem() {
        super("Login System");
        this.setSize(900, 600);
        this.setLocation(200, 100);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void addComponents() {
        //addGif();
        jtf1 = new JTextField();
        jtf1.setBounds(550, 150, 250, 40);
        jtf1.setFont(new Font("SansSerif", Font.BOLD, 20));
        this.add(jtf1);
        jb1 = new JButton("Login");
        jb1.setBounds(550, 325, 70, 40);
        this.add(jb1);
        jb2 = new JButton("Customer Signup");
        jb2.setBounds(660, 325, 150, 40);
        this.add(jb2);
        jb3 = new JButton("Terms of Service");
        jb3.setBounds(640, 75, 180, 20);
        this.add(jb3);
        jpf1 = new JPasswordField();
        jpf1.setBounds(550, 200, 250, 40);
        jpf1.setFont(new Font("SansSerif", Font.BOLD, 20));
        this.add(jpf1);
        jl1 = new JLabel("User ID");
        jl1.setBounds(505, 145, 70, 50);
        jl1.setBackground(Color.WHITE);
        jl1.setForeground(Color.BLUE);
        this.add(jl1);
        jl2 = new JLabel("Password");
        jl2.setBounds(485, 195, 70, 50);
        jl2.setBackground(Color.WHITE);
        jl2.setForeground(Color.BLUE);
        this.add(jl2);
        jl3 = new JLabel("User Type");
        jl3.setBounds(490, 245, 70, 50);
        jl3.setBackground(Color.WHITE);
        jl3.setForeground(Color.BLUE);
        this.add(jl3);
        jl4 = new JLabel("LATEST UPDATES");
        jl4.setBounds(120, 35, 120, 100);
        jl4.setBackground(Color.WHITE);
        jl4.setForeground(Color.BLUE);
        this.add(jl4);
        String choises[] = {"Select", "Manager", "Employee", "Customer"};
        jcb1 = new JComboBox(choises);
        jcb1.setBounds(550, 250, 250, 40);
        ((JLabel) jcb1.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);//see renderer concept
        jcb1.setBackground(Color.green);
        this.add(jcb1);
        jta1 = new JTextArea(readUpdateFile(), 5, 30);
        //jta1.setBounds(20, 250, 800, 100);//override
        jta1.setFont(new Font("Serif", Font.BOLD, 20));
        jta1.setLineWrap(true);
        jta1.setWrapStyleWord(true);
        jta1.setEditable(false);
        jta1.setBackground(new Color(150, 238, 241));
        //this.add(jta1);//override
        jsp1 = new JScrollPane(jta1);
        jsp1.setBounds(20, 90, 400, 100);
        jsp1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        this.add(jsp1);
    }

    public void setButtonFunctionality() {
        ActionListener a = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(jpf1.getPassword());//password
                String username = jtf1.getText();//name
                String stringManagerFromFileLine[] = null;
                String stringEmployeeFromLine[] = null;
                String stringCustomerFromLine[] = null;
                if (jcb1.getSelectedItem().equals("Manager") && jtf1.getText() != null && password != null) {
                    try {
                        FileReader fr1 = new FileReader("manager.txt");
                        BufferedReader br1 = new BufferedReader(fr1);
                        String s1 = br1.readLine();

                        while (s1 != null) {
                            stringManagerFromFileLine = s1.split(";");
                            if (username.contains(stringManagerFromFileLine[0]) && password.contains(stringManagerFromFileLine[1])) {

                                JOptionPane.showMessageDialog(null, stringManagerFromFileLine[0] + "  thank you for logging in");

                                jtf1.setText("");
                                jpf1.setText("");
                            //    user = jtf1.getText();
                            //    secretWord = password;

                                ManagerManagement mm = new ManagerManagement();
                                mm.addComponents();
                                mm.setButtonFunctionality();
                                mm.setVisible(true);
                                disposeWorker();

                            }
                            s1 = br1.readLine();
                        }

                    } catch (Exception E1) {
                    }
                } else if (jcb1.getSelectedItem().equals("Employee") && jtf1.getText() != null && password != null) {
                    try {
                        FileReader fr2 = new FileReader("employeelogin.txt");
                        BufferedReader br2 = new BufferedReader(fr2);
                        String s2 = br2.readLine();
                        stringEmployeeFromLine = s2.split(";");
                        while (s2 != null) {
                            stringEmployeeFromLine = s2.split(";");
                            if (username.contains(stringEmployeeFromLine[0]) && password.contains(stringEmployeeFromLine[1])) {

                                JOptionPane.showMessageDialog(null, stringEmployeeFromLine[0] + "  thank you for logging in");
                                jtf1.setText("");
                                jpf1.setText("");

                                EmployeeManagement x = new EmployeeManagement();
                                x.addComponents();
                                x.setButtonFunctionality();
                                x.setVisible(true);
                                disposeWorker();
                                x.setVisible(true);

                            }

                            s2 = br2.readLine();
                        }

                    } catch (Exception E2) {
                    }
                } else if (jcb1.getSelectedItem().equals("Customer") && jtf1.getText() != null && password != null) {
                    try {
                        FileReader fr3 = new FileReader("customerlogin.txt");
                        BufferedReader br3 = new BufferedReader(fr3);
                        String s3 = br3.readLine();

                        while (s3 != null) {
                            stringCustomerFromLine = s3.split(";");
                            if (username.contains(stringCustomerFromLine[0]) && password.contains(stringCustomerFromLine[1])) {

                                JOptionPane.showMessageDialog(null, stringCustomerFromLine[0] + "  thank you for logging in");
                                jtf1.setText("");
                                jpf1.setText("");

                                ShowCustomerDetails cm = new ShowCustomerDetails();
        cm.addComponents();
       cm.ReadFromFile();
      cm.addFunctionality();
      cm.setVisible(true);
                                disposeWorker();
                                cm.setVisible(true);

                            }
                            s3 = br3.readLine();
                        }

                    } catch (Exception E3) {
                    }

                } else if (jcb1.getSelectedItem().equals("Select") || jcb1.getSelectedItem().equals("Manager") || jcb1.getSelectedItem().equals("Employee") || jcb1.getSelectedItem().equals("Customer") || (jtf1.getText() == null) || password == null) {
                    JOptionPane.showMessageDialog(null, "Enter your required information");
                    jtf1.setText("");
                    jpf1.setText("");
                }

            }

        };
        jb1.addActionListener(a);

        ActionListener b = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerSignup csup = new CustomerSignup();
                csup.addComponents();
                csup.setButtonFunctionality();
                csup.setVisible(true);
                disposeWorker();
            }
        };
        jb2.addActionListener(b);
        ActionListener c = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TermsOfService tos = new TermsOfService();
                tos.addComponents();
                tos.setButtonFunctionality();
                tos.setVisible(true);

            }
        };
        jb3.addActionListener(c);

    }

    void disposeWorker() {
        this.dispose();
    }

    /*  void addGif() {
        try {
            URL url = new URL("http://24.media.tumblr.com/tumblr_mcoee0phmA1r3p9nio1_400.gif");
            Icon icon = new ImageIcon(url);
            jl4 = new JLabel(icon);
            jl4.setBounds(50, 50, 300, 600);
            this.add(jl4);
        } catch (Exception ec) {
        }
    }*/
    String readUpdateFile() {
        FileReader fr4 = null;
        BufferedReader br4 = null;
        String ll = "";
        try {

            fr4 = new FileReader("update.txt");
            br4 = new BufferedReader(fr4);
            String s = br4.readLine();
            while (s != null) {
                ll += s;
                s = br4.readLine();
            }
            br4.close();
            fr4.close();
        } catch (Exception e) {
        }
        return ll;
    }

}
