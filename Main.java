import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int point = 0;
        boolean game = true;

        while (game) {
            String Comp = getComputer();
            System.out.println("\n<==================>");
            System.out.println("Press: [P].Paper [R].Rock [S].Scissors");
            String input = scan.nextLine();
            input = input.toUpperCase();
            System.out.println("\n<==================>");
            if (checkAnswer(input, Comp)) {
                point++;
            } else {
                point--;
            }
            System.out.println("Point : " + point);
            message(checkAnswer(input, Comp), input, Comp);
        }

    }

    public static String getComputer() {
        // Inisialisasi objek Random
        String[] array = { "Paper", "Rock", "Scissors" };
        Random random = new Random();

        // Pilih indeks acak dari array
        int randomIndex = random.nextInt(array.length);

        // Ambil string dari array berdasarkan indeks acak
        String randomString = array[randomIndex];

        return randomString;
    }

    public static boolean checkAnswer(String answer, String computer) {
        switch (answer) {
            case "P":
                if (computer != "Rock") {
                    return false;
                }

                return true;

            case "R":
                if (computer != "Scissors") {
                    return false;
                }

                return true;

            case "S":
                if (computer != "Paper") {
                    return false;
                }

                return true;

            default:
                return false;
        }

    }

    public static void message(boolean result, String answer, String computer) {

        switch (answer) {
            case "P":
                answer = "Paper";
                break;

            case "R":
                answer = "Rock";
                break;

            case "S":
                answer = "Scissors";
                break;

            default:
                answer = "Nothing";

        }
        if (!result) {
            System.out.println("Draw Or Loses : - 1 point");
        } else {
            System.out.println("Your Answer is right : + 1 point");
        }

        System.out.println("You : " + answer + "\tComputer : " + computer);
    }
}