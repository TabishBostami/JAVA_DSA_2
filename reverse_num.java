public class reverse_num {
    public static int reverse_num(int n) {
        int temp = 0;
        int num = n;
        int number=0;
        while (num>0) {
            temp = num%10;
            num=num/10;
            number = number*10 + temp;

        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(reverse_num(12345));
    }
}
