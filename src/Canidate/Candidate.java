package Canidate;

public class Candidate {
    /*
    Alfa 01:
	Desired Salary: 2000

	Salary Base > 2000 print: CALL TO CANDIDATE

	Salary Base = Desired Salary print: CALL THE CANDIDATE WITH A 	COUNTER PROPOSAL

	ELSE print: Waiting for results from more candidates.

    */

    public double getDesiredSalary() {
        return 2000;
    }

    public void salaryCandidate(double salary) {
        if (salary > getDesiredSalary()) {
            System.out.println("CALL TO CANDIDATE");
        } else if (salary == getDesiredSalary()) {
            System.out.println("CALL THE CANDIDATE WITH A COUNTER PROPOSAL");
        } else {
            System.out.println("WAITING FOR RESULTS FROM MORE CANDIDATES");
        }
    }

}
