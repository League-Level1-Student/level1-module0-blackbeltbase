package _09_sound_effects_machine;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffectsMachine implements ActionListener {
	JButton button = new JButton("sawing wood");
	JButton button2 = new JButton("homer wohoo");
	JButton button3 = new JButton("me gusta");
	JButton button4 = new JButton("groan");
	public void run() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	frame.add(button);
	frame.pack();
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed==button) {
			playSound("sawing-wood-daniel_simon.wav");
		}
	if(buttonPressed == button2) {
		playSound("homer-wohoo.wav");
	}
	if(buttonPressed==button3) {
		playSound("me-gusta.wav");
	}
	if(buttonPressed==button4) {
		playSound("Soft Groan.wav");
	}
	}
}
