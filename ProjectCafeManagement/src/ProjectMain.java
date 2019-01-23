
public class ProjectMain {

    public static void main(String[] args) {
        ManagementLoginSystem ms = new ManagementLoginSystem();
        ms.addComponents();
        ms.setButtonFunctionality();
       /* Manager m=new Manager();
        m.getManagerFileRead();
        Employee e=new Employee();
        e.getEmployeeFileRead();
       Customer c=new Customer();
       c.getEmployeeFileRead();*/
        
        ms.setVisible(true);
        
    }

}
