import java.util.Scanner;
public class burcc_bulmak {
    public static void main(String[]args){
        int day,month;
        Scanner inp =new Scanner(System.in);
        System.out.print("Doğduğunuz Günü Girirniz :");
        day = inp.nextInt();
        System.out.print("Doğduğunuz Ayı Girirniz :");
        month= inp.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day<=31){
                    if (day<=22){
                        System.out.print("Oğlak burcusunuz.");
                    }else{
                        System.out.print("Kova burcusunuz.");
                    }

                }else{
                    System.out.print("Geçersiz tarih girdiniz...");
                }
                break;
            case 2:
                if (day >= 1 && day<=29){
                    if (day<=19){
                        System.out.print("Kova burcusunuz.");
                    }else{
                        System.out.print("Balık burcusunuz.");
                    }

                }else{
                    System.out.print("Geçersiz tarih girdiniz...");
                }
                break;
            case 3:
                if (day >= 1 && day<=31){
                    if (day<=20){
                        System.out.print("Balık burcusunuz.");
                    }else{
                        System.out.print("Koç burcusunuz.");
                    }

                }else{
                    System.out.print("Geçersiz tarih girdiniz...");
                }
                break;
            case 4:
                if (day >= 1 && day<=31){
                    if (day<=20){
                        System.out.print("Koç burcusunuz.");
                    }else{
                        System.out.print("Boğa burcusunuz.");
                    }

                }else{
                    System.out.print("Geçersiz tarih girdiniz...");
                }
                break;
            case 5:
                if (day >= 1 && day<=31){
                    if (day<=21){
                        System.out.print("Boğa burcusunuz.");
                    }else{
                        System.out.print("İkizler burcusunuz.");
                    }

                }else{
                    System.out.print("Geçersiz tarih girdiniz...");
                }
                break;
            default:
                System.out.print("Hatalı Ay Girdiniz ...");
        }
    }
}
