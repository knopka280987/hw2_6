import Competing;
import com.sun.jdi.connect.Transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, Double engineVolume) {
        private  LoadTypeTruck loadTypeTruck;
    public Truck(String brand, String model, Double engineVolume, LoadTypeTruck loadTypeTruck) {
            super(brand, model, engineVolume);
            this.loadTypeTruck = loadTypeTruck;
        }

        public LoadTypeTruck getLoadTypeTruck() {
            return loadTypeTruck;
        }

        public void setLoadTypeTruck(LoadTypeTruck loadTypeTruck) {
            this.loadTypeTruck = loadTypeTruck;
        }

        public void determineTypeOfTtuck() {
            if (loadTypeTruck != null) {
                switch (loadTypeTruck) {
                    case N1:
                        System.out.println("У грузовика " + getBrand() + " " + getModel() + " грузоподъемность до 3,5 тонн");
                        break;
                    case N2:
                        System.out.println("У грузовика " + getBrand() + " " + getModel() + " грузоподъемность свыше 3,5 до 12 тонн");
                        break;
                    case N3:
                        System.out.println("У грузовика " + getBrand() + " " + getModel() + " грузоподъемность свыше 12 тонн");
                        break;

                    default:
                        System.out.println("Нет информации");
                }
            } else {
                System.out.println("Данных недостаточно");
            }
        }
        @Override
        public void startMoving() {
            System.out.println("Грузовик начал движение с грузом");
        }
        @Override
        public void finishMoving() {
            System.out.println("Грузовик привез груз в пункт назначения");
        }
        @Override
        public void pitStop() {
            System.out.println("Грузовик " + getBrand() + " остановился поменять колесо");
        }
        @Override
        public void maxSpeed() {
            System.out.println("Грузовик " + getBrand() + " показал лучшую скорость");
        }
        @Override
        public void bestTime() {
            System.out.println("Грузовик " + getBrand() + " приехал первым");
        }
    }