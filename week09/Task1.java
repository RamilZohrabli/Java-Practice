package week09;
import java.util.PriorityQueue;
class Task implements Comparable<Task> {
    String name;
    int priority;
    int duration;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }
}

public class Task1 {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Task("Task1", 5, 10));
        taskQueue.add(new Task("Task2", 15, 20));
        int availableTime = 30;

        int totalTimeSpent = 0;
        while (!taskQueue.isEmpty() && availableTime > 0) {
            Task task = taskQueue.poll();
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
