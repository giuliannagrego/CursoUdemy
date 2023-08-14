package entity;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalNote() {
        return note1 + note2 + note3;
    }
    public String studentPassedOrFailed() {
        boolean passed = true;

        if (finalNote() < 60) {
            passed = false;

            return "Disapproved! \nMissing " + (60 - finalNote()) + " points.";
        } else {
            return "Approved! Congratulations!";
        }
    }
}
