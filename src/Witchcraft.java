
//theworldisquiethere

import javax.swing.*;
import java.awt.*;

public class Witchcraft extends JPanel {

	private int stage = 0;

	public Witchcraft() {

		setBackground(Color.BLACK);

	}

	public void paint(Graphics g) {

		super.paint(g);

		g.drawImage(Sorcery.imgs.get("img/" + ((stage <= 2)? stage : 1) + ".png"), 130, 130, null);

		if (stage <= 2) stage++; else stage = 0;

	}

	public void cast() {

		for (;;) {

			repaint();

			try { Thread.sleep(125); } catch (Exception e) {}

		}

	}

}
