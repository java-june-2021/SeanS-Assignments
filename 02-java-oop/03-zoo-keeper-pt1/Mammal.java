public class Mammal {
    protected int energyLevel;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println("Mammal Energy Level: " + this.energyLevel);
        return this.energyLevel;
    }
}
