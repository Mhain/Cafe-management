import java.awt.event.ActionListener;
import java.awt.Color;
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
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ManagerTableWorks extends JFrame{
    String name, address, password, email, gender, dob, contactNumber, password1, employeeType;
    JButton jb1, jb2, jb3, jb4, jb5, jb6;
    JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6, jtf7, jtf8;
    JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8;
    JPasswordField jpf1, jpf2;
    JTable jt1, jt2;
    JScrollPane jsp1, jsp2;
    public ManagerTableWorks()
    {
         super("Manager Table List ");
        this.setLayout(null);
        this.setSize(900, 600);
        this.setLocation(200, 100);
        this.getContentPane().setBackground(Color.RED);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tableWorks();
        
        
    }
     void addComponents() {
        jb1 = new JButton("Back");
        jb1.setBounds(20, 480, 90, 40);
        this.add(jb1);
        jb2 = new JButton("Add");
        jb2.setBounds(20, 430, 90, 40);
        this.add(jb2);
        jb3 = new JButton("Delete");
        jb3.setBounds(20, 375, 90, 40);
        this.add(jb3);
        jb4 = new JButton("Edit");
        jb4.setBounds(20, 325, 90, 40);
        this.add(jb4);

        //---------------------------------------------------------------------------------------
        jtf1 = new JTextField();
        jtf1.setBounds(375, 350, 180, 30);
        jtf1.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf1.setBackground(Color.GREEN);
        this.add(jtf1);
        jpf1 = new JPasswordField();
        jpf1.setBounds(375, 400, 180, 30);
        jpf1.setFont(new Font("SansSerif", Font.BOLD, 15));
        jpf1.setBackground(Color.GREEN);
        this.add(jpf1);
        jtf2 = new JTextField();
        jtf2.setBounds(375, 450, 180, 30);
        jtf2.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf2.setBackground(Color.GREEN);
        this.add(jtf2);
        jtf3 = new JTextField();
        jtf3.setBounds(640, 350, 180, 30);
        jtf3.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf3.setBackground(Color.GREEN);

        this.add(jtf3);
        jtf4 = new JTextField();
        jtf4.setBounds(400, 300, 180, 20);
        jtf4.setFont(new Font("SansSerif", Font.BOLD, 10));//textmessage

        jtf4.setBackground(Color.ORANGE);

        jtf4.setEditable(false);
        this.add(jtf4);
        jtf5 = new JTextField();
        jtf5.setBounds(640, 400, 180, 30);
        jtf5.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf5.setBackground(Color.GREEN);
        this.add(jtf5);
        jtf7 = new JTextField();
        jtf7.setBounds(570, 500, 180, 30);
        jtf7.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf7.setBackground(Color.GREEN);
        this.add(jtf7);
        jtf8 = new JTextField();
        jtf8.setBounds(640, 450, 180, 30);
        jtf8.setFont(new Font("SansSerif", Font.BOLD, 15));
        jtf8.setBackground(Color.GREEN);
        this.add(jtf8);
        jl1 = new JLabel("User Name");
        jl1.setBounds(300, 340, 70, 50);
        jl1.setBackground(Color.WHITE);
        jl1.setForeground(Color.BLUE);
        this.add(jl1);
        jl2 = new JLabel("Password");
        jl2.setBounds(310, 390, 70, 50);
        jl2.setBackground(Color.WHITE);
        jl2.setForeground(Color.BLUE);
        this.add(jl2);
        jl4 = new JLabel("Address");//jl3 gone

        jl4.setBounds(320, 440, 70, 50);
        jl4.setBackground(Color.WHITE);
        jl4.setForeground(Color.BLUE);
        this.add(jl4);
        jl5 = new JLabel("Mobile");
        jl5.setBounds(595, 340, 70, 50);
        jl5.setBackground(Color.WHITE);
        jl5.setForeground(Color.BLUE);
        this.add(jl5);
        jl6 = new JLabel("Email");
        jl6.setBounds(595, 390, 110, 50);
        jl6.setBackground(Color.WHITE);
        jl6.setForeground(Color.BLUE);
        this.add(jl6);
        jl7 = new JLabel("Gender");
        jl7.setBounds(595, 440, 110, 50);
        jl7.setBackground(Color.WHITE);
        jl7.setForeground(Color.BLUE);
        this.add(jl7);
        jl8 = new JLabel("Birth");
        jl8.setBounds(540, 490, 110, 50);
        jl8.setBackground(Color.WHITE);
        jl8.setForeground(Color.BLUE);
        this.add(jl8);

    }

    void setButtonFunctionality() {
        ActionListener a = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerManagement mmf = new ManagerManagement();
                mmf.addComponents();
                mmf.setButtonFunctionality();
                mmf.setVisible(true);
                disposeWorker();
            }
        };

        jb1.addActionListener(a);
        ActionListener b = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTable();
            }
        };

        jb3.addActionListener(b);

        ActionListener c = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                updateTable();
            }
        };
        jb4.addActionListener(c);
        MouseListener myMouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                clickTable();
            }
        };

        jt1.addMouseListener(myMouseListener);
         ActionListener f = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                addTable();
                 password = new String(jpf1.getPassword());//password
    
        name = jtf1.getText();//name
        address = jtf2.getText();//address
        gender = jtf8.getText();
        dob = jtf7.getText();
        //empty jtf6
        contactNumber = jtf3.getText();//contact
        email = jtf5.getText();//email


     if (name != null && gender != null && dob != null && password != null && password1 != null && address != null && contactNumber != null && email != null) {
            try {
                FileWriter fw1 = new FileWriter("employeedetails.txt", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                bw1.write(name);
                bw1.write(";");
                bw1.write(password);
                bw1.write(";");
                bw1.write(gender);
                bw1.write(";");
                bw1.write(dob);
                bw1.write(";");
                bw1.write(email);
                bw1.write(";");
                bw1.write(address);
                bw1.write(";");
                bw1.write(contactNumber);
                bw1.newLine();
                BufferedWriter bw2 = new BufferedWriter(new FileWriter("managerlogin.txt", true));
                bw1.write(name);
                bw1.write(";");
                bw1.write(password);
                bw1.newLine();

                bw1.close();
                fw1.close();
                bw2.close();
                jtf4.setText("Your infomation has been saved ");

            } catch (Exception eff) {
            }
        }
                
                
                
            }
        };

        jb2.addActionListener(f);

    }

    public void tableWorks() {
        String[][] allEmployee = new String[20][20];
        String fileline = null;
        String[] parts = null;
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("managerdetails.txt"));
            fileline = br.readLine();
            while (fileline != null) {
                parts = fileline.split(";");
                allEmployee[i] = parts;
                i++;
                fileline = br.readLine();
            }
        } catch (Exception ew) {
        }
        String[] column = {"Name", "Password", "Gender", "Birth", "Email", "Address", "Contactnumber"};
        Object[][] row = allEmployee;
        DefaultTableModel dtm = new DefaultTableModel(row, column);
        jt1 = new JTable(dtm);
        jsp1 = new JScrollPane(jt1);
        jsp1.setBounds(10, 10, 850, 200);
        this.add(jsp1);

    }

    void disposeWorker() {
        this.dispose();
    }

    void deleteTable() {
        DefaultTableModel model = (DefaultTableModel) jt1.getModel();
        if (jt1.getSelectedRow() == -1) {
            if (jt1.getRowCount() == 0) {
                jtf4.setText("Table is empty");
            } else {
                jtf4.setText("You must select someone");
            }
        } else {
            model.removeRow(jt1.getSelectedRow());
        }
    }

    void updateTable() {
        DefaultTableModel model = (DefaultTableModel) jt1.getModel();
        try {
            if (jt1.getSelectedRow() == -1) {
                if (jt1.getRowCount() == 0) {
                    jtf4.setText("Table is empty");
                } else {
                    jtf4.setText("You must select someone");
                }
            }

            model.setValueAt(jtf1.getText(), jt1.getSelectedRow(), 0);//name
            model.setValueAt(new String(jpf1.getPassword()), jt1.getSelectedRow(), 1);//password
            model.setValueAt(jtf8.getText(), jt1.getSelectedRow(), 2); //gender
            model.setValueAt(jtf7.getText(), jt1.getSelectedRow(), 3);//birth
            model.setValueAt(jtf5.getText(), jt1.getSelectedRow(), 4);//email
            model.setValueAt(jtf2.getText(), jt1.getSelectedRow(), 5);//address
            model.setValueAt(jtf3.getText(), jt1.getSelectedRow(), 6);//contact
        } catch (Exception er) {
        }

    }

    void clickTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) jt1.getModel();
            jtf1.setText(model.getValueAt(jt1.getSelectedRow(), 0).toString());
            jpf1.setText(model.getValueAt(jt1.getSelectedRow(), 1).toString());
            jtf8.setText(model.getValueAt(jt1.getSelectedRow(), 2).toString());
            jtf7.setText(model.getValueAt(jt1.getSelectedRow(), 3).toString());
            jtf5.setText(model.getValueAt(jt1.getSelectedRow(), 4).toString());
            jtf2.setText(model.getValueAt(jt1.getSelectedRow(), 5).toString());
            jtf3.setText(model.getValueAt(jt1.getSelectedRow(), 6).toString());
        } catch (Exception ed) {
        }

    }
    void addTable()
    {
        
        jtf4.setText("");
        DefaultTableModel model=(DefaultTableModel)jt1.getModel();
        if(!jtf1.getText().trim().equals(""))
        {
        model.addRow(new Object[]{jtf1.getText(),new String(jpf1.getPassword()),jtf8.getText(),jtf7.getText(),jtf5.getText(),jtf2.getText(),jtf3.getText()});
    
        }
        else
        {
            jtf4.setText("All the data must be given");
           
        }
    }
   
   
    
    
    
    
    
    
}
