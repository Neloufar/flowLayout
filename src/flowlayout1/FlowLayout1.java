/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayout1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nl2027
 */
public class FlowLayout1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("FlowLayout Demo");
        frame.setLayout(new FlowLayout());
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        frame.add(panel1);
        frame.add(panel2);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        frame.pack();
        frame.setSize(750,90);
        frame.setVisible(true);
        
        
    }
}