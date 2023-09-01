public class Main {
    public static void main(String[] args) {

        Camry camry = new Camry(2,"Toyota Camry");
        Corolla corolla = new Corolla(2,"Toyota Corolla");
        Rav4 rav4 = new Rav4(10,"Toyota Rav4");

        camry.accelerate();
        corolla.accelerate();
        rav4.accelerate();

    }
}