public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("1.3", "AA 000 AA", "Fiat", "Panda");

        System.out.println("la macchina è una " + myCar.getBrand() + " " + myCar.getModel() + " di cilindrata " + myCar.getDisplacement() + " targata " + myCar.getPlate());
    }
}