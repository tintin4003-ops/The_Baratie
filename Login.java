import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Login extends JFrame implements MouseListener, ActionListener{
    private JTextField ut;
    private JPasswordField pt;
    private ImageIcon pic,in,in3,ib,ib2,ib3;
    private JLabel l,l2,u,p;
    private JButton b1,b2;
    private String adminu,adminp;

	Login()
	{
     this.setTitle("The Baratie");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setSize(1000,600);
     this.setLocation(300,150);

    
     this.setResizable(false);
     JPanel jp = new JPanel();
     jp.setLayout(null);
      Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jp.setCursor(cursor);
    
  
     pic = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/icon.png");
     this.setIconImage(pic.getImage());


      in = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/bn.png");
     Image in2 = in.getImage().getScaledInstance(200, 100,Image.SCALE_DEFAULT);
     in3 = new ImageIcon(in2);
     l2 = new JLabel(in3);
     l2.setBounds(780,10,200,100);
     jp.add(l2);

     u = new JLabel("User-ID   :");
     u.setBounds(385,25,200,100);
     u.setFont(new Font("Arial", Font.BOLD,20));
     jp.add(u);

     ut = new JTextField();
     ut.setBounds(500,65,150,20);
     ut.addMouseListener(this);
     jp.add(ut);

     p = new JLabel("Password :");
     p.setBounds(385,65,200,100);
     p.setFont(new Font("Arial", Font.BOLD,20));
     jp.add(p);

     pt = new JPasswordField();
     pt.setBounds(500,105,150,20);
      pt.addMouseListener(this);
     jp.add(pt);

     b1 = new JButton("Login");
     b1.setBounds(525,130,100,25);
     b1.setFont(new Font("Arial", Font.BOLD,15));
     b1.setBackground(Color.BLACK);
     b1.setForeground(Color.WHITE);
     b1.addMouseListener(this);
     b1.addActionListener(this);
     jp.add(b1);

    b2 = new JButton("Signup");
     b2.setBounds(525,160,100,25);
     b2.setFont(new Font("Arial", Font.BOLD,15));
     b2.setBackground(Color.BLACK);
     b2.setForeground(Color.WHITE);
     b2.addMouseListener(this);
     b2.addActionListener(this);
     jp.add(b2);

     ib = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/baratie.png");
     Image ib2 = ib.getImage().getScaledInstance(1000,575,Image.SCALE_DEFAULT);
     ib3 = new ImageIcon(ib2);

     l = new JLabel();
     l.setIcon(ib3);
     l.setBounds(0,-25,1000,600);
     jp.add(l); 

     checkadmin();
     
     this.add(jp);
     this.setVisible(true);

}

    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == ut)
        {
            //System.out.println("Please enter your username here");

        }
      else if(me.getSource() == pt)
        {
            //System.out.println("Please enter your Password here");
        }
        else if(me.getSource() == b1)
        {
                b1.setBackground(Color.PINK);
                b1.setForeground(Color.BLACK);
                
        }
         else if(me.getSource() == b2)
        {
                b2.setBackground(Color.YELLOW);
                 b2.setForeground(Color.BLACK);
                
        }
    }
    public void mouseExited(MouseEvent me) {
         if(me.getSource() == b1)
        {
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
                
        }
         else if(me.getSource() == b2)
        {
                 b2.setBackground(Color.BLACK);
                b2.setForeground(Color.WHITE);
                
        }
    }

    public void actionPerformed(ActionEvent ae)
    { 
        if (ae.getSource() == b1) {
            String username = ut.getText();
            String password = new String(pt.getPassword());

            if (username.equals(adminu) && password.equals(adminp))
                 {
                    JOptionPane.showMessageDialog(this, "Welcome Admin!");
                    this.setVisible(false);
                    new AHome();
                } 

            else if (Filesio.check(username, password) == true) 
            {
               
                    JOptionPane.showMessageDialog(this, "Login Successful!");
                    this.setVisible(false);
                    new Home();
                
            } 
            else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        else if(ae.getSource() == b2)
        {
            this.setVisible(false);
                new Signup();     
        }
    }
    public void checkadmin()
    
    {BufferedReader br=null;
         try
        {

             br = new BufferedReader(new FileReader("admin.txt"));

            String s;

            s = br.readLine();
            
            String[] word = s.split(",");

                adminu=word[0];
                adminp=word[1];
               
            }
         catch (IOException e) {
            System.out.println("Error reading the file.");
        } finally {
            try {
              br.close();
              
            }
            catch(IOException io3) {
              System.out.println("Error closing file.");
            }
                      
                  }
    }


    public static void main(String[] args) {
        new Login();}
	
}