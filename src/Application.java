import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import synesketch.emotion.Empathyscope;


public class Application extends JFrame {
	public Application(){
		setLayout(new FlowLayout());
		JPanel panel=new JPanel();
		  
		final JTextField inputText=new JTextField(30);
		JButton clickMe=new JButton("Click Me!");
		//inputText.setBounds(50, 0, 300, 50);
		//clickMe.setBounds(300, 0, 400, 50);
		clickMe.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text= inputText.getText();
				inputText.setText("");
				try {
					System.out.println(Empathyscope.feel(text));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		inputText.setBounds(0, 0, 300, 50);
		clickMe.setBounds(300, 0, 400, 50);
		panel.add(inputText);
		panel.add(clickMe);
		add(panel);

	}
	public static void main(String args[]){
		  Application app=new Application();
		  app.setSize(400, 400);
		  app.setVisible(true);
				  
	}
}
