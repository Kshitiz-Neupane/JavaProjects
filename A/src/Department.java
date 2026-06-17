public class Department {
    private String deptName;
    private String hodName;
    private double totalBudget;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public double getTotalBudget() {
        return totalBudget;
    }

    public void checkBudgetStatus() {
        if (totalBudget > 50000) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
    }
}

class ScienceDept extends Department {
    public void listlabs() {
        String[] list = {"Physics", "Chemistry", "Biology", "Geology"};
        for (String lab : list) {
            System.out.println(lab);
        }
    }
}


