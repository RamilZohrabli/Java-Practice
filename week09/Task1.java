package week09;
import java.util.PriorityQueue;
public class Task1 {
    public static void main(String[] args) {
        PriorityQueue<Taskfile> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Taskfile("Task1", 5, 10));
        taskQueue.add(new Taskfile("Task2", 15, 20));
        int availableTime = 30;

        int totalTimeSpent = 0;
        while (!taskQueue.isEmpty() && availableTime > 0) {
            Taskfile task = taskQueue.poll();
            if (task.duration <= availableTime) {
                System.out.println(task.name);
                totalTimeSpent += task.duration;
                availableTime -= task.duration;
            } else {
                System.out.println("Could not complete task: " + task.name);
                break;
            }
        }

        System.out.println("Total time spent on tasks: " + totalTimeSpent);
        System.out.println("Available time: " + availableTime);
        System.out.println(totalTimeSpent == availableTime ? "Equal" : "Not Equal");
    }
}
