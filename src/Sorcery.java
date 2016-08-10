
//theworldisquiethere

import javax.swing.*;
import java.awt.*;

public class Sorcery extends JFrame {

	private JPanel atlas;
	private Witchcraft magic;
	public static ImgContainer imgs;

	public Sorcery() {

		super("tset noitamina");

		questionLife();

		burden();

		buildAbox();

		magic.cast();

	}

	private void questionLife() {

		magic = new Witchcraft();

		imgs = new ImgContainer();		

	}

	private void burden() {

		atlas = new JPanel();

		atlas.setBackground(Color.BLACK);
		atlas.setLayout(new BoxLayout(atlas, BoxLayout.Y_AXIS));

		atlas.add(magic);

	}

	private void buildAbox() {

		setContentPane(atlas);
		setSize(new Dimension(300, 300));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String args[]) {

		Sorcery box = new Sorcery();

	}

}
