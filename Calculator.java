import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class Calculator {
    public Calculator()
    {
        JFrame frame=new JFrame("Simple Calculator ") ;
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());
        ArrayList<JButton> simpleButtons=new ArrayList<>();
        
        simpleButtons.add(new JButton("+"));
        simpleButtons.add(new JButton("-"));
        simpleButtons.add(new JButton("*"));
        simpleButtons.add(new JButton("/"));
        simpleButtons.add(new JButton("%"));
        simpleButtons.add(new JButton("="));

        

        ArrayList<JButton> advanceButtons=new ArrayList<>();
        String[] advaceButtonsStrign={"+","-","*","/","%","sin/cos","tan/cot","exp","log","e","π","Shift","="};
        for (String string : advaceButtonsStrign) {
            
            advanceButtons.add(new JButton(string));
        }
       
        JTabbedPane jtp=new JTabbedPane();

        JPanel simple=new JPanel(new GridLayout(4,4,40,40));
        for (JButton button : simpleButtons) {
            simple.add(button);
        }
        simple.setVisible(true);
        


        JPanel advance=new JPanel(new GridLayout(4,5,30,30));
        for (JButton button : advanceButtons) {
            advance.add(button);
        }
        advance.setVisible(true);
        

        
        
        simple.setSize(200, 200);
        
        jtp.add("Simple", simple);
        jtp.add("Advance", advance);


    
        jtp.setVisible(true);

        JTextField jtx=new JTextField();
        JTextField jtx2=new JTextField();
        JLabel answer=new JLabel("Result");
        
        JMenuBar menubar=new JMenuBar();
        JMenu menu=new JMenu("Menu");
        JMenuItem exit=new JMenuItem("Exit");
        JMenuItem copy=new JMenuItem("Copy Result");
        menubar.add(menu);
        menu.add(copy);
        menu.add(exit);


        frame.add(menubar);
        jtx.setVisible(true);
        frame.add(jtx);
        
        jtx2.setVisible(true);
        frame.add(jtx2);
        
        frame.add(jtp);
        frame.add(answer);
        
        
        
        //ading action listener
         //+
         advanceButtons.get(0).addActionListener(L -> {
            try {
                Integer a=Integer.parseInt(jtx.getText());
                Integer b=Integer.parseInt(jtx2.getText());
                Integer c=a+b;
                answer.setText(c.toString());
            } catch (Exception e) {
                System.out.println("Enter Numbers");
            }

        });
        //-
        advanceButtons.get(1).addActionListener(L -> {
            try {
                Integer a=Integer.parseInt(jtx.getText());
                Integer b=Integer.parseInt(jtx2.getText());
                Integer c=a-b;
                answer.setText(c.toString());
            } catch (Exception e) {
                System.out.println("Enter Numbers");
            }

        });
        

         //ading action listener
         //+
         simpleButtons.get(0).addActionListener(L -> {
            try {
                Integer a=Integer.parseInt(jtx.getText());
                Integer b=Integer.parseInt(jtx2.getText());
                Integer c=a+b;
                answer.setText(c.toString());
            } catch (Exception e) {
                System.out.println("Enter Numbers");
            }

        });
        //-
        simpleButtons.get(1).addActionListener(L -> {
            try {
                Integer a=Integer.parseInt(jtx.getText());
                Integer b=Integer.parseInt(jtx2.getText());
                Integer c=a-b;
                answer.setText(c.toString());
            } catch (Exception e) {
                System.out.println("Enter Numbers");
            }

        });
        KeyAdapter kl=new java.awt.event.KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                
                if(e.getKeyCode()==17)//ctrl
                {
                    //+
                    simpleButtons.get(0).doClick();
                }
                else if(e.getKeyCode()==16)//shift
                {
                    //-
                    simpleButtons.get(1).doClick();
                }
            }
        };
        jtx.addKeyListener(kl);
        jtx2.addKeyListener(kl);
        frame.addKeyListener(kl);
        for (int i = 0; i < advanceButtons.size(); i++) {
            advanceButtons.get(i).addKeyListener(kl);
        }
        
        for (int i = 0; i < simpleButtons.size(); i++) {
            simpleButtons.get(i).addKeyListener(kl);
        }

       

        frame.pack();

        frame.setVisible(true);



        
        
}
}