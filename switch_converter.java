public class switch_converter {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            String range;

            switch (String.valueOf(gpa)) {
            case "4.0":
                range = "95.0% to 100.0%";
                break;
            case "3.9":
                range = "< 95.0% to 94.0%";
                break;
            case "3.8":
                range = "< 94.0% to 93.0%";
                break;
            case "3.7":
                range = "< 93.0% to 92.0%";
                break;
            case "3.6":
                range = "< 92.0% to 91.0%";
                break;
            case "3.5":
                range = "< 91.0% to 90.0%";
                break;
            case "3.4":
                range = "< 90.0% to 89.0%";
                break;
            case "3.3":
                range = "< 89.0% to 88.0%";
                break;
            case "3.2":
                range = "< 88.0% to 87.0%";
                break;
            case "3.1":
                range = "< 87.0% to 86.0%";
                break;
            case "3.0":
                range = "< 86.0% to 85.0%";
                break;
            case "2.9":
                range = "< 85.0% to 84.0%";
                break;
            case "2.8":
                range = "< 84.0% to 83.0%";
                break;
            case "2.7":
                range = "< 83.0% to 82.0%";
                break;
            case "2.6":
                range = "< 82.0% to 81.0%";
                break;
            case "2.5":
                range = "< 81.0% to 80.0%";
                break;
            case "2.4":
                range = "< 80.0% to 79.0%";
                break;
            case "2.3":
                range = "< 79.0% to 78.0%";
                break;
            case "2.2":
                range = "< 78.0% to 77.0%";
                break;
            case "2.1":
                range = "< 77.0% to 76.0%";
                break;
            case "2.0":
                range = "< 76.0% to 75.0%";
                break;
            case "1.9":
                range = "< 75.0% to 74.0%";
                break;
            case "1.8":
                range = "< 74.0% to 73.0%";
                break;
            case "1.7":
                range = "< 73.0% to 72.0%";
                break;
            case "1.6":
                range = "< 72.0% to 71.0%";
                break;
            case "1.5":
                range = "< 71.0% to 70.0%";
                break;
            case "1.4":
                range = "< 70.0% to 69.0%";
                break;
            case "1.3":
                range = "< 69.0% to 68.0%";
                break;
            case "1.2":
                range = "< 68.0% to 67.0%";
                break;
            case "1.1":
                range = "< 67.0% to 66.0%";
                break;
            case "1.0":
                range = "< 66.0% to 65.0%";
                break;
            case "0.0":
                range = "< 65.0% to 0.0%";
                break;
            default:
                range = "invalid GPA";
                break;
            }

            System.out.println("range: " + range);
        }
        
    }
}