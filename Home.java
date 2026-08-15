import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements MouseListener, ActionListener{

	private ImageIcon pic,ib,ib2,ib3; 
	private JButton lb,rb,mb,hb,p;
	private JLabel l,r,r2,r3;
   
      
	Home(){

		 this.setTitle("The Baratie (Homepage)");
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

         lb = new JButton("Logout");
         lb.setBounds(880,20,80,25);
         lb.setFont(new Font("Raleway", Font.BOLD,12));
         lb.addActionListener(this);
         lb.addMouseListener(this);
         jp.add(lb);


         rb = new JButton("Review");
         rb.setBounds(790,20,80,25);
         rb.setFont(new Font("Raleway", Font.BOLD,12));
         rb.addMouseListener(this);
         rb.addActionListener(this);
         jp.add(rb);


         mb = new JButton("Menu");
         mb.setBounds(700,20,80,25);
         mb.setFont(new Font("Raleway", Font.BOLD,12));
         mb.addActionListener(this);
         mb.addMouseListener(this);
         jp.add(mb);

         hb = new JButton("Home");
         hb.setBounds(610,20,80,25);
         hb.setFont(new Font("Raleway", Font.BOLD,12));
         hb.addMouseListener(this);
         jp.add(hb);

     
         p = new JButton("Profile");
         p.setBounds(50,20,80,25);
         p.setFont(new Font("Raleway", Font.BOLD,12));
         p.addActionListener(this);
         p.addMouseListener(this);
         jp.add(p);


         r = new JLabel("Welcome");
         r.setBounds(60,365,200,100);
         r.setFont(new Font("Edwardian Script ITC", Font.BOLD,50));
         r.setForeground(new Color(255, 238, 88));
         jp.add(r);


         r2 = new JLabel("to");
         r2.setBounds(100,400,200,100);
         r2.setFont(new Font("Edwardian Script ITC", Font.BOLD,60));
         r2.setForeground(new Color(255, 238, 88));
         jp.add(r2);


         r3 = new JLabel("The Baratie");
         r3.setBounds(50,450,250,100);
         r3.setFont(new Font("Edwardian Script ITC", Font.BOLD,50));
         r3.setForeground(new Color(255, 238, 88));
         jp.add(r3);



         ib = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/bh.png");
         Image ib2 = ib.getImage().getScaledInstance(1000,575,Image.SCALE_DEFAULT);
         ib3 = new ImageIcon(ib2);
         l = new JLabel();
         l.setIcon(ib3);
         l.setBounds(0,-25,1000,600);
         jp.add(l);


        
         
         this.add(jp);
         this.setVisible(true);


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
        else if(me.getSource() == hb)
        {
                hb.setBackground(Color.YELLOW);
                 hb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == p)
        {
                p.setBackground(Color.YELLOW);
                 p.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == mb)
        {
                mb.setBackground(Color.YELLOW);
                 mb.setForeground(Color.BLACK);
                
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
        else if(me.getSource() == hb)
        {
                 hb.setBackground(Color.WHITE);
                hb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == mb)
        {
                 mb.setBackground(Color.WHITE);
                mb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == p)
        {
                 p.setBackground(Color.WHITE);
                p.setForeground(Color.BLACK);
                
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource() == lb){
       	this.setVisible(false);
       	new Login();
       }
       else if(ae.getSource() == mb)
       {
         this.setVisible(false);
         new Menu();
       }
        else if(ae.getSource() == p)
       {
         this.setVisible(false);
         new Profile();
       }
       else if(ae.getSource() == rb)
       {
         this.setVisible(false);
         new Review();
       }

       
    }

    
    public static void main (String [] args)
    {
     new Home();
    }

}