interface Branch {
    String IFSC_CODE = "ABC123456";

    void search();
}

class BankBranch implements Branch {
    private String branchName;

    public BankBranch(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public void search() {
        System.out.println("Searching branch: " + branchName);
        System.out.println("IFSC Code: " + IFSC_CODE);
    }
}

public class Practical6B {
    public static void main(String[] args) {
        BankBranch branch = new BankBranch("Downtown Branch");
        branch.search();
    }
}
