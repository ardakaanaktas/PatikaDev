import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Derslerimizi Tanımlıyoruz
        float math,physical,chemistry,turkish,history,music;
        //Geçip geçmediğini yazan stringimiz
        String pass;

        //Scanner tanımlıyoruz
        Scanner scanner = new Scanner(System.in);

        //Notlarımızı alıyoruz ve geçti mi kaldı mı yazdırıyoruz
        System.out.println("Matematik Notu:");
        math = scanner.nextInt();
        pass = (math>60) ? "Geçti" : "Kaldı";
        System.out.println(pass);

        System.out.println("Fizik Notu:");
        physical = scanner.nextInt();
        pass = (physical>60) ? "Geçti" : "Kaldı";
        System.out.println(pass);

        System.out.println("Kimya Notu:");
        chemistry = scanner.nextInt();
        pass = (chemistry>60) ? "Geçti" : "Kaldı";
        System.out.println(pass);

        System.out.println("Türkçe Notu:");
        turkish = scanner.nextInt();
        pass = (turkish>60) ? "Geçti" : "Kaldı";
        System.out.println(pass);

        System.out.println("Tarih Notu:");
        history = scanner.nextInt();
        pass = (history>60) ? "Geçti" : "Kaldı";
        System.out.println(pass);

        System.out.println("Müzik Notu:");
        music = scanner.nextInt();
        pass = (music>60) ? "Geçti" : "Kaldı";
        System.out.println(pass);

        //Ortalamayı hesaplıyoruz
        float avg = (math+physical+chemistry+turkish+history+music)/6;
        System.out.println("Ortalamanız: "+avg);
    }
}