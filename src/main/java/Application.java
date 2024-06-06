import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame implements ActionListener {
	private JButton button;
	private JTextField textField;

	public Application() {
		button = new JButton("Push Me");
		textField = new JTextField(20);

		setLayout(new FlowLayout());
		add(button);
		add(textField);

		button.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText("Hello");
	}

	public static void main(String[] args) {
		new Application();
	}
}
