package Account;

import Insurance.HealthInsurance;

public class Individual extends Account{

    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy() {
        this.getInsuranceList().add(new HealthInsurance());
    }
}
