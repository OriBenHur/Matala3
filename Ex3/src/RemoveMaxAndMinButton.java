
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;


public class RemoveMaxAndMinButton extends JDialog{
	private int width;
	private int height;
	public RemoveMaxAndMinButton(JFrame frame, String str){
		super(frame,str);
		
		JTextPane textPane = new JTextPane();
		JScrollPane jsp = new JScrollPane(textPane);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jsp, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jsp, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				System.exit(0);
			}
		});
	}
	private static RemoveMaxAndMinButton obj = null;
	public static void main(String[] args){
		try{
			RemoveMaxAndMinButton frame = new RemoveMaxAndMinButton(new JFrame(),
					"Remove the Minimize and Maximize button from the Title Bar");
			JPanel panel = new JPanel();
			panel.setSize(200,200);
			JLabel lbl = new JLabel("RoseIndia.Net");
			panel.add(lbl);
			frame.getContentPane().add(panel);
			frame.setSize(400, 400);
			frame.setVisible(true);
		}
		catch(IllegalArgumentException e){
			System.exit(0);
		}
	} 
}