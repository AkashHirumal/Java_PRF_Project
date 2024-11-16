import java.util.*;

public class iCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Home:
        while (true) {
            System.out.println("\n\t\t\t\t\t __   ______             __           \n"
                    + "\t\t\t\t\t|  \\ /      \\           |  \\          \n"
                    + "\t\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______ \n"
                    + "\t\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\\n"
                    + "\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$\n"
                    + "\t\t\t\t\t| $$| $$   __  /      $$| $$| $$      \n"
                    + "\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____ \n"
                    + "\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\\n"
                    + "\t\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$\n"
                    + "\t\t\t\t\t                                     ");

            System.out.println(
                    "  _   _                       _                         ____                                         _                 \n"
                    + " | \\ | |  _   _   _ __ ___   | |__     ___   _ __      / ___|   ___    _ __   __   __   ___   _ __  | |_    ___   _ __ \n"
                    + " |  \\| | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|    | |      / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|\n"
                    + " | |\\  | | |_| | | | | | | | | |_) | |  __/ | |       | |___  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |   \n"
                    + " |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|        \\____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|   \n"
                    + "                                                                                                                       ");
            System.out.println(
                    "=======================================================================================================================\n");

            System.out.println(
                    "\n\n\t[01] Decimal Conveter\n\n\t[02] Binary Conveter\n\n\t[03] Octal Conveter\n\n\t[04] Hexadecimal Conveter\n\n\t[05] Roman Number Conveter");
            System.out.print("\n\n\nEnter Option -> ");
            String num = sc.next();

            switch (num) {
                case "1":
                    D:
                    while (true) {
                        System.out.println("\n+-------------------------------------------+");
                        System.out.println("|           Decimal Converter               |");
                        System.out.println("+-------------------------------------------+\n");

                        System.out.print("\n\nEnter a Decimal number : ");

                        int decimalInput = sc.nextInt();
                        if (decimalInput < 0) {
                            System.out.println("\n\t\tInvalid Input... \n");
                            System.out.print("Do you want Input number again (Y/N) ->  ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue D;
                            } else if (ans == 'N') {
                                continue Home;
                            }
                        }
                        String binary = "";
                        int decimal = decimalInput;
                        if (decimal == 0) {
                            binary = "0";
                        } else {
                            while (decimal > 0) {
                                binary = (decimal % 2) + binary;
                                decimal = decimal / 2;
                            }
                        }

                        String octal = "";
                        decimal = decimalInput;
                        if (decimal == 0) {
                            octal = "0";
                        } else {
                            while (decimal > 0) {
                                octal = (decimal % 8) + octal;
                                decimal = decimal / 8;
                            }
                        }

                        String hex = "";
                        decimal = decimalInput;
                        if (decimal == 0) {
                            hex = "0";
                        } else {
                            while (decimal > 0) {
                                int remin = decimal % 16;
                                if (remin < 10) {
                                    hex = remin + hex;
                                } else {
                                    switch (remin) {
                                        case 10:
                                            hex = 'A' + hex;
                                            break;
                                        case 12:
                                            hex = 'C' + hex;
                                            break;
                                        case 13:
                                            hex = 'D' + hex;
                                            break;
                                        case 14:
                                            hex = 'E' + hex;
                                            break;
                                        case 15:
                                            hex = 'F' + hex;
                                            break;
                                    }
                                }
                                decimal = decimal / 16;
                            }
                        }
                        System.out.println("\n\n\tBinary Number\t\t: " + binary);
                        System.out.println("\n\tOctal Number\t\t: " + octal);
                        System.out.println("\n\tHexadecimal Number\t: " + hex);
                        while (true) {
                            System.out.print("\n\nDo you want to go to Homepage (Y/N) -> ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue Home;
                            } else {
                                break;
                            }
                        }
                    }
                case "2":
                    B:
                    while (true) {
                        System.out.println("\n+-------------------------------------------+");
                        System.out.println("|            Binary Converter               |");
                        System.out.println("+-------------------------------------------+\n");

                        System.out.print("\n\nEnter a Binary number : ");
                        int binaryInput = sc.nextInt();
                        String binarys = "" + binaryInput;

                        boolean bnum = false;
                        for (int i = 0; i < binarys.length(); i++) {
                            char num1 = binarys.charAt(i);
                            if (num1 < '0' || num1 > '1') {
                                bnum = true;
                                break;
                            }
                        }

                        if (bnum) {
                            System.out.println("\n\t\tInvalid Input... \n");
                            System.out.print("Do you want Input number again (Y/N) ->  ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue B;
                            } else {
                                continue Home;
                            }
                        }
                        int binay = binaryInput;
                        int decimal = 0;
                        int i = 0;
                        while (binay != 0) {
                            int temp = binay % 10;
                            decimal += temp * Math.pow(2, i);
                            binay /= 10;
                            i++;
                        }

                        int tem = decimal;
                        String octal = "";
                        if (tem == 0) {
                            octal = "0";
                        } else {
                            while (tem > 0) {
                                octal = (tem % 8) + octal;
                                tem = tem / 8;
                            }
                        }

                        String hex = "";
                        tem = decimal;
                        if (tem == 0) {
                            hex = "0";
                        } else {
                            while (tem > 0) {
                                int remin = tem % 16;
                                if (remin < 10) {
                                    hex = remin + hex;
                                } else {
                                    switch (remin) {
                                        case 10:
                                            hex = 'A' + hex;
                                            break;
                                        case 12:
                                            hex = 'C' + hex;
                                            break;
                                        case 13:
                                            hex = 'D' + hex;
                                            break;
                                        case 14:
                                            hex = 'E' + hex;
                                            break;
                                        case 15:
                                            hex = 'F' + hex;
                                            break;
                                    }
                                }
                                tem = tem / 16;
                            }
                        }

                        System.out.println("\n\n\tDecimal Number\t\t: " + decimal);
                        System.out.println("\n\tOctal Number\t\t: " + octal);
                        System.out.println("\n\tHexadecimal Number\t: " + hex);
                        while (true) {
                            System.out.print("\n\nDo you want to go to Homepage (Y/N) -> ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue Home;
                            } else {
                                break;
                            }
                        }
                    }
                case "3":
                    o:
                    while (true) {
                        System.out.println("\n+-------------------------------------------+");
                        System.out.println("|            Octal Converter                |");
                        System.out.println("+-------------------------------------------+\n");

                        System.out.print("\n\nEnter a Octal number : ");

                        int octalInput = sc.nextInt();
                        String octals = "" + octalInput;

                        boolean onum = false;
                        for (int i = 0; i < octals.length(); i++) {
                            char num1 = octals.charAt(i);
                            if (num1 < '0' || num1 > '7') {
                                onum = true;
                                break;
                            }
                        }

                        if (onum) {
                            System.out.println("\n\t\tInvalid Input... \n");
                            System.out.print("Do you want to input the number again (Y/N) ->  ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue o;
                            } else {
                                break;
                            }
                        }

                        int octal = octalInput;
                        int decimal = 0;
                        int i = 0;
                        while (octal != 0) {
                            int temp = octal % 10;
                            decimal += temp * Math.pow(8, i);
                            octal /= 10;
                            i++;
                        }

                        int temp = decimal;
                        String binary = "";
                        if (temp == 0) {
                            binary = "0";
                        } else {
                            while (temp > 0) {
                                binary = (temp % 2) + binary;
                                temp = temp / 2;
                            }
                        }

                        String hex = "";
                        int tem = decimal;
                        if (tem == 0) {
                            hex = "0";
                        } else {
                            while (tem > 0) {
                                int remin = tem % 16;
                                if (remin < 10) {
                                    hex = remin + hex;
                                } else {
                                    switch (remin) {
                                        case 10:
                                            hex = 'A' + hex;
                                            break;
                                        case 12:
                                            hex = 'C' + hex;
                                            break;
                                        case 13:
                                            hex = 'D' + hex;
                                            break;
                                        case 14:
                                            hex = 'E' + hex;
                                            break;
                                        case 15:
                                            hex = 'F' + hex;
                                            break;
                                    }
                                }
                                tem = tem / 16;
                            }
                        }

                        System.out.println("\n\n\tDecimal Number\t\t: " + decimal);
                        System.out.println("\n\tBinary Number\t\t: " + binary);
                        System.out.println("\n\tHexadecimal Number\t: " + hex);
                        while (true) {
                            System.out.print("\n\nDo you want to go to Homepage (Y/N) -> ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue Home;
                            } else {
                                break;
                            }
                        }
                    }
                case "4":
                    H:
                    while (true) {
                        System.out.println("\n+-------------------------------------------+");
                        System.out.println("|            HexaDecimal Converter          |");
                        System.out.println("+-------------------------------------------+\n");

                        System.out.print("\n\nEnter a HexaDecimal number : ");
                        String hexInput = sc.next().toUpperCase();

                        boolean Hnum = false;
                        for (int i = 0; i < hexInput.length(); i++) {
                            char num1 = hexInput.charAt(i);
                            if ((num1 < '0' || num1 > '9') && (num1 < 'A' || num1 > 'F')) {
                                Hnum = true;
                                break;
                            }

                        }
                        if (Hnum) {
                            System.out.println("\n\t\tInvalid Input... \n");
                            System.out.print("Do you want Input number again (Y/N) ->  ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue H;
                            } else {
                                continue Home;
                            }
                        }

                        int decimal = 0;
                        int k = 0;
                        for (int i = hexInput.length() - 1; i >= 0; i--) {
                            char chr = hexInput.charAt(i);
                            int temp;
                            if (chr >= '0' && chr <= '9') {
                                temp = (chr == '0') ? 0 : (chr == '1') ? 1 : (chr == '2') ? 2 : (chr == '3') ? 3 : (chr == '4') ? 5 : (chr == '6') ? 6 : (chr == '7') ? 7 : (chr == '8') ? 8 : 9;
                            } else {
                                temp = (chr == 'A') ? 10 : (chr == 'B') ? 11 : (chr == 'C') ? 12 : (chr == 'D') ? 13 : (chr == 'E') ? 14 : 15;
                            }

                            decimal += temp * (Math.pow(16, k));
                            k++;
                        }

                        System.out.println("\n\n\tDecimal Number\t\t: " + decimal);

                        int temp = decimal;
                        String binary = "";
                        if (temp == 0) {
                            binary = "0";
                        } else {
                            while (temp > 0) {
                                binary = (temp % 2) + binary;
                                temp = temp / 2;
                            }
                        }

                        int tem = decimal;
                        String octal = "";
                        if (tem == 0) {
                            octal = "0";
                        } else {
                            while (tem > 0) {
                                octal = (tem % 8) + octal;
                                tem = tem / 8;
                            }
                        }

                        System.out.println("\n\n\tDecimal Number\t\t: " + decimal);
                        System.out.println("\n\tBinary Number\t\t: " + binary);
                        System.out.println("\n\tOctal Number\t\t: " + octal);
                        while (true) {
                            System.out.print("\n\nDo you want to go to Homepage (Y/N) -> ");
                            char ans = sc.next().toUpperCase().charAt(0);
                            if (ans == 'Y') {
                                continue Home;
                            } else {
                                break;
                            }
                        }
                    }
                case "5":
                    System.out.println("  \n"
                            + "+------------------------------------------------------------------------------+\n"
                            + "|                             Roman Number Converter                           |\n"
                            + "+------------------------------------------------------------------------------+");
                    System.out.println("\n\n\t[01] Decimal Number to Roman Number Converter");
                    System.out.println("\t[02] Roman Number to Decimal Number Converter");
                    System.out.print("\n\tEnter your Option :");
                    int romchoice = sc.nextInt();
                    while (romchoice != 0 || romchoice != 1) {
                        switch (romchoice) {
                            case 1:
                                while (true) {
                                    System.out.println("  \n"
                                            + "+------------------------------------------------------------------------------+\n"
                                            + "|                 Decimal Number to Roman Number Converter                     |\n"
                                            + "+------------------------------------------------------------------------------+");
                                    System.out.print("\n\n\tEnter an Decimal Number ");
                                    int num1 = sc.nextInt();
                                    if (num1 <= 0) {
                                        System.out.println("Invalid number");
                                    }

                                    String result = "";

                                    while (num1 >= 1000) {
                                        result += "M";
                                        num1 -= 1000;
                                    }
                                    while (num1 >= 900) {
                                        result += "CM";
                                        num1 -= 900;
                                    }
                                    while (num1 >= 500) {
                                        result += "D";
                                        num1 -= 500;
                                    }
                                    while (num1 >= 400) {
                                        result += "CD";
                                        num1 -= 400;
                                    }
                                    while (num1 >= 100) {
                                        result += "C";
                                        num1 -= 100;
                                    }
                                    while (num1 >= 90) {
                                        result += "XC";
                                        num1 -= 90;
                                    }
                                    while (num1 >= 50) {
                                        result += "L";
                                        num1 -= 50;
                                    }
                                    while (num1 >= 40) {
                                        result += "XL";
                                        num1 -= 40;
                                    }
                                    while (num1 >= 10) {
                                        result += "X";
                                        num1 -= 10;
                                    }
                                    while (num1 >= 9) {
                                        result += "IX";
                                        num1 -= 9;
                                    }
                                    while (num1 >= 5) {
                                        result += "V";
                                        num1 -= 5;
                                    }
                                    while (num1 >= 4) {
                                        result += "IV";
                                        num1 -= 4;
                                    }
                                    while (num1 >= 1) {
                                        result += "I";
                                        num1 -= 1;
                                    }

                                    System.out.println("\n\t\tRoman numeral : " + result);

                                    while (true) {
                                        System.out.print("\n\nDo you want to go to Homepage (Y/N) -> ");
                                        char ans = sc.next().toUpperCase().charAt(0);
                                        if (ans == 'Y') {
                                            continue Home;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            case 2:
                                while (true) {
                                    System.out.println("  \n"
                                            + "+------------------------------------------------------------------------------+\n"
                                            + "|                 Roman Number to Decimal Number Converter                     |\n"
                                            + "+------------------------------------------------------------------------------+");
                                    System.out.print("\n\n\tEnter an Roman Number :");
                                    String roman = sc.next().toUpperCase();
                                    int rnum = 0;
                                    int i = 0;

                                    while (i < roman.length()) {
                                        char current = roman.charAt(i);
                                        int currentValue = 0;
                                        switch (current) {
                                            case 'I':
                                                currentValue = 1;
                                                break;
                                            case 'V':
                                                currentValue = 5;
                                                break;
                                            case 'X':
                                                currentValue = 10;
                                                break;
                                            case 'L':
                                                currentValue = 50;
                                                break;
                                            case 'C':
                                                currentValue = 100;
                                                break;
                                            case 'D':
                                                currentValue = 500;
                                                break;
                                            case 'M':
                                                currentValue = 1000;
                                                break;
                                            default:
                                                currentValue = 0;
                                                break;
                                        }

                                        if (i + 1 < roman.length()) {
                                           char next = roman.charAt(i + 1); 
                                            int nextValue = 0;
                                            switch (current) {
                                                case 'I':
                                                    nextValue = 1;
                                                    break;
                                                case 'V':
                                                    nextValue = 5;
                                                    break;
                                                case 'X':
                                                    nextValue = 10;
                                                    break;
                                                case 'L':
                                                    nextValue = 50;
                                                    break;
                                                case 'C':
                                                    nextValue = 100;
                                                    break;
                                                case 'D':
                                                    nextValue = 500;
                                                    break;
                                                case 'M':
                                                    nextValue = 1000;
                                                    break;
                                                default:
                                                    nextValue = 0;
                                                    break;
                                            }

                                            if (currentValue < nextValue) {
                                                rnum += nextValue - currentValue;
                                                i += 2;
                                            } else {
                                                rnum += currentValue;
                                                i++;
                                            }
                                        } else {
                                            rnum += currentValue;
                                            i++;
                                        }
                                    }

                                    System.out.println("\n\t\tDecimal number : " + rnum);
                                    while (true) {
                                        System.out.print("\n\nDo you want to go to Homepage (Y/N) -> ");
                                        char ans = sc.next().toUpperCase().charAt(0);
                                        if (ans == 'Y') {
                                            continue Home;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                        }
                    }
            }
        }
    }
}
