package Test;

import java.util.ArrayList;

import Model.idemo.Airplane;
import Model.idemo.Car;
import Model.idemo.Vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Car(4, 10, "Ford", 9000, "Sedan"));
		vehicles.add(new Airplane(100, 100, "Boieng", 500000, 350));
		vehicles.add(new Car(40, 60, "GM", 8500, "SUV"));
		vehicles.add(new Airplane(500, 700, "Airbus", 700000, 250));

		/*for (var v:vehicles){
			System.out.println(v);
		}
		*/

		for (var v:vehicles){
			String m = " " + v;
			if (v instanceof Car){
				assert (m.contains("Airplan"));
			} else if (v instanceof Airplane){
				assert (m.contains("Airplane"));
			}
		}

	}

}
