package week06;
import java.math.BigDecimal;

public class Task9 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("2.35");
        BigDecimal num2 = new BigDecimal("1.95");
        BigDecimal result1 = num1.subtract(num2);
        System.out.println(result1);

        BigDecimal num3 = new BigDecimal("1000000.0");
        BigDecimal num4 = new BigDecimal("1.2");
        BigDecimal result2 = num1.add(num3).subtract(num4);
        System.out.println(result2);
    }
}
