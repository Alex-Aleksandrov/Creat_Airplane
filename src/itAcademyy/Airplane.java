package itAcademyy;

public class Airplane {
    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = 0;
    }

    public int fillUp(int Up) {
        return fuel += Up;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + " год выпуска: " + year + " длина: " +
                lenght + " Вес: " + weight + " количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLenght() > airplane2.getLenght()) {
            System.out.println("First airplane more longer");
        } else if (airplane1.getLenght() < airplane2.getLenght()) {
            System.out.println("Second airplane more longer");
        }else System.out.println("Airplane equal");
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
