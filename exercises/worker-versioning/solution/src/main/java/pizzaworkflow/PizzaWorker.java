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

    WorkerOptions workerOptions = WorkerOptions.newBuilder()
         .setBuildId("v2.0") // Part A
         //.setBuildId("v2.1") // Part C
         .setUseBuildIdForVersioning(true)
         .build();

    Worker worker = factory.newWorker(Constants.TASK_QUEUE_NAME, workerOptions);

    worker.registerWorkflowImplementationTypes(PizzaWorkflowImpl.class);

    worker.registerActivitiesImplementations(new PizzaActivitiesImpl());

    factory.start();
  }
}
