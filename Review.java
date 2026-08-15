import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class Review extends JFrame implements ActionListener,MouseListener{

    private ImageIcon pic;
    private JButton lb, rb, mb, hb, p, fb,sb;
    private JLabel r, rate, name, r2, i, d;
    private TextArea rt;
    private JTextField ntf,dtf;
    private JComboBox<String> combo,combo1;
  

    Review() {
        this.setTitle("The Baratie (Reviews)");
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

       

        JLabel title = new JLabel("Reviews");
        title.setFont(new Font("Raleway", Font.BOLD, 35));
        title.setBounds(50,50,150,100);
        title.setForeground(Color.YELLOW);
        jp.add(title);


        JLabel title1 = new JLabel("Leave a Feedback");
        title1.setFont(new Font("Raleway", Font.BOLD, 35));
        title1.setBounds(550,50,300,100);
        title1.setForeground(Color.YELLOW);
        jp.add(title1);

        name = new JLabel("Name : ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(550,120,100,100);
        name.setForeground(Color.WHITE);
        jp.add(name);

        ntf = new JTextField();
        ntf.setBounds(620, 160, 125, 25);
        jp.add(ntf);

        rate = new JLabel("Rate   :");
        rate.setFont(new Font("Raleway", Font.BOLD, 20));
        rate.setBounds(550,180,150,100);
        rate.setForeground(Color.WHITE);
        jp.add(rate);

        String r[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        combo = new JComboBox<>(r);
        combo.setBounds(620, 220, 40, 25);
        jp.add(combo);

        r2 = new JLabel(" /10");
        r2.setFont(new Font("Raleway", Font.BOLD, 20));
        r2.setBounds(660,180,80,100);
        r2.setForeground(Color.WHITE);
        jp.add(r2);

        i = new JLabel("Item : ");
        i.setFont(new Font("Raleway", Font.BOLD, 20));
        i.setBounds(730,180,80,100);
        i.setForeground(Color.WHITE);
        jp.add(i);

        String i2[] = {"Ichiraku Ramen", "Lasagna", "Pasta", "Sushi", "Calamari Ring", "Cheesecake", "Anteiku Drinks"};
         combo1 = new JComboBox<>(i2);
        combo1.setBounds(790, 220, 120, 25);
        jp.add(combo1);

        d = new JLabel("Experience :");
        d.setFont(new Font("Raleway", Font.BOLD, 20));
        d.setBounds(550,250,250,100);
        d.setForeground(Color.WHITE);
        jp.add(d);
         dtf = new JTextField();
        dtf.setBounds(550, 340, 400, 100);
        jp.add(dtf);

        sb = new JButton("Submit");
        sb.setBounds(860, 485, 80, 25);
        sb.setFont(new Font("Raleway", Font.BOLD, 12));
        sb.addActionListener(this);
        sb.addMouseListener(this);
        jp.add(sb);

        String review = "";

       

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("reviews.txt"));

            String s;

            while ((s = br.readLine()) != null) 
            {
                review = review + "\n " + s;

                
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }


        rt = new TextArea(review,0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
        rt.setEditable(false);
        rt.setBounds(50,150,450,350);
        rt.setFont(new Font("Raleway", Font.PLAIN, 14));    
        
        jp.add(rt);

    
        this.add(jp);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == lb){
        	this.setVisible(false);
        	new Login();

        }

        else if(ae.getSource() == hb){
            this.setVisible(false);
            new Home();
        }

        else if(ae.getSource() == sb){

            String name1 = ntf.getText();
            String describe = dtf.getText();
            String q = combo.getSelectedItem().toString();
            String p = combo1.getSelectedItem().toString();
            String dt=d.getText();
            String rating=rate.getText();
            String item = i.getText();
            String user =name.getText();


            if(name1.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please provide your name.", "Feedback",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            else if(describe.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please describe your experience.", "Feedback",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            else{

                Filesio.writeReview(user,name1, item,p,rating,q,dt,describe);
                JOptionPane.showMessageDialog(null, "Feedback Submitted.", "Feedback",
                        JOptionPane.INFORMATION_MESSAGE);


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
        else if(me.getSource() == sb)
        {
                sb.setBackground(Color.YELLOW);
                 sb.setForeground(Color.BLACK);
                
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
        else if(me.getSource() == sb)
        {
                 sb.setBackground(Color.WHITE);
                sb.setForeground(Color.BLACK);
                
        }
    }
     public static void main(String[] args) {
        new Review();
    }
}
