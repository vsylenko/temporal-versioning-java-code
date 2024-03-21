package patchversion;

import io.temporal.activity.ActivityInterface;
import patchversion.model.ChargeInput;
import patchversion.model.CustomerInfo;

@ActivityInterface
public interface LoanProcessingActivities {

  public String chargeCustomer(ChargeInput input);

  public String sendThankYouToCustomer(CustomerInfo input);

}
