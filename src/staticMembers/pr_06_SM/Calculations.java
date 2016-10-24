package staticMembers.pr_06_SM;

/**
 * Created by typer on 10/24/16.
 */
public class Calculations {
    public static final double PI = 3.14159;
    public static final double PLANCK_CONSTANT = 6.62606896e-34;
    public static double getReducedPlanckConstant() {
        return PLANCK_CONSTANT / (2*PI) ;
    }
}
