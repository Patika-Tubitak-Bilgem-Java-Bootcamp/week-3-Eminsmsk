package Account;

import Insurance.ResidenceInsurance;

public class Enterprise extends Account{

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy() {
        this.getInsuranceList().add(new ResidenceInsurance());
    }
}
