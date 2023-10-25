// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int month_days [ ] = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 } ;
        String months [ ] = { "January" , "February" , "March" , "April" , "May" , "June" ,
                "July" , "August" , "September" , "October" , "November" , "December" } ;
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // 1.4.1
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " -> " + month_days[i]);
        }
        // 1.4.2
        for (int i = 0; i < months.length; i++) {
            if(month_days[i]==31)
           System.out.println(months[i]);
        }
        //1.4.3
        for (int i = 0; i < months.length; i++) {
            if(month_days[i]<31)
            System.out.println(months[i] + " -> " + month_days[i]);
        }
        //1.4.4
        int sum=0;
        for (int i = 0; i < months.length; i++) {
            if(month_days[i]<31)
                sum = sum +month_days[i];
        }
        System.out.println("sum="+ sum);
        //1.4.5
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i].substring(0,3));
        }
    }
}