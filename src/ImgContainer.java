
//theworldisquiethere

import java.awt.image.*;
import java.util.ArrayList;

public class ImgContainer {

	private ArrayList<ImgWrapper> holder = new ArrayList<ImgWrapper>();

	public ImgContainer() {

		load("img/0.png");
		load("img/1.png");
		load("img/2.png");

	}

	private void load(String container) {

		holder.add(new ImgWrapper(container));

	}	

	public BufferedImage get(String container) {

		for (ImgWrapper temp : holder)

			if (temp.getName().equals(container)) return temp.getImg();

		return null;

	}

}
