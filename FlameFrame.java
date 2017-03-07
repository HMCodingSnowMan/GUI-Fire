import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FlameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlameFrame frame = new FlameFrame();
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
	public FlameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		setTitle("Monkey Test");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		toolBar.setFloatable(false);
		
		JButton btnRed = new JButton("Red");
		toolBar.add(btnRed);
		btnRed.setBackground(Color.RED);
		
		JButton btnBlue = new JButton("Blue");
		toolBar.add(btnBlue);
		btnBlue.setBackground(Color.BLUE);
		
		JButton btnGreen = new JButton("Green");
		toolBar.add(btnGreen);
		btnGreen.setBackground(Color.GREEN);
		
		JButton btnYellow = new JButton("Yellow");
		toolBar.add(btnYellow);
		btnYellow.setBackground(Color.YELLOW);
		
		JButton btnViolet = new JButton("Magenta");
		toolBar.add(btnViolet);
		btnViolet.setBackground(Color.MAGENTA);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("The Wizard Will Light Your Flame");
		lblNewLabel.setIcon(new ImageIcon("S:\\EclipseEnv\\FlameApp\\src\\Images\\ProfileIcon936_Poro_Wizard_1.png"));
		panel.add(lblNewLabel);
	}

}
