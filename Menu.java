import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class Menu extends JFrame implements MouseListener, ActionListener{

	private ImageIcon pic,b,b3,ac,ramen,lsn,past,ss,csc,crd; 
	private JButton lb,rb,mb,hb,lsnb,pb,db,sb,cdb,acb,rmb;
        private JLabel i;
        private String ramenp,lasagnap,pastap,calamarip,suship,cakep,drinkp,ramenavail,lasagnaavail,pastaavail,calamariavail,sushiavail,cakeavail,drinkavail;
  private int ramenPrice,lasagnaPrice,pastaPrice,sushiPrice,calamariPrice,cheesecakePrice,anteikuPrice;

  
      
	Menu(){

		 this.setTitle("The Baratie (Menu)");
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


         rb = new JButton("Review");
         rb.setBounds(790,20,80,25);
         rb.setFont(new Font("Raleway", Font.BOLD,12));
         rb.addMouseListener(this);
         rb.addActionListener(this);
         jp.add(rb);


         mb = new JButton("Menu");
         mb.setBounds(700,20,80,25);
         mb.setFont(new Font("Raleway", Font.BOLD,12));
         mb.addMouseListener(this);
         jp.add(mb);

         hb = new JButton("Home");
         hb.setBounds(610,20,80,25);
         hb.setFont(new Font("Raleway", Font.BOLD,12));
         hb.addActionListener(this);
         hb.addMouseListener(this);
         jp.add(hb);

         b = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/My vibe.jpg");
         Image b2 = b.getImage().getScaledInstance(450,565,Image.SCALE_DEFAULT);
          b3 = new ImageIcon(b2);
          i = new JLabel(b3);
         i.setBounds(0,0,450,565);
         jp.add(i);

         setPrice(); //initializing price

         JLabel md = new JLabel("Dishes");
         md.setBounds(475,25,200,100);
         md.setFont(new Font("Edwardian Script ITC", Font.BOLD,40));
         md.setForeground(new Color(255, 238, 88));
         jp.add(md);

         ramen = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/ramenf.jpg");
          Image ramen2 = ramen.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon  ramen3 = new ImageIcon(ramen2);
           JLabel ri = new JLabel(ramen3);
           ri.setBounds(475,95,100,100);
           jp.add(ri);

           JLabel rmn1 = new JLabel("Ichiraku Ramen");
         rmn1.setBounds(580,95,200,20);
         rmn1.setFont(new Font("Raleway", Font.BOLD,15));
         rmn1.setForeground(Color.WHITE);
         jp.add(rmn1);

         JLabel rmn2 = new JLabel("Price : " + ramenPrice + " Tk" );
         rmn2.setBounds(580,135,200,20);
         rmn2.setFont(new Font("Raleway", Font.BOLD,15));
         rmn2.setForeground(Color.WHITE);
         jp.add(rmn2);

         rmb = new JButton("Order");
         rmb.setBounds(580,175,100,20);
         rmb.addActionListener(this);
         rmb.addMouseListener(this);
         jp.add(rmb);

          lsn = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/lasagna.jpg");
         Image lsn2 = lsn.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon  lsn3 = new ImageIcon(lsn2);
          JLabel lsni = new JLabel(lsn3);
          lsni.setBounds(750,95,100,100);
          jp.add(lsni);

          JLabel lsn1 = new JLabel("Lasagna");
          lsn1.setBounds(855,95,200,20);
          lsn1.setFont(new Font("Raleway", Font.BOLD,15));
          lsn1.setForeground(Color.WHITE);
        jp.add(lsn1);

        JLabel lsna2 = new JLabel("Price : " + lasagnaPrice + " Tk" );
        lsna2.setBounds(855,135,200,20);
        lsna2.setFont(new Font("Raleway", Font.BOLD,15));
        lsna2.setForeground(Color.WHITE);
        jp.add(lsna2);

        lsnb = new JButton("Order");
        lsnb.setBounds(855,175,100,20);
        lsnb.addActionListener(this);
        lsnb.addMouseListener(this);
        jp.add(lsnb);

          past = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/pasta.jpg");
          Image past2 = past.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon  past3 = new ImageIcon(past2);
           JLabel pasti = new JLabel(past3);
           pasti.setBounds(475,210,100,100);
           jp.add(pasti);
         
         JLabel pt1 = new JLabel("Pasta");
        pt1.setBounds(580,210,200,20);
         pt1.setFont(new Font("Raleway", Font.BOLD,15));
         pt1.setForeground(Color.WHITE);
         jp.add(pt1);

         JLabel pt2 = new JLabel("Price : " + pastaPrice + " Tk" );
         pt2.setBounds(580,250,200,20);
         pt2.setFont(new Font("Raleway", Font.BOLD,15));
         pt2.setForeground(Color.WHITE);
         jp.add(pt2);

          pb = new JButton("Order");
         pb.setBounds(580,290,100,20);
         pb.addActionListener(this);
         pb.addMouseListener(this);
         jp.add(pb);
          
         ss = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/sushi.jpg");
          Image ss2 = ss.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon  ss3 = new ImageIcon(ss2);
           JLabel ssi = new JLabel(ss3);
           ssi.setBounds(475,325,100,100);
           jp.add(ssi);
         
         JLabel ss1 = new JLabel("Sushi");
        ss1.setBounds(580,325,200,20);
         ss1.setFont(new Font("Raleway", Font.BOLD,15));
         ss1.setForeground(Color.WHITE);
         jp.add(ss1);

         JLabel sh2 = new JLabel("Price : " + sushiPrice + " Tk" );
         sh2.setBounds(580,365,200,20);
         sh2.setFont(new Font("Raleway", Font.BOLD,15));
         sh2.setForeground(Color.WHITE);
         jp.add(sh2);

          sb = new JButton("Order");
         sb.setBounds(580,405,100,20);
         sb.addActionListener(this);
         sb.addMouseListener(this);
         jp.add(sb);

          crd = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/crd.png");
          Image crd2 = crd.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon  crd3 = new ImageIcon(crd2);
           JLabel crdi = new JLabel(crd3);
           crdi.setBounds(475,440,100,100);
           jp.add(crdi);

         JLabel cd1 = new JLabel("Calamari Rings");
        cd1.setBounds(580,440,200,20);
         cd1.setFont(new Font("Raleway", Font.BOLD,15));
         cd1.setForeground(Color.WHITE);
         jp.add(cd1);

         JLabel cd2 = new JLabel("Price : " + calamariPrice + " Tk" );
         cd2.setBounds(580,480,200,20);
         cd2.setFont(new Font("Raleway", Font.BOLD,15));
         cd2.setForeground(Color.WHITE);
         jp.add(cd2);

          cdb = new JButton("Order");
         cdb.setBounds(580,520,100,20);
         cdb.addActionListener(this);
         cdb.addMouseListener(this);
         jp.add(cdb);
         
         JLabel dst = new JLabel("Dessert");
         dst.setBounds(750,175,200,100);
         dst.setFont(new Font("Edwardian Script ITC", Font.BOLD,40));
         dst.setForeground(new Color(255, 238, 88));
         jp.add(dst); 
       
         csc = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/cheesecake.jpg");
          Image csc2 = csc.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
          ImageIcon  csc3 = new ImageIcon(csc2);
           JLabel csci = new JLabel(csc3);
           csci.setBounds(750,245,100,100);
           jp.add(csci);

           JLabel c1 = new JLabel("CheeseCake");
         c1.setBounds(855,245,200,20);
         c1.setFont(new Font("Raleway", Font.BOLD,15));
         c1.setForeground(Color.WHITE);
         jp.add(c1);

         JLabel c2 = new JLabel("Price : " + cheesecakePrice + " Tk" );
         c2.setBounds(855,285,200,20);
         c2.setFont(new Font("Raleway", Font.BOLD,15));
         c2.setForeground(Color.WHITE);
         jp.add(c2);

          db = new JButton("Order");
         db.setBounds(855,325,100,20);
         db.addActionListener(this);
         db.addMouseListener(this);
         jp.add(db);

         JLabel dik = new JLabel("Drinks");
         dik.setBounds(750,325,200,100);
         dik.setFont(new Font("Edwardian Script ITC", Font.BOLD,40));
         dik.setForeground(new Color(255, 238, 88));
         jp.add(dik);

         ac = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/Anteiku.jpg");
         Image ac2 = ac.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon  ac3 = new ImageIcon(ac2);
          JLabel aci = new JLabel(ac3);
          aci.setBounds(750,350,80,200);
          jp.add(aci);

          JLabel ac1 = new JLabel("Anteiku Drink");
          ac1.setBounds(855,400,200,20);
          ac1.setFont(new Font("Raleway", Font.BOLD,15));
          ac1.setForeground(Color.WHITE);
          jp.add(ac1);
 
          JLabel acc2 = new JLabel("Price : " + anteikuPrice + " Tk" );
          acc2.setBounds(855,440,200,20);
          acc2.setFont(new Font("Raleway", Font.BOLD,15));
          acc2.setForeground(Color.WHITE);
          jp.add(acc2);
 
           acb = new JButton("Order");
          acb.setBounds(855,480,100,20);
          acb.addActionListener(this);
          acb.addMouseListener(this);
          jp.add(acb);
 
         this.add(jp);
         this.setVisible(true);


	}
         public void setPrice ()
  {
        BufferedReader br=null;
        
try{
           br = new BufferedReader(new FileReader("price.txt"));
          String s;
          s=br.readLine();
          String [] words = s.split(",");
          ramenp = words[0];
          ramenavail=words[1];

          pastap = words[2];
          pastaavail =words[3];

          lasagnap = words[4];
          lasagnaavail =words[5];

          calamarip = words[6];
          calamariavail =words[7];

          suship = words[8];
          sushiavail = words[9];

          cakep = words[10];
          cakeavail = words[11];

          drinkp = words[12];
          drinkavail = words[13];

          ramenPrice=Integer.parseInt(ramenp);
          lasagnaPrice=Integer.parseInt(lasagnap);
          pastaPrice =Integer.parseInt(pastap);
          sushiPrice =Integer.parseInt(suship);
          calamariPrice=Integer.parseInt(calamarip);
          cheesecakePrice=Integer.parseInt(cakep);
          anteikuPrice=Integer.parseInt(drinkp);

         }catch(IOException ioe)
         {
          System.out.println("Error while reading file.");
         }finally {
                                try {
                                    br.close();
                                    
                                }
                catch(IOException io3) {
                System.out.println("Error closing file.");
                }
                    
                  
                }
         

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
        else if(me.getSource() == db)
        {
                db.setBackground(Color.YELLOW);
                 db.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == acb)
        {
               acb.setBackground(Color.YELLOW);
                 acb.setForeground(Color.BLACK);
                
        }
        
        else if(me.getSource() == cdb)
        {
                cdb.setBackground(Color.YELLOW);
                 cdb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == sb)
        {
                sb.setBackground(Color.YELLOW);
                 sb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == pb)
        {
                pb.setBackground(Color.YELLOW);
                 pb.setForeground(Color.BLACK);
                
        }
        
        else if(me.getSource() == lsnb)
        {
                lsnb.setBackground(Color.YELLOW);
                 lsnb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == rmb)
        {
                rmb.setBackground(Color.YELLOW);
                 rmb.setForeground(Color.BLACK);
                
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
        else if(me.getSource() == db)
        {
                db.setBackground(Color.WHITE);
                 db.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == acb)
        {
               acb.setBackground(Color.WHITE);
                 acb.setForeground(Color.BLACK);
                
        }
        
        else if(me.getSource() == cdb)
        {
                cdb.setBackground(Color.WHITE);
                 cdb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == sb)
        {
                sb.setBackground(Color.WHITE);
                 sb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == pb)
        {
                pb.setBackground(Color.WHITE);
                 pb.setForeground(Color.BLACK);
                
        }
        
        else if(me.getSource() == lsnb)
        {
                lsnb.setBackground(Color.WHITE);
                 lsnb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == rmb)
        {
                rmb.setBackground(Color.WHITE);
                 rmb.setForeground(Color.BLACK);
                
        }
        
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
       else if(ae.getSource() == acb)
       {
        String ad = "A refreshing blend of smooth, chilled coffee, served over ice with creamy milk, chewy boba pearls, and topped with a swirl of fluffy whipped cream. A perfect balance of bold coffee flavor and sweet indulgence!";
        this.setVisible(false);
        new ViewItem(ac,ad,"Anteiku Drink",anteikuPrice,drinkavail);
       }
       else if(ae.getSource() == rmb)
       {
        this.setVisible(false);
        String rd = "A hearty and flavorful bowl of authentic Japanese ramen, featuring rich, slow-simmered broth, tender chashu pork, springy noodles, marinated soft-boiled egg, and fresh toppings like green onions, seaweed, and bamboo shoots. A comforting and delicious taste of tradition!";
        new ViewItem(ramen,rd,"Ichiraku Ramen",ramenPrice,234,ramenavail);
       }
       else if(ae.getSource() ==lsnb)
       {
        this.setVisible(false);
        String ld = "Layers of tender pasta, rich slow-cooked beef and tomato sauce, creamy ricotta, and a blend of melted mozzarella and parmesan, baked to golden perfection. Served with garlic bread and a side of fresh basil garnish.";
        new ViewItem(lsn,ld,"Lasagna",lasagnaPrice,343,lasagnaavail);
       }
       else if(ae.getSource() == pb)
       {
        this.setVisible(false);
        String pd = "A delightful selection of freshly made pasta, tossed in your choice of rich, flavorful sauces, from classic marinara and creamy Alfredo to savory pesto. Served with freshly grated parmesan and garlic bread on the side.";
        new ViewItem(past,pd,"Pasta",pastaPrice,234,pastaavail);
       }
       else if(ae.getSource() == sb)
       {
        this.setVisible(false);
        String sd = "An exquisite selection of hand-rolled sushi, featuring fresh sashimi-grade fish, seasoned rice, and crisp vegetables. Served with soy sauce, wasabi, and pickled ginger for a perfect bite every time. ";
        new ViewItem(ss,sd,"Sushi",sushiPrice,369,sushiavail);
       }
       else if(ae.getSource() == cdb)
       {
        this.setVisible(false);
        String cd = "Crispy, tender calamari rings, lightly battered and fried to perfection. Served with a side of zesty marinara sauce and fresh lemon wedges for the perfect balance of flavor.";
        new ViewItem(crd,cd,"Calamari-Rings",calamariPrice,643,calamariavail);
       }
       else if(ae.getSource() == db)
       {
        this.setVisible(false);
        String cd = "Creamy, rich, and velvety smooth, our signature cheesecake is served on a buttery graham cracker crust and topped with your choice of fresh berries, chocolate drizzle, or caramel sauce. A decadent treat for any occasion!";
        new ViewItem(csc,cd,"CheeseCake",cheesecakePrice,1845,cakeavail);
       }
       else if(ae.getSource() == rb)
       {
         this.setVisible(false);
         new Review();
       }

    }
public static void main (String [] args)
   {
       new Menu();
   }
    


}