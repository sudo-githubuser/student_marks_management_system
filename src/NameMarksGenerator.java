import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class NameMarksGenerator {

    public static String[] names = {"Aarav", "Aanya", "Abhinav", "Aditya", "Advika", "Akash", "Alisha", "Amit", "Amrita", "Ananya",
                "Aniket", "Anjali", "Arjun", "Aryan", "Bhavya", "Chirag", "Daksha", "Dev", "Diya", "Divya",
                "Esha", "Farhan", "Gaurav", "Harsha", "Isha", "Ishaan", "Jay", "Jiya", "Kabir", "Karan",
                "Kavya", "Krishna", "Lakshmi", "Lavanya", "Mahesh", "Manav", "Meera", "Mihir", "Mitali", "Mohit",
                "Namrata", "Neha", "Nikhil", "Nisha", "Nitin", "Om", "Palak", "Pooja", "Pranav", "Priya",
                "Raghav", "Raj", "Rakesh", "Raman", "Ravi", "Reema", "Reyansh", "Rhea", "Rohan", "Roshni",
                "Saanvi", "Sagar", "Sakshi", "Salman", "Samarth", "Sameer", "Sana", "Sanjay", "Sara", "Sarika",
                "Shivam", "Shruti", "Simran", "Sneha", "Soham", "Sonia", "Sumit", "Sunita", "Swati", "Tanvi",
                "Tanya", "Tarun", "Tina", "Uday", "Utkarsh", "Vaibhav", "Varun", "Ved", "Vikas", "Vikram",
                "Vinay", "Vishal", "Yash", "Zara", "Zoya", "Abhishek", "Deepika", "Rahul", "Kiran", "Preeti"
        };


    public static int getStudentMarks(){
        Random random = new Random();
        return random.nextInt(10, 100);
    }

    public static HashMap<String, Integer> assignStudentNameAndMarks(){

        HashMap<String, Integer> studentNameAndMarks = new HashMap<>();

        for (String name: names){
            int marks = getStudentMarks();
            studentNameAndMarks.put(name, marks);
        }
        return studentNameAndMarks;
    }
}
