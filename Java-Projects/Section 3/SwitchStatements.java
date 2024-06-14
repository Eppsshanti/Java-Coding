public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny": System.out.println("you can wear a shirt");
            case "cloudy": System.out.println("you should wear a sweater");
            case "rainy": System.out.println("you should wear a rain coat");
            case "snowy": System.out.println("you should wear a jacket");
            default: System.out.println("you can wear whatever you want");
                
        }
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1: System.out.println("youu are admin");
            case 2: System.out.println("youu are user");
            case 3: System.out.println("you are a user");
        
            default: System.out.println("unable to assign role");
        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if (temperature >= 80 && humidity >= 60) {
            System.out.println("its too hot and humid\n");
        } else if (temperature >=80) {
            System.out.println("its too hot \n");
        } else {
            System.out.println("cannot determine");
        }
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
