public class Car {
    private String carBrand;
    private int model;
    private String Registration;

    public Car(String carBrand, int model, String Registration) {
        this.carBrand = carBrand;
        this.model = model;
        this.Registration = Registration;
    }

    //(Задача - добавляем геттеры и сеттеры).
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String  carBrand) {
        this.carBrand = carBrand;
    }

    public int getModel() {
        return model;
    }

    public void setPrice(int model) {
        this.model = model;
    }

    public String getRegistration() {
        return Registration;
    }

    public void setRegistration(String Registration) {
        this.Registration = Registration;
    }
}

