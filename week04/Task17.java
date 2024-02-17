package week04;
import week03.geometry.Segment;
public class Task17 {
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
