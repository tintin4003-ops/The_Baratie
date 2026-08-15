import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Checkout extends JFrame implements ActionListener,MouseListener{
	private int price;
	private String item;
	private int q,de=80;
  private double t,tv;

  ImageIcon pic; 
	JButton lb,mb,hb,cb;
  JTextField lname,lname1,lname2,lnamec;
	

	Checkout(String item,int price,String quantity)
	{
   this.item=item;
   this.price=price;
   this.q = Integer.parseInt(quantity);
   this.t = q*price;
   this.tv = t*0.15;

   this.setTitle("The Baratie (Checkout)");
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


         mb = new JButton("Menu");
         mb.setBounds(790,20,80,25);
         mb.setFont(new Font("Raleway", Font.BOLD,12));
         mb.addActionListener(this);
         mb.addMouseListener(this);
         jp.add(mb);

         hb = new JButton("Home");
         hb.setBounds(700,20,80,25);
         hb.setFont(new Font("Raleway", Font.BOLD,12));
         hb.addActionListener(this);
         hb.addMouseListener(this);
         jp.add(hb);

           JLabel label1 = new JLabel();
        label1.setText("Checkout");
        label1.setBounds(378, 50, 350, 30);
        label1.setFont(new Font("Century Gothic", Font.BOLD, 32));
        label1.setForeground(Color.white);
        label1.setBackground(Color.black); 
        jp.add(label1);

        JLabel label11 = new JLabel();
        label11.setText("Billing Information");
        label11.setBounds(78, 90, 350, 30);
        label11.setFont(new Font("Century Gothic", Font.BOLD, 22));
        label11.setForeground(Color.white);
        label11.setBackground(Color.black);
        jp.add(label11);

        JLabel label16 = new JLabel();
        label16.setText("Order Summary");
        label16.setBounds(520, 90, 350, 30);
        label16.setFont(new Font("Century Gothic", Font.BOLD, 22));
        label16.setForeground(Color.white);
        label16.setBackground(Color.black);
        jp.add(label16);

        JLabel label3 = new JLabel();
        label3.setText("Name                      :");
        label3.setBounds(78, 140, 175, 30);
        label3.setForeground(Color.white);
        label3.setBackground(Color.black);
        label3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jp.add(label3);

         lname = new JTextField();
        lname.setBounds(260, 140, 145, 30);
        jp.add(lname);


       JLabel label4 = new JLabel();
        label4.setText("Contact No            :");
        label4.setBounds(78, 200, 175, 30);
        label4.setForeground(Color.white);
        label4.setBackground(Color.black);
        label4.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jp.add(label4);


        lname1 = new JTextField();
        lname1.setBounds(260, 200, 145, 30);
        jp.add(lname1);


        JLabel label5 = new JLabel();
        label5.setText("Address                   :");
        label5.setBounds(78, 260, 175, 30);
        label5.setForeground(Color.white);
        label5.setBackground(Color.black);
        label5.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jp.add(label5);

        lname2 = new JTextField();
        lname2.setBounds(260, 260, 145, 30);
        jp.add(lname2);
        
        JLabel labelp = new JLabel();
        labelp.setText("Payment Method :");
        labelp.setBounds(78, 320, 175, 30);
        labelp.setForeground(Color.white);
        labelp.setBackground(Color.black);
        labelp.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jp.add(labelp);

        String items[] = {"bKash", "Card", "Paypal"};
        JComboBox<String> combo = new JComboBox<>(items);
        combo.setBounds(260, 320, 100, 30);
        jp.add(combo);

        JLabel lc = new JLabel();
        lc.setText("Email / Card No.   :");
        lc.setBounds(78, 380, 175, 30);
        lc.setForeground(Color.white);
        lc.setBackground(Color.black);
        lc.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jp.add(lc);

       lnamec = new JTextField();
        lnamec.setBounds(260, 380, 145, 30);
        jp.add(lnamec);

        JLabel label17 = new JLabel();
        label17.setText(item);
        label17.setBounds(525, 290, 145, 30);
        label17.setForeground(Color.white);
        label17.setBackground(Color.black);
        label17.setFont(new Font("Century Gothic", Font.BOLD, 18));
        jp.add(label17);

        JLabel label18 = new JLabel();
        label18.setText("Quantity :" + quantity);
        label18.setBounds(522, 325, 145, 30);
        label18.setForeground(Color.white);
        label18.setBackground(Color.black);
        label18.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label18);

        JLabel label19 = new JLabel();
        label19.setText("TK " + price);
        label19.setBounds(712, 325, 145, 30);
        label19.setForeground(Color.white);
        label19.setBackground(Color.black);
        label19.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label19);

        JLabel label20 = new JLabel();
        label20.setText("Subtotal ");
        label20.setBounds(522, 355, 145, 30);
        label20.setForeground(Color.white);
        label20.setBackground(Color.black);
        label20.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label20);

        JLabel label21 = new JLabel();
        label21.setText("TK " + t);
        label21.setBounds(712, 355, 145, 30);
        label21.setForeground(Color.white);
        label21.setBackground(Color.black);
        label21.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label21);

        JLabel dn = new JLabel();
        dn.setText("Deilivery Charge ");
        dn.setBounds(522, 385, 145, 30);
        dn.setForeground(Color.white);
        dn.setBackground(Color.black);
        dn.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(dn);

        JLabel dp = new JLabel();
        dp.setText("TK " + de);
        dp.setBounds(712, 385, 145, 30);
        dp.setForeground(Color.white);
        dp.setBackground(Color.black);
        dp.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(dp);

        JLabel label22 = new JLabel();
        label22.setText("VAT (15%) ");
        label22.setBounds(522, 425, 145, 30);
        label22.setForeground(Color.white);
        label22.setBackground(Color.black);
        label22.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label22);
        
        
        JLabel label23 = new JLabel();
        label23.setText("TK " + tv);
        label23.setBounds(712, 425, 145, 30);
        label23.setForeground(Color.white);
        label23.setBackground(Color.black);
        label23.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label23);

        JLabel label24 = new JLabel();
        label24.setText("Total (VAT Included) ");
        label24.setBounds(522, 475, 190, 30);
        label24.setForeground(Color.white);
        label24.setBackground(Color.black);
        label24.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label24);

        JLabel label25 = new JLabel();
        label25.setText("TK " + (t+tv+de));
        label25.setBounds(720, 475, 120, 30);
        label25.setForeground(Color.white);
        label25.setBackground(Color.black);
        label25.setFont(new Font("Century Gothic", Font.BOLD, 15));
        jp.add(label25);

       cb = new JButton("Confirm");
         cb.setBounds(850,500,80,25);
         cb.setFont(new Font("Raleway", Font.BOLD,12));
         cb.addActionListener(this);
         cb.addMouseListener(this);
         jp.add(cb);

        ImageIcon lsn = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/s-l400.png");
         Image lsn2 = lsn.getImage().getScaledInstance(300,175,Image.SCALE_DEFAULT);
         ImageIcon  lsn3 = new ImageIcon(lsn2);
          JLabel lsni = new JLabel(lsn3);
          lsni.setBounds(520,120,300,175);
          jp.add(lsni);

         this.add(jp);
         this.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{
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
       else if(ae.getSource() == cb)
       {
        String name = lname.getText();
      String contact_No = lname1.getText();
      String address = lname2.getText();
      String cardno = lnamec.getText();
      String username = "Name:";
      String mobile="Mobile No.:";
      String i="Item Name:";
      String adrs="Address:";
      String amount="Quantity:";
      String bill="Bill:";

          if (name.isEmpty())
           {
                JOptionPane.showMessageDialog(null, "Please provide your name.", "Checkout",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (contact_No.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Please provide your mobile number.", "Checkout",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (address.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Please provide your address.", "Checkout",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (cardno.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Please provide your card or email.", "Checkout",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
           
            
            else {   Filesio.writeOrder(username, name, mobile,contact_No,adrs,address,i,item,amount,q,bill,t);
                      JOptionPane.showMessageDialog(null, "Order Confirmed.", "Checkout",JOptionPane.INFORMATION_MESSAGE);
              this.setVisible(false);
                new Home();

                }
        
        
       }
	}
  public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me) 
    {
        
        if(me.getSource() == cb)
        {
                cb.setBackground(Color.YELLOW);
                cb.setForeground(Color.BLACK);
                
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
        
      }
      public void mouseExited(MouseEvent me) {
        if(me.getSource() == cb)
        {
                cb.setBackground(Color.WHITE);
                cb.setForeground(Color.BLACK);
                
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
      
      }
  public static void main(String[] args)
  {
    new Checkout("CheeseCake",300,"3");
  }
}