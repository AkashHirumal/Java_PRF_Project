import java.util.*;

public class taxCal {

    public static Scanner sc = new Scanner(System.in);

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

    public static void Home() {
        clearConsole();
        
        System.out.println("\t\t\t\t\t\t\t  	 __   ______   ________  ________      \n"+
						   "\t\t\t\t\t\t\t	|  \\ /      \\ |        \\|        \\     \n"+
						   "\t\t\t\t\t\t\t	 \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$      \n"+
						   "\t\t\t\t\t\t\t	|  \\| $$   \\$$| $$__       | $$          \n"+
					       "\t\t\t\t\t\t\t	| $$| $$      | $$  \\      | $$           \n"+
						   "\t\t\t\t\t\t\t	| $$| $$    __ | $$$$$     | $$            \n"+
						   "\t\t\t\t\t\t\t	| $$| $$/    \\| $$_____    | $$           \n"+
						   "\t\t\t\t\t\t\t	| $$ \\$$    $$| $$     \\   | $$          \n"+ 
						   "\t\t\t\t\t\t\t	 \\$$  \\$$$$$$  \\$$$$$$$$    \\$$      \n\n" +
                   " _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____  \n" +
                   "|__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ \n" +
                   "   | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |\n" +
                   "   | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / \n" +
                   "   | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ \n" +
                   "   |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\\n");

        System.out.println("===============================================================================================================================================================================\n\n");

        System.out.println("\t[1] Withholding Tax\n");
        System.out.println("\t[2] Payble Tax\n");
        System.out.println("\t[3] Income Tax\n");
        System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax\n");
        System.out.println("\t[5] Leasing Pament\n");
        System.out.println("\t[6] Exit\n\n");

        System.out.print("Enter an option to continue -> ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                withholdingTax();
                break;
            case 2:
                paybleTax();
                break;
            case 3:
                incomeTax();
                break;
            case 4:
                SSCL();
                break;
            case 5:
                leasingPament();
                break;
            default:
                Home();
                break;
            case 6:
                break;

        }
    }

    private static void withholdingTax() {
        clearConsole();
        System.out.println("+------------------------------------------------------------------------------+\n" +
                   "|                             WITHHOLDING TAX                                  |\n" +
                   "+------------------------------------------------------------------------------+");


        System.out.println("\t[1] Rent Tax\n");
        System.out.println("\t[2] Bank Interest Tax\n");
        System.out.println("\t[3] Dividend Tax\n");
        System.out.println("\t[4] Exit\n\n");
        System.out.print("Enter an option to continue -> ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                rentTax();
                break;
            case 2:
                bankInterestTax();
                break;
            case 3:
                dividendTax();
                break;
            case 4:
                Home();
                break;
            default:
                withholdingTax();
                break;
        }

    }

    private static void rentTax() {
        clearConsole();
        System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                                 RENT TAX                                |\n" +
                   "+-------------------------------------------------------------------------+\n");


        System.out.print("Enter your rent          : ");
        int rent = sc.nextInt();

        if (rent > 100000) {

            double renttax = (rent - 100000) * 0.1;
            System.out.printf("%nYou have to pay Rent Tax : %.2f %n%n ", renttax);
            againRentTax();

        } else if (rent < 0) {
            System.out.println("\n\tInvalid input...\n\n");
            System.out.print("Do you want to Enter the corroct value again (Y/N) : ");
            char again = sc.next().toUpperCase().charAt(0);
            switch (again) {
                case 'Y':
                    rentTax();break;
                case 'N':
                    Home();break;
                default:
                    withholdingTax();break;
            }
        } else {
            System.out.println("\n\tYou dont have to pay rent tax...\n");
            againRentTax();
        }
    }

    private static void againRentTax() {
        System.out.print("\nDo you want to Calculate another rent Tax (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                rentTax();break;
            case 'N':
                Home();break;
            default:
                withholdingTax();break;
        }
    }

    private static void bankInterestTax() {
clearConsole();
        System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                           BANK INTEREST TAX                             |\n" +
                   "+-------------------------------------------------------------------------+");


        System.out.print("\n\nEnter ypur bank interest per year          : ");
        int bankinterest = sc.nextInt();

        if (bankinterest > 0) {

            double paybankinterest = bankinterest * 0.05;

            System.out.printf("\nyou have to pay Bank Interest Tax per year : %.2f \n  ", paybankinterest);

        } else {
            System.out.println("\n\tInvalid Lease Amount...\n");
        }
        System.out.print("\nDo you want to Calculate another Bank Interest Tax (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                bankInterestTax();break;
            case 'N':
                Home();break;
            default:
                withholdingTax();break;
        }
    }

    private static void dividendTax() {
clearConsole();
       System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                              DIVIDEND TAX                               |\n" +
                   "+-------------------------------------------------------------------------+");


        System.out.print("\nEnter your rent          : ");
        double dividend = sc.nextInt();

        if (dividend > 0) {

            if (dividend > 100000) {

                double dividendtax = (dividend - 100000) * 0.14;
                System.out.printf("%nYou have to pay Rent Tax : %.2f \n ", dividendtax);
            } else {
                System.out.println("\n\tYou dont have to pay Dividend tax...");

            }

        } else {
            System.out.println("\n\tInvalid Lease Amount...\n");
        }

        System.out.print("\nDo you want to Calculate another Dividend Tax (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                dividendTax();break;
            case 'N':
                Home();break;
            default:
                withholdingTax();break;
        }
    }

    private static void paybleTax() {
clearConsole();
        System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                              PAYABLE TAX                                |\n" +
                   "+-------------------------------------------------------------------------+");


        int payment = 0;
        LB1:
        do {
            System.out.print("Enter your employee payment per month : ");
            payment = sc.nextInt();

            if (payment <= 0) {
                System.out.println("Invalid input... Enter the correct value again...");
                continue LB1;
            }

        } while (payment <= 0);

        if (0 < payment && payment <= 100000) {
            System.out.println("\n\tYou dont have to pay Payable tax...");
        } else {
            double tax = 0;
            if (308333 < payment) {
                tax = ((payment - 308333) * 0.36) + 37500;
            } else if (266667 < payment) {
                tax = ((payment - 266667) * 0.3) + 25000;
            } else if (225000 < payment) {
                tax = ((payment - 225000) * 0.24) + 15000;
            } else if (183333 < payment) {
                tax = ((payment - 183333) * 0.18) + 7500;
            } else if (141667 < payment) {
                tax = ((payment - 141667) * 0.12) + 2500;
            } else if (100000 < payment) {
                tax = ((payment - 100000) * 0.06);
            } else {
                System.out.println("\n\tinvalid salary");
            }
            System.out.printf("\nYou have to pay Income Tax per month: %.2f", tax);
        }
        System.out.print("\n\nDo you want to Calculate another Payable Tax (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                paybleTax();
                break;
            case 'N':
                Home();
                break;
            default:
                Home();
                break;
        }
    }

    private static void incomeTax() {
clearConsole(); 
        System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                               INCOME TAX                                |\n" +
                   "+-------------------------------------------------------------------------+");


        double income = 0;
        LB1:
        do {
            System.out.print("Enter your total income per year    : ");
            income = sc.nextInt();

            if (income <= 0) {
                System.out.println("Invalid income... Enter the correct value again...");
                continue LB1;
            }

        } while (income <= 0);

        int tax = 500000;
        if (income < 1200000) {
            System.out.println("\n\tYou dont have to Income tax...");
        } else {

            double incometax = 0;
            if (income < 1700000) {
                incometax = (income - 1200000) * 0.06;
            } else if (income < 2200000) {
                incometax = tax * 0.06 + (income - 1700000) * 0.12;
            } else if (income < 2700000) {
                incometax = (tax * 0.18) + (income - 2200000) * 0.18;
            } else if (income < 3200000) {
                incometax = (tax * 0.36) + (income - 2700000) * 0.24;
            } else if (income < 3700000) {
                incometax = (tax * 0.6) + (income - 3200000) * 0.30;
            } else {
                incometax = (tax * 0.9) + (income - 3700000) * 0.36;;
            }
            System.out.printf("%nYou have to pay income Tax per year    :%.2f \n  ", incometax);
        }
        System.out.print("\nDo you want to Calculate another Income Tax (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                incomeTax();
                break;
            case 'N':
                Home();break;
            default:
                Home();break;
        }
    }

    private static void SSCL() {
clearConsole(); 
        System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|           SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                  |\n" +
                   "+-------------------------------------------------------------------------+");


        double value = 0;
        LB1:
        do {
            System.out.print("\nEnter value of Good or Service  : ");
            value = sc.nextInt();

            if (value <= 0) {
                System.out.println("Invalid Value... Enter the correct value again...\n");
                continue LB1;
            }

        } while (value <= 0);

        if (value > 0) {

            double saletax = value * 2.5 / 100;
            double addsaletax = value + saletax;
            double vat = addsaletax * 0.15;
            double sscl = saletax + vat;

            System.out.printf("You have to pay SSCL Tax       :%.2f \n  ", sscl);

        } else {
            System.out.println("\n\tInvalid Lease Amount...\n");
        }
        System.out.print("\nDo you want to Calculate another SSCL Tax (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                SSCL();break;
            case 'N':
                Home();break;
            default:
                Home();break;
        }
    }

    private static void leasingPament() {
clearConsole(); 
System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                                  Leasing Payment                          |\n" +
                   "+-------------------------------------------------------------------------+");


        System.out.println("\t[1] Calculate Monthly Installment\n");
        System.out.println("\t[2] Serch Leasing Category\n");
        System.out.println("\t[3] Find Leasing Amount\n");
        System.out.println("\t[4] Exit\n");

        System.out.print("\nEnter an optoin to continue -> ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                calculateMonthlyInstallment();break;
            case 2:
                serchLeasingCategory();break;
            case 3:
                findLeasingAmount();break;
            case 4:
                Home();
                break;
            default:
                withholdingTax();break;
        }
    }

    private static void calculateMonthlyInstallment() {
clearConsole(); 
System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                          Calculate Leasing Payment                       |\n" +
                   "+-------------------------------------------------------------------------+");


        double amount = 0;
        LB1:
        do {
            System.out.print("\nEnter lease amount         : ");
            amount = sc.nextDouble();

            if (amount <= 0) {
                System.out.println("\n\nInvalid amount... Enter the correct value again...");
                continue LB1;
            }

        } while (amount <= 0);

        double rate = 0;

        LA2:
        do {
            System.out.print("\n\nEnter annual interest rate : ");
            rate = sc.nextDouble();

            if (rate <= 0) {
                System.out.println("\n\nInvalid rate... Enter the correct value again...");
                continue LA2;
            }

        } while (rate <= 0);

        int year = 0;
        LA1:
        do {
            System.out.print("\n\nEnter number of Year       : ");

            year = sc.nextInt();
            if (year > 5 || year <= 0) {
                System.out.println("\n\nInvalid number of year... Enter the correct value again...");
                continue LA1;
            }
        } while (year > 5 || year <= 0);

        double i = rate / 1200;
        double n = year * 12;
        double A = amount;
        double z = i + 1;
        double r = Math.pow(z, n);
        double s = 1 / r;
        double m = A * i / (1 - s);

        System.out.printf("\n\nYour monthly instalment    :%.2f \n  ", m);

        System.out.print("\nDo you want to Calculate another monthly instalment (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                calculateMonthlyInstallment();break;
            case 'N':
                Home();break;
            default:
                leasingPament();break;
        }
    }

    private static void serchLeasingCategory() {
        clearConsole(); 
       System.out.println("+-------------------------------------------------------------------------+\n" +
                   "|                           Search Leasing Category                        |\n" +
                   "+-------------------------------------------------------------------------+");

        double lamount = 0;
        LB1:
        do {
            System.out.print("\nEnter lease amount         : ");
            lamount = sc.nextInt();
            if (lamount <= 0) {
                System.out.println("\nInvalid amount... Enter the correct value again...");
                continue LB1;
            }

        } while (lamount <= 0);

        System.out.print("\nEnter annual interest rate : ");
        double lrate = sc.nextInt();

        double ii = lrate / 1200;
        double n1 = 3 * 12;
        double n2 = 4 * 12;
        double n3 = 5 * 12;
        double AA = lamount;
        double zz = ii + 1;
        double r1 = Math.pow(zz, n1);
        double r2 = Math.pow(zz, n2);
        double r3 = Math.pow(zz, n3);
        double s1 = 1 / r1;
        double s2 = 1 / r2;
        double s3 = 1 / r3;
        double m1 = AA * ii / (1 - s1);
        double m2 = AA * ii / (1 - s2);
        double m3 = AA * ii / (1 - s3);

        System.out.printf("%nYour monthly instalment for 3 year leasing plan - %.2f %n ", m1);
        System.out.printf("Your monthly instalment for 4 year leasing plan - %.2f %n ", m2);
        System.out.printf("Your monthly instalment for 5 year leasing plan - %.2f %n ", m3);

        System.out.print("Do you want to Calculate another monthly instalment (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                serchLeasingCategory();break;
            case 'N':
                Home();break;
            default:
                leasingPament();break;
        }
    }

    private static void findLeasingAmount() {
        clearConsole(); 
       System.out.println("\n+-------------------------------------------------------------------------+\n" +
                   "|                             Find Leasing Amount                         |\n" +
                   "+-------------------------------------------------------------------------+");


        double lease = 0;
        LB1:
        do {
            System.out.print("\nEnter the monthly lease payment amount you can attord : ");
            lease = sc.nextDouble();
            if (lease <= 0) {
                System.out.println("\nInvalid amount... Enter the correct value again...");
                continue LB1;
            }

        } while (lease <= 0);

        if (true) {

            System.out.print("\nEnter number of year                                  : ");
            int year4 = sc.nextInt();

            System.out.print("\nEnter annual interest rate                            : ");
            double annualRate = sc.nextDouble();

            double M = lease;
            double i2 = annualRate / 1200;
            double N2 = year4 * 12;
            double Z = 1 + i2;
            double p = Math.pow(Z, N2);
            double A2 = M / (i2 / (1 - (1 / p)));

            System.out.printf("%nYour monthly instalment                                :%.2f \n  ", A2);

        } else {
            System.out.println("\n\tInvalid Lease Amount...\n");
        }

        System.out.print("\nDo you want to Calculate another monthly instalment (Y/N) : ");
        char again = sc.next().toUpperCase().charAt(0);
        switch (again) {
            case 'Y':
                findLeasingAmount();break;
            case 'N':
                Home();break;
            default:
                leasingPament();break;
        }
    }

    public static void main(String[] args) {
        Home();
    }

}
