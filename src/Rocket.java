import java.util.Scanner;

public class Rocket {
    public static void main(String[] args) {

        Rocket rocket = new Rocket();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите приветственное слово для баннера на космодроме\n(не более 25 символов):");
        String inputLine = scanner.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        rocket.starShip(inputLine);
    }

    public void starShip(String bannerText) {
        System.out.println("   *       _            __________________________");
        System.out.println("          / \\          |    Стартовая площадка    |");
        System.out.println("         /   \\         |                          |");
        System.out.println("        /     \\   *    |" + addBanner(bannerText) + "|");
        System.out.println("    *   |     |        |__________________________|");
        System.out.println("        |  О  |                     |                ");
        System.out.println("--------|     |---------------------|--------------");
        System.out.println("        |  c  |                                    ");
        System.out.println("        |  о  |                                    ");
        System.out.println("        |  ю  |                                    ");
        System.out.println("        |  з  |                                    ");
        System.out.println("        |_____|                                    ");
        System.out.println("       /_\\   /_\\                  ");
    }

    private String addBanner(String text) {
        // ограничиваем длину текста баннера до 27 символов
        if (text.length() > 26) {
            text = text.substring(0, 26);
        }
        // выравниваем текст по центру баннера
        int spaces = (26 - text.length()) / 2;
        String banner = "";
        for (int i = 0; i < spaces; i++) {
            banner += " ";
        }
        banner += text;
        for (int i = spaces + text.length(); i < 26; i++) {
            banner += " ";
        }
        return banner;
    }
}