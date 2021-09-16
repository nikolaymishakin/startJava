public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println();

        int i = 6;
        while(i > -7) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println();

        i = 10;
        int sum = 0;
        do {
            if(i % 2 == 1) {
                sum += i;
            }
            i++;
        } while(i < 21);
        System.out.println(sum);
    }
}