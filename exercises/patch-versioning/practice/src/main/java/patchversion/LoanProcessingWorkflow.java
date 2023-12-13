package patchversion;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

import patchversion.model.CustomerInfo;

@WorkflowInterface
public interface LoanProcessingWorkflow {

  @WorkflowMethod
  public String loanProcessingWorkflow(CustomerInfo info);

}
