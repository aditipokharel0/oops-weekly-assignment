package PersonalDetails;

public class DiamondShape {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i += 2) {
            for (int j = 0; j < (4 - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = 3; i >= 1; i -= 2) {
            for (int j = 0; j < (4 - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
