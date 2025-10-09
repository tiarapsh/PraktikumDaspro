import java.util.Scanner;
public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD ---");
        System.out.println("Have the tuition fees been paid in full (true/false):");
        boolean uktLunas = scan.nextBoolean();

        if(uktLunas){
            System.out.println("UKT payment has been verified");
            System.out.println("KRS now can be printed and you can ask the academic advisor to sign it.");
        }else {
            System.out.println("Registration rejected. Please pay UKT first.");
        }
    }
}