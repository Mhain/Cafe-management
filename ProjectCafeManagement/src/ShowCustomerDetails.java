
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;



public class ShowCustomerDetails  extends JFrame  {
    JLabel CustomerName; 
    JLabel CustomerAdress;
    JLabel CustomerNumber;
    JLabel CustomerEmail;
    JLabel CustomerId;
    JLabel Review;
    
    //this from file
    JLabel ShowName; 
    JLabel ShowAdress;
    JLabel ShowNumber;
    JLabel ShowEmail;
    JLabel ShowId;        
    
    JTextField CustomerRv;
    
    JCheckBox Tea;
    JCheckBox Coffe;
    JCheckBox Sandwich;
    JCheckBox Cake;   
    JCheckBox Burger;
    
    JTextField T1;
    JTextField T2;
    JTextField T3;
    JTextField T4;
    JTextField T5;

    
    JButton Order;
    JFrame odered;

    
    public ShowCustomerDetails(){
    super("Customer Details");
    this.setSize(1000,500);
    this.setLocation(300,50);
    this.setLayout(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
   
public void addComponents(){
    CustomerName=new JLabel("Name :"); 
    CustomerAdress=new JLabel("Adress :");
    CustomerNumber=new JLabel("Phone Number :");
    CustomerEmail=new JLabel("Email Adress :");
    CustomerId=new JLabel("Customer ID :");
    Review=new JLabel("Review :");
    
    ShowName=new JLabel(""); 
    ShowAdress=new JLabel("");
    ShowNumber=new JLabel("");
    ShowEmail=new JLabel("");
    ShowId=new JLabel("");
  
     CustomerRv=new JTextField();
    
     Tea=new JCheckBox("Tea (Price:10BDT)   ×");
    Coffe=new JCheckBox("Coffe (Price:20BDT)  ×");
    Sandwich=new JCheckBox("Sandwich (Price:40BDT)  ×");
    Cake=new JCheckBox("Cake (Price:10BDT)  ×");
    Burger=new JCheckBox("Burger (Price:50BDT)  ×");
    
    T1=new JTextField();
    T2=new JTextField();
    T3=new JTextField();
    T4=new JTextField();
    T5=new JTextField();
    
    Order=new JButton("Save&Order");
    odered=new JFrame();
    
    this.CustomerName.setBounds(10,100, 100, 50);
    this.CustomerAdress.setBounds(10,150, 100, 50);
    this.CustomerNumber.setBounds(10, 200, 100, 50);
    this.CustomerEmail.setBounds(10,250, 100, 50);
    this.CustomerId.setBounds(10,40,100,50);
     this.Review.setBounds(10, 300, 100, 50);
    this.CustomerRv.setBounds(120, 310, 300, 100);
   
    this.ShowId.setBounds(120, 40, 100 ,50);
    this.ShowName.setBounds(120, 100, 100, 50);
    this.ShowAdress.setBounds(120, 150, 300, 50);    
    this.ShowEmail.setBounds(120, 250, 300, 50);
    this.ShowNumber.setBounds(120, 200, 100, 50);
   
    
    this.Tea.setBounds(560, 50, 160, 50);
    this.Coffe.setBounds(560, 100, 160, 50);
    this.Sandwich.setBounds(560, 150, 180, 50);
    this.Cake.setBounds(560, 200, 160, 50);    
    this.Burger.setBounds(560, 250, 160, 50);

    this.T1.setBounds(750, 60, 50, 30);
    this.T2.setBounds(750, 110, 50, 30);
    this.T3.setBounds(750, 160, 50, 30);
    this.T4.setBounds(750, 210, 50, 30);    
    this.T5.setBounds(750, 260, 50, 30);
    
    this.Order.setBounds(690,370 ,120, 40);
    
    this.add(CustomerName);
    this.add(CustomerAdress);
    this.add(CustomerNumber);
    this.add(CustomerEmail);
    this.add(CustomerId);
    this.add(Review);
    this.add(CustomerRv); 
    
    this.add(Tea);
    this.add(Coffe);
    this.add(Cake);    
    this.add(Sandwich);
    this.add(Burger); 

    this.add(T1);
    this.add(T2);
    this.add(T3);    
    this.add(T4);
    this.add(T5); 
    
    this.add(Order);

    this.add(ShowId);
    this.add(ShowName);
    this.add(ShowAdress);
    this.add(ShowEmail);
    this.add(ShowNumber);    
}

public void ReadFromFile(){
         String CusId = null;
         String CusName = null;
         String CusAdress = null;
         String CusEmail = null;
         String CusPhone = null;
               
        try {
         FileReader fr = new FileReader("E:/ProjectCafeManagement/ProjectCafeManagement/CustomerDetail.txt");
         BufferedReader buf = new BufferedReader(fr);
         String stringArrayFromFileLine[] = null;

          String CustomerDetails = buf.readLine();

	   stringArrayFromFileLine = CustomerDetails.split("\\;");
 	if(stringArrayFromFileLine.length == 6)
 		{
                    CusId=stringArrayFromFileLine[5];
                    CusName=stringArrayFromFileLine[0];
                    CusAdress=stringArrayFromFileLine[2];
                    CusEmail=stringArrayFromFileLine[3];
                    CusPhone=stringArrayFromFileLine[4];
                    
                    //5no is for password
                }
		
         }
		 
                catch (IOException e){
			e.printStackTrace();   }      


         ShowId.setText(CusId);
        ShowName.setText(CusName);
        ShowAdress.setText(CusAdress);
        ShowEmail.setText(CusEmail);
        ShowNumber.setText(CusPhone);

}



   public void addFunctionality(){
               ActionListener btn = new ActionListener(){
                    public void actionPerformed(ActionEvent btn) {
                        
                        String Review; 
                        Review=CustomerRv.getText();
                FileWriter fw=null;
                BufferedWriter bw=null;
                try {
                    fw = new FileWriter("E:/ProjectCafeManagement/ProjectCafeManagement/Reviews.txt",true);
                    bw = new BufferedWriter(fw);
                    
                    
                    bw.write(Review+";");
                   
                            
                    bw.close();
                    fw.close();
                }
                catch (IOException ex) {
                    System.out.println("File Doesn't exist");
                    ex.printStackTrace();
                }  
                //problem starts from here
                      System.out.print("465456");              
                       
                      int amount=0; 

                     int t=Integer.parseInt(T1.getText());
                      System.out.print(t);             
                     int c=Integer.parseInt(T2.getText());
                     int ca=Integer.parseInt(T4.getText());
                     int s=Integer.parseInt(T3.getText());
                     int b=Integer.parseInt(T5.getText());
                     
        String msg="";  
        if(Tea.isSelected()){  
            amount+=(10*t);  
            msg="Tea: "+amount+"\n";  
        }  
        if(Coffe.isSelected()){  
            amount+=(20*c);  
            msg+="Coffe: "+amount+"\n";  
        }  
        if(Cake.isSelected()){  
            amount+=(10*ca);  
            msg+="Cake: 10\n";  
        }  
        if(Sandwich.isSelected()){  
            amount+=(40*s);  
            msg+="Sandwich: "+amount+"\n";  
        }
        if(Burger.isSelected()){  
            amount+=(50*b);  
            msg+="Burger: "+amount+"\n";  
        }        
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(odered,msg+"Total: "+amount);  
       
                    }
                    
                        };
                                  Order.addActionListener(btn);
   
   }
}
