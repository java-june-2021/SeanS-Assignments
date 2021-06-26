public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "T-Mobile", "RING RING");
        Iphone iPhone10 = new Iphone("X", 100, "ATT", "Zzz zzz zzz");
        s9.displayInfo();
        iPhone10.displayInfo();
    }
}