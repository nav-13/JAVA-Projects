import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame1 extends JFrame implements ActionListener{
    JLabel label,label2,label3,label4;
    JTextField textF,textF2,textF3;
    JButton b1,b2,b3;
    JLabel answer;

    MyFrame1(){
       setTitle("Swing Project");
         setSize(800, 600);
         setLayout(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
//adding the components.
         label = new JLabel("Enter First Number");
         label.setBounds(10, 1, 150,150);
         textF = new JTextField(20);
         textF.setBounds(160, 68, 200, 20);
         
          label2 = new JLabel("Enter second Number");
         label2.setBounds(10, 50, 150,150);
          textF2 = new JTextField(20);
         textF2.setBounds(160, 115, 200, 20);
         
          label3 = new JLabel("Enter Third Number");
         label3.setBounds(10, 99, 150,150);
           textF3 = new JTextField(20);
         textF3.setBounds(160, 165, 200, 20);
         
          label4 = new JLabel("Answer is");
         label4.setBounds(10, 450, 150,150);
         
          answer = new JLabel("0");
         answer.setBounds(160, 450, 150,150);
         
         b1 = new JButton("Average");
         b1.setBounds(160, 220, 200,20);
         
            b2 = new JButton("Volume");
         b2.setBounds(160, 265, 200,20);
         
             b3 = new JButton("Greatest");
         b3.setBounds(160, 310, 200,20);

        add(label);add(label2);add(label3);add(label4);
        add(textF); add(textF2);add(textF3);
        add(b1);add(b2);add(b3);
        add(answer);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
      
        setVisible(true);
       }
    
    public void actionPerformed(ActionEvent ae) {
    	int a,b,c,greatest;
    	double average,volume;
    	
    	//ASK,error when its a.
    	a = Integer.parseInt(textF.getText());
    	b= Integer.parseInt(textF2.getText());
    	c= Integer.parseInt(textF3.getText());
    	
    	if(ae.getSource()==b1) {
    		average = (a+b+c)/3D;
        	answer.setText(String.valueOf(average));
    		}
    	
    	else if(ae.getSource()==b3) {
    		if(a>b && a>c) {
    			greatest = a;
    			answer.setText(String.valueOf(a));
    		}
    			
    			else if(b>a && b>c) {
        			greatest = b;
        			answer.setText(String.valueOf(b));
    			}
    			else if(c>a && c>b) {
        			greatest = c;
        			answer.setText(String.valueOf(c));
    			}
    			else if(a==b && a==c && b==c) {
        			greatest = c;
        			answer.setText(String.valueOf(c));
    			}
    			
    		}
    	
    	
    	else {
    		volume = (a*b*c);
    		answer.setText(String.valueOf(volume));
    		
    	}
    	
    	
    	
    }
}
public class SwingP {

    public static void main(String[] args) {
       new MyFrame1();
        //MyFrame1 obj = new MyFrame1();
    }
    
}