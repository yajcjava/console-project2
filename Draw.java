import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Draw {
    public static void main(String[] args) {

        List<String> colors = Arrays.asList(
                ConsoleColors.YELLOW_BACKGROUND,
                ConsoleColors.GREEN_BACKGROUND,
                ConsoleColors.RED_BACKGROUND
        );

        Random random = new Random();

        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 40; x++) {
                int randomColorIndex = random.nextInt(colors.size());
                String color = colors.get(randomColorIndex);
                System.out.print(color + "\u2007");
            }
            System.out.println(ConsoleColors.RESET);
        }
    }
}

