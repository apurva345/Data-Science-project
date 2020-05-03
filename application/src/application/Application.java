
package application;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.border.MatteBorder;

public class Application {

   private static String text="One where you get the real meaning of the Sentence with idioms";
    public static void main(String[] args) throws IOException
    {
        JFrame frame=new JFrame("Data");
        BorderLayout layout=new BorderLayout();
        frame.setLayout(layout);
        frame.setSize(1300,1000);
        JPanel p1=new JPanel();
        GridLayout g=new GridLayout(7,1);
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        Color bx=new Color(73,90,140);
        Box box = Box.createVerticalBox();
        JLabel q1=new JLabel("Data Science and Data Mining Project");
        q1.setFont(new Font(Font.SERIF,Font.BOLD + Font.ITALIC,50));
        q1.setForeground(bx);
        box.add(q1);
        
        JLabel r9=new JLabel(" ");
        r9.setFont(new Font(Font.SERIF,Font.BOLD,30));
        box.add(r9);
       
        JLabel r1=new JLabel("Introduction");
        r1.setFont(new Font(Font.SERIF,Font.BOLD,45));
        r1.setForeground(bx);
        box.add(r1);
        
        JLabel r0=new JLabel(" ");
        r0.setFont(new Font(Font.SERIF,Font.BOLD,20));
        box.add(r0);
        
        JLabel r2=new JLabel(" Definition of Data Science-:");
        r2.setFont(new Font(Font.SERIF,Font.BOLD,35));
        r2.setForeground(bx);
        box.add(r2);
        String t[]={"Data science is the study of data. It involves developing methods of recording, storing,and","analyzing data to effectively extract useful information. The goal of data science is to","gain insights and knowledge from any type of data — both structured and unstructured."};
        for(int i=0;i<3;i++)
        {
        JLabel r3=new JLabel(t[i]);
        r3.setFont(new Font(Font.SERIF,Font.PLAIN,25));
        r3.setForeground(bx);
        r3.setLayout(new GridLayout(100,200,10,20));
        box.add(r3);
        }
        JLabel r00=new JLabel(" ");
        r00.setFont(new Font(Font.SERIF,Font.BOLD,20));
        box.add(r00);
        
        JLabel r20=new JLabel(" Definition of Data Mining-:");
        r20.setFont(new Font(Font.SERIF,Font.BOLD,35));
        r20.setForeground(bx);
        box.add(r20);
        String d[]={"Data mining is defined as a process used to extract usable data from a larger set of any raw ","It implies analysing data patterns in large batches of data using one or more software.Data mining","has applications in multiple fields, like science and research."}; 
        for(int i=0;i<d.length;i++)
        {
            JLabel r30=new JLabel(d[i]);
        r30.setFont(new Font(Font.SERIF,Font.PLAIN,25));
        r30.setForeground(bx);
        r30.setLayout(new GridLayout(100,200,10,20));
        box.add(r30);
            
            
        }
        ImageIcon ir=new ImageIcon("C:/Users/Hp/Desktop/ed.jpg");
        JLabel y=new JLabel(ir);
        box.add(y);
       
        p5.setBackground(Color.white);
        p5.add(box);
        
        
        
        
        
        JButton b0=new JButton("Case studies");
        b0.setBackground(new Color(73,90,140));
        b0.setBorder(new MatteBorder(1,1,1,1,Color.WHITE));
        b0.setContentAreaFilled(true);
        b0.setFont(new Font("Arial", Font.BOLD, 20));
        b0.setForeground(Color.white);
        JLabel m=new JLabel("hello");
        b0.addActionListener(new ActionListener() {
       

            @Override
            public void actionPerformed(ActionEvent ae)
            {
              // JPanel p2=new JPanel();
             JPanel   p5=null;
             p5=new JPanel();
               p5.setBackground(Color.WHITE);
               Box box = Box.createVerticalBox();
               Color bluex=new Color(73,90,140);
        JLabel r=new JLabel("Data Science and Data Mining Project");
        r.setFont(new Font(Font.SERIF,Font.BOLD + Font.ITALIC,50));
        r.setForeground(bluex);
        box.add(r);
        
        JLabel f=new JLabel(" ");
        f.setFont(new Font(Font.SERIF,Font.PLAIN,50));
        box.add(f);
        
        JLabel y=new JLabel("Here are few Case studies Listed Below:-");
        y.setFont(new Font(Font.SERIF,Font.PLAIN + Font.ITALIC,30));
        y.setForeground(bluex);
        box.add(y);
        JLabel u=new JLabel("1.One where you get the real meaning of the Sentence with idioms");
        u.setFont(new Font(Font.SERIF,Font.PLAIN,30));
        u.setForeground(bluex);
        u.setAlignmentX(Component.LEFT_ALIGNMENT);
        box.add(u);
        
        JLabel u1=new JLabel("2.One with the time series prediction of stock market");
        u1.setFont(new Font(Font.SERIF,Font.PLAIN,30));
        u1.setForeground(bluex);
        u1.setAlignmentX(Component.LEFT_ALIGNMENT);
        box.add(u1);
        
        JLabel u2=new JLabel("3.One where we find the strongest Pokemon");
        u2.setFont(new Font(Font.SERIF,Font.PLAIN,30));
        u2.setForeground(bluex);
        u2.setAlignmentX(Component.LEFT_ALIGNMENT);
        box.add(u2);
        
        JLabel u3=new JLabel("4.One where we find country trendz as per the country you asked for ");
        u3.setFont(new Font(Font.SERIF,Font.PLAIN,30));
        u3.setForeground(bluex);
        u3.setAlignmentX(Component.LEFT_ALIGNMENT);
        box.add(u3); 
        
        JLabel u4=new JLabel("5.One where we do the sentiment analysis of live data extracted from twitter ");
        u4.setFont(new Font(Font.SERIF,Font.PLAIN,30));
        u4.setForeground(bluex);
        u4.setAlignmentX(Component.LEFT_ALIGNMENT);
        box.add(u4);
        
        
        ImageIcon u7=new ImageIcon("C:/Users/Hp/Desktop/2.jpg");
        JLabel u8=new JLabel(u7);
        box.add(u8);
        
        
        
        
        
        
        
        u.setCursor(new Cursor(Cursor.HAND_CURSOR));
        String t="One where you get the real meaning of the Sentence with idioms";
        u.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseExited(MouseEvent e) {
                u.setText("1.One where you get the real meaning of the Sentence with idioms");
                u.setFont(new Font(Font.SERIF,Font.PLAIN,30));
                
                
            }
            
            
           @Override
            public void mouseEntered(MouseEvent e) {
              
                u.setText("<html><a href=''>" + text + "</a></html>");
                u.setFont(new Font(Font.SERIF,Font.PLAIN,30));
            }
 
        });
        
        p5.add(box);
          //frame.remove(p5);
          frame.add(p5);
          frame.setVisible(true);      
                 
            }

          
    });
       
        
        
        
        
        
        
        
        JButton b1=new JButton("Process Understanding");
        Color bluex=new Color(73,90,140);
        b1.setBackground(bluex);
        b1.setBorder(new MatteBorder(1,1,1,1,Color.WHITE));
        b1.setContentAreaFilled(true);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setForeground(Color.white);
        
        JButton b2=new JButton("Data Science");
        b2.setBackground(bluex);
        b2.setBorder(new MatteBorder(1,1,1,1,Color.WHITE));
        b2.setContentAreaFilled(true);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setForeground(Color.white);

        JButton b3=new JButton("Data Mining");
        b3.setBackground(bluex);
        b3.setBorder(new MatteBorder(1,1,1,1,Color.WHITE));
        b3.setContentAreaFilled(true);
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setForeground(Color.white);
        
        JButton b4=new JButton("Result Analusis");
        b4.setBackground(bluex);
        b4.setBorder(new MatteBorder(1,1,1,1,Color.WHITE));
        b4.setContentAreaFilled(true);
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setForeground(Color.white);
        b4.addActionListener( new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent ae)
            {
              CreatePanelForResult obj=new CreatePanelForResult();
              obj.settingPanelForResult(frame,p5);
              
            
            
            }
            
        });
        
        JPanel p3=new JPanel();
        p3.setBackground(Color.white);
        p4.setBackground(Color.white);
        ImageIcon icon=new ImageIcon("C:/Users/Hp/Desktop/imp.jpg");
        JLabel l2=new JLabel(icon);
        l2.setBackground(Color.WHITE);
        GridLayout i=new GridLayout(1,1);
        p4.add(l2);
        p4.setLayout(i);
        p1.add(p4);
        p1.add(b0);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(p3);
        p1.setLayout(g);
        
        
        
        
        
        

        
        
        frame.add(p1,BorderLayout.WEST);
        frame.add(p5,BorderLayout.CENTER);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}