import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 10;
        boolean[] booked = new boolean[totalSeats];

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("    TICKET BOOKING SYSTEM");
            System.out.println("==============================");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nSeat Status:");
                    for (int i = 0; i < totalSeats; i++) {
                        if (booked[i]) {
                            System.out.println("Seat " + (i + 1) + " : Booked");
                        } else {
                            System.out.println("Seat " + (i + 1) + " : Available");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Seat Number (1-10): ");
                    int seat = sc.nextInt();

                    if (seat >= 1 && seat <= totalSeats) {
                        if (!booked[seat - 1]) {
                            booked[seat - 1] = true;
                            System.out.println("Ticket Booked Successfully!");
                        } else {
                            System.out.println("Seat Already Booked!");
                        }
                    } else {
                        System.out.println("Invalid Seat Number!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Seat Number to Cancel: ");
                    int cancel = sc.nextInt();

                    if (cancel >= 1 && cancel <= totalSeats) {
                        if (booked[cancel - 1]) {
                            booked[cancel - 1] = false;
                            System.out.println("Ticket Cancelled Successfully!");
                        } else {
                            System.out.println("Seat is Already Available!");
                        }
                    } else {
                        System.out.println("Invalid Seat Number!");
                    }
                    break;

                case 4:
                    System.out.println("Thank You for Using Ticket Booking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}