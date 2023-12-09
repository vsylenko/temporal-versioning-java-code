package pizzaworkflow;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;
import io.temporal.worker.WorkerOptions;

public class PizzaWorker {
  public static void main(String[] args) {

    WorkflowServiceStubs service = WorkflowServiceStubs.newLocalServiceStubs();
    WorkflowClient client = WorkflowClient.newInstance(service);
    WorkerFactory factory = WorkerFactory.newInstance(client);

    // TODO Part A: Create the workerOptions object, specifying the options for 
    // `BuildID` as `v2` and `UseBuildIDForVersioning: true`.

    // TODO Part C: Update the workerOptions object's `BuildID` to `v2.1`

    // TODO Part A: pass in the WorkerOptions created above as the second parameter
    // in the call to create a new Worker
    Worker worker = factory.newWorker(Constants.TASK_QUEUE_NAME);

    worker.registerWorkflowImplementationTypes(PizzaWorkflowImpl.class);

    worker.registerActivitiesImplementations(new PizzaActivitiesImpl());

    factory.start();
  }
}
