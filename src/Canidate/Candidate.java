package Canidate;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
    List<String> candidates = new ArrayList<>();

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

    public void salaryCandidate(double salary, String name) {
        if (salary > getDesiredSalary()) {
            System.out.println("CALL TO CANDIDATE: " + name);
        } else if (salary == getDesiredSalary()) {
            System.out.printf("CALL THE CANDIDATE %s WITH A COUNTER PROPOSAL %n", name);
            candidates.add(name);
        } else {
            System.out.printf("%s WAITING FOR RESULTS FROM MORE CANDIDATES%n", name);
            candidates.add(name);
        }
    }



    public void selected() {

        for (String candidate : candidates) {
            System.out.println(candidate);
        }

    }

}
