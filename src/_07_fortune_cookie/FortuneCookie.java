package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void run() {
		JFrame frame = new JFrame();
		  frame.setVisible(true);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JButton button = new JButton("Click here");
		    button.addActionListener(this);
		    frame.add(button);
		    frame.pack();
	}
	        public void showButton() {
	            System.out.println("Button clicked");
	       }
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Woohoo!");
				 int rand = new Random().nextInt(5);
				 if(rand==0) {
					 JOptionPane.showMessageDialog(null, "You have impending fault");
				 }
				 else if(rand==1) {
					 JOptionPane.showMessageDialog(null, "You will have a bright future");
				 }
				 else if(rand==2) {
					 JOptionPane.showMessageDialog(null, "You will have a bleek future");
				 }
				 else if(rand==3) {
					 JOptionPane.showMessageDialog(null, "Ask again");
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "send this text to 5 of your closest friends:This is the funniest thing in the world! In exactly 87 seconds, you have to send this to 275 people, then if you press (space bar + tab + backspace + page up) a clip will pop up on your screen of a mad goat attacking Bill Gates and butting him into a pile of garbage! I couldnt stop laughing, even though since Im typing this I obviously couldnt have seen it yet, and there is absolutely no way to attach a clip in a way that you have to send the email before you see the clip, its still true! And you know what else is true? I am Batman! And if you stay online doing absolutely nothing for one hour after sending this, Ill email you a gift certificate for five million dollars to spend at Wal-Mart! Just forget the fact that I have no way of finding the email addresses of people who send this out, and the fact that stores will recognize a fake gift certificate. Just send this out, youll be glad you did!\n" + 
					 		"\n" + 
					 		" ");
				 }
			}
	    }

