import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Aprofile extends JFrame implements ActionListener,MouseListener{

	private ImageIcon pic,b,b3,ib,ib3,ib5,ib7; 
	private JButton lb,rb,cb;
  private JLabel n,op,np,p,l,l8;
	private JTextField ntf;
  private JPasswordField opf,npf;
  private String usern,userp,usere,usera,userc;
   
      
	Aprofile(){
   

		 this.setTitle("The Baratie (Profile)");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(1000,600);
         this.setLocation(300,150);
         this.setResizable(false);
        

         JPanel jp = new JPanel();
         jp.setLayout(null);
         Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jp.setCursor(cursor);
        jp.setBackground(Color.BLACK);
        
         pic = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/icon.png");
         this.setIconImage(pic.getImage());

         lb = new JButton("Logout");
         lb.setBounds(880,20,80,25);
         lb.setFont(new Font("Raleway", Font.BOLD,12));
         lb.addActionListener(this);
         lb.addMouseListener(this);
         jp.add(lb);

         p = new JLabel("Profile");
         p.setBounds(450,40,200,100);
         p.setFont(new Font("Raleway",Font.BOLD,30));
         p.setForeground(Color.WHITE);
      
         jp.add(p);

         ImageIcon pm = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/images.jpg");

         Image ipm = pm.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
         ImageIcon pm2 = new ImageIcon(ipm);
         JLabel il = new JLabel(pm2);
         il.setBounds(150,120,150,150);
         jp.add(il);


         rb = new JButton("Home");
         rb.setBounds(50,20,80,25);
         rb.setFont(new Font("Raleway", Font.BOLD,12));
         rb.addActionListener(this);
         rb.addMouseListener(this);
         jp.add(rb);

         


         n = new JLabel("User-Name       :");
         n.setBounds(60,260,160,100);
         n.setFont(new Font("Raleway", Font.BOLD,20));
         n.setForeground(Color.WHITE);
         jp.add(n);

         ntf = new JTextField();
         ntf.setBounds(240,300,150,25);
         jp.add(ntf);

         op = new JLabel("Old Password  :");
         op.setBounds(60,310,160,100);
         op.setFont(new Font("Raleway", Font.BOLD,20));
         op.setForeground(Color.WHITE);
         jp.add(op);

         opf = new JPasswordField();
         opf.setBounds(240,350,150,25);
         jp.add(opf);

         np = new JLabel("New Password :");
         np.setBounds(60,360,160,100);
         np.setFont(new Font("Raleway", Font.BOLD,20));
         np.setForeground(Color.WHITE);
         jp.add(np);

         npf = new JPasswordField();
         npf.setBounds(240,400,150,25);
         jp.add(npf);


         cb = new JButton("Confirm");
         cb.setBounds(180,455,80,25);
         cb.setFont(new Font("Raleway", Font.BOLD,12));
         cb.addActionListener(this);
         cb.addMouseListener(this);
         jp.add(cb);

         ib5 = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/main.jpg");
         Image ib6 = ib5.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
         ib7 = new ImageIcon(ib6);
         l8 = new JLabel(ib7);
         l8.setBounds(600,150,250,250);
         jp.add(l8);

         ib = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/bg4.jpg");
         Image ib2 = ib.getImage().getScaledInstance(1000,575,Image.SCALE_DEFAULT);
         ib3 = new ImageIcon(ib2);
         l = new JLabel();
         l.setIcon(ib3);
         l.setBounds(0,-25,1000,600);
         jp.add(l);


         this.add(jp);
         this.setVisible(true);


	}

  public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == cb)
    {
      String username = ntf.getText();
      String oldPass  = new String(opf.getPassword());
      String newPass  = new String(npf.getPassword()); 

    if(changePass(username,oldPass,newPass))
    {
      JOptionPane.showMessageDialog(this," Password Changed Successfully!");
      this.setVisible(false);
      new Login();
    }
    else{
      JOptionPane.showMessageDialog(this, "Incorrect Username or Old Password", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }

    else if(ae.getSource() == lb)
    {
      this.setVisible(false);
      new Login();
    }
    else if(ae.getSource() == rb)
    {
      this.setVisible(false);
      new AHome();
    }
    
  }

  public boolean changePass(String username,String oldPass,String newPass)
  {
    File inputFile = new File("admin.txt");
    File tempFile = new File("tadmin.txt");

    boolean update = false;
    BufferedReader br =null;

         BufferedWriter bw = null;
    

    try 
      {
       br = new BufferedReader(new FileReader(inputFile));

         bw = new BufferedWriter(new FileWriter(tempFile));

        String line;

        while ((line = br.readLine()) != null) 
        {
            String[] words = line.split(",");

            if (words[0].equals(username) && words[1].equals(oldPass)) {

                bw.write(username + "," + newPass);
                  
                update = true;
            } 
            else {
                bw.write(line);  
            }
            bw.write("\n");
        }
        

    } catch (IOException e) {
      System.out.println("Error occured");
     
    }finally {
      try {
         
              br.close(); 
         bw.close();
      } catch (IOException e) {
          System.out.println("Error closing.");
      }
  }
    if(update == true)
    {
      inputFile.delete();
      tempFile.renameTo(inputFile);
    }

    return update;
  }
  public void mouseClicked(MouseEvent me){}
  public void mousePressed(MouseEvent me){}
  public void mouseReleased(MouseEvent me){}
  public void mouseEntered(MouseEvent me) 
    {
        
        if(me.getSource() == rb)
        {
                rb.setBackground(Color.YELLOW);
                rb.setForeground(Color.BLACK);
                
        }
         else if(me.getSource() == lb)
        {
                lb.setBackground(Color.YELLOW);
                 lb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == cb)
        {
                cb.setBackground(Color.YELLOW);
                 cb.setForeground(Color.BLACK);
                
        }
    }
    public void mouseExited(MouseEvent me) {
        if(me.getSource() == rb)
        {
                rb.setBackground(Color.WHITE);
                rb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == lb)
        {
                 lb.setBackground(Color.WHITE);
                lb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == cb)
        {
                 cb.setBackground(Color.WHITE);
                cb.setForeground(Color.BLACK);
                
        }
    }

 
  public static void main (String [] args)
  {
    Aprofile p1 = new Aprofile();
  }


}