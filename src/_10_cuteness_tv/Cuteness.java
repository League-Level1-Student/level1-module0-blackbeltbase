package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness implements ActionListener {
	JButton duckButton = new JButton("ducks");
	JButton frogButton = new JButton("frog");
	JButton unicornButton = new JButton("unicorn");
	void run() {
	JFrame frame = new JFrame();
	JPanel panel  = new JPanel();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	duckButton.addActionListener(this);
	frogButton.addActionListener(this);
	unicornButton.addActionListener(this);
	panel.add(duckButton);
	panel.add(frogButton);
	panel.add(unicornButton);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == duckButton) {
		showDucks();
		}
		if(buttonPressed== frogButton) {
		showFrog();
		}
		if(buttonPressed== unicornButton) {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
