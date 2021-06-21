public class Pythag {
    public double calculateHypotenuse(int a, int b) {
        // Define what Hypotenuse is --- C
        double c = 0.0;
        // Need to do equation --- A sqrd + B sqrd == C sqrd
        // C = sqrt of above
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

}
