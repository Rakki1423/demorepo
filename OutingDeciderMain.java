import java.util.Scanner;

class OutingDecider {
    String employeeName;
    int employeeAge;
    String spouseName;
    int spouseAge;

    OutingDecider(String employeeName, int employeeAge, String spouseName, int spouseAge) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.spouseName = spouseName;
        this.spouseAge = spouseAge;
    }

    public String outingChecker(int ageGap) {

        if (spouseName.equals("NA")) {
            if (employeeAge > 20) {
                return "Enjoy outing";
            } else {
                return "We are planning good for you";
            }
        }

        int maxAge = Math.max(employeeAge, spouseAge);
        int minAge = Math.min(employeeAge, spouseAge);
        int difference = maxAge - minAge;

        if (difference < ageGap) {
            return employeeName + " and " + spouseName + " - You are invited";
        }

        return "";     
	}
}

public class  OutingDeciderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    	System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

	System.out.print("Enter Employee Age: ");
        int employeeAge = sc.nextInt();
        sc.nextLine(); 

	System.out.print("Enter Spouse Name: ");
        String spouseName = sc.nextLine();

	System.out.print("Enter Spouse Age: ");
        int spouseAge = sc.nextInt();

	System.out.print("Enter allowed age gap ");
        int ageGap = sc.nextInt();
        sc.close();

        OutingDecider obj = new OutingDecider(employeeName, employeeAge, spouseName, spouseAge);
        
        String result = obj.outingChecker(ageGap);
       
        if (!result.isEmpty()) {
            System.out.println(result);
        }

        
    }
}