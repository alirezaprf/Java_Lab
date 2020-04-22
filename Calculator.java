import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
    public Calculator()
    {
        JFrame frame=new JFrame("Simple Calculator ") ;
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel simplePanel=new JPanel();
        JPanel advancePanel=new JPanel();

        
        ArrayList<JButton> simpleButtons=new ArrayList<>();
        
        simpleButtons.add(new JButton("+"));
        simpleButtons.add(new JButton("-"));
        simpleButtons.add(new JButton("*"));
        simpleButtons.add(new JButton("/"));


        ArrayList<JButton> advanceButtons=(ArrayList<JButton>)simpleButtons.clone();
        
        advanceButtons.add(new JButton("sadaas"));

        System.out.println(simpleButtons.size());
        System.out.println(advanceButtons.size());
        

    }
}