import java.util.*;

class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 38) {
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;
                if (nextMultipleOfFive - grade < 3) {
                    grade = nextMultipleOfFive;
                }
            }
            roundedGrades.add(grade);
        }
        return roundedGrades;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }
        List<Integer> result = Result.gradingStudents(grades);
        for (int res : result) {
            System.out.println(res);
        }
    }
}
