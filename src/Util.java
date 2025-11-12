import java.util.*;

public class Util {

    HashMap<String, Integer> editMarks = new HashMap<>();

    public void updateStudentMarks(String studentName, int studentMarks){
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();

        for(String name : editMarks.keySet()){
            if(Objects.equals(name, studentName)){
                editMarks.replace(studentName, studentMarks);
            } else {
                editMarks.put(studentName, studentMarks);
                System.out.println("New student " + studentName + " with marks " + studentMarks + "added to the list");
            }
        }

    }

    public void removeStudentMarks(String studentName){
        int studentMarks = 0;
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();

        for(String name : editMarks.keySet()){
            if(Objects.equals(name, studentName)) {
                editMarks.replace(studentName, studentMarks);
            }
        }
    }

    public void sortByStudentName(){
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();
        TreeMap<String, Integer> sortByName = new TreeMap<>(editMarks);

        sortByName.forEach((k, v) -> System.out.println(k + " → " + v));
    }

    public void sortByStudentMarks(){
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();

        List<Map.Entry<String, Integer>> sortByMarks = new ArrayList<>(editMarks.entrySet());
        sortByMarks.sort(Map.Entry.comparingByValue());

        sortByMarks.forEach(System.out::println);
    }

    public void highestMarks(){
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();
        int marks = Collections.max(editMarks.values());

        for(String name : editMarks.keySet()){
            if(Objects.equals(editMarks.get(name), marks)){
                System.out.println("Student " + name + " has the highest marks: " + marks);
            }
        }
    }

    public void lowestMarks(){
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();
        int marks = Collections.min(editMarks.values());

        for(String name : editMarks.keySet()){
            if(Objects.equals(editMarks.get(name), marks)){
                System.out.println("Student " + name + " has the lowest marks: " + marks);
            }
        }

    }

    public void averageMarks(){
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();
        int sum = 0;
        int count = 0;

        for(int marks : editMarks.values()){
            sum += marks;
            count++;
        }

        System.out.println("Average marks: " + sum/count);

    }

    public void topThreeScorers(){
        editMarks = NameMarksGenerator.assignStudentNameAndMarks();

        List<Map.Entry<String, Integer>> topThree = editMarks.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .toList();

        topThree.forEach(System.out::println);

    }
}
