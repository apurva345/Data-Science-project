/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.io.*;
import com.github.rcaller.datatypes.DataFrame;
import com.github.rcaller.rstuff.RCaller;
import com.github.rcaller.rstuff.RCode;
import examples.SimplePlot;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;


/**
 *
 * @author Hp
 */
class CreatePanelForResult
{
    
    void settingPanelForResult(JFrame frame,JPanel p5)
    {
            
            Color bluex=new Color(73,90,140);
            JFrame f1 =new JFrame("Result Analysis");
            JPanel p1=new JPanel();
            p1.setBackground(Color.white);
            
            Box box=Box.createVerticalBox();
             
            JPanel p2=new JPanel();
            p2.setBackground(Color.white);
            JLabel r=new JLabel("Data Science and Data Mining Project");
            r.setFont(new Font(Font.SERIF,Font.BOLD + Font.ITALIC,50));
            r.setForeground(bluex);
            box.add(r);
            
            
              String t[]={"Idioms","Stock Market","Pokemon","Countrytrendz","Live data"};
              JComboBox c1=new JComboBox(t);
              c1.setBackground(bluex);
              c1.setFont(new Font(Font.SERIF,Font.BOLD,35));
              c1.setForeground(Color.WHITE);
             
              box.add(c1);
               
             JLabel l1=new JLabel(" ");
             l1.setFont(new Font(Font.SERIF,Font.BOLD,15));
             box.add(l1);
             JPanel p3=new JPanel();
             p3.setBackground(Color.white);
             p3.setLayout(new FlowLayout());
             System.out.println(c1.getSelectedIndex());
             JPanel p4=new JPanel();
            p4.setBackground(Color.WHITE);
            
             if(c1.getSelectedIndex()==0)
             {
             
             
            JButton s=new JButton("SENTIMENT");
            s.setBackground(Color.WHITE);
            s.setFont(new Font(Font.SERIF,Font.PLAIN,20));
            s.setForeground(bluex);
            p3.add(s);
            JLabel l=new JLabel("          ");
            l.setBackground(Color.WHITE);
            l.setFont(new Font(Font.SERIF,Font.PLAIN,20));
            p3.add(l);
            JButton m=new JButton("MACHINE");
            m.setBackground(Color.WHITE);
            m.setFont(new Font(Font.SERIF,Font.PLAIN,20));
            m.setForeground(bluex);
            p3.add(m);
            
            
            s.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                      RCaller caller = RCaller.create();
                      RCode code = RCode.create();
               File file=null;           
               File file2=null;
               code.R_require("RCurl");
               code.R_require("textclean");
               code.R_require("tm");
               code.R_require("lexicon");
               code.R_require("plyr");
               code.R_require("syuzhet");
               code.R_require("sentimentr");
               code.R_require("ggplot2");
               code.addRCode("sen <- read.csv(\"C:/Users/Hp/Downloads/sen.csv\")");
               code.addRCode("g<-as.character(sen$SENTENCE)");
               code.addRCode("tw<-get_nrc_sentiment(g)"); 
               code.addRCode("SentimentScores<-data.frame(colSums(tw[ , ]))");
               code.addRCode("names(SentimentScores)<-\"Scores\"");
               code.addRCode("SentimentScores<-cbind(\"sentiment\"=rownames(SentimentScores),SentimentScores)");

             try {
                 file = code.startPlot();
             } catch (IOException ex) {
                 Logger.getLogger(CreatePanelForResult.class.getName()).log(Level.SEVERE, null, ex);
             }
        
              code.addRCode("ggplot(data = SentimentScores,aes(x=sentiment , y = Scores))+geom_bar(aes(fill=sentiment), stat = \"identity\")+\n" +
"  theme(legend.position=\"none\")+xlab(\"sentiment\")+ylab(\"Scores\")+ggtitle(\"Sentiment analysis of th data with isioms\")");
              code.endPlot();
              
               caller.setRCode(code);
               caller.runOnly();
               
               
                RCaller caller1 = RCaller.create();
                      RCode code1 = RCode.create();
              
               code1.R_require("RCurl");
               code1.R_require("textclean");
               code1.R_require("tm");
               code1.R_require("lexicon");
               code1.R_require("plyr");
               code1.R_require("syuzhet");
               code1.R_require("sentimentr");
               code1.R_require("ggplot2");
               code1.addRCode("sen <- read.csv(\"C:/Users/Hp/Downloads/sen.csv\")");
               code1.addRCode("g<-as.character(sen$SENTENCE)");
              code1.addRCode("d<-read.csv(\"C:/Users/Hp/Downloads/idioms.csv\")");
              code1.addRCode("H<-tolower(d$IDIOMS)");
              code1.addRCode("H<-removeWords(H,\"to\")");
              code1.addRCode("k<-d$MEANING");
              code1.addRCode("t<-1:50");
              code1.addRCode("f<-1:489");
              code1.addRCode("for(val in t)\n" +
"{\n" +
"  for(r in f)\n" +
"     {\n" +
"    b<-sub(H[r],k[r],g[val])\n" +
"    g[val]<-b\n" +
"  \n" +
"  }\n" +
"}");
               code1.addRCode("tw<-get_nrc_sentiment(g)"); 
               code1.addRCode("SentimentScores<-data.frame(colSums(tw[ , ]))");
               code1.addRCode("names(SentimentScores)<-\"Scores\"");
               code1.addRCode("SentimentScores<-cbind(\"sentiment\"=rownames(SentimentScores),SentimentScores)");

             try {
                 file2 = code1.startPlot();
             } catch (IOException ex) {
                 Logger.getLogger(CreatePanelForResult.class.getName()).log(Level.SEVERE, null, ex);
             }
        
              code1.addRCode("ggplot(data = SentimentScores,aes(x=sentiment , y = Scores))+geom_bar(aes(fill=sentiment), stat = \"identity\")+\n" +
"  theme(legend.position=\"none\")+xlab(\"sentiment\")+ylab(\"Scores\")+ggtitle(\"Sentiment analysis of th data with meanings\")");
                           
              
               code1.endPlot();
               caller1.setRCode(code1);
               caller1.runOnly();
               ImageIcon icon2=new ImageIcon(""+file2);
               ImageIcon icon3 =new ImageIcon(""+file); 
               JLabel lb3=new JLabel(icon3);
               JLabel lb2=new JLabel(icon2);
               
                       
                p4.add(lb3);
              //  p4.add(l2);
                p4.add(lb2);
                
                }

                   
                });
              
             } 
             p4.setLayout(new FlowLayout());
             box.add(p3);
             box.add(p4);
             
             
             
             
            
           
       
         
       
        
       
        
        
        
        
        
        
        
        
        
       
       
       
        
    
        p2.add(box);
        p5=p2;
        f1.setSize(1450,750);
        f1.add(p2);
        f1.setVisible(true);
          
    }
    
    
}
