package zoo.animals;

public class Tiger extends Animal {
    public Tiger(int hungerLevel) {
        super(hungerLevel);
    }

    public Tiger(String name) {

        setName(name);

    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm tiger - I'm moving veeery fast");
    }

    @Override
    public void makeSound() {
        super.makeSound();

        System.out.println("Wrrrrrr");
    }
}
