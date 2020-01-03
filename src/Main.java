public class Main {

    public static void main(String[] args) {

        ProcessRentals processRentals = new ProcessRentals(new Children());

        System.out.println("The cost for Children DVD is €" + processRentals.executePrice(1));

        processRentals = new ProcessRentals(new OldRelease());
        System.out.println("The cost for Old Release DVD is €" + processRentals.executePrice(1));

        processRentals = new ProcessRentals(new NewRelease());
        System.out.println("The cost for New Release DVD is €" + processRentals.executePrice(1));



    }
}
