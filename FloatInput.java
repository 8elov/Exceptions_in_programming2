import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                result = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное число. Повторите ввод.");
            }
        }

        return result;
    }
}
