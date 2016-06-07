import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Info extends JFrame {

	private JPanel contentPane;
	private JTextPane textPane;

	private static Info obj = null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private Info() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowIconified(WindowEvent e) {
				
				
			}
		});
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 482, 457);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		JScrollPane jsp = new JScrollPane(textPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(jsp, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(jsp, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
	public static Info getObj()
	{
		if(obj == null)
		{
			obj = new Info();
		}
		return obj;
	}
	public void setTextPane(String txt) {
		this.textPane.setText(txt);
		
	}
}
