import java.util.*;

public class Util {
    private final HashMap<String, Integer> editMarks;
    public Util() {
        this.editMarks = NameMarksGenerator.assignStudentNameAndMarks();
    }

    public void updateStudentMarks(String studentName, int studentMarks) {
        Objects.requireNonNull(studentName, "Student name must not be null");
        if (editMarks.containsKey(studentName)) {
            editMarks.replace(studentName, studentMarks);
            System.out.println("Student " + studentName + " marks updated to " + studentMarks);
        } else {
            editMarks.put(studentName, studentMarks);
            System.out.println("New student " + studentName + " with marks " + studentMarks + "added to the list");
        }
    }

    public void removeStudentMarks(String studentName) {
        Objects.requireNonNull(studentName, "Student name must not be null");
        if (editMarks.containsKey(studentName)) {
            editMarks.remove(studentName);
            System.out.println("Student " + studentName + " is removed");
        } else {
            System.out.println("Student " + studentName + " not found");
        }
    }

    public void sortByStudentName() {
        TreeMap<String, Integer> sortByName = new TreeMap<>(editMarks);
        sortByName.forEach((k, v) -> System.out.println(k + " → " + v));
    }

    public void sortByStudentMarks() {
        List<Map.Entry<String, Integer>> sortByMarks = new ArrayList<>(editMarks.entrySet());

        sortByMarks.sort(Map.Entry.comparingByValue());
        sortByMarks.forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }

    public void highestMarks() {
        int marks = Collections.max(editMarks.values());

        for (Map.Entry<String, Integer> entry : editMarks.entrySet()) {
            if (Objects.equals(entry.getValue(), marks)) {
                System.out.println("Student " + entry.getKey() + " has the highest marks: " + marks);
            }
        }
    }

    public void lowestMarks() {
        int marks = Collections.min(editMarks.values());

        for (Map.Entry<String, Integer> entry : editMarks.entrySet()) {
            if (Objects.equals(entry.getValue(), marks)) {
                System.out.println("Student " + entry.getKey() + " has the lowest marks: " + marks);
            }
        }

    }

    public void averageMarks() {
        if (editMarks.isEmpty()) System.out.println("No students to compute average.");

        double avg = editMarks.values().stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);

        System.out.printf("Average marks: %.2f%n", avg);
    }

    public void topScorers(int n) {
        if(n > editMarks.size() || n <= 0)
            System.out.println("Invalid input. N should be > 0 and <= " + editMarks.size() + ".");

        List<Map.Entry<String, Integer>> topThree = editMarks.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(n)
                .toList();

        topThree.forEach(System.out::println);
    }
}
