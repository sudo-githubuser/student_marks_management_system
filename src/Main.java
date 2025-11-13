public class Main {

    public static void main(String[] args){

        Util util = new Util();

        System.out.println("---- Sorted by Name ----");
        util.sortByStudentName();

        System.out.println("---- Sorted by Marks ----");
        util.sortByStudentMarks();

        System.out.println("\n---- Highest Marks ----");
        util.highestMarks();

        System.out.println("\n---- Lowest Marks ----");
        util.lowestMarks();

        System.out.println("\n---- Average ----");
        util.averageMarks();

        System.out.println("\n---- Top Scorers ----");
        util.topScorers(5);

        System.out.println("\n---- Remove ----");
        util.removeStudentMarks("Yash");

        System.out.println("\n---- Update ----");
        util.updateStudentMarks("Raj", 100);

    }
}
