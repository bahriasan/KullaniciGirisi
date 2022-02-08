import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName , password, passwordNew, systemName = "patika", systemPassword = "java123", clean;
        int reset;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adını Giriniz");
        userName = input.nextLine();
        System.out.println("Şifrenizi Giriniz");
        password = input.nextLine();

        if(userName.equals(systemName) && password.equals(systemPassword)){
            System.out.println("Girdiniz");
        }else{
            System.out.println("Şifre Yanlış. Şifrenizi Sıfırlamak İsterseniz 1'e Basın");
            reset = input.nextInt();

            //Enter Tuşunu temizlemek için
            clean = input.nextLine();

            if(reset != 1) {
                System.out.println("Giriş Başarısız");
            }else{
                System.out.println("Yeni Şifreyi giriniz");
                passwordNew = input.nextLine();
                if(passwordNew.equals(password) || passwordNew.equals(systemPassword)){
                    System.out.println("Şifre Oluşturulamadı, lütfen başka şifre giriniz");
                }else{
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        }
    }

}

