package swingObserverPattern;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Lama
 */
public class SwingObserverExample {
    JFrame frame;
    
    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }
    
    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        //Frame properties here
    }
    
    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it");
        }
    }
    
    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           System.out.println("Do it");
        }
        
    }

}
