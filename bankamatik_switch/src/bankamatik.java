import java.util.Scanner;

public class bankamatik {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;

        while (right>0){
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName = input.next();
            System.out.println("Şifrenizi giriniz: ");
            password = input.next();
            if (userName.equals("Goker") && password.equals("1234")){
                System.out.println("Merhaba Bank Göker'e Hoşgeldiniz!\n");
                System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n"
                            + "4-Çıkış Yapınız");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 :
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                            int addMoney = input.nextInt();
                            balance += addMoney;
                            System.out.print("Yeni bakiyeniz: " + balance );
                            break;
                        case 2 :
                            System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                            int removeMoney = input.nextInt();
                            balance -= removeMoney;
                            System.out.print("Yeni bakiyeniz: " + balance);
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            break;
                        default:
                            System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz.");
                            break;

                    }

                }
            else {
                right--;
                System.out.print("Kullanıcı adınızı veya şifrenizi yanlış girdiniz!\n ");
                    if (right == 0) {
                        System.out.print("Hesabınız bloke oldu. Lütfen müşteri hizmetlerini arayınız!");
                    }
            }

            }


        }


    }

