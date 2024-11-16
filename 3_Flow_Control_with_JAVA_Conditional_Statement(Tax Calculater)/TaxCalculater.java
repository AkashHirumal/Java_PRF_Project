
import java.util.*;

public class TaxCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("------------------------------------------------------------------------------------------\n"
                + "|\t\t\t\tSALARY INFORMATION SYSTEM                                |\n"
                + "------------------------------------------------------------------------------------------\n\n");
        System.out.print("\t[1] Calculate Income Tax\n"
                + "\t[2] Calculate Annual Bonus\n"
                + "\t[3] Calculate Loan amount");
        System.out.print("\n\nEnter an option to continue > ");

        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1:
                System.out.print  ("\n\n------------------------------------------------------------------------------------------\n"+
		                   "|\t\t\t\t   Calculate Income Tax                                  |\n"+
		                   "------------------------------------------------------------------------------------------\n\n" );	
			   
		System.out.print("Input Employee name    - ");
		String name=input.nextLine();	
		System.out.print("Input Employee salary  - ");
                double salary=input.nextDouble();
                double tax = 0;
                if(308333 < salary){
                    tax = ((salary-308333)*0.36 ) + 37500;
                }else if(266667 < salary){
                    tax = ((salary-266667)*0.3 ) + 25000;
                }else if(225000 < salary){
                    tax = ((salary-225000)*0.24 ) + 15000;
                }else if(183333 < salary){
                    tax = ((salary-183333)*0.18 ) + 7500;
                }else if(141667 < salary){
                    tax = ((salary-141667)*0.12 ) + 2500;
                }else if(100000 < salary){
                    tax = ((salary-100000)*0.06 );
                }else if(0 < salary){
                    tax = 0;
                }else{
                    System.out.println("invalid salary");
                }
                System.out.printf("\nYou have to pay Income Tax per month: %.0f",tax);
                break;
                
            case 2:
                System.out.print("\n\n------------------------------------------------------------------------------------------\n"+
		                     "|\t\t\t\t   Calculate Annual Bonus                                |\n"+
		                     "------------------------------------------------------------------------------------------\n\n" );
		                     
		System.out.print("Input Employee name    - ");
		String ename=input.nextLine();	
		System.out.print("Input Employee salary  - ");
		double esalary=input.nextDouble();
		double bonus=0;	
                if(400000 <= esalary){
                    bonus = esalary*0.35;
                }else if(300000 <= esalary){
                    bonus = esalary*0.2;
                }else if(200000 <= esalary){
                    bonus = esalary*0.15;
                }else if(100000 <= esalary){
                    bonus = esalary*0.1;
                }else if(0 <= esalary){
                    bonus = 5000;
                }else{
                    System.out.println("invalid salary");
                }
                System.out.printf("\nAnnual bonus    - %.1f",bonus);	
                break;
            case 3:
                System.out.print("\n\n------------------------------------------------------------------------------------------\n"+
		                     "|\t\t\t\t   Calculate Loan amount                                 |\n"+
		                     "------------------------------------------------------------------------------------------\n\n" );	
			
		                     
		System.out.print("Input Employee name    - ");
		String cname=input.nextLine();	
		System.out.print("Input Employee salary  - ");
		double csalary=input.nextDouble();	
                if (50000 < csalary) {
                    System.out.print("Enter number of years : ");
                    int years=input.nextInt();
                    double loan;
                    double range;
                    int n = years * 12;
                    double Installement = csalary *0.6;
                    double r  = 0.15;
                    double rate1 = r/12;
                    double rate2 = Math.pow(1 + rate1, n);
                    if (5 >= years) {
                        loan = Installement * (1-(1/rate2))/rate1;
                        range = loan%1000;
                        if (range < 500) {
                            loan -= range;
                        }else{
                            loan = (loan - range)+1000;
                        }
                        System.out.printf("\n\nYou can get Loan Amount : %.0f",loan);
                        
                    }else{
                        System.out.println("You can not get loan because your year morethan 5... ");
                    }
                    

                }else{
                    System.out.println("You can not get loan because your salary lessthan Rs.50 000... ");
                }
                break;
        }
    }

}
