import java.awt.Choice;
import java.util.Scanner;
public class HotelReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kii = new Scanner(System.in);
		
		int[][] hotel = new int[7][5];
		int choice;
		
		while (true) {
			
			System.out.print("\nHOTEL RESERVATION SYSTEM");
			System.out.println();
			System.out.println("1. View Rooms");
			System.out.println("2. Check In");
			System.out.println("3. Check out");
			System.out.println("4. Exit");
			System.out.println("Enter Choice>");
			
			choice = kii.nextInt();
			if (choice == 4) {
				 System.out.println("Exiting... Thank you!");
	                break;
	            }
	 
	            switch (choice) {
	                case 1:
	                    System.out.println("\nCURRENT ROOM STATUS");
	                    for (int i = 0; i < hotel.length; i++) {
	                        System.out.print("Floor " + (i + 1) + ": ");
	                        for (int j = 0; j < hotel[i].length; j++) {
	                            System.out.print("[" + hotel[i][j] + "]");
	                        }
	                        System.out.println();
	                    }
	                    break;
	 
	                case 2:
	                    System.out.print("Enter floor (1-7): ");
	                    int inFloor = kii.nextInt() - 1;
	                    System.out.print("Enter room (1-5): ");
	                    int inRoom = kii.nextInt() - 1;
	 
	                    if (inFloor >= 0 && inFloor < 7 && inRoom >= 0 && inRoom < 5) {
	                        if (hotel[inFloor][inRoom] == 0) {
	                            hotel[inFloor][inRoom] = 1;
	                            System.out.println("Check-in successful!");
	                        } else {
	                            System.out.println("Room already occupied.");
	                        }
	                    } else {
	                        System.out.println("Invalid floor or room number.");
	                    }
	                    break;
	 
	                case 3:
	                    System.out.print("Enter floor (1-7): ");
	                    int outFloor = kii.nextInt() - 1;
	                    System.out.print("Enter room (1-5): ");
	                    int outRoom =kii.nextInt() - 1;
	 
	                    if (outFloor >= 0 && outFloor < 7 && outRoom >= 0 && outRoom < 5) {
	                        if (hotel[outFloor][outRoom] == 1) {
	                            hotel[outFloor][outRoom] = 0;
	                            System.out.println("Check-out successful!");
	                        } else {
	                            System.out.println("Room is empty.");
	                        }
	                    } else {
	                        System.out.println("Invalid floor or room number.");
	                    }
	                    break;
	 
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
		kii.close();
	}
}
