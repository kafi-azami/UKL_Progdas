import java.util.Scanner;

public class LuasPermukaanBola {
       public static double hitungLuasPermukaanBola(double jariJari) {
           return 4 * Math.PI * jariJari * jariJari;
       }
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Masukkan jari-jari bola: ");
           double jariJari = scanner.nextDouble();
           double luasPermukaan = hitungLuasPermukaanBola(jariJari);
           System.out.println("Luas permukaan bola adalah: " + luasPermukaan);
           scanner.close();
        
    } 
}
