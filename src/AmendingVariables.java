public class AmendingVariables {
    public static void main(String[] args) {
        int robertCurrentIncome = 62000;
        double yearlyIncrease = 1.1;
        System.out.println("Robert's starting income:" + robertCurrentIncome);
        int years = 1;
        while (years <= 5) {
            years ++;
            robertCurrentIncome = (int) (robertCurrentIncome * yearlyIncrease);
        }

        System.out.println("Robert income after 5 year if increased by 10% each year: " + robertCurrentIncome);
    }
}

