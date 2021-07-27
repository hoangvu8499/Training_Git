public class Animal {
    int age;
    Double height;
    String name;
    Double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Animal(int age, Double height, String name, Double weight) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Animal() {
    }

    public static void main(String[] args) {
        Animal Dog = new Animal(10, 50.2, "Dog", 10.1);
        Animal abc = new Animal(1000, 50.2, "abc", 10.1);
        Animal Pig = new Animal(200, 1000.0, "Pig Heo", 200.1);
        Animal siba = new Animal(200, 1000.0, "siba", 200.1);

    }
}
