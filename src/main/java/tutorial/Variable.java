package tutorial;
public class Variable {
    private static final int HOUR_PRICE = 100;

    public static void main(String[] args) {
       /**
        * සදුදා සිට සිකුරාදා තෙක් වැඩ කල පැය ගණන
        */
       int mondayHours = 2;
       int tuesdayHours  = 2;
       int wednesdayHours  = 3;
       int thursdayHours  = 4;
       int fridayHours  = 8;
       int weekHours = mondayHours+tuesdayHours+wednesdayHours+thursdayHours+fridayHours; //මුළු සතියේ වැඩ කල පැය ගණන
       System.out.println("WEEK HOURS :"+weekHours);

       int total = 0; //ආරම්භක මුළු එකතුව =  0
       int mondayIncome = mondayHours*HOUR_PRICE;
       total = total+mondayIncome;//මුළු එකතුව = පරණ මුළු එකතුව + සදුදා ආදායම
       System.out.println("TOTAL :"+total);
       int tuesdayIncome = tuesdayHours*HOUR_PRICE;
       total = total +tuesdayIncome;
       System.out.println("TOTAL :"+total);
       int wednesdayIncome = wednesdayHours*HOUR_PRICE;
       total =total +wednesdayIncome;
       System.out.println("TOTAL :"+total);
       int thursdayIncome = thursdayHours*HOUR_PRICE;
       total = total+wednesdayIncome;
       System.out.println("TOTAL :"+total);
       int fridayIncome = fridayHours*HOUR_PRICE;
       total = total+fridayIncome;
       System.out.println("TOTAL :"+total);
       int weekIncome = mondayIncome+tuesdayIncome+wednesdayIncome+thursdayIncome+fridayIncome;
       System.out.println("WEEK INCOME :"+weekIncome);
    }
}

