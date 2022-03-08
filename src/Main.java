import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int month, day;

                Scanner input = new Scanner(System.in);

                System.out.print("Doğunuzunuz Ay : ");
                month = input.nextInt();

                System.out.print("Doğuduğunudz Gün : ");
                day = input.nextInt();

                if (month == 1){
                    if(day >= 1 && day <= 31);
                    if (day < 22 ){
                        System.out.print("Oğlak");
                    }else {
                        System.out.print("Kova");
                    }
                }

                if (month == 2){
                    if (day >=1 && day <= 28){
                        if (day < 20 ){
                            System.out.print("Kova");
                        }else{
                            System.out.print("Balık");
                        }
                    }
                }

                if (month == 3){
                    if (day >=1 && day <= 31){
                        if (day < 21){
                            System.out.print("Balık");
                        }else {
                            System.out.print("Koç");
                        }
                    }
                }

                if (month == 4){
                    if (day >=1 && day <=30){
                        if (day < 21){
                            System.out.print("Koç");
                        }else {
                            System.out.print("Boga");
                        }
                    }
                }

                if (month == 5 ){
                    if (day >=1 && day <=31){
                        if (day<22){
                            System.out.print("Boga");
                        }else {
                            System.out.print("İkizler");
                        }
                    }
                }

                if (month == 6){
                    if (day >=1 && day <=30){
                        if (day < 23 ){
                            System.out.print("İkizler");
                        }else {
                            System.out.print("Yengeç");
                        }
                    }
                }

                if (month == 7){
                    if (day >=1 && day <=31){
                        if(day < 23){
                            System.out.print("Yengeç");
                        }else {
                            System.out.print("Aslan");
                        }
                    }
                }

                if (month == 8){
                    if (day >=1 && day <=30)
                        if (day < 23){
                            System.out.print("Aslan");
                        }else {
                            System.out.print("Basak");
                        }
                }

                if (month == 9){
                    if (day >=1 && day <=30)
                        if (day < 23){
                            System.out.print("Basak");
                        }else {
                            System.out.print("Terazi");
                        }
                }

                if (month == 10){
                    if (day >=1 && day <=30)
                        if (day < 23){
                            System.out.print("Terazi");
                        }else {
                            System.out.print("Akrep");
                        }
                }

                if (month == 11){
                    if (day >=1 && day <=30)
                        if (day < 23){
                            System.out.print("Akrep");
                        }else {
                            System.out.print("Yay");
                        }
                }

                if (month == 12){
                    if (day >=1 && day <=30)
                        if (day < 23){
                            System.out.print("Yay");
                        }else {
                            System.out.print("Kova");
                        }
                }
    }
}
