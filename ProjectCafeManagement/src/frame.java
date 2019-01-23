

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



 class frame extends JFrame implements ActionListener {
    Container c ;
    JLabel label;
    JLabel labe;
    JLabel lab = new JLabel("Name of Items");
    JCheckBox  cb = new JCheckBox("Hot Coffee");
    JCheckBox  cb1 = new JCheckBox("Special Coffee");
    JCheckBox  cb2 = new JCheckBox("Hot Cream Coffee");
    JCheckBox  cb3 = new JCheckBox("Plain Cold Coffee");
    JCheckBox  cb4 = new JCheckBox("Chocolate Milk");
    JCheckBox  cb5 = new JCheckBox("Masala Dosa");
    
    JCheckBox  price = new JCheckBox("");
    JCheckBox  price1 = new JCheckBox("");
    JCheckBox  price2 = new JCheckBox("");
    JCheckBox  price3 = new JCheckBox("");
    JCheckBox  price4 = new JCheckBox("");
    JCheckBox  price5 = new JCheckBox("");
    
    JTextArea area = new JTextArea();
    
    
    JLabel item = new JLabel("Bill Generate ");
    
    JLabel bil = new JLabel("Item 1: ");
    JLabel bil1 = new JLabel("Item 2: ");
    JLabel bil2 = new JLabel("Item 3: ");
    JLabel bil3 = new JLabel("Item 4: ");
    JLabel bil4 = new JLabel("Item 5: ");
    JLabel bil5 = new JLabel("Item 6: ");
    
    JLabel itm = new JLabel("NO OF ITEM");
    
    JComboBox box=new JComboBox(); ;
    JComboBox box1 =new JComboBox();
    JComboBox box2 =new JComboBox();
    JComboBox box3 =new JComboBox();
    JComboBox box4 =new JComboBox();
    JComboBox box5 =new JComboBox();
    
    String [] no = new String [20];
   
   JTextField txt = new JTextField();
   JTextField txt1 = new JTextField();
   JTextField txt2 = new JTextField();
   JTextField txt3 = new JTextField();
   JTextField txt4 = new JTextField();
   JTextField txt5 = new JTextField();
   
   JButton bill = new JButton("BILL : ");
   
   JTextField billAns = new JTextField();
   
   JButton butn =new JButton ("Exit");
   
    
    Color clr = new Color(250,220,130);
    Color cl = new Color(15,10,80);
    
    
    Font f = new Font("Palatino",Font.ITALIC,20);
    Font fn = new Font("Palatino",Font.ITALIC,15);
    Font fnt = new Font("Palatino",Font.ITALIC,35);
    
    
    frame(){
       c=this.getContentPane();
       c.setLayout(null);
       ImageIcon icon = new ImageIcon("coffee.png");
       ImageIcon icon1 = new ImageIcon("mh.png");
       label = new JLabel(icon);
       labe = new JLabel(icon1);
       label.setBounds(15,10,icon.getIconWidth(),icon.getIconHeight());
       labe.setBounds(300,670,icon1.getIconWidth(),icon1.getIconHeight());
       
       
       lab.setBounds(12,130,250,50);
       lab.setBackground(clr);
       lab.setForeground(Color.red);
       lab.setFont(f);
       
       cb.setBounds(12,170,140,40);
       cb.setForeground(Color.red);
       cb.setFont(fn);
       
       cb1.setBounds(12,220,140,40);
       cb1.setForeground(Color.red);
       cb1.setFont(fn);
       
       cb2.setBounds(12,270,160,40);
       cb2.setForeground(Color.red);
       cb2.setFont(fn);
       
       cb3.setBounds(12,320,140,40);
       cb3.setForeground(Color.red);
       cb3.setFont(fn);
       
       cb4.setBounds(12,370,140,40);
       cb4.setForeground(Color.red);
       cb4.setFont(fn);
       
       cb5.setBounds(12,420,140,40);
       cb5.setForeground(Color.red);
       cb5.setFont(fn);
       
       itm.setBounds(180,130,250,50);
       itm.setBackground(clr);
       itm.setForeground(cl);
       itm.setFont(f);
       
       
       box.setFont(f);
       box = new JComboBox(no);
       for(int i=0;i<20;i++){
            no[i]=Integer.toString(i+1);
       }
       box = new JComboBox(no);
       box.setBounds(200,180,40,20);
       box.setBackground(Color.white);
       box.setForeground(Color.red);
       
       
       box1.setFont(f);
       box1 = new JComboBox(no);
       for(int i=0;i<20;i++){
            no[i]=Integer.toString(i+1);
       }
       box1 = new JComboBox(no);
       box1.setBounds(200,230,40,20);
       box1.setBackground(Color.white);
       box1.setForeground(Color.red);
         
        
       box2.setFont(f);
       box2 = new JComboBox(no);
       for(int i=0;i<20;i++){
            no[i]=Integer.toString(i+1);
       }
       box2 = new JComboBox(no);
       box2.setBounds(200,280,40,20);
       box2.setBackground(Color.white);
       box2.setForeground(Color.red);
       
       
       box3.setFont(f);
       box3 = new JComboBox(no);
       for(int i=0;i<20;i++){
            no[i]=Integer.toString(i+1);
       }
       box3 = new JComboBox(no);
       box3.setBounds(200,330,40,20);
       box3.setBackground(Color.white);
       box3.setForeground(Color.red);
       
       
       box4.setFont(f);
       box4 = new JComboBox(no);
       for(int i=0;i<20;i++){
            no[i]=Integer.toString(i+1);
       }
       box4 = new JComboBox(no);
       box4.setBounds(200,380,40,20);
       box4.setBackground(Color.white);
       box4.setForeground(Color.red);
       
       
       box5.setFont(f);
       box5 = new JComboBox(no);
       for(int i=0;i<20;i++){
            no[i]=Integer.toString(i+1);
       }
       box5 = new JComboBox(no);
       box5.setBounds(200,430,40,20);
       box5.setBackground(Color.white);
       box5.setForeground(Color.red);
       
       area.setBounds(350,170,330,300);
       area.setFont(f);
       area.setBackground(Color.LIGHT_GRAY);
       area.setForeground(Color.red);
       
      
       
       item.setBounds(783,80,250,50);
       item.setFont(fnt);
       item.setBackground(Color.black);
       item.setForeground(Color.red);
       
       bil.setBounds(820,140,100,50);
       bil.setFont(f);
       
       bil1.setBounds(820,200,100,50);
       bil1.setFont(f);
       
       bil2.setBounds(820,260,100,50);
       bil2.setFont(f);
       
       bil3.setBounds(820,320,100,50);
       bil3.setFont(f);
       
       bil4.setBounds(820,380,100,50);
       bil4.setFont(f);
       
       bil5.setBounds(820,440,100,50);
       bil5.setFont(f);
       
       txt.setBounds(900,140,100,50);
       txt.setFont(f);
       txt.setForeground(cl);
       
       txt1.setBounds(900,200,100,50);
       txt1.setFont(f);
       txt1.setForeground(cl);
       
       txt2.setBounds(900,260,100,50);
       txt2.setFont(f);
       txt2.setForeground(cl);
       
       txt3.setBounds(900,320,100,50);
       txt3.setFont(f);
       txt3.setForeground(cl);
       
       txt4.setBounds(900,380,100,50);
       txt4.setFont(f);
       txt4.setForeground(cl);
       
       txt5.setBounds(900,440,100,50);
       txt5.setFont(f);
       txt5.setForeground(cl);
       
       
      price.setBounds(770,140,50,50);
      price1.setBounds(770,200,50,50);
      price2.setBounds(770,260,50,50);
      price3.setBounds(770,320,50,50);
      price4.setBounds(770,380,50,50);
      price5.setBounds(770,440,50,50);
      
       bill.setBounds(700,550,150,100);
       bill.setFont(fnt);
       bill.setBackground(Color.BLACK);
       bill.setForeground(Color.red);
       
       billAns.setBounds(870,550,200,100);
       billAns.setFont(fnt);
       billAns.setForeground(Color.red);
       
       butn.setBounds(50,650,150,50);
       butn.setForeground(Color.red);
       butn.setFont(f);
       
        butn.addActionListener(this);
       
       cb.addActionListener(this);
       cb1.addActionListener(this);
       cb2.addActionListener(this);
       cb3.addActionListener(this);
       cb4.addActionListener(this);
       cb5.addActionListener(this);
       
       price.addActionListener(this);
       price1.addActionListener(this);
       price2.addActionListener(this);
       price3.addActionListener(this);
       price4.addActionListener(this);
       price5.addActionListener(this);
       
       bill.addActionListener(this);
      
       c.add(labe);
       c.add(label);
       c.add(lab);
       c.add(cb);
       c.add(cb1);
       c.add(cb2);
       c.add(cb3);
       c.add(cb4);
       c.add(cb5);
       c.add (area);
       c.add(item);
       c.add(bil);
       c.add(bil1);
       c.add(bil2);
       c.add(bil3);
       c.add(bil4);
       c.add(bil5);
       c.add(itm);
       c.add(txt);
       c.add(txt1);
       c.add(txt2);
       c.add(txt3);
       c.add(txt4);
       c.add(txt5);
       c.add(bill);
       c.add(billAns);
       c.add(price);
       c.add(price1);
       c.add(price2);
       c.add(price3);
       c.add(price4);
       c.add(price5);
       c.add(box);
       c.add(box1);
       c.add(box2);
       c.add(box3);
       c.add(box4);
       c.add(box5);
       c.add(butn);
               
    }
    
    public void actionPerformed(ActionEvent e){
        
        
        String combobox1 = (String)box1.getSelectedItem();
        String combobox2 = (String)box2.getSelectedItem();
        String combobox3 = (String)box3.getSelectedItem();
        String combobox4 = (String)box4.getSelectedItem();
        String combobox5 = (String)box5.getSelectedItem();
        
        area.setText("");
        if(cb.isSelected()){
            area.append("1."+cb.getText()+"                Price:25 tk\n\n");
            if(price.isSelected()){
                String combobox = (String)box.getSelectedItem();
               
               float f = Float.parseFloat(combobox);
               float ans = (25*f);
               String answer = Float.toString(ans);
               txt.setText(" "+answer);
            }
          }
        
       else if(!(cb.isSelected())){
           if(price.isSelected()){
              txt.setText(" "+"0"); 
           } 
        }
        
        
        if(cb1.isSelected()){
            area.append("2."+cb1.getText()+"         Price:30 tk\n\n");
            if(price1.isSelected()){
                String combobox = (String)box1.getSelectedItem();
               
               float f = Float.parseFloat(combobox);
               float ans = (30*f);
               String answer = Float.toString(ans);
               txt1.setText(" "+answer);
            }
        }
        
      else  if(!(cb1.isSelected())){
           if(price1.isSelected()){
              txt1.setText(" "+"0"); 
           } 
        }
        
       
         if(cb2.isSelected()){
            area.append("3."+cb2.getText()+"    Price:40 tk\n\n");
            if(price2.isSelected()){
                String combobox = (String)box2.getSelectedItem();
               
               float f = Float.parseFloat(combobox);
               float ans = (40*f);
               String answer = Float.toString(ans);
               txt2.setText(" "+answer);
            }
        }
        
         
         else  if(!(cb2.isSelected())){
           if(price2.isSelected()){
              txt2.setText(" "+"0"); 
           } 
        }
        
        
        
        if(cb3.isSelected()){
            area.append("4."+cb3.getText()+"    Price:50 tk\n\n");
            if(price3.isSelected()){
                String combobox = (String)box3.getSelectedItem();
               
               float f = Float.parseFloat(combobox);
               float ans = (50*f);
               String answer = Float.toString(ans);
               txt3.setText(" "+answer);
            }  
        }
        
        else  if(!(cb3.isSelected())){
           if(price3.isSelected()){
              txt3.setText(" "+"0"); 
           } 
        }
        
        
        if(cb4.isSelected()){
            area.append("5."+cb4.getText()+"        Price:30 tk\n\n");
           if(price4.isSelected()){
                String combobox = (String)box4.getSelectedItem();
               
               float f = Float.parseFloat(combobox);
               float ans = (30*f);
               String answer = Float.toString(ans);
               txt4.setText(" "+answer);
            }
        }
        
        else  if(!(cb4.isSelected())){
           if(price4.isSelected()){
              txt4.setText(" "+"0"); 
           } 
        }
        
        
        if(cb5.isSelected()){
            area.append("6."+cb5.getText()+"          Price:60 tk\n\n");
          if(price5.isSelected()){
                String combobox = (String)box5.getSelectedItem();
               
               float f = Float.parseFloat(combobox);
               float ans = (60*f);
               String answer = Float.toString(ans);
               txt5.setText(" "+answer);
            }
        }
        
        else  if(!(cb5.isSelected())){
           if(price5.isSelected()){
              txt5.setText(" "+"0"); 
           } 
        }
        
        
        
        
        if(e.getSource()==bill){
            
           try{
            String s =txt.getText();
            String s1 =txt1.getText();
            String s2 =txt2.getText();
            String s3 =txt3.getText();
            String s4 =txt4.getText();
            String s5 =txt5.getText();
            
            float f =  Float.parseFloat(s);
            float f1 = Float.parseFloat(s1);
            float f2 = Float.parseFloat(s2);
            float f3 = Float.parseFloat(s3);
            float f4 = Float.parseFloat(s4);
            float f5 = Float.parseFloat(s5);
            
            float answer = f+f1+f2+f3+f4+f5;
            
            String ans = Float.toString(answer);
            
            billAns.setText(" "+ans);
           }
           catch(Exception en){
               JOptionPane.showMessageDialog(null,"Please Select All Item Numbers, Thankyou.");
               
           }
        }
        
        if (e.getSource()==butn){
            System.exit(0);
        }
        
    }
}    




   

 
    
   
    




   