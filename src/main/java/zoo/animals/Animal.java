package zoo.animals;

public class Animal {

    private String color;
    private Integer legCount;
    private Integer weight;
    private String name;
    private Integer hungerLevel;// = 50;

    public Animal() {

        hungerLevel = 50;
        name = "unnamed animal";

    }

    public Animal(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLegCount() {
        return legCount;
    }

    public void setLegCount(Integer legCount) {
        this.legCount = legCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void move() {

        if (hungerLevel <= 100) {
            System.out.println("I'm animal - I'm moving");
            hungerLevel += 10;
        } else System.out.println("i'm exhausted and starving!!! Can't make noise!");

    }

    public void makeSound() {

        if (hungerLevel <= 100) {

            System.out.println("I'm making some voice");
            this.hungerLevel++;

        } else System.out.println("i'm exhausted and starving!!! Can't make sound!");

    }

    public void feed() {

        System.out.println("I'm animal - I'm eating");
        if (hungerLevel > 0)
            hungerLevel -= 1;
        else System.out.println("I don't need any food");

    }

}
