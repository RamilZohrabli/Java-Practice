package week04;
import week03.geometry.Segment;
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numSegments = scanner.nextInt();
        scanner.nextLine(); 
        
        Segment[] segments = new Segment[numSegments];
        
        for (int i = 0; i < numSegments; i++) {
            float x1 = scanner.nextFloat();
            float y1 = scanner.nextFloat();
            float x2 = scanner.nextFloat();
            float y2 = scanner.nextFloat();
            segments[i] = new Segment(x1, y1, x2, y2);
            scanner.nextLine(); 
        }
        
        Segment[] segmentsWithMinLength = findSegmentsWithMinimumLength(segments);
        
        for (Segment segment : segmentsWithMinLength) {
            System.out.println(segment.getp1() + " - " + segment.getp2());
        }
        
        scanner.close();
    }

    public static Segment[] findSegmentsWithMinimumLength(Segment[] segments){
        double minimumLength = Double.MAX_VALUE;
        int counter = 0;
        for(Segment segment : segments){
            if(segment.length() < minimumLength){
                minimumLength = segment.length();
                counter = 1;
            }
            else if(segment.length() == minimumLength){
                counter++;
            }
        }
        Segment [] segmentWithMinimumElements = new Segment[counter];
        int index = 0;
        for(Segment segment : segments){
            if(segment.length() == minimumLength){
                segmentWithMinimumElements[index++] = segment;
            }
        }
        return segmentWithMinimumElements;
    }
}

