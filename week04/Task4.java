package week04;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[][] adjacencyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(adjacencyMatrix[i], 0);
        }
        
        for (int i = 0; i < m; i++) {
            int vertex1 = scan.nextInt() - 1;
            int vertex2 = scan.nextInt() - 1;
            
            adjacencyMatrix[vertex1][vertex2] = 1;
            adjacencyMatrix[vertex2][vertex1] = 1; 
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scan.close();
    }
}
