package week13;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Task {
    private final int taskId;
    private final int duration; 

    public Task(int taskId, int duration) {
        this.taskId = taskId;
        this.duration = duration;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getDuration() {
        return duration;
    }
}

class ParallelTaskExecutor extends Thread {
    private final BlockingQueue<Task> taskQueue;
    private final AtomicInteger completedTasks;

    public ParallelTaskExecutor(BlockingQueue<Task> taskQueue, AtomicInteger completedTasks) {
        this.taskQueue = taskQueue;
        this.completedTasks = completedTasks;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Task task = taskQueue.take(); 
                System.out.println("Executing task: " + task.getTaskId() + " with duration: " + task.getDuration() + " ms");
                Thread.sleep(task.getDuration()); 
                completedTasks.incrementAndGet();
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Task2 {

    private static void createTasksCSV(String filePath, int taskCount) {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("task_id,duration\n");
            for (int i = 1; i <= taskCount; i++) {
                int duration = random.nextInt(1000) + 500; 
                writer.write(i + "," + duration + "\n"); 
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    private static List<Task> readTasksFromCSV(String filePath) {
        List<Task> tasks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); 
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int taskId = Integer.parseInt(parts[0]); 
                int duration = Integer.parseInt(parts[1]);
                tasks.add(new Task(taskId, duration));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    private static void runTasks(List<Task> tasks, int numberOfExecutors) {
        BlockingQueue<Task> taskQueue = new LinkedBlockingQueue<>(tasks);
        AtomicInteger completedTasks = new AtomicInteger(0);
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfExecutors);

        long startTime = System.currentTimeMillis(); 

        for (int i = 0; i < numberOfExecutors; i++) {
            executorService.execute(new ParallelTaskExecutor(taskQueue, completedTasks));
        }

        while (completedTasks.get() < tasks.size()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            }
        }

        executorService.shutdown(); 

        long endTime = System.currentTimeMillis(); 

        System.out.println("Total time with " + numberOfExecutors + " executors: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {
        String filePath = "tasks.csv";

        createTasksCSV(filePath, 10); 

        List<Task> tasks = readTasksFromCSV(filePath);

        runTasks(tasks, 1); 
        runTasks(tasks, Runtime.getRuntime().availableProcessors()); 
        runTasks(tasks, tasks.size());
    }
}
