public class Samurai extends Human {
    static int numberOfSamurai;


    public Samurai() {
        this.health = 200;
        numberOfSamurai++;

    }

    public void deathBlow(Human target) {
        target.health = 0;
        this.health = (this.health/2);
    }

    public void meditate() {
        this.health += (this.health/2);
    }

    public static void howMany() {
        System.out.println(numberOfSamurai);
    }
}
