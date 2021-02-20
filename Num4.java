public class Num4 
{
    public static void main(String[] args)
    {
        double[] test1 = { 9, 17, 30, 1.5 };
        double[] test2 = { 16, 18, 30, 1.8 };
        double[] test3 = { 13.25, 15, 30, 1.5 }; 

        System.out.println("overTime([9, 17, 30, 1.5]) -> " + overTime(test1));
        System.out.println("overTime([16, 18, 30, 1.8]) -> " + overTime(test2));
        System.out.println("overTime([13.25, 15, 30, 1.5]) -> " + overTime(test3));
    }
    public static String overTime(double[] a)
    {
        double timeStart = a[0];
        double timeEnd = a[1];
        double hourPay = a[2];
        double multiplyer = a[3];

        if(timeEnd < 17)
            return String.format("$%.2f", (timeEnd - timeStart) * hourPay);
        else
            return String.format("$%.2f", (17 - timeStart) * hourPay + (timeEnd - 17) * hourPay * multiplyer);
    }
}
