import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.*;
public class Calculator {
    public Calculator()
    {
        JFrame frame=new JFrame("Simple Calculator ") ;
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,2,20,20));
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
        



        frame.setVisible(true);



        
        
}
}