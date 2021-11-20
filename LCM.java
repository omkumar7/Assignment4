public class LCM {
    public static long lcm(int[] numbers) {
        long lcm = 1;
        int divisor = 2;
        while (true) {
            int cnt = 0;
            boolean divisible = false;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 0) {
                    return 0;
                } else if (numbers[i] < 0) {
                    numbers[i] = numbers[i] * (-1);
                }
                if (numbers[i] == 1) {
                    cnt++;
                }
                if (numbers[i] % divisor == 0) {
                    divisible = true;
                    numbers[i] = numbers[i] / divisor;
                }
            }
            if (divisible) {
                lcm = lcm * divisor;
            } else {
                divisor++;
            }
            if (cnt == numbers.length) {
                return lcm;
            }
        }
    }

    public static int lcm2(int num1, int num2) {
        if(num1==0 || num2==0){
            return 0;
        }else if(num1<0){
            num1=num1*(-1);
        }else if(num2<0){
            num2=num2*(-1);
        }
        int m = num1;
        int n = num2;
        while (num1 != num2) {
            if (num1 < num2) {
                num1 = num1 + m;
            } else {
                num2 = num2 + n;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6};
        System.out.println("*** Least Common Multiple ***");
        System.out.println("LCM of Given numbers is ");
        System.out.println(lcm(numbers));


    }
}
