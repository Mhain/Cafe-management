
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
import javafx.scene.chart.BarChart;
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


public class ManagerManagement extends JFrame {

    // public String user,secretWord;
    String name, address, password, email, gender, dob, contactNumber, password1, employeeType;
    //  int employeeId = 20000;
    JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6, jtf7, jtf8, jtf9, jtf10, jtf11, jtf12;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15;
    JPanel jp1, jp2, jp3, jp4, jp5, jp6, jp7, jp8, jp9, jp10, jp11, jp12, jp13, jp14, jp15, jp16, jp17, jp18, jp19, jp20;
    JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8;
    JTable jt1, jt2, jt3, jt4, jt5, jt6, jt7, jt8;
    JCheckBox jckb1, jckb2;
    JPasswordField jpf1, jpf2, jpf3, jpf4, jpf5, jpf6;
    JScrollPane jsp1, jsp2, jsp3, jsp4;
//   JFreeChart chart;

    public ManagerManagement() {
        super("Manager Controller");
        this.setLayout(null);
        this.setSize(900, 600);
        this.setLocation(200, 100);
        this.getContentPane().setBackground(Color.GREEN);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    void addComponents() {

        jp1 = new JPanel();//upper panel
        jp1.setBackground(Color.YELLOW);
        jp1.setLayout(null);
        jp1.setBounds(1, 1, 899, 75);
        this.add(jp1);
        jp2=new JPanel();
        jp2.setBounds(125,75,775,500);
        jp2.setLayout(null);
        jp2.setVisible(true);
        jp1.setBackground(Color.ORANGE);
        this.add(jp2);
        jp3 = new JPanel();//settings employee
        //  jp3.setBackground(Color.GREEN);
        jp3.setBounds(125, 75, 775, 500);
        jp3.setLayout(null);
        jp3.setVisible(false);
        this.add(jp3);
        jp4 = new JPanel();
        jp4.setBackground(Color.RED);
        jp4.setBounds(125, 75, 775, 500);
        jp4.setLayout(null);
        jp4.setVisible(false);
        this.add(jp4);
        jp5 = new JPanel();//food regular
       // jp5.setBackground(Color.RED);
        jp5.setBounds(125, 75, 775, 500);
        jp5.setVisible(false);
        this.add(jp5);
        jp6 = new JPanel();//food special
        jp6.setBackground(Color.RED);
        jp6.setBounds(125, 75, 775, 500);
        jp6.setVisible(false);
        this.add(jp6);
        jp7 = new JPanel();//edit

        jp7.setBounds(125, 75, 775, 500);
        jp7.setVisible(true);
        jp7.setLayout(null);
        this.add(jp7);
        jp8 = new JPanel();//statistics bar chart
        jp8.setBackground(Color.RED);
        jp8.setBounds(125, 75, 775, 500);
        jp8.setVisible(false);
        this.add(jp8);
        jp9 = new JPanel();//statistics graph
        jp9.setBackground(Color.RED);
        jp9.setBounds(125, 75, 775, 500);
        jp9.setVisible(false);
        this.add(jp9);
        jp10 = new JPanel();//social manager
        jp10.setBackground(Color.RED);
        jp10.setBounds(125, 75, 775, 500);
        jp10.setVisible(false);
        this.add(jp10);
        jp11 = new JPanel();//social employee
        jp11.setBackground(Color.RED);
        jp11.setBounds(125, 75, 775, 500);
        jp11.setVisible(false);
        this.add(jp11);
        jp12 = new JPanel();//social customer
        jp12.setBackground(Color.RED);
        jp12.setBounds(125, 75, 775, 500);
        jp12.setVisible(false);
        this.add(jp12);
        jp13 = new JPanel();//signup manager
        jp13.setBackground(Color.RED);
        jp13.setBounds(125, 75, 775, 500);
        jp13.setVisible(false);
        this.add(jp13);
        jp14 = new JPanel();//signup employee
        jp14.setBackground(Color.RED);
        jp14.setBounds(125, 75, 775, 500);
        jp14.setVisible(false);
        this.add(jp14);

        //--------------------------------------------------------------------------------------------------------------------
        jb1 = new JButton("Logout");
        jb1.setBounds(20, 490, 90, 40);
        this.add(jb1);
        jb2 = new JButton("settings");
        jb2.setBounds(20, 100, 90, 40);
        this.add(jb2);
        jb3 = new JButton("Food");
        jb3.setBounds(20, 190, 90, 40);
        this.add(jb3);
        jb4 = new JButton("Statistics");
        jb4.setBounds(20, 280, 90, 40);
        this.add(jb4);
      jb8 = new JButton("Manager");
        jb8.setBounds(150, 250, 125, 40);
        jp2.add(jb8);
        jb9 = new JButton("Employee");
        jb9.setBounds(300, 250, 125, 40);
        jp2.add(jb9);
        jb10 = new JButton("Customer");
        jb10.setBounds(450, 250, 125, 40);
        jp2.add(jb10);
        jb11 = new JButton("Food Menu");
        jb11.setBounds(250,250, 200,200);
        jp3.add(jb11);
        jb12 = new JButton("Daily Income");
        jb12.setBounds(250, 200, 200, 200);
        jp4.add(jb12);
        
        //---------------------------------------------------------------------------------------------------------------
      
    }

    void setButtonFunctionality() {
        ActionListener a = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ManagementLoginSystem mls = new ManagementLoginSystem();
                mls.addComponents();
                mls.setButtonFunctionality();
                mls.setVisible(true);
                disposeWorker();
            }
        };
        jb1.addActionListener(a);
        ActionListener b = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jb2.setBackground(Color.BLUE);
            
                jb3.setBackground(null);
                jb4.setBackground(null);
               
                
                jp2.setVisible(true);
                jp3.setVisible(false);
                jp4.setVisible(false);
                
               
        
                jp8.setVisible(false);
                jp9.setVisible(false);
                jp10.setVisible(false);
                jp11.setVisible(false);
                jp12.setVisible(false);
                jp13.setVisible(false);
                jp14.setVisible(false);

            }

        };
        jb2.addActionListener(b);//settings

        ActionListener c = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jb2.setBackground(null);
                jb3.setBackground(Color.BLUE);
                jb4.setBackground(null);
            
            
               
              
                jp3.setVisible(true);
                jp2.setVisible(false);
                jp4.setVisible(false);
             
                jp6.setVisible(false);
                jp7.setVisible(false);
                jp8.setVisible(false);
                jp9.setVisible(false);
                jp10.setVisible(false);
                jp11.setVisible(false);
                jp12.setVisible(false);
                jp13.setVisible(false);
                jp14.setVisible(false);

            }
        };

        jb3.addActionListener(c);//food

        ActionListener d = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
              
                jb7.setBackground(null);
                jb3.setBackground(null);
                jb2.setBackground(null);
                jb4.setBackground(Color.BLUE);
                jp3.setVisible(false);
                jp2.setVisible(false);
                jp4.setVisible(true);
                 jp8.setVisible(false);
                jp9.setVisible(false);
                jp10.setVisible(false);
                jp11.setVisible(false);
                jp12.setVisible(false);
                jp13.setVisible(false);
                jp14.setVisible(false);
            }
        };

        jb4.addActionListener(d);//statistics
        ActionListener u = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jb8.setBackground(Color.BLUE);
                jb9.setBackground(null);
                jb10.setBackground(null);
                jp2.setVisible(true);
                jp3.setVisible(false);
                jp4.setVisible(false);
                jp5.setVisible(false);
               
              
                jp8.setVisible(false);
                jp9.setVisible(false);
                jp10.setVisible(false);
                jp11.setVisible(false);
                jp12.setVisible(false);
                jp13.setVisible(false);
                jp14.setVisible(false);
                ManagerTableWorks mtw = new ManagerTableWorks();
                mtw.addComponents();
                mtw.setButtonFunctionality();
                mtw.setVisible(true);
                disposeWorker();

            }
        };

        jb8.addActionListener(u);
        ActionListener u1 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jb9.setBackground(Color.BLUE);
                jb8.setBackground(null);
                jb10.setBackground(null);
                jp2.setVisible(true);
                jp3.setVisible(false);
                jp4.setVisible(false);
              
                jp6.setVisible(false);
                jp7.setVisible(false);
                jp8.setVisible(false);
                jp9.setVisible(false);
                jp10.setVisible(false);
                jp11.setVisible(false);
                jp12.setVisible(false);
                jp13.setVisible(false);
                jp14.setVisible(false);
                EmployeeTableWorks etw = new EmployeeTableWorks();
                etw.addComponents();
                etw.setButtonFunctionality();
                etw.setVisible(true);
                disposeWorker();

            }
        };

        jb9.addActionListener(u1);
        ActionListener u2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jb10.setBackground(Color.BLUE);
                jb8.setBackground(null);
                jb9.setBackground(null);
                jp2.setVisible(true);
                jp3.setVisible(false);
                jp4.setVisible(false);
              
              
            
                jp8.setVisible(false);
                jp9.setVisible(false);
                jp10.setVisible(false);
                jp11.setVisible(false);
                jp12.setVisible(false);
                jp13.setVisible(false);
                jp14.setVisible(false);
                CustomerTableWorks ctw = new CustomerTableWorks();
                ctw.addComponents();
                ctw.setButtonFunctionality();
                ctw.setVisible(true);
                disposeWorker();

            }
        };

        jb10.addActionListener(u2);
        ActionListener u3 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                frame f = new frame();
                f.setTitle("MH");
                f.setVisible(true);
                f.setBounds(100, 50, 1400, 850);
                disposeWorker();
            }
        };

        jb11.addActionListener(u3);
         ActionListener u4= new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                barChart();
             
           
           
            }
        };

        jb12.addActionListener(u4);

    }

    void disposeWorker() {
        this.dispose();
    }

   void barChart() {
       
  /*           
    DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(80,"Checkings","Day1");
         dataset.setValue(50,"Checkings","Day2");
          dataset.setValue(75,"Checkings","Day3");
           dataset.setValue(95,"Checkings","Day4"); 
           dataset.setValue(44,"Checkings","Day5"); 
           dataset.setValue(31,"Checkings","Day6");
           dataset.setValue(95,"Checkings","Day7"); 
           
           JFreeChart chart=ChartFactory.createBarChart("Daily Earning","Day number","Income",dataset,PlotOrientation.VERTICAL,false,true,false);
           CategoryPlot p=chart.getCategoryPlot();
           p.setRangeGridlinePaint(Color.black);
           ChartFrame frame=new ChartFrame("Cafe Income",chart);
           frame.setVisible(true);
           frame.setSize(900,800);
           frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    */ 
          
         
       


        
     
}
   
   
   
   
   
}