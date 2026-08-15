import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Signup extends JFrame implements MouseListener, ActionListener{

  private ImageIcon pic,b,b3;
  private JLabel r,un,e,pass,c,ad,i;
  private JTextField utf,adf,cf,ef;
  private JPasswordField passf;
  private JButton bu1,bu2;

   
    

	Signup(){
	 this.setTitle("The Baratie (Signup)");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setSize(1000,600);
     this.setLocation(300,150);
      this.setResizable(false);

     JPanel jp = new JPanel();
     jp.setLayout(null);
     jp.setBackground(new Color(222,255,228));
     Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jp.setCursor(cursor);

    pic = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/icon.png");
     this.setIconImage(pic.getImage());

     r = new JLabel("REGISTER");
     r.setBounds(700,10,200,100);
     r.setFont(new Font("Raleway", Font.BOLD,30));
     jp.add(r);

      un = new JLabel("Username  :");
     un.setBounds(600,70,200,100);
     un.setFont(new Font("Raleway", Font.BOLD,20));
     jp.add(un);

     utf = new JTextField();
     utf.setBounds(720,115,200,20);
     jp.add(utf);

      e = new JLabel("Email          :");
     e.setBounds(600,110,200,100);
     e.setFont(new Font("Raleway", Font.BOLD,20));
     jp.add(e);

      ef = new JTextField();
     ef.setBounds(720,155,200,20);
     jp.add(ef);

      pass = new JLabel("Password  :");
     pass.setBounds(600,150,200,100);
     pass.setFont(new Font("Raleway", Font.BOLD,20));
     jp.add(pass);

     passf = new JPasswordField();
     passf.setBounds(720,195,200,20);
     jp.add(passf);

      c = new JLabel("Contact No:");
     c.setBounds(600,190,200,100);
     c.setFont(new Font("Raleway", Font.BOLD,20));
     jp.add(c);

      cf = new JTextField();
     cf.setBounds(720,235,200,20);
     jp.add(cf);

      ad = new JLabel("Address     :");
     ad.setBounds(600,230,200,100);
     ad.setFont(new Font("Raleway", Font.BOLD,20));
     jp.add(ad);

      adf = new JTextField();
     adf.setBounds(720,275,200,20);
     jp.add(adf);

      bu1 = new JButton("Confirm");
     bu1.setBounds(755,315,100,25);
     bu1.setFont(new Font("Arial", Font.BOLD,15));
     bu1.setBackground(Color.BLACK);
     bu1.setForeground(Color.WHITE);
     bu1.addActionListener(this);
     jp.add(bu1);

     bu2 = new JButton("Go to Login");
     bu2.setBounds(745,355,120,25);
     bu2.setFont(new Font("Arial", Font.BOLD,15));
     bu2.setBackground(Color.BLACK);
     bu2.setForeground(Color.WHITE);
     bu2.addActionListener(this);
     jp.add(bu2);


       b = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/b.jpg");
     Image b2 = b.getImage().getScaledInstance(550,600,Image.SCALE_DEFAULT);
      b3 = new ImageIcon(b2);
      i = new JLabel(b3);
     i.setBounds(0,-15,550,600);
     jp.add(i);


    
     this.add(jp);
     this.setVisible(true);

	}

  public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}

    public void actionPerformed(ActionEvent ae)
    {
     String username = utf.getText();
     char[]pin = passf.getPassword();
     String password = new String(pin);

      String email = new String(ef.getText());
      String contact_No = new String(cf.getText());
      String address = new String(adf.getText());

        if(ae.getSource() == bu1 )
        {

          if (username.isEmpty())
           {
                JOptionPane.showMessageDialog(null, "Please provide User-name.", "Sign Up",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (email.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Please provide your email.", "Sign Up",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (password.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Please provide your password.", "Sign Up",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (contact_No.isEmpty())
             {
                JOptionPane.showMessageDialog(null, "Please provide your phone number.", "Sign Up",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (address.isEmpty())
             {
                JOptionPane.showMessageDialog(null, "Please provide your home address.", "Sign Up",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            
            else {

              Filesio.signingUp(username,password,email,contact_No,address);
                      
          JOptionPane.showMessageDialog(null, "You have successfully signed up! Log In Now.", "Sign Up",
                        JOptionPane.INFORMATION_MESSAGE);
              this.setVisible(false);
                new Login();        
        }
        
        }

        else if(ae.getSource() == bu2 )
        {
          this.setVisible(false);
                new Login();
        }

       
    }
     public static void main (String [] args)
   {
       new Signup();
   }
 }

  
	