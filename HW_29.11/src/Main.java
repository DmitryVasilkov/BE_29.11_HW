public class Main {
    public static void main(String[] args) {
        number(1, 2, 3);
        System.out.println(num(13, 10));
        Car car = new Car("Mercedes", 100, "Germany");
        System.out.println("Car Brand: " + car.getCarBrand() + " Model: " + car.getModel()
                + " Registration: " + car.getRegistration());
        car.setRegistration("France");
        System.out.println("Car Brand: " + car.getCarBrand() + " Model: " + car.getModel()
                + " Registration: " + car.getRegistration());
    }
    static void number(int x, int y, int z){
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }
    static int num(int x, int y) {
        return x * y;
    }
}