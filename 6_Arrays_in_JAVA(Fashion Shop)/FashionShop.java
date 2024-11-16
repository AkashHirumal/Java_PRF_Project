import java.util.*;

public class FashionShop {

    public static Scanner input = new Scanner(System.in);
    public static char again = '0';

//    public static String[] orderIds = {};
//    public static String[] phoneNumbers = {};
//    public static String[] sizes = {};
//    public static int[] qtys = {};
//    public static double[] amounts = {};
//    public static String[] statusarry = {};
    
    public static String[] orderIds = {"ODR#00001", "ODR#00002", "ODR#00003", "ODR#00004", "ODR#00005", "ODR#00006", "ODR#00007", "ODR#00008", "ODR#00009"};
    public static String[] phoneNumbers = {"0717641090", "0717641010", "0717641090", "0717641020", "0717641030", "0717641030", "0717641040", "0717641040", "0717641090"};
    public static String[] sizes = {"XS", "S", "XS", "M", "S", "L", "XL", "XXL", "L"};
    public static int[] qtys = {2, 5, 4, 5, 3, 10, 4, 1, 6};
    public static double[] amounts = {1200.00, 4000.00, 2400.00, 4500.00, 2400.00, 10000.00, 4400.00, 1200.00, 6000.00};
    public static String[] statusarry = {"PROCESSING", "DELIVERING", "DELIVERED", "DELIVERING", "PROCESSING", "PROCESSING", "DELIVERED", "PROCESSING", "PROCESSING"};

    public final static String[] status = {"PROCESSING", "DELIVERING", "DELIVERED"};
    public static final double[] prices = {600.00, 800.00, 900.00, 1000.00, 1100.00, 1200.00};

    static int index = orderIds.length;

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public final static void clearLine(int i) {
        //Move the cursor up five lines
        System.out.print("\033[" + i + "A");
        // Clear the lines
        System.out.print("\033[0J");
    }

    public static void extendAllArrays() {
        String[] tempOrderIds2 = new String[orderIds.length + 1];
        String[] tempphoneNumbers2 = new String[orderIds.length + 1];
        String[] tempSizes2 = new String[orderIds.length + 1];
        int[] tempQtys2 = new int[orderIds.length + 1];
        double[] tempamounts2 = new double[orderIds.length + 1];
        String[] tempStatusarry2 = new String[orderIds.length + 1];

        for (int i = 0; i < orderIds.length; i++) {
            tempOrderIds2[i] = orderIds[i];
            tempphoneNumbers2[i] = phoneNumbers[i];
            tempSizes2[i] = sizes[i];
            tempQtys2[i] = qtys[i];
            tempamounts2[i] = amounts[i];
            tempStatusarry2[i] = statusarry[i];

        }

        orderIds = tempOrderIds2;
        phoneNumbers = tempphoneNumbers2;
        sizes = tempSizes2;
        qtys = tempQtys2;
        amounts = tempamounts2;
        statusarry = tempStatusarry2;
    }

    public static void deleteAllArrays() {
        String[] tempOrderIds = new String[orderIds.length - 1];
        String[] tempphoneNumbers = new String[orderIds.length - 1];
        String[] tempSizes = new String[orderIds.length - 1];
        int[] tempQtys = new int[orderIds.length - 1];
        double[] tempamounts = new double[orderIds.length - 1];
        String[] tempStatusarry = new String[orderIds.length - 1];

        for (int i = 0; i < orderIds.length - 1; i++) {
            tempOrderIds[i] = orderIds[i];
            tempphoneNumbers[i] = phoneNumbers[i];
            tempSizes[i] = sizes[i];
            tempQtys[i] = qtys[i];
            tempamounts[i] = amounts[i];
            tempStatusarry[i] = statusarry[i];

        }

        orderIds = tempOrderIds;
        phoneNumbers = tempphoneNumbers;
        sizes = tempSizes;
        qtys = tempQtys;
        amounts = tempamounts;
        statusarry = tempStatusarry;
    }

    public static void home() {

        clearConsole();
        System.out.println("\t/$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                           \n"
                + "\t| $$_____/                | $$      |__/                           /$$__  $$| $$                           \n"
                + "\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ \n"
                + "\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$\n"
                + "\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$\n"
                + "\t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$\n"
                + "\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/\n"
                + "\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ \n"
                + "\t                                                                                                | $$     \n"
                + "\t                                                                                                | $$     \n"
                + "\t                                                                                                |__/     ");

        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------\n");

        System.out.printf("\t\t%-60s%s\n\n\t\t%-60s%s\n\n\t\t%-60s%s\n\n", "[1] Place Order", "[2] Search Customer", "[3] Search Order", "[4] View Reports", "[5] Change Order Status", "[6] Delete Order");

        System.out.print("\n\t\tInput Option : ");
        char option = input.next().charAt(0);

        switch (option) {
            case '1':
                placeOrder();
                break;
            case '2':
                searchCustomer();
                break;
            case '3':
                searchOrder();
                break;
            case '4':
                viewReports();
                break;
            case '5':
                changeOrderStatus();
                break;
            case '6':
                deleteOrder();
                break;
            default:
                home();
        }

    }

    public static int genereteNumber = orderIds.length;

    public static String genereteId() {
        genereteNumber++;
        return String.format("ODR#%05d", genereteNumber);

    }

    public static void placeOrder() {
        L2:
        while (true) {
            clearConsole();
            index++;

            System.out.println("\t  _____  _                   ____          _           \n"
                    + "\t |  __ \\| |                 / __ \\        | |          \n"
                    + "\t | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ \n"
                    + "\t |  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|\n"
                    + "\t | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   \n"
                    + "\t |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   \n"
                    + "\t  __________________________________________________________ ");

            String CustomerNumber = "0";
            String orderId = genereteId();
            System.out.println("\n\n\t\tEnter Order ID : " + orderId);

            L1:
            while (true) {
                System.out.print("\n\t\tEnter Customer Phone Number : ");
                CustomerNumber = input.next();

                if (CustomerNumber.charAt(0) != '0' || CustomerNumber.length() != 10) {
                    System.out.println("\n\t\t\tInvalid Phone number.. Try again");

                    System.out.print("\n\t\tDo you want to enter phone number again? (y/n) : ");
                    again = input.next().toUpperCase().charAt(0);
                    if (again == 'Y') {
                        clearLine(6);
                        continue L1;
                    } else if (again == 'N') {
                        genereteNumber--;
                        index--;
                        home();
                    }
                }
                break;
            }
            int qty1 = 0;
            double amount = 0.00;
            String size1 = "0";
            L6:
            while (true) {
                System.out.print("\n\t\tEnter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
                size1 = input.next().toUpperCase();

                switch (size1) {
                    case "XS":
                        System.out.print("\n\t\tEnter QTY : ");
                        qty1 = input.nextInt();
                        amount = qty1 * prices[0];
                        break;
                    case "S":
                        System.out.print("\n\t\tEnter QTY : ");
                        qty1 = input.nextInt();
                        amount = qty1 * prices[1];
                        break;
                    case "M":
                        System.out.print("\n\t\tEnter QTY : ");
                        qty1 = input.nextInt();
                        amount = qty1 * prices[2];
                        break;
                    case "L":
                        System.out.print("\n\t\tEnter QTY : ");
                        qty1 = input.nextInt();
                        amount = qty1 * prices[3];
                        break;
                    case "XL":
                        System.out.print("\n\t\tEnter QTY : ");
                        qty1 = input.nextInt();
                        amount = qty1 * prices[4];
                        break;
                    case "XXL":
                        System.out.print("\n\t\tEnter QTY : ");
                        qty1 = input.nextInt();
                        amount = qty1 * prices[5];
                        break;
                    default:
                        clearLine(2);
                        continue L6;
                }

                System.out.printf("\n\t\tAmount : %.2f\n", amount);

                L5:
                while (true) {
                    System.out.print("\n\t\tDo you want to place this order ? (y/n) : ");

                    again = input.next().toUpperCase().charAt(0);
                    if (again == 'Y') {

                        System.out.println("\n\t\t\tOrder Placed..!");

                        extendAllArrays();

                        orderIds[index - 1] = orderId;
                        phoneNumbers[index - 1] = CustomerNumber;
                        sizes[index - 1] = size1;
                        amounts[index - 1] = amount;
                        qtys[index - 1] = qty1;
                        statusarry[index - 1] = status[0];

                    } else if (again == 'N') {
                        genereteNumber--;
                        index--;
                    } else {
                        clearLine(2);
                        continue L5;
                    }
                    break;
                }
                L7:
                while (true) {
                    System.out.print("\n\t\tDo you want to place another order ? (y/n) : ");
                    again = input.next().toUpperCase().charAt(0);
                    switch (again) {
                        case 'Y':
                            clearLine(7);
                            continue L2;
                        case 'N':
                            home();
                            break;
                        default:
                            clearLine(2);
                            continue L7;
                    }
                    break;
                }
            }
        }
    }

    public static void searchCustomer() {
        L1:
        while (true) {
            clearConsole();
            System.out.println("\t   _____                     _        _____          _                             \n"
                    + "\t  / ____|                   | |      / ____|        | |                            \n"
                    + "\t | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  \n"
                    + "\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| \n"
                    + "\t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    \n"
                    + "\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    \n"
                    + "\t  _____________________________________________________________________________________");

            System.out.print("\n\n\t\tEnter Customer Phone Number : ");
            String CustNum = input.next();

            boolean found1 = false;
            int j = 0;
            int[] temp1 = new int[phoneNumbers.length];

            for (int i = 0; i < phoneNumbers.length; i++) {

                if (phoneNumbers[i].equalsIgnoreCase(CustNum)) {
                    j++;
                    temp1[j - 1] = i;
                    found1 = true;
                }
            }
            if (!found1) {
                System.out.println("\n\t\t\tInvalid Input\n");

                System.out.print("\n\t\tDo you want to search another customer Report? (y/n) : ");
                again = input.next().toUpperCase().charAt(0);

                if (again == 'Y') {
                    continue L1;
                } else if (again == 'N') {
                    home();
                } else {
                    clearLine(1);

                }

            }

            int[] temp2 = new int[j];
            for (int i = 0; i < j; i++) {
                temp2[i] = temp1[i];
            }
            searchtable(temp2);
            L2:
            while (found1) {

                System.out.print("\n\t\tDo you want to search another customer Report? (y/n) : ");
                again = input.next().toUpperCase().charAt(0);

                if (again == 'Y') {
                    continue L1;
                } else if (again == 'N') {
                    home();
                } else {
                    clearLine(1);

                }
            }

        }
    }

    public static void searchtable(int[] y) {

        int XSCount = 0;
        int SCount = 0;
        int MCount = 0;
        int LCount = 0;
        int XLCount = 0;
        int XXLCount = 0;

        for (int i : y) {

            switch (sizes[i]) {
                case "XS":
                    XSCount += qtys[i];
                    break;
                case "S":
                    SCount += qtys[i];
                    break;
                case "M":
                    MCount += qtys[i];
                    break;
                case "L":
                    LCount += qtys[i];
                    break;
                case "XL":
                    XLCount += qtys[i];
                    break;
                case "XXL":
                    XXLCount += qtys[i];
                    break;

            }
        }

        String[] sizearray = {"XS", "S", "M", "L", "XL", "XXL"};

        int[] qtyTable = {XSCount, SCount, MCount, LCount, XLCount, XXLCount};

        double[] amountTable = {XSCount * 600, SCount * 800, MCount * 900, LCount * 1000, XLCount * 1100, XXLCount * 1200};

        for (int i = 0; i < amountTable.length; i++) {
            for (int j = 0; j < amountTable.length - 1; j++) {
                if (amountTable[j] < amountTable[j + 1]) {
                    double temp2 = amountTable[j + 1];
                    amountTable[j + 1] = amountTable[j];
                    amountTable[j] = temp2;

                    int temp1 = qtyTable[j + 1];
                    qtyTable[j + 1] = qtyTable[j];
                    qtyTable[j] = temp1;

                    String temp3 = sizearray[j + 1];
                    sizearray[j + 1] = sizearray[j];
                    sizearray[j] = temp3;
                }
            }
        }

        double total = 0;
        for (int i = 0; i < amountTable.length; i++) {
            total += amountTable[i];
        }

        System.out.print("\t\t\t+--------+---------+--------------+\n"
                + "\t\t\t|  Size  |   QTY   | Total Amount |\n"
                + "\t\t\t+--------+---------+--------------+\n");

        for (int i = 0; i < qtyTable.length; i++) {
            System.out.printf("\t\t\t|   %-4s | %4d    |  %10.2f  |%n", sizearray[i], qtyTable[i], amountTable[i]);
        }

        System.out.println("\t\t\t+--------+---------+--------------+");
        System.out.printf("\t\t\t|   Total Amount   |  %10.2f  |%n", total);
        System.out.println("\t\t\t+---------------------------------+");

    }

    public static void searchOrder() {

        L1:
        while (true) {
            clearConsole();
            System.out.println("\t   _____                     _        ____          _           \n"
                    + "\t  / ____|                   | |      / __ \\        | |          \n"
                    + "\t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ \n"
                    + "\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|\n"
                    + "\t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   \n"
                    + "\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|   \n"
                    + "\t  ___________________________________________________________________");

            System.out.print("\n\n\tEnter order ID : ");
            String oID = input.next();

            boolean found1 = false;
            int j = 0;

            for (int i = 0; i < orderIds.length; i++) {

                if (orderIds[i].equalsIgnoreCase(oID)) {
                    j = i;
                    found1 = true;
                    break;
                }
            }
            while (found1) {

                System.out.println("\n\tPhone Number : " + phoneNumbers[j]);
                System.out.println("\tSize         : " + sizes[j]);
                System.out.println("\tQty          : " + qtys[j]);
                System.out.println("\tAmount       : " + amounts[j]);
                System.out.println("\tStatus       : " + statusarry[j]);

                System.out.print("\n\n\tDo you want to search another order? (y/n) : ");
                again = input.next().toUpperCase().charAt(0);

                if (again == 'Y') {
                    continue L1;
                } else if (again == 'N') {
                    home();
                } else {
                    clearLine(1);
                }
            }

            if (!found1) {
                System.out.println("\n\t\tInvalid ID..");

                System.out.print("\n\n\tDo you want to search another order? (y/n) : ");
                again = input.next().toUpperCase().charAt(0);

                if (again == 'Y') {
                    continue L1;
                } else if (again == 'N') {
                    home();
                } else {
                    clearLine(1);
                }

            }

        }

    }

    public static void eAgain() {
        L7:
        while (true) {
            System.out.print("\n\nTo access the Main Menu, please enter 0 : ");
            char eNum = input.next().charAt(0);
            switch (eNum) {
                case '0':
                    home();
                    break;
                default:
                    clearLine(3);
                    continue L7;
            }
        }
    }

    public static void viewReports() {
        clearConsole();
        System.out.println("\t  _____                       _       \n"
                + "\t |  __ \\                     | |      \n"
                + "\t | |__) |___ _ __   ___  _ __| |_ ___ \n"
                + "\t |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|\n"
                + "\t | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\n"
                + "\t |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\n"
                + "\t            | |                       \n"
                + "\t            |_|                       \n"
                + "      _________________________________________");

        System.out.println("\n\n\t\t[1] Customer Reports\n\n\t\t[2] Item Reports\n\n\t\t[3] Orders Reports\n\n");

        System.out.print("\n\tEnter Option : ");
        char option1 = input.next().charAt(0);

        switch (option1) {
            case '1':
                customerReports();
                break;
            case '2':
                itemReports();
                break;
            case '3':
                ordersReports();
                break;
            default:
                viewReports();

        }

    }

    public static void customerReports() {
        clearConsole();
        System.out.println("\t   _____          _                              _____                       _       \n"
                + "\t  / ____|        | |                            |  __ \\                     | |      \n"
                + "\t | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ \n"
                + "\t | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|\n"
                + "\t | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\n"
                + "\t  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\n"
                + "\t                                                           | |                      \n"
                + "\t                                                           |_|                      \n"
                + "      ______________________________________________________________________________________");

        System.out.println("\n\n\t\t[1] Best in Customers\n\n\t\t[2] View Customers\n\n\t\t[3] All Customer Reports\n\n");

        System.out.print("\n\tEnter Option : ");
        char option2 = input.next().charAt(0);

        switch (option2) {
            case '1':
                bestInCustomers();
                break;
            case '2':
                viewCustomers();
                break;
            case '3':
                allCustomerReports();
                break;
            default:
                System.out.println("\n\t\tInvalid input..\n");
                System.out.print("\n\t\tDo you want to enter option again? (y/n) : ");
                again = input.next().toUpperCase().charAt(0);

                if (again == 'Y') {
                    customerReports();
                } else if (again == 'N') {
                    home();
                } else {
                    clearLine(1);

                }

        }
    }

    public static void bestInCustomers() {
        clearConsole();
        System.out.println("\t  ____            _     _____          _____          _                                \n"
                + "\t |  _ \\          | |   |_   _|        / ____|        | |                               \n"
                + "\t | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___  \n"
                + "\t |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __| \n"
                + "\t | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\ \n"
                + "\t |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/ \n"
                + "      ________________________________________________________________________________________ ");

        int count1 = 0;
        String tempNum1[] = new String[phoneNumbers.length];

        for (int i = 0; i < phoneNumbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < count1; j++) {
                if (phoneNumbers[i].equals(tempNum1[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempNum1[count1] = phoneNumbers[i];
                count1++;
            }

        }

        String tempNum2[] = new String[count1];
        for (int i = 0; i < count1; i++) {
            tempNum2[i] = tempNum1[i];
        }

        int[] tempqty1 = new int[tempNum2.length];
        double[] tempamount1 = new double[tempNum2.length];
        for (int i = 0; i < phoneNumbers.length; i++) {
            for (int j = 0; j < tempNum2.length; j++) {
                if (tempNum2[j].equals(phoneNumbers[i])) {
                    tempamount1[j] += amounts[i];
                    tempqty1[j] += qtys[i];
                }
            }
        }
        for (int i = 0; i < tempqty1.length; i++) {
            for (int j = 0; j < tempqty1.length - 1; j++) {
                if (tempamount1[j] < tempamount1[j + 1]) {
                    double temp1 = tempamount1[j + 1];
                    tempamount1[j + 1] = tempamount1[j];
                    tempamount1[j] = temp1;

                    int temp2 = tempqty1[j + 1];
                    tempqty1[j + 1] = tempqty1[j];
                    tempqty1[j] = temp2;

                    String temp3 = tempNum2[j + 1];
                    tempNum2[j + 1] = tempNum2[j];
                    tempNum2[j] = temp3;

                }

            }
        }
        System.out.println("\t\t+---------------+----------+--------------+\n"
                + "\t\t|  Customer ID  | All QTY  | Total Amount |\n"
                + "\t\t+---------------+----------+--------------+");

        for (int i = 0; i < tempNum2.length; i++) {
            System.out.printf("\t\t|   %-11s |     %2d   |    %9.2f |%n\t\t|               |          |              |%n", tempNum2[i], tempqty1[i], tempamount1[i]);
        }
        System.out.println("\t\t+---------------+----------+--------------+");
        eAgain();
    }

    public static void viewCustomers() {
        clearConsole();
        System.out.println("\t __      ___                  _____          _                            \n"
                + "\t \\ \\    / (_)                / ____|        | |                           \n"
                + "\t  \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ \n"
                + "\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|\n"
                + "\t    \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   \n"
                + "\t     \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   \n"
                + "      ____________________________________________________________________________ ");

        int count1 = 0;
        String tempNum1[] = new String[phoneNumbers.length];

        for (int i = 0; i < phoneNumbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < count1; j++) {
                if (phoneNumbers[i].equals(tempNum1[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempNum1[count1] = phoneNumbers[i];
                count1++;
            }

        }

        String tempNum2[] = new String[count1];
        for (int i = 0; i < count1; i++) {
            tempNum2[i] = tempNum1[i];
        }

        int[] tempqty1 = new int[tempNum2.length];
        double[] tempamount1 = new double[tempNum2.length];
        for (int i = 0; i < phoneNumbers.length; i++) {
            for (int j = 0; j < tempNum2.length; j++) {
                if (tempNum2[j].equals(phoneNumbers[i])) {
                    tempamount1[j] += amounts[i];
                    tempqty1[j] += qtys[i];
                }
            }
        }
        System.out.println("\t\t+---------------+----------+--------------+\n"
                + "\t\t|  Customer ID  | All QTY  | Total Amount |\n"
                + "\t\t+---------------+----------+--------------+");

        for (int i = 0; i < tempNum2.length; i++) {
            System.out.printf("\t\t|   %-11s |     %2d   |    %9.2f |%n\t\t|               |          |              |%n", tempNum2[i], tempqty1[i], tempamount1[i]);
        }
        System.out.println("\t\t+---------------+----------+--------------+");
        eAgain();
    }

    public static void allCustomerReports() {
        clearConsole();
        System.out.println("\t           _ _    _____          _                              _____                       _   \n"
                + "\t     /\\   | | |  / ____|        | |                            |  __ \\                     | |  \n"
                + "\t    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ \n"
                + "\t   / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __|\n"
                + "\t  / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_ \n"
                + "\t /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|\n"
                + "\t                                                                          | |                   \n"
                + "\t                                                                          |_|                   \n"
                + "      ___________________________________________________________________________________________________");

        int count1 = 0;
        String tempNum1[] = new String[phoneNumbers.length];

        for (int i = 0; i < phoneNumbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < count1; j++) {
                if (phoneNumbers[i].equals(tempNum1[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                tempNum1[count1] = phoneNumbers[i];
                count1++;
            }

        }

        String tempNum2[] = new String[count1];
        for (int i = 0; i < count1; i++) {
            tempNum2[i] = tempNum1[i];
        }

        System.out.println("\t\t+--------------+-----+------+------+------+------+------+--------------+\n"
                + "\t\t| Phone Number | XS  |  S   |  M   |  L   | XL   | XXL  |  Total       |\n"
                + "\t\t+--------------+-----+------+------+------+------+------+--------------+");

        for (int i = 0; i < tempNum2.length; i++) {

            int XSCount = 0;
            int SCount = 0;
            int MCount = 0;
            int LCount = 0;
            int XLCount = 0;
            int XXLCount = 0;

            for (int z = 0; z < phoneNumbers.length; z++) {

                if (tempNum2[i].equalsIgnoreCase(phoneNumbers[z])) {

                    switch (sizes[z]) {
                        case "XS":
                            XSCount += qtys[z];
                            break;
                        case "S":
                            SCount += qtys[z];
                            break;
                        case "M":
                            MCount += qtys[z];
                            break;
                        case "L":
                            LCount += qtys[z];
                            break;
                        case "XL":
                            XLCount += qtys[z];
                            break;
                        case "XXL":
                            XXLCount += qtys[z];
                            break;

                    }
                }

            }

            int[] qtyTable = {XSCount, SCount, MCount, LCount, XLCount, XXLCount};

            double[] amountTable = {XSCount * 600, SCount * 800, MCount * 900, LCount * 1000, XLCount * 1100, XXLCount * 1200};

            double total = 0;
            for (int k = 0; k < amountTable.length; k++) {
                total += amountTable[k];
            }

            System.out.printf("\t\t| %10s   | %2d  |  %2d  | %2d   |  %2d  |  %2d  |  %2d  |     %8.2f |%n"
                    + "\t\t|              |     |      |      |      |      |      |              |%n", tempNum2[i], qtyTable[0], qtyTable[1], qtyTable[2], qtyTable[3], qtyTable[4], qtyTable[5], total);

        }
        System.out.println("\t\t+--------------+-----+------+------+------+------+------+--------------+");

        eAgain();
    }

    public static void itemReports() {
        clearConsole();
        System.out.println("\t  _____ _                   _____                       _       \n"
                + "\t |_   _| |                 |  __ \\                     | |      \n"
                + "\t   | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ ___ \n"
                + "\t   | | | __/ _ \\ '_ ` _ \\  |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|\n"
                + "\t  _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\n"
                + "\t |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\n"
                + "\t                                      | |                      \n"
                + "\t                                      |_|                      \n"
                + "      ____________________________________________________________________");

        System.out.print("\n\t\t[1] Best Selliing Categories Sorted by Qty\n\n\t\t[2] Best Selliing Categories Sorted by Amount\n\n\n\tEnter Option : ");
        char option = input.next().charAt(0);

        switch (option) {
            case '1':
                bestSelliingCategoriesSortedByQty();
                break;
            case '2':
                bestSelliingCategoriesSortedByAmount();
                break;
            default:
                itemReports();
        }
    }

    public static void bestSelliingCategoriesSortedByQty() {
        clearConsole();
        System.out.println("\t   _____            _           _   ____           ____ _________     __ \n"
                + "\t  / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / / \n"
                + "\t | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ /  \n"
                + "\t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /   \n"
                + "\t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |    \n"
                + "\t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|    \n"
                + "\t                                           __/ |                        \n"
                + "\t                                          |___/                         \n"
                + "      __________________________________________________________________________");

        int XSCount = 0;
        int SCount = 0;
        int MCount = 0;
        int LCount = 0;
        int XLCount = 0;
        int XXLCount = 0;

        for (int i = 0; i < phoneNumbers.length; i++) {

            switch (sizes[i]) {
                case "XS":
                    XSCount += qtys[i];
                    break;
                case "S":
                    SCount += qtys[i];
                    break;
                case "M":
                    MCount += qtys[i];
                    break;
                case "L":
                    LCount += qtys[i];
                    break;
                case "XL":
                    XLCount += qtys[i];
                    break;
                case "XXL":
                    XXLCount += qtys[i];
                    break;

            }
        }

        String[] sizearray = {"XS", "S", "M", "L", "XL", "XXL"};

        int[] qtyTable = {XSCount, SCount, MCount, LCount, XLCount, XXLCount};

        double[] amountTable = {XSCount * 600, SCount * 800, MCount * 900, LCount * 1000, XLCount * 1100, XXLCount * 1200};

        for (int i = 0; i < amountTable.length; i++) {
            for (int j = 0; j < amountTable.length - 1; j++) {
                if (qtyTable[j] < qtyTable[j + 1]) {
                    double temp2 = amountTable[j + 1];
                    amountTable[j + 1] = amountTable[j];
                    amountTable[j] = temp2;

                    int temp1 = qtyTable[j + 1];
                    qtyTable[j + 1] = qtyTable[j];
                    qtyTable[j] = temp1;

                    String temp3 = sizearray[j + 1];
                    sizearray[j + 1] = sizearray[j];
                    sizearray[j] = temp3;
                }
            }
        }

        System.out.print("\t\t+--------+---------+--------------+\n"
                + "\t\t|  Size  |   QTY   | Total Amount |\n"
                + "\t\t+--------+---------+--------------+\n");

        for (int i = 0; i < qtyTable.length; i++) {
            System.out.printf("\t\t|   %-4s | %4d    |  %10.2f  |%n\t\t|        |         |              |%n", sizearray[i], qtyTable[i], amountTable[i]);

        }

        System.out.println("\t\t+--------+---------+--------------+");
        eAgain();
    }

    public static void bestSelliingCategoriesSortedByAmount() {
        clearConsole();
        System.out.println("\t   _____            _           _   ____                                               _   \n"
                + "\t  / ____|          | |         | | |  _ \\            /\\                               | |  \n"
                + "\t | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ \n"
                + "\t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|\n"
                + "\t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ \n"
                + "\t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|\n"
                + "\t                                           __/ |                                           \n"
                + "\t                                          |___/                                            \n"
                + "      ______________________________________________________________________________________________");

        int XSCount = 0;
        int SCount = 0;
        int MCount = 0;
        int LCount = 0;
        int XLCount = 0;
        int XXLCount = 0;

        for (int i = 0; i < phoneNumbers.length; i++) {

            switch (sizes[i]) {
                case "XS":
                    XSCount += qtys[i];
                    break;
                case "S":
                    SCount += qtys[i];
                    break;
                case "M":
                    MCount += qtys[i];
                    break;
                case "L":
                    LCount += qtys[i];
                    break;
                case "XL":
                    XLCount += qtys[i];
                    break;
                case "XXL":
                    XXLCount += qtys[i];
                    break;

            }
        }

        String[] sizearray = {"XS", "S", "M", "L", "XL", "XXL"};

        int[] qtyTable = {XSCount, SCount, MCount, LCount, XLCount, XXLCount};

        double[] amountTable = {XSCount * 600, SCount * 800, MCount * 900, LCount * 1000, XLCount * 1100, XXLCount * 1200};

        for (int i = 0; i < amountTable.length; i++) {
            for (int j = 0; j < amountTable.length - 1; j++) {
                if (amountTable[j] < amountTable[j + 1]) {
                    double temp2 = amountTable[j + 1];
                    amountTable[j + 1] = amountTable[j];
                    amountTable[j] = temp2;

                    int temp1 = qtyTable[j + 1];
                    qtyTable[j + 1] = qtyTable[j];
                    qtyTable[j] = temp1;

                    String temp3 = sizearray[j + 1];
                    sizearray[j + 1] = sizearray[j];
                    sizearray[j] = temp3;
                }
            }
        }

        System.out.print("\t\t+--------+---------+--------------+\n"
                + "\t\t|  Size  |   QTY   | Total Amount |\n"
                + "\t\t+--------+---------+--------------+\n");

        for (int i = 0; i < qtyTable.length; i++) {
            System.out.printf("\t\t|   %-4s | %4d    |  %10.2f  |%n\t\t|        |         |              |%n", sizearray[i], qtyTable[i], amountTable[i]);

        }

        System.out.println("\t\t+--------+---------+--------------+");
        eAgain();
    }

    public static void ordersReports() {
        clearConsole();
        System.out.println("\t   ____          _             _____                       _       \n"
                + "\t  / __ \\        | |           |  __ \\                     | |      \n"
                + "\t | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ \n"
                + "\t | |  | | '__/ _` |/ _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|\n"
                + "\t | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\\n"
                + "\t  \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/\n"
                + "\t                                         | |                      \n"
                + "\t                                         |_|                      \n"
                + "      _____________________________________________________________________");
        System.out.println("\n\n\t\t[1] All Oders\n\n\t\t[2] Oders By Amount\n\n");

        System.out.print("\n\tEnter Option : ");
        char option = input.next().charAt(0);

        switch (option) {
            case '1':
                allOders();
                break;
            case '2':
                odersByAmount();
                break;
            default:
                ordersReports();
        }
    }

    public static void allOders() {
        clearConsole();
        System.out.println("\t __      ___                  ____          _               \n"
                + "\t \\ \\    / (_)                / __ \\        | |              \n"
                + "\t  \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___ \n"
                + "\t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | '__/ _` |/ _ \\ '__/ __|\n"
                + "\t    \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\\n"
                + "\t     \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/\n"
                + "      _______________________________________________________________");

        String tempId[] = orderIds;
        String tempNum[] = phoneNumbers;
        String tempsize[] = sizes;
        int tempqty[] = qtys;
        double tempamount[] = amounts;
        String tempstatus[] = statusarry;

        System.out.println("\t\t+------------+-------------+------+-------+------------+--------------+");
        System.out.println("\t\t|  Order ID  | Customer ID | Size |  QTy  |   Amount   |    Status    |");
        System.out.println("\t\t+------------+-------------+------+-------+------------+--------------+");

        for (int i = 0; i < tempId.length; i++) {
            System.out.printf("\t\t| %-7s  | %-10s  |  %-4s|   %-4d| %9.2f  |  %-12s|%n", tempId[tempId.length - 1 - i], tempNum[tempId.length - 1 - i], tempsize[tempId.length - 1 - i], tempqty[tempId.length - 1 - i], tempamount[tempId.length - 1 - i], tempstatus[tempId.length - 1 - i]);

        }
        System.out.println("\t\t+------------+-------------+------+-------+------------+--------------+\n\n");
        
       
       eAgain();
    }

    public static void odersByAmount() {
        clearConsole();
        System.out.println("\t   ____          _                 ____                                               _   \n"
                + "\t  / __ \\        | |               |  _ \\            /\\                               | |  \n"
                + "\t | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ \n"
                + "\t | |  | | '__/ _` |/ _ \\ '__/ __| |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|\n"
                + "\t | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ \n"
                + "\t  \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|\n"
                + "\t                                          __/ |                                            \n"
                + "\t                                         |___/                                             \n"
                + "      ___________________________________________________________________________________________");

        for (int i = 0; i < orderIds.length; i++) {
            for (int j = 0; j < orderIds.length - 1; j++) {
                if (amounts[j] < amounts[j + 1]) {
                    String temp1 = orderIds[j + 1];
                    orderIds[j + 1] = orderIds[j];
                    orderIds[j] = temp1;

                    String temp2 = phoneNumbers[j + 1];
                    phoneNumbers[j + 1] = phoneNumbers[j];
                    phoneNumbers[j] = temp2;

                    String temp3 = sizes[j + 1];
                    sizes[j + 1] = sizes[j];
                    sizes[j] = temp3;

                    int temp4 = qtys[j + 1];
                    qtys[j + 1] = qtys[j];
                    qtys[j] = temp4;

                    double temp5 = amounts[j + 1];
                    amounts[j + 1] = amounts[j];
                    amounts[j] = temp5;

                    String temp6 = statusarry[j + 1];
                    statusarry[j + 1] = statusarry[j];
                    statusarry[j] = temp6;
                }
            }
        }
        System.out.println("\t\t+-----------------+----------------------+----------+---------+-----------------+--------------+\n"
                + "\t\t|    Order ID     |     Customer ID      |   Size   |  QTY    |      Amount     |    Status    |\n"
                + "\t\t+-----------------+----------------------+----------+---------+-----------------+--------------+");

        for (int i = 0; i < orderIds.length; i++) {
            System.out.printf("\t\t|  %s	  |    %s        |   %-3S    | %6d  |     %9.2f   |  %11s |%n", orderIds[i], phoneNumbers[i], sizes[i], qtys[i], amounts[i], statusarry[i]);
        }
        System.out.println("		+-----------------+----------------------+----------+---------+-----------------+--------------+");

        eAgain();
    }

    public static void changeOrderStatus() {
        clearConsole();
        System.out.println("\t   ____          _              _____ _        _             \n"
                + "\t  / __ \\        | |            / ____| |      | |            \n"
                + "\t | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___ \n"
                + "\t | |  | | '__/ _` |/ _ \\ '__|  \\___ \\| __/ _` | __| | | / __|\n"
                + "\t | |__| | | | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\ \n"
                + "\t  \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/ \n"
                + "      _________________________________________________________________");

        System.out.print("\n\n\tEnter order ID : ");
        String oID = input.next();

        boolean found1 = false;
        int j = 0;

        for (int i = 0; i < orderIds.length; i++) {

            if (orderIds[i].equalsIgnoreCase(oID)) {
                j = i;
                found1 = true;
                break;
            }
        }
        if (!found1) {
            System.out.println("\n\t\tInvalid ID\n");
            change();
        }

        if (found1) {

            System.out.println("\n\tPhone Number : " + phoneNumbers[j]);
            System.out.println("\tSize         : " + sizes[j]);
            System.out.println("\tQty          : " + qtys[j]);
            System.out.println("\tAmount       : " + amounts[j]);
            System.out.println("\tStatus       : " + statusarry[j]);

            if (statusarry[j].equalsIgnoreCase("DELIVERED")) {
                System.out.println("\n\t\tCan't change this order status, Order already delivered..!\n\n");
                change();

            } else {

                L5:
                while (true) {
                    System.out.print("\n\n\tDo you want to change this order status? (y/n) : ");
                    again = input.next().toUpperCase().charAt(0);

                    switch (again) {
                        case 'Y': {
                            if (statusarry[j].equalsIgnoreCase("PROCESSING")) {

                                L3:
                                while (true) {
                                    System.out.println("\n\t\t[1] Order Delevering\n\n\t\t[2] Order Delivered\n");
                                    System.out.print("\tEnter Option : ");
                                    char option = input.next().charAt(0);

                                    switch (option) {
                                        case '1':
                                            statusarry[j] = status[1];
                                            System.out.println("\n\t\tStatus Updated..!");
                                            change();
                                            break;
                                        case '2':
                                            statusarry[j] = status[2];
                                            System.out.println("\n\t\tStatus Updated..!");
                                            change();
                                            break;
                                        default:
                                            clearLine(6);
                                            continue L3;
                                    }
                                }
                            } else if (statusarry[j].equalsIgnoreCase("DELIVERING")) {

                                System.out.println("\n\t\t[1] Order Delivered\n");
                                L2:
                                while (true) {
                                    System.out.print("\tEnter Option : ");
                                    char option = input.next().charAt(0);

                                    switch (option) {
                                        case '1':
                                            statusarry[j] = status[2];
                                            System.out.println("\n\t\tStatus Updated..!");
                                            change();
                                            break;
                                        default:
                                            System.out.println("\n\t\tInvalid Input..\n");
                                            continue L2;

                                    }
                                }
                            }

                        }
                        case 'N': {
                            change();
                        }
                        default: {
                            clearLine(3);
                            continue L5;
                        }
                    }

                }
            }
        }
    }

    public static void change() {
        L4:
        while (true) {
            System.out.print("\n\tDo you want to change another order status? (y/n) : ");
            again = input.next().toUpperCase().charAt(0);

            switch (again) {
                case 'Y':
                    changeOrderStatus();
                    break;
                case 'N':
                    home();
                    break;
                default:
                    clearLine(2);
                    continue L4;
            }

        }
    }

    public static void deleteOrder() {
        clearConsole();
        System.out.println("\t  _____       _      _          ____          _           \n"
                + "\t |  __ \\     | |    | |        / __ \\        | |          \n"
                + "\t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ \n"
                + "\t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|\n"
                + "\t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   \n"
                + "\t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   \n"
                + "\t  ____________________________________________________________");

        System.out.print("\n\n\tEnter order ID : ");
        String oID = input.next();

        boolean found1 = false;
        int j = 0;

        for (int i = 0; i < orderIds.length; i++) {

            if (orderIds[i].equalsIgnoreCase(oID)) {
                j = i;
                found1 = true;
                break;
            }
        }
        if (!found1) {
            System.out.println("\n\t\tInvalid ID\n");
            changeDelete();
        }

        if (found1) {

            System.out.println("\n\tPhone Number : " + phoneNumbers[j]);
            System.out.println("\tSize         : " + sizes[j]);
            System.out.println("\tQty          : " + qtys[j]);
            System.out.println("\tAmount       : " + amounts[j]);
            System.out.println("\tStatus       : " + statusarry[j]);

            if (statusarry[j].equalsIgnoreCase("DELIVERED")) {
                System.out.println("\n\t\tCan't Delete this order status, Order already delivered..!");
                changeDelete();
            } else if (statusarry[j].equalsIgnoreCase("DELIVERING")) {
                System.out.println("\n\t\tCan't Delete this order status, Order already delivering..!");
                changeDelete();
            } else {

                L5:
                while (true) {
                    System.out.print("\n\n\tDo you want to delete this order? (y/n) : ");
                    again = input.next().toUpperCase().charAt(0);

                    switch (again) {
                        case 'Y': {
                            if (statusarry[j].equalsIgnoreCase("PROCESSING")) {
                                for (int i = j; i < orderIds.length - 1; i++) {
                                    orderIds[i] = orderIds[i + 1];
                                }
                                deleteAllArrays();
                                index--;
                            }
                            System.out.println("\n\t\tOrder Deleted..!");
                            changeDelete();
                        }
                        case 'N': {
                            changeDelete();
                        }
                        default: {
                            clearLine(1);
                            continue L5;
                        }
                    }
                }
            }
        }
    }

    public static void changeDelete() {
        L4:
        while (true) {
            System.out.print("\n\n\tDo you want to delete another order? (y/n) : ");
            again = input.next().toUpperCase().charAt(0);

            switch (again) {
                case 'Y':
                    deleteOrder();
                    break;
                case 'N':
                    home();
                    break;
                default:
                    clearLine(2);
                    continue L4;
            }
        }
    }

    public static void main(String[] args) {
        home();
    }

}
