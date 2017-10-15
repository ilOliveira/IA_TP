import java.util.ArrayList;
import java.util.Collections;

public class Travel {

	private ArrayList<Cidade> travel = new ArrayList<>();
	private ArrayList<Cidade> previousTravel = new ArrayList<>();

	public Travel() {
	
			travel.add(new Cidade("Atroeira", 116, 464));
			travel.add(new Cidade("Douro", 272, 593));
			travel.add(new Cidade("Pinhal", 119, 521));
			travel.add(new Cidade("Teixoso", 100, 580));
			travel.add(new Cidade("Ulgeira", 192, 537));
			travel.add(new Cidade("Vilar", 180, 467));

		
	}

	public void generateInitialTravel() {
		if (travel.isEmpty())
			new Travel();
	}

	public void swapCities() {
		int a = generateRandomIndex();
		int b = generateRandomIndex();
		previousTravel = travel;
		Cidade x = travel.get(a);
		Cidade y = travel.get(b);
		travel.set(a, y);
		travel.set(b, x);
	}

	public void revertSwap() {
		travel = previousTravel;
	}

	private int generateRandomIndex() {
		return (int) (Math.random() * travel.size());
	}

	public Cidade getCidade(int index) {
		return travel.get(index);
	}

	public int getDistance() {
		int distance = 0;
		for (int index = 0; index < travel.size(); index++) {
			Cidade starting = getCidade(index);
			Cidade destination;
			if (index + 1 < travel.size()) {
				destination = getCidade(index + 1);
			} else {
				destination = getCidade(0);
			}
			distance += starting.distanceToCity(destination);
		}
		return distance;
	}

}
