import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Window extends JPanel implements ActionListener
{
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	private String title;
	private int width, height;
	
	public Window (String title, int width, int height)
	{
		this.title = title;
		this.width = width;
		this.height = height;
	}
	
	public void createWindow()
	{
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(width, height));
		button = new JButton("draw");
		button.setPreferredSize(new Dimension(200, 50));
		panel.add(button);
		panel.setBackground(Color.BLACK);
		frame.add(panel);
		frame.pack();
	}
	
	public void actionPerformed(ActionEvent event)
	{
		String temp = JOptionPane.showInputDialog("Do you want to play?");
		if (temp.equals("yes"))
			System.out.println("ok");
		else
			System.out.println("done");
		
	}
}