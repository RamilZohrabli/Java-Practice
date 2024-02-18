package week04;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> gradesList = new ArrayList<>();
        while (scan.hasNextInt()) {
            gradesList.add(scan.nextInt());
        }
        int[] grades = new int[gradesList.size()];
        for (int i = 0; i < gradesList.size(); i++) {
            grades[i] = gradesList.get(i);
        }
        double[] stats = findMeanMedianAndMode(grades);
        System.out.println("Mean: " + stats[0]);
        System.out.println("Median: " + stats[1]);
        System.out.println("Mode: " + (int) stats[2]);
        int[] histogram = calculateHistogram(grades);
        System.out.println("\nHistogram:");
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + ": " + histogram[i]);
        }
        scan.close();
    }
    
    public static double[] findMeanMedianAndMode(int[] numbers) {
        Arrays.sort(numbers);
        int size = numbers.length;
        //Calculate Median
        double median;
        if (size % 2 == 0) {
            median = (numbers[size / 2 - 1] + numbers[size / 2]) / 2.0;
        } else {
            median = numbers[size / 2];
        }
        //Calculate Mean
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double mean = sum / size;
        
        // Calculate Mode
        int mode = numbers[0];
        int maxFrequency = 1;
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            if (count > maxFrequency) {
                maxFrequency = count;
                mode = numbers[i];
            }
        }
        
        return new double[]{mean, median, mode};
    }
    
    public static int[] calculateHistogram(int[] grades) {
        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        for (int grade : grades) {
            minGrade = Math.min(minGrade, grade);
            maxGrade = Math.max(maxGrade, grade);
        }
    
        int numBins = maxGrade - minGrade + 1;
    
        int[] histogram = new int[numBins];
        for (int grade : grades) {
            histogram[grade - minGrade]++;
        }
        return histogram;
    }
}


       





