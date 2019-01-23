
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
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class CustomerSignup extends JFrame {

    String name, address, password, email, gender, dob, contactNumber, password1;
    int bill, customerId = 30000;
   public CustomerSignup []allCustomer = new CustomerSignup[500];
     public CustomerSignup customer = null;
    int count = 0;
    private String s;
   public String stringCustomerFromFileLine[] = null;
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5, jtf6, jtf7, jtf8;
    JPasswordField jpf1;
    JPasswordField jpf2;
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JLabel jl5;
    JLabel jl6, jl7, jl8, jl9;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JCheckBox jcb1;
    JTextArea jta1;
    JScrollPane jsp1;

    CustomerSignup() {
        super("Customer Signup");
        this.setSize(900, 600);
        this.setLocation(200, 100);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void addComponents() {
        jtf1 = new JTextField();
        jtf1.setBounds(400, 150, 180, 30);
        jtf1.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf1.setBackground(Color.GREEN);
        this.add(jtf1);
        jpf1 = new JPasswordField();
        jpf1.setBounds(400, 200, 180, 30);
        jpf1.setFont(new Font("SansSerif", Font.BOLD, 15));
        jpf1.setBackground(Color.GREEN);
        this.add(jpf1);
        jpf2 = new JPasswordField();
        jpf2.setBounds(400, 250, 180, 30);
        jpf2.setFont(new Font("SansSerif", Font.BOLD, 15));
        jpf2.setBackground(Color.GREEN);
        this.add(jpf2);
        jtf2 = new JTextField();
        jtf2.setBounds(400, 300, 180, 30);
        jtf2.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf2.setBackground(Color.GREEN);
        this.add(jtf2);
        jtf3 = new JTextField();
        jtf3.setBounds(640, 150, 180, 30);
        jtf3.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf3.setBackground(Color.GREEN);

        this.add(jtf3);
        jtf4 = new JTextField();
        jtf4.setBounds(400, 100, 180, 20);
        jtf4.setFont(new Font("SansSerif", Font.BOLD, 10));
        jtf4.setText("Enter all the information");
        jtf4.setBackground(Color.ORANGE);
        jtf4.setEditable(false);
        this.add(jtf4);
        jtf5 = new JTextField();
        jtf5.setBounds(640, 200, 180, 30);
        jtf5.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf5.setBackground(Color.GREEN);
        this.add(jtf5);
        jtf7 = new JTextField();
        jtf7.setBounds(640, 300, 180, 30);
        jtf7.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf7.setBackground(Color.GREEN);
        this.add(jtf7);
        jtf8 = new JTextField();
        jtf8.setBounds(640, 250, 180, 30);
        jtf8.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf8.setBackground(Color.GREEN);
        this.add(jtf8);
        jl1 = new JLabel("User Name");
        jl1.setBounds(335, 140, 70, 50);
        jl1.setBackground(Color.WHITE);
        jl1.setForeground(Color.BLUE);
        this.add(jl1);
        jl2 = new JLabel("Password");
        jl2.setBounds(335, 190, 70, 50);
        jl2.setBackground(Color.WHITE);
        jl2.setForeground(Color.BLUE);
        this.add(jl2);
        jl3 = new JLabel("Confirm Password");
        jl3.setBounds(290, 240, 110, 50);
        jl3.setBackground(Color.WHITE);
        jl3.setForeground(Color.BLUE);
        this.add(jl3);

        jl4 = new JLabel("Address");
        jl4.setBounds(345, 290, 70, 50);
        jl4.setBackground(Color.WHITE);
        jl4.setForeground(Color.BLUE);
        this.add(jl4);
        jl5 = new JLabel("Mobile");
        jl5.setBounds(595, 140, 70, 50);
        jl5.setBackground(Color.WHITE);
        jl5.setForeground(Color.BLUE);
        this.add(jl5);
        jl6 = new JLabel("Email");
        jl6.setBounds(595, 190, 110, 50);
        jl6.setBackground(Color.WHITE);
        jl6.setForeground(Color.BLUE);
        this.add(jl6);
        jl7 = new JLabel("Gender");
        jl7.setBounds(595, 240, 110, 50);
        jl7.setBackground(Color.WHITE);
        jl7.setForeground(Color.BLUE);
        this.add(jl7);
        jl8 = new JLabel("Birth");
        jl8.setBounds(600, 290, 110, 50);
        jl8.setBackground(Color.WHITE);
        jl8.setForeground(Color.BLUE);
        this.add(jl8);

        jb1 = new JButton("Back");
        jb1.setBounds(710, 385, 70, 40);
        this.add(jb1);
        jb2 = new JButton("Add");
        jb2.setBounds(520, 385, 70, 40);
        this.add(jb2);
        jb3 = new JButton("Cancel");
        jb3.setBounds(610, 385, 80, 40);
        this.add(jb3);
        jcb1 = new JCheckBox("Agree To the Terms of Service");
        jcb1.setBounds(520, 340, 450, 40);
        jcb1.setFont(new Font("SansSerif", Font.BOLD, 12));
        jcb1.setSelected(false);//initial state
        this.add(jcb1);
        jta1 = new JTextArea(showFront(), 5, 30);
        // jta1.setBounds(20, 150, 200, 100);//override
        jta1.setFont(new Font("Serif", Font.BOLD, 20));
        jta1.setLineWrap(true);
        jta1.setWrapStyleWord(true);
        jta1.setEditable(false);
        jta1.setBackground(new Color(150, 238, 241));
        this.add(jta1);//override
        jsp1 = new JScrollPane(jta1);
        jsp1.setBounds(2, 30, 280, 200);
        jsp1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jsp1.setAutoscrolls(true);
        this.add(jsp1);
    }

    void setButtonFunctionality() {
        ActionListener a = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ManagementLoginSystem mls = new ManagementLoginSystem();
                mls.addComponents();
                mls.setButtonFunctionality();
                disposeWorker();
                mls.setVisible(true);

            }
        };
        jb1.addActionListener(a);
        ActionListener b = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jpf1.setText(null);
                jpf2.setText(null);
                jtf1.setText(null);
                jtf2.setText(null);
                jtf3.setText(null);
                jtf5.setText(null);
                jtf7.setText(null);
                jtf8.setText(null);
                jtf4.setText("Enter all the information");
                jcb1.setSelected(false);
            }
        };
        jb3.addActionListener(b);

        ActionListener c = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                password = new String(jpf1.getPassword());//password
                password1 = new String(jpf2.getPassword());//confirm password
                name = jtf1.getText();//name
                address = jtf2.getText();//address
                gender = jtf8.getText();
                dob = jtf7.getText();
                //empty jtf6
                contactNumber = jtf3.getText();//contact
                email = jtf5.getText();//email
               
                 if (!(password.equals(password1)) && jcb1.isSelected() == false) {
                    jtf4.setText("Enter all the information");
                } else if (!(password.equals(password1))) {
                    jtf4.setText(" Enter your password correctly ");
                } else if (jcb1.isSelected() == false) {
                    jtf4.setText("Agree to the Terms of Service ");

                } else if (name != null && gender != null && dob != null && password != null && password1 != null && address != null && contactNumber != null && email != null && jcb1.isSelected() == true) {
                    try {
                        FileWriter fw = new FileWriter("customerdetails.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(name);
                        bw.write(";");
                        bw.write(password);
                        bw.write(";");
                        bw.write(gender);
                        bw.write(";");
                        bw.write(dob);
                        bw.write(";");
                        bw.write(email);
                        bw.write(";");
                        bw.write(address);
                        bw.write(";");
                        bw.write(contactNumber);
                        bw.newLine();
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter("customerlogin.txt", true));
                        bw1.write(name);
                        bw1.write(";");
                        bw1.write(password);
                        bw1.newLine();

                        bw.close();
                        fw.close();
                        bw1.close();
                        jtf4.setText("Your infomation has been saved ");

                    } catch (Exception ef) {
                    }
                }
            }
        };
        jb2.addActionListener(c);
    }

    void disposeWorker() {
        this.dispose();
    }

    String showFront() {
        String st = "";
        FileReader fr4 = null;
        BufferedReader br4 = null;
        try {
            fr4 = new FileReader("customerupdate.txt");
            br4 = new BufferedReader(fr4);
            String s = br4.readLine();
            while (s != null) {
                st += s;
                s = br4.readLine();
            }
            br4.close();
            fr4.close();
        } catch (Exception e) {
        }

        return st;
    }

    public void getEmployeeFileRead() {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader("customerdetails.txt");
            br = new BufferedReader(fr);

            s = br.readLine();

            while (s != null) {
                stringCustomerFromFileLine = s.split(";");
                if (stringCustomerFromFileLine.length == 7) {//7 is correct

                    CustomerSignup customer = new CustomerSignup();
                    customer.customerId=customerId;
                    customer.name=stringCustomerFromFileLine[0];
                    customer.password=stringCustomerFromFileLine[1];
                    customer.gender=stringCustomerFromFileLine[2];
                    customer.dob=stringCustomerFromFileLine[3];
                    customer.email=stringCustomerFromFileLine[4];
                    customer.address=stringCustomerFromFileLine[5];
                    customer.contactNumber=stringCustomerFromFileLine[6];
                    customerId++;
                    allCustomer[count] = customer;
                    count++;
                }
                s = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {

        }

    }

}
