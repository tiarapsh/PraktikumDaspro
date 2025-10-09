import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = null;
        System.out.println("Has the student been cleared of compensation? (Y/T or Yes/No):");
        String compensationStatus = scan.nextLine().trim();

        if (compensationStatus.equalsIgnoreCase("Yes") || compensationStatus.equalsIgnoreCase("Y")) {
            System.out.println("Enter the number of guidance logs with Supervisor 1:");
            int supervisor1 = scan.nextInt();
            System.out.println("Enter the number of guidance logs with Supervisor 2:");
            int supervisor2 = scan.nextInt();
            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The student may register for the thesis exam.";
            } else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 fewer then 4";
            } else if (supervisor1 < 8 && supervisor2 >= 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8";
            } else if (supervisor1 >= 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 2 are fewer than 4";
            }
        } else {
            message = "Failed: The student has not been cleared of compensation.";
        }

        System.out.println(message);
    }
}
