public class Main {

    static boolean isPalidrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp!=0){
            lastNumber=temp%10;
            System.out.println("Son basamak: "+lastNumber);
            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println("Sayinin Tersten yazilisi: "+reverseNumber);

            temp=temp/10;
            System.out.println("Kalan Sayi: "+temp);
        }
        if (reverseNumber==number){
            System.out.println(number+"  >  = "+"palindrom sayidir.");
            return true;
        }else {
            System.out.println(number+"  >  ="+"palindrom sayi değildir.");
        } return false;



    } 




    public static void main(String[] args) {


        System.out.println(isPalidrom(247)); ;

    }
}
