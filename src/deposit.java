import java.util.Scanner;

public class deposit {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        int term = 1;
        double depositRate=0.1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền đầu tư: ");
        money = input.nextDouble();
        System.out.println("nhập số tháng gửi: ");
        month = input.nextInt();
        System.out.println("kỳ hạn gửi: ");
        term = input.nextInt();
        switch (term){
            case 1: {
                depositRate = 1;
                break;
            }
            case 3: {
                depositRate = 3;
                break;
            }
            case 6: {
                depositRate = 5;
                break;
            }
            case 12: {
                depositRate = 5.4;
                break;
            }
        }
        double totalInterest = 0;
        for(int i = term; i <= month; i=i+term){
            totalInterest += (money+totalInterest) * term*(depositRate/100)/12 ;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
