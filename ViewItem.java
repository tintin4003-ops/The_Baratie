import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewItem extends JFrame implements MouseListener, ActionListener{

  private JButton lb,rb,mb,hb,b1;
private JCheckBox c1,c2;
private JComboBox<String> cb1;
private String item;

private int price;

ViewItem(ImageIcon img,String details,String item,int price,String available)
    {
      this.price=price;
      this.item=item;
		 this.setTitle("The Baratie (" + item + ")");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(1000,600);
         this.setLocation(300,150);
         this.setResizable(false);


         JPanel jp = new JPanel();
         jp.setLayout(null);
         Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jp.setCursor(cursor);
        jp.setBackground(Color.BLACK);

         ImageIcon pic = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/icon.png");
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
         rb.addActionListener(this);
         rb.addMouseListener(this);
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
         hb.addActionListener(this);
         hb.addMouseListener(this);
         jp.add(hb);

     

          JLabel label1 = new JLabel();
        label1.setText(item);
        label1.setBounds(488, 100, 220, 30);
        label1.setFont(new Font("Century Gothic", Font.BOLD, 17));
        label1.setForeground(Color.white);
        jp.add(label1);

        ImageIcon icon23 = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/rating.jpg");
        JLabel label52 = new JLabel(icon23);
        label52.setBounds(488, 135, icon23.getIconWidth(), icon23.getIconHeight());
        jp.add(label52);

        JLabel label53 = new JLabel();
        label53.setText("(Based on 800 reviews)");
        label53.setBounds(588, 132, 220, 30);
        label53.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        label53.setForeground(Color.white);
        jp.add(label53);

        JLabel label2 = new JLabel();
        label2.setText("TK " + price);
        label2.setBounds(488, 164, 130, 30);
         label2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        label2.setForeground(Color.white);
         jp.add(label2);

        JLabel label3 = new JLabel();
        label3.setText("Quantity");
        label3.setBounds(488, 196, 75, 30);
        label3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        label3.setForeground(Color.white);
        jp.add(label3);

        JLabel label54 = new JLabel();
        label54.setText("Description");
        label54.setBounds(488, 296, 110, 30);
        label54.setFont(new Font("Century Gothic", Font.BOLD, 15));
        label54.setForeground(Color.white);
        jp.add(label54);

        ImageIcon icon3 = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/line.jpg");
        JLabel label58 = new JLabel(icon3);
        label58.setBounds(488, 326, 85, 1);
        jp.add(label58);

        JTextArea ta = new JTextArea(details );
        ta.setBounds(488, 340, 350, 300);
        ta.setFont(new Font("Century Gothic", Font.PLAIN, 11));
        ta.setForeground(Color.white);
        ta.setBackground(Color.black);
         ta.setEditable(false);
        ta.setLineWrap(true);
       ta.setWrapStyleWord(true);
        jp.add(ta);


        ImageIcon lsn = img;
         Image lsn2 = lsn.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
         ImageIcon  lsn3 = new ImageIcon(lsn2);
          JLabel lsni = new JLabel(lsn3);
          lsni.setBounds(25,100,400,400);
          jp.add(lsni);

        String[] s1 = { "1", "2", "3", "4"};
         cb1 = new JComboBox<>(s1);
        cb1.setBounds(575, 202, 40, 20);
        cb1.setBackground(Color.WHITE);
        jp.add(cb1);

        c1 = new JCheckBox("Boba Pearls");
		c1.setBounds(625, 202, 100, 20);
		jp.add(c1);
		
		c2 = new JCheckBox("Whipped Cream");
		c2.setBounds(740, 202, 120, 20);
		jp.add(c2);

    if (available.equals("true"))
       {
        b1 = new JButton("Pay Now");
        b1.setBounds(488, 248, 120, 30);
        b1.addActionListener(this);
        b1.addMouseListener(this);
        jp.add(b1);

        JLabel notavail = new JLabel("Available !");
        notavail.setBounds(620, 248, 200, 30);
        notavail.setFont(new Font("Century Gothic", Font.BOLD, 17));
        notavail.setForeground(Color.GREEN);
        jp.add(notavail);
       }
       else if(available.equals("false"))
       {
        JLabel notavail = new JLabel("Sorry not Available !");
        notavail.setBounds(488, 248, 200, 30);
        notavail.setFont(new Font("Century Gothic", Font.BOLD, 17));
        notavail.setForeground(Color.RED);
        jp.add(notavail);

       }

       

         this.add(jp);
         this.setVisible(true);
	}


ViewItem(ImageIcon img,String details,String item,int price,int review,String available)
    {
      this.price=price;
      this.item=item;
		 this.setTitle("The Baratie (" + item + ")");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(1000,600);
         this.setLocation(300,150);
         this.setResizable(false);


         JPanel jp = new JPanel();
         jp.setLayout(null);
         Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jp.setCursor(cursor);
        jp.setBackground(Color.BLACK);

         ImageIcon pic = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/icon.png");
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
         hb.addActionListener(this);
         hb.addActionListener(this);
         jp.add(hb);

          JLabel label1 = new JLabel();
        label1.setText(item);
        label1.setBounds(488, 100, 220, 30);
        label1.setFont(new Font("Century Gothic", Font.BOLD, 17));
        label1.setForeground(Color.white);
        jp.add(label1);

        ImageIcon icon23 = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/rating.jpg");
        JLabel label52 = new JLabel(icon23);
        label52.setBounds(488, 135, icon23.getIconWidth(), icon23.getIconHeight());
        jp.add(label52);

        JLabel label53 = new JLabel();
        label53.setText("(Based on " + review +" reviews)");
        label53.setBounds(588, 132, 220, 30);
        label53.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        label53.setForeground(Color.white);
        jp.add(label53);

        JLabel label2 = new JLabel();
        label2.setText("TK " + price);
        label2.setBounds(488, 164, 130, 30);
         label2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        label2.setForeground(Color.white);
         jp.add(label2);

        JLabel label3 = new JLabel();
        label3.setText("Quantity");
        label3.setBounds(488, 196, 75, 30);
        label3.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        label3.setForeground(Color.white);
        jp.add(label3);

        JLabel label54 = new JLabel();
        label54.setText("Description");
        label54.setBounds(488, 296, 110, 30);
        label54.setFont(new Font("Century Gothic", Font.BOLD, 15));
        label54.setForeground(Color.white);
        jp.add(label54);

        ImageIcon icon3 = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/line.jpg");
        JLabel label58 = new JLabel(icon3);
        label58.setBounds(488, 326, 85, 1);
        jp.add(label58);

        JTextArea ta = new JTextArea(details );
        ta.setBounds(488, 340, 350, 300);
        ta.setFont(new Font("Century Gothic", Font.PLAIN, 11));
        ta.setForeground(Color.white);
        ta.setBackground(Color.black);
         ta.setEditable(false);
        ta.setLineWrap(true);
       ta.setWrapStyleWord(true);
        jp.add(ta);


        ImageIcon lsn = img;
         Image lsn2 = lsn.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
         ImageIcon  lsn3 = new ImageIcon(lsn2);
          JLabel lsni = new JLabel(lsn3);
          lsni.setBounds(25,100,400,400);
          jp.add(lsni);

        String[] s1 = { "1", "2", "3", "4"};
         cb1 = new JComboBox<>(s1);
        cb1.setBounds(575, 202, 40, 20);
        cb1.setBackground(Color.WHITE);
        jp.add(cb1);

       if (available.equals("true"))
       {
        b1 = new JButton("Pay Now");
        b1.setBounds(488, 248, 120, 30);
        b1.addActionListener(this);
        b1.addMouseListener(this);
        jp.add(b1);

        JLabel notavail = new JLabel("Available !");
        notavail.setBounds(620, 248, 200, 30);
        notavail.setFont(new Font("Century Gothic", Font.BOLD, 17));
        notavail.setForeground(Color.GREEN);
        jp.add(notavail);
       }
       else if(available.equals("false"))
       {
        JLabel notavail = new JLabel("Sorry not Available !");
        notavail.setBounds(488, 248, 200, 30);
        notavail.setFont(new Font("Century Gothic", Font.BOLD, 17));
        notavail.setForeground(Color.RED);
        jp.add(notavail);

       }

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
        
        else if(me.getSource() == mb)
        {
                mb.setBackground(Color.YELLOW);
                 mb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == b1)
        {
                b1.setBackground(Color.YELLOW);
                b1.setForeground(Color.BLACK);
                
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
        else if(me.getSource() == b1)
        {
                 b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
                
        }
      }

    public void actionPerformed(ActionEvent ae)
    { 
      String q = cb1.getSelectedItem().toString();
        if(ae.getSource() == lb){
              this.setVisible(false);
              new Login();
       }
       else if(ae.getSource() == hb){
         this.setVisible(false);
         new Home();
       }
       
       else if(ae.getSource() == mb){
         this.setVisible(false);
         new Menu();
       }
       else if(ae.getSource() == b1){
         this.setVisible(false);
         new Checkout(item,price,q);
       }
       else if(ae.getSource() == rb)
       {
         this.setVisible(false);
         new Review();
       }
    }
    public static void main(String[] args)
    {
       //new ViewItem();
    }
	
}
