package core;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Playbook {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Ma première calculatrice");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JPanel panel = new JPanel();
	        JTextField valeur1 = new JTextField(10);
	        JComboBox<String> operande = new JComboBox<String>(new String[] { "+", "-", "*", "/" });
	        JTextField valeur2 = new JTextField(10);
	        JButton button = new JButton("execute");
	        JLabel result = new JLabel("                          ");
	        setSize(600,200);
	        result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                int champ1 = Integer.parseInt(valeur1.getText());
	                String op = operande.getItemAt(operande.getSelectedIndex());
	                int champ2 = Integer.parseInt(valeur2.getText());
	                int res = 0;
	                switch (op) {
	                    case "+":
	                        res = champ1 + champ2;
	                        break;
	                    case "-":
	                        res = champ1 - champ2;
	                        break;
	                    case "*":
	                        res = champ1 * champ2;
	                        break;
	                    case "/":
	                        res = champ1 / champ2;
	                        break;
	                   
	                }
	                result.setText(String.valueOf(res));
	            }
	        });
	        panel.add(valeur1);
	        panel.add(operande);
	        panel.add(valeur2);
	        panel.add(button);
	        panel.add(result);
	        frame.add(panel);
	        frame.pack();
	        frame.setVisible(true);
	    }

		private static void setSize(int i, int j) {
			// TODO Auto-generated method stub
			
		}

	}



