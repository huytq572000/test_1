public class Student {
    private String divison;
    private int english, math, science, japanese, history;


    public Student() {
    }

    public Student(String divison, int english, int math, int science, int japanese, int history) {
        this.divison = divison;
        this.english = english;
        this.math = math;
        this.science = science;
        this.japanese = japanese;
        this.history = history;
    }



    public String getDivison() {
        return divison;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getJapanese() {
        return japanese;
    }

    public void setJapanese(int japanese) {
        this.japanese = japanese;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }


    @Override
    public String toString() {
        return this.divison +" "+ this.english +" "+ this.math +" "+ this.science + " " + this.japanese +" "+ this.history;
    }

}
