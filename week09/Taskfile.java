package week09;
public class Taskfile implements Comparable<Taskfile> {
    String name;
    int priority;
    int duration;

    public Taskfile(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public int compareTo(Taskfile other) {
        return Integer.compare(other.priority, this.priority);
    }
}
