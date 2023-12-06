alias workspace="cd ${GITPOD_REPO_ROOT}"
alias webui="gp preview $(gp url 8080)"

alias ex1="cd ${GITPOD_REPO_ROOT}/exercises/patch-versioning/practice"
alias ex1s="cd ${GITPOD_REPO_ROOT}/exercises/patch-versioning/solution"
alias ex1w="mvn clean compile exec:java -Dexec.mainClass='versionworkflow.LoanProcessingWorker'"
alias ex1st="mvn clean compile exec:java -Dexec.mainClass='versionworkflow.Starter' -Dexec.args='a100'"
alias ex1h="temporal workflow show --workflow-id=loan-processing-workflow-customer-a100 --fields long  --output json > history_for_original_execution.json"

alias ex2="cd ${GITPOD_REPO_ROOT}/exercises/worker-versioning/practice"
alias ex2s="cd ${GITPOD_REPO_ROOT}/exercises/worker-versioning/solution"
alias ex2t="mvn test"


export PATH="$PATH:/workspace/bin"
echo "temporal configured! try typing temporal -v"
echo "Your workspace is located at: ${GITPOD_REPO_ROOT}"
echo "Type the command     workspace      to return to the workspace directory at any time."