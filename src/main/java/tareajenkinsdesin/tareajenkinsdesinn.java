package tareajenkinsdesin;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class tareajenkinsdesinn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tareajenkinsdesinn window = new tareajenkinsdesinn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tareajenkinsdesinn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 730, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JMenu menu, subMenu;

		JMenuItem opcion1, opcion2, opcion3, rojo, verde;

		JMenuBar menuBar = new JMenuBar();

		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub menu");
		opcion1 = new JMenuItem("Ocion 1");
		opcion2 = new JMenuItem("Ocion 2");
		opcion3 = new JMenuItem("Ocion 3");
		rojo = new JMenuItem("Color rojo");
		verde = new JMenuItem("Color verde");

		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);

		subMenu.add(rojo);
		subMenu.add(verde);

		menu.add(subMenu);

		menuBar.add(menu);

		frame.setJMenuBar(menuBar);

		ActionListener colorAction = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				JMenuItem item = (JMenuItem) e.getSource();
				if (item.getText().equals("Color rojo")) {
					System.out.println(item.getText());
					frame.getContentPane().setBackground(new Color(255, 0, 0));
				}
				if (item.getText() == "Color verde") {
					frame.getContentPane().setBackground(new Color(0, 255, 0));
				}
			}
		};
		rojo.addActionListener(colorAction);
		verde.addActionListener(colorAction);
	}

}


