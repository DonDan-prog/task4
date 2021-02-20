public class Num5 
{
    public static void main(String[] args)
    {
        System.out.println("BMI(\"205 pounds\", \"73 inches\") -> " + BMI("205 pounds", "73 inches"));
        System.out.println("BMI(\"55 kilos\", \"1.65 meters\") -> " + BMI("55 kilos", "1.65 meters"));
        System.out.println("BMI(\"154 pounds\", \"2 meters\") -> " + BMI("154 pounds", "2 meters"));
    }
    public static String BMI(String input1, String input2)
    {
        String[] arr1 = input1.split(" "); // split input in words
        String[] arr2 = input2.split(" ");

        double weight = Double.parseDouble(arr1[0]) * (arr1[1].equals("pounds") ? 1/2.20462 : 1); // translation into kg
        double heigth = Double.parseDouble(arr2[0]) * (arr2[1].equals("inches") ? 2.54/100 : 1);  // translation into cm

        double bmi = weight / (heigth * heigth);

        String res = null;
        if(bmi < 18.5)
            res = "Underweight";
        else if(bmi >= 18.5 && bmi < 24.9)
            res= "Normal weight";
        else
            res = "Overweight";
        return String.format("%.1f %s", bmi, res);
    }
}
