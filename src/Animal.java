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
        Animal pig = new Animal(2,50.2,"pig",10.1);
        Animal cat = new Animal(2,50.2,"Cat",10.1);


    }
}
