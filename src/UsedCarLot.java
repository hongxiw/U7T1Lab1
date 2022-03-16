import java.util.ArrayList;

public class UsedCarLot {

    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<>();
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public boolean swap(int first, int second) {
        if(first < 0 || first >= inventory.size() || second < 0 || second >= inventory.size()) {
            return false;
        }
        Car replaced = inventory.set(first, inventory.get(second));
        inventory.set(second, replaced);
        return true;
    }

}
