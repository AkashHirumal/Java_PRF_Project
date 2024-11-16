
import java.util.*;

public class SmartFashion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t     _____                      _     ______        _     _                   \n"
                + "\t\t\t\t\t\t    / ____|                    | |   |  ____|      | |   (_)                  \n"
                + "\t\t\t\t\t\t   | (___  _ __ ___   __ _ _ __| |_  | |__ __ _ ___| |__  _  ___  _ __        \n"
                + "\t\t\t\t\t\t    \\___ \\| '_ ` _ \\ / _` | '__| __| |  __/ _` / __| '_ \\| |/ _ \\| '_ \\ \n"
                + "\t\t\t\t\t\t    ____) | | | | | | (_| | |  | |_  | | | (_| \\__ \\ | | | | (_) | | | |    \n"
                + "\t\t\t\t\t\t   |_____/|_| |_| |_|\\__,_|_|   \\__| |_|  \\__,_|___/_| |_|_|\\___/|_| |_|  \n");

        System.out.print("\n\n\t\t\t\t\t\t   Date : ");
        String date = input.nextLine();

        System.out.print("\n\n\t\t\t\t\t\t   Customer Name : ");
        String name = input.nextLine();
        System.out.print("\n\n\t\t\t\t\t\t   _________________________________________________________________________\n\n\n");

        System.out.print("\t\t\t\t\t\t\t\t   _______     _____ _     _      _             \n"
                + "\t\t\t\t\t\t\t\t  |__   __|   / ____| |   (_)    | |            \n"
                + "\t\t\t\t\t\t\t\t     | |_____| (___ | |__  _ _ __| |_ ___       \n"
                + "\t\t\t\t\t\t\t\t     | |______\\___ \\| '_ \\| | '__| __/ __|   \n"
                + "\t\t\t\t\t\t\t\t     | |      ____) | | | | | |  | |_\\__ \\    \n"
                + "\t\t\t\t\t\t\t\t     |_|     |_____/|_| |_|_|_|   \\__|___/     \n");

        System.out.print("\n\n\n\t\t\t\t\t\t  Number of T-Shirts : ");
        int nuOftshirt = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Unit Price of T-Shirt : ");
        double unitPrice1 = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Discount Rate (%) : ");
        double discountRate = input.nextDouble();

        double total = (nuOftshirt * unitPrice1);
        double discount = (total * (discountRate / 100));
        double amount1 = (total - discount);

        System.out.print("\n\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Description              |    QTY    |    Unit Price    |      Amount     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | T-Shirt                  |     " + nuOftshirt + "     |      " + unitPrice1 + "       |      " + amount1 + "     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");

        System.out.print("\n\n\t\t\t\t\t\t _____________________________________________________________________________\n\n\n");

        System.out.print("\t\t\t\t\t\t\t\t  _______                                        \n"
                + "\t\t\t\t\t\t\t\t |__   __|                                       \n"
                + "\t\t\t\t\t\t\t\t    | |_ __ ___  _   _ ___  ___ _ __ ___         \n"
                + "\t\t\t\t\t\t\t\t    | | '__/ _ \\| | | / __|/ _ \\ '__/ __|      \n"
                + "\t\t\t\t\t\t\t\t    | | | | (_) | |_| \\__ \\  __/ |  \\__ \\    \n"
                + "\t\t\t\t\t\t\t\t    |_|_|  \\___/ \\__,_|___/\\___|_|  |___/      \n");

        System.out.print("\n\n\n\t\t\t\t\t\t  Number of Trousers : ");
        int nuOftrousers = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Unit Price of Trouser : ");
        double unitPrice2 = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Discount Rate (%) : ");
        discountRate = input.nextDouble();

        total = (nuOftrousers * unitPrice2);
        discount = (total * (discountRate / 100));
        double amount2 = (total - discount);

        System.out.print("\n\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Description              |    QTY    |    Unit Price    |      Amount     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Trouser                  |     " + nuOftrousers + "     |      " + unitPrice2 + "      |      " + amount2 + "     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");

        System.out.print("\n\n\t\t\t\t\t\t _____________________________________________________________________________\n\n\n");

        System.out.print("\t\t\t\t\t\t\t\t\t   _____ _     _      _           \n"
                + "\t\t\t\t\t\t\t\t\t  / ____| |   (_)    | |          \n"
                + "\t\t\t\t\t\t\t\t\t | (___ | |__  _ _ __| |_ ___     \n"
                + "\t\t\t\t\t\t\t\t\t  \\___ \\| '_ \\| | '__| __/ __| \n"
                + "\t\t\t\t\t\t\t\t\t  ____) | | | | | |  | |_\\__ \\  \n"
                + "\t\t\t\t\t\t\t\t\t |_____/|_| |_|_|_|   \\__|___/   \n");

        System.out.print("\n\n\n\t\t\t\t\t\t  Number of Shirts : ");
        int nuOfshirts = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Unit Price of Shirt : ");
        double unitPrice3 = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Discount Rate (%) : ");
        discountRate = input.nextDouble();

        total = (nuOfshirts * unitPrice3);
        discount = (total * (discountRate / 100));
        double amount3 = (total - discount);

        System.out.print("\n\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Description              |    QTY    |    Unit Price    |      Amount     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Shirt                    |     " + nuOfshirts + "     |      " + unitPrice3 + "      |      " + amount3 + "     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");

        System.out.print("\n\n\t\t\t\t\t\t _____________________________________________________________________________\n\n\n");

        System.out.print("\t\t\t\t\t\t\t\t\t    _____ _                _            \n"
                + "\t\t\t\t\t\t\t\t\t   / ____| |              | |           \n"
                + "\t\t\t\t\t\t\t\t\t  | (___ | |__   ___  _ __| |_ ___      \n"
                + "\t\t\t\t\t\t\t\t\t   \\___ \\| '_ \\ / _ \\| '__| __/ __| \n"
                + "\t\t\t\t\t\t\t\t\t   ____) | | | | (_) | |  | |_\\__ \\   \n"
                + "\t\t\t\t\t\t\t\t\t  |_____/|_| |_|\\___/|_|   \\__|___/   \n");

        System.out.print("\n\n\n\t\t\t\t\t\t  Number of Shorts : ");
        int nuOfshorts = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Unit Price of Short : ");
        double unitPrice4 = input.nextInt();

        System.out.print("\n\n\t\t\t\t\t\t  Discount Rate (%) : ");
        discountRate = input.nextDouble();

        total = (nuOfshorts * unitPrice4);
        discount = (total * (discountRate / 100));
        double amount4 = (total - discount);

        System.out.print("\n\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Description              |    QTY    |    Unit Price    |      Amount     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Short                    |     " + nuOfshorts + "     |      " + unitPrice4 + "       |      " + amount4 + "     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");

        System.out.print("\n\n\t\t\t\t\t\t _____________________________________________________________________________\n\n\n");

        double fullTotal = (amount1 + amount2 + amount3 + amount4);

        System.out.print("\n\n\t\t\t\t\t\t +---------------------------------------------------------------------------+");
        System.out.print("\n\t\t\t\t\t\t |                                                                           |");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t |      ____  _ _ _    _____                                                 |\n"
                + "\t\t\t\t\t\t |     |  _ \\(_) | |  / ____|                                                |\n"
                + "\t\t\t\t\t\t |     | |_) |_| | | | (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _      |\n"
                + "\t\t\t\t\t\t |     |  _ <| | | |  \\___ \\| | | | '_ ` _ \\| '_ ` _ \\ / _` | '__| | | |     |\n"
                + "\t\t\t\t\t\t |     | |_) | | | |  ____) | |_| | | | | | | | | | | | (_| | |  | |_| |     |\n"
                + "\t\t\t\t\t\t |     |____/|_|_|_| |_____/ \\__,_|_| |_| |_|_| |_| |_|\\__,_|_|   \\__, |     |\n"
                + "\t\t\t\t\t\t |                                                                 __/ |     |\n"
                + "\t\t\t\t\t\t |                                                                 |___/     |");
        System.out.print("\n\t\t\t\t\t\t |                                                                           |");
        System.out.print("\n\t\t\t\t\t\t |                                                                           |");
        System.out.print("\n\t\t\t\t\t\t |  Customer : " + name + "                                    Date : " + date + "  |");
        System.out.print("\n\t\t\t\t\t\t |                                                                           |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Description              |    QTY    |    Unit Price    |      Amount     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | T-Shirt                  |     " + nuOftshirt + "     |      " + unitPrice1 + "       |      " + amount1 + "     |");
        System.out.print("\n\t\t\t\t\t\t |                          |           |                  |                 |");
        System.out.print("\n\t\t\t\t\t\t | Trouser                  |     " + nuOftrousers + "     |      " + unitPrice2 + "      |      " + amount2 + "     |");
        System.out.print("\n\t\t\t\t\t\t |                          |           |                  |                 |");
        System.out.print("\n\t\t\t\t\t\t | Shirt                    |     " + nuOfshirts + "     |      " + unitPrice3 + "      |      " + amount3 + "     |");
        System.out.print("\n\t\t\t\t\t\t |                          |           |                  |                 |");
        System.out.print("\n\t\t\t\t\t\t | Short                    |     " + nuOfshorts + "     |      " + unitPrice4 + "       |      " + amount4 + "     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");
        System.out.print("\n\t\t\t\t\t\t | Total                                                   |      " + fullTotal + "     |");
        System.out.print("\n\t\t\t\t\t\t +--------------------------+-----------+------------------+-----------------+");

    }

}
