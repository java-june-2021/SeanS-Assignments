public class Bat extends Mammal {
    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("Bat takes off!");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        this.energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Town has been attacked!");
        this.energyLevel -= 100;
    }
}
