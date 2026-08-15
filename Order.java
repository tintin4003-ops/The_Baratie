import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Order extends JFrame implements ActionListener,MouseListener{

    private ImageIcon pic;
    private JButton lb,hb;
    private JLabel r;
    private TextArea rt;
  

    Order() {
        this.setTitle("The Baratie (Orders)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.setLocation(300, 150);
        this.setResizable(false);
        

        JPanel jp = new JPanel();
        jp.setLayout(null);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        jp.setCursor(cursor);
        jp.setBackground(Color.BLACK);

        pic = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/icon.png");
        this.setIconImage(pic.getImage());

        lb = new JButton("Logout");
        lb.setBounds(880, 20, 80, 25);
        lb.setFont(new Font("Raleway", Font.BOLD, 12));
        lb.addActionListener(this);
        lb.addMouseListener(this);
        jp.add(lb);

        hb = new JButton("Home");
        hb.setBounds(50, 20, 80, 25);
        hb.setFont(new Font("Raleway", Font.BOLD, 12));
        hb.addActionListener(this);
        hb.addMouseListener(this);
        jp.add(hb);
        String review = "";

        JLabel title = new JLabel("Orders");
        title.setFont(new Font("Raleway", Font.BOLD, 35));
        title.setBounds(50,50,150,100);
        title.setForeground(Color.YELLOW);
        jp.add(title);

        BufferedReader br=null;

        try
        {
         br = new BufferedReader(new FileReader("order.txt"));

            String s;

            while ((s = br.readLine()) != null) 
            {
                review = review + "\n " + s;

                
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        } finally {
            try {
              br.close();
           
            }
            catch(IOException io3) {
              System.out.println("Error closing file.");
            }
                      
                  }


        rt = new TextArea(review,0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
        rt.setEditable(false);
        rt.setBounds(50,150,450,350);
        rt.setFont(new Font("Raleway", Font.PLAIN, 14));
        
        
        jp.add(rt);

        ImageIcon b = new ImageIcon("C:/Users/mahim/Desktop/The Baratie/icon/order.jpg");
         Image b2 = b.getImage().getScaledInstance(425,450,Image.SCALE_DEFAULT);
         ImageIcon  b3 = new ImageIcon(b2);
         JLabel i = new JLabel(b3);
         i.setBounds(530,80,425,450);
         jp.add(i);


    
        this.add(jp);
        this.setVisible(true);
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
    }

    public void actionPerformed(ActionEvent ae)
    { 
        if(ae.getSource()==lb)
        {
            this.setVisible(false);
            new Login();
    }
        if(ae.getSource()==hb)
        {
            this.setVisible(false);
            new AHome();
}
    }

    public static void main(String[] args) {
        new Order();
    }
}
