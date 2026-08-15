import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class AMenu extends JFrame implements MouseListener, ActionListener{

	private ImageIcon pic,b,b3; 
	private JButton lb,hb,cob;
  private JLabel i;
  private JCheckBox ramencheck,lasagnacheck,sushicheck,calamaricheck,pastacheck,cakecheck,drinkcheck;
  private String ramenp,lasagnap,pastap,calamarip,suship,cakep,drinkp;
	private JTextField rf, lsnaf, ptf, shf, cdf1, cdf, acf;
   
      
	AMenu(){

		 this.setTitle("The Baratie (AMenu)");
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
         lb.addMouseListener(this);
         lb.addActionListener(this);
         
         jp.add(lb);
   
         hb = new JButton("Home");
         hb.setBounds(50,20,80,25);
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

         JLabel md = new JLabel("Dishes");
         md.setBounds(475,25,200,100);
         md.setFont(new Font("Edwardian Script ITC", Font.BOLD,40));
         md.setForeground(new Color(255, 238, 88));
         jp.add(md);

         setPrice();//set price

        ImageIcon ramen = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/ramenf.jpg");
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

         JLabel rmn2 = new JLabel("Price : " + ramenp + " TK");
         rmn2.setBounds(580,120,200,20);
         rmn2.setFont(new Font("Raleway", Font.BOLD,15));
         rmn2.setForeground(Color.WHITE);
         jp.add(rmn2);

         JLabel rmn4 = new JLabel("Update Price");
         rmn4.setBounds(580,145,200,20);
         rmn4.setFont(new Font("Raleway", Font.BOLD,15));
         rmn4.setForeground(Color.WHITE);
         jp.add(rmn4);

         rf = new JTextField();
         rf.setBounds(580,175,80,20);
         jp.add(rf);

         ramencheck = new JCheckBox();
         ramencheck.setBounds(670,175,20,20);
         jp.add(ramencheck);

         ImageIcon lsn = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/lasagna.jpg");
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

        JLabel lsna2 = new JLabel("Price : " + lasagnap +" TK");
        lsna2.setBounds(855,120,200,20);
        lsna2.setFont(new Font("Raleway", Font.BOLD,15));
        lsna2.setForeground(Color.WHITE);
        jp.add(lsna2);

        JLabel lsna4 = new JLabel("Update Price");
        lsna4.setBounds(855,145,200,20);
        lsna4.setFont(new Font("Raleway", Font.BOLD,15));
        lsna4.setForeground(Color.WHITE);
        jp.add(lsna4);

       
         lsnaf = new JTextField();
        lsnaf.setBounds(855,175,80,20);
        jp.add(lsnaf);

        lasagnacheck = new JCheckBox();
        lasagnacheck.setBounds(945,175,20,20);
         jp.add(lasagnacheck);

         ImageIcon past = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/pasta.jpg");
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

         JLabel pt2 = new JLabel("Price : " + pastap + " TK");
         pt2.setBounds(580,235,200,20);
         pt2.setFont(new Font("Raleway", Font.BOLD,15));
         pt2.setForeground(Color.WHITE);
         jp.add(pt2);

         JLabel pt4 = new JLabel("Update Price");
         pt4.setBounds(580,260,200,20);
         pt4.setFont(new Font("Raleway", Font.BOLD,15));
         pt4.setForeground(Color.WHITE);
         jp.add(pt4);

       
        ptf = new JTextField();
        ptf.setBounds(580,285,80,20);
        jp.add(ptf);

        pastacheck = new JCheckBox();
        pastacheck.setBounds(670,285,20,20);
         jp.add(pastacheck);
          
         ImageIcon ss = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/sushi.jpg");
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

         JLabel sh2 = new JLabel("Price : " + suship + " TK");
         sh2.setBounds(580,350,200,20);
         sh2.setFont(new Font("Raleway", Font.BOLD,15));
         sh2.setForeground(Color.WHITE);
         jp.add(sh2);

         JLabel sh4 = new JLabel("Update Price");
         sh4.setBounds(580,375,200,20);
         sh4.setFont(new Font("Raleway", Font.BOLD,15));
         sh4.setForeground(Color.WHITE);
         jp.add(sh4);

       
       shf = new JTextField();
        shf.setBounds(580,400,80,20);
        jp.add(shf);

        sushicheck = new JCheckBox();
        sushicheck.setBounds(670,400,20,20);
         jp.add(sushicheck);

         ImageIcon crd = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/crd.png");
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

         JLabel cd2 = new JLabel("Price : " + calamarip +" TK");
         cd2.setBounds(580,465,200,20);
         cd2.setFont(new Font("Raleway", Font.BOLD,15));
         cd2.setForeground(Color.WHITE);
         jp.add(cd2);

         JLabel cd4 = new JLabel("Update Price");
         cd4.setBounds(580,490,200,20);
         cd4.setFont(new Font("Raleway", Font.BOLD,15));
         cd4.setForeground(Color.WHITE);
         jp.add(cd4);

       
        cdf = new JTextField();
        cdf.setBounds(580,520,80,20);
        jp.add(cdf);

        calamaricheck = new JCheckBox();
        calamaricheck.setBounds(670,520,20,20);
         jp.add(calamaricheck);
     

         
         JLabel dst = new JLabel("Dessert");
         dst.setBounds(750,175,200,100);
         dst.setFont(new Font("Edwardian Script ITC", Font.BOLD,40));
         dst.setForeground(new Color(255, 238, 88));
         jp.add(dst); 
       
         ImageIcon csc = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/cheesecake.jpg");
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

         JLabel c2 = new JLabel("Price : " + cakep + "TK");
         c2.setBounds(855,270,200,20);
         c2.setFont(new Font("Raleway", Font.BOLD,15));
         c2.setForeground(Color.WHITE);
         jp.add(c2);

         JLabel cd41 = new JLabel("Update Price");
         cd41.setBounds(855,295,200,20);
         cd41.setFont(new Font("Raleway", Font.BOLD,15));
         cd41.setForeground(Color.WHITE);
         jp.add(cd41);

       
        cdf1 = new JTextField();
        cdf1.setBounds(855,325,80,20);
        jp.add(cdf1);

        cakecheck = new JCheckBox();
        cakecheck.setBounds(945,325,20,20);
         jp.add(cakecheck);

         JLabel dik = new JLabel("Drinks");
         dik.setBounds(750,325,200,100);
         dik.setFont(new Font("Edwardian Script ITC", Font.BOLD,40));
         dik.setForeground(new Color(255, 238, 88));
         jp.add(dik);

         ImageIcon ac = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/Anteiku.jpg");
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
 
          JLabel acc2 = new JLabel("Price : " + drinkp + " TK");
          acc2.setBounds(855,425,200,20);
          acc2.setFont(new Font("Raleway", Font.BOLD,15));
          acc2.setForeground(Color.WHITE);
          jp.add(acc2);
 
          JLabel ac4 = new JLabel("Update Price");
          ac4.setBounds(855,450,200,20);
          ac4.setFont(new Font("Raleway", Font.BOLD,15));
          ac4.setForeground(Color.WHITE);
          jp.add(ac4);

       
          acf = new JTextField();
          acf.setBounds(855,480,80,20);
          jp.add(acf);

          drinkcheck = new JCheckBox();
        drinkcheck.setBounds(945,480,20,20);
         jp.add(drinkcheck);


          cob  = new JButton("Confirm");
          cob.setBounds(880,520,80,25);
          cob.setFont(new Font("Raleway", Font.BOLD,12));
          cob.addActionListener(this);
          cob.addMouseListener(this);
          jp.add(cob);
 
         this.add(jp);
         this.setVisible(true);


	}

  public void setPrice ()
  {
    File f1= new File("price.txt");
    BufferedReader br=null;
  
try{
           br = new BufferedReader(new FileReader(f1));
          String s;
          s=br.readLine();
          String [] words = s.split(",");
          ramenp = words[0];
          String x1 = words[1];
          pastap = words[2];
          String x2 = words[3];
          lasagnap = words[4];
          String x3 = words[5];
          calamarip = words[6];
          String x4 = words[7];
          suship = words[8];
          String x5 = words[9];
          cakep = words[10];
          String x6 = words[11];
          drinkp = words[12];
          String x7 = words[13];

         }catch(IOException ioe)
         {
          System.out.println("Error while reading file.");
         } finally {
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
        
        if(me.getSource() == hb)
        {
                hb.setBackground(Color.YELLOW);
                hb.setForeground(Color.BLACK);
                
        }
         else if(me.getSource() == lb)
        {
                lb.setBackground(Color.YELLOW);
                 lb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == cob)
        {
          cob.setBackground(Color.YELLOW);
                cob.setForeground(Color.BLACK);
        }
    }
    public void mouseExited(MouseEvent me) {
        if(me.getSource() == hb)
        {
                hb.setBackground(Color.WHITE);
                hb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == lb)
        {
                 lb.setBackground(Color.WHITE);
                lb.setForeground(Color.BLACK);
                
        }
        else if(me.getSource() == cob)
        {
          cob.setBackground(Color.WHITE);
                cob.setForeground(Color.BLACK);
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
          new AHome();
       }
       else if(ae.getSource() == cob){
        String rm = rf.getText();
        int r = Integer.parseInt(rm);

        String ls = lsnaf.getText();
        int l = Integer.parseInt(ls);

        String ps = ptf.getText();
        int p = Integer.parseInt(ps);

        String shu = shf.getText();
        int s = Integer.parseInt(shu);

        String cr = cdf.getText();
        int c = Integer.parseInt(cr);

        String ck = cdf1.getText();
        int c1 = Integer.parseInt(ck);

        String ad = acf.getText();
        int a = Integer.parseInt(ad);

       boolean check1= ramencheck.isSelected();
       boolean check2= pastacheck.isSelected();
       boolean check3= lasagnacheck.isSelected();
       boolean check4= sushicheck.isSelected();
       boolean check5= calamaricheck.isSelected();
       boolean check6= cakecheck.isSelected();
       boolean check7= drinkcheck.isSelected();

       if (r<=0)
           {
                JOptionPane.showMessageDialog(null, "Please provide Ramen price.", "Invalid",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (l<=0) 
            {
                JOptionPane.showMessageDialog(null, "Please provide Lasagna price.", "Invalid",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (p<=0) 
            {
                JOptionPane.showMessageDialog(null, "Please provide Pasta price.", "Invalid",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (s<=0)
             {
                JOptionPane.showMessageDialog(null, "Please provide Sushi price.", "Invalid",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (c<=0)
             {
                JOptionPane.showMessageDialog(null, "Please provide Calamari price.", "Invalid",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (c1<=0)
             {
                JOptionPane.showMessageDialog(null, "Please provide Cheesecake price.", "Invalid",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (a <=0 )
             {
                JOptionPane.showMessageDialog(null, "Please provide Anteiku Drink price.", "Invalid",
                        JOptionPane.INFORMATION_MESSAGE);
            } 
            else{
             
       
        Filesio.writeprice(r,check1,p,check2,l,check3,c,check5,s,check4,c1,check6,a,check7);



        JOptionPane.showMessageDialog(null, "Menu updated successfully !", "Update",
                        JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        
        new AHome();
            }
       

       }
       
    }

    


  public static void main(String[] args){
    AMenu am = new AMenu();
  }


}