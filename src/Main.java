public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        var salary = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");

        System.out.println("Задание 2");
        var cash = generateRandomArray();
        var min = cash[0];
        var max = 0;
        for (int i = 0; i < salary.length; i++) {
            if (min > cash[i]) {
                min = cash[i];
            }
            if (max < cash[i]) {
                max = cash[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println("Задание 3");
        double sum3 = 0;
        for (int i = 0; i < salary.length; i++) {
            sum3 += salary[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum3 / 30 + " рублей");

        System.out.println("Задание 4");
        char[] errorName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[errorName.length];
        for (int i = errorName.length - 1, index = 0; i >= 0; i--, index++) {
            fullName[index] = errorName[i];
        }
        System.out.println(String.valueOf(fullName));
    }


}