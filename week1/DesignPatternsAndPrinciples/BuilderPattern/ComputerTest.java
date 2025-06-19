package week1.DesignPatternsAndPrinciples.BuilderPattern;


public class ComputerTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println("Gaming PC Specs:");
        gamingPC.displaySpecs();

        System.out.println("\nOffice PC Specs:");
        officePC.displaySpecs();
    }
}

