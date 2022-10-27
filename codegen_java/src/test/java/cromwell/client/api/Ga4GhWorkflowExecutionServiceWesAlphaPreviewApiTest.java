/*
 * Cromwell Server REST API
 * Describes the REST API provided by a Cromwell server
 *
 * The version of the OpenAPI document: 30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cromwell.client.api;

import cromwell.client.ApiException;
import java.io.File;
import cromwell.client.model.RunId;
import cromwell.client.model.RunListResponse;
import cromwell.client.model.RunLog;
import cromwell.client.model.RunStatus;
import cromwell.client.model.ServiceInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Ga4GhWorkflowExecutionServiceWesAlphaPreviewApi
 */
@Disabled
public class Ga4GhWorkflowExecutionServiceWesAlphaPreviewApiTest {

    private final Ga4GhWorkflowExecutionServiceWesAlphaPreviewApi api = new Ga4GhWorkflowExecutionServiceWesAlphaPreviewApi();

    /**
     * Cancel run
     *
     * Cancel a running workflow.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelRunTest() throws ApiException {
        String runId = null;
        RunId response = api.cancelRun(runId);
        // TODO: test validations
    }

    /**
     * Get run log
     *
     * This endpoint provides detailed information about a given workflow run. The returned result has information about the outputs produced by this workflow (if available), a log object which allows the stderr and stdout to be retrieved, a log array so stderr/stdout for individual tasks can be retrieved, and the overall state of the workflow run (e.g. RUNNING, see the State section).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRunLogTest() throws ApiException {
        String runId = null;
        RunLog response = api.getRunLog(runId);
        // TODO: test validations
    }

    /**
     * Get run status
     *
     * This provides an abbreviated (and likely fast depending on implementation) status of the running workflow, returning a simple result with the  overall state of the workflow run (e.g. RUNNING, see the State section).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRunStatusTest() throws ApiException {
        String runId = null;
        RunStatus response = api.getRunStatus(runId);
        // TODO: test validations
    }

    /**
     * Get service info
     *
     * May include information related (but not limited to) the workflow descriptor formats, versions supported, the WES API versions supported, and information about general service availability.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServiceInfoTest() throws ApiException {
        ServiceInfo response = api.getServiceInfo();
        // TODO: test validations
    }

    /**
     * List runs
     *
     * Runs are listed from newest to oldest. When paging through the list, the client should not make assumptions about live updates, but should assume the contents of the list reflect the workflow list at the moment that the first page is requested. To monitor a specific workflow run, use GetRunStatus or GetRunLog.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRunsTest() throws ApiException {
        Long pageSize = null;
        String pageToken = null;
        RunListResponse response = api.listRuns(pageSize, pageToken);
        // TODO: test validations
    }

    /**
     * Run workflow
     *
     * This endpoint creates a new workflow run and returns a &#x60;RunId&#x60; to monitor its progress.  The &#x60;workflow_attachment&#x60; array may be used to upload files that are required to execute the workflow, including the primary workflow, tools imported by the workflow, other files referenced by the workflow, or files which are part of the input.  The implementation should stage these files to a temporary directory and execute the workflow from there. These parts must have a Content-Disposition header with a \&quot;filename\&quot; provided for each part.  Filenames may include subdirectories, but must not include references to parent directories with &#39;..&#39; -- implementations should guard against maliciously constructed filenames.  The &#x60;workflow_url&#x60; is either an absolute URL to a workflow file that is accessible by the WES endpoint, or a relative URL corresponding to one of the files attached using &#x60;workflow_attachment&#x60;.  The &#x60;workflow_params&#x60; JSON object specifies input parameters, such as input files.  The exact format of the JSON object depends on the conventions of the workflow language being used.  Input files should either be absolute URLs, or relative URLs corresponding to files uploaded using &#x60;workflow_attachment&#x60;.  The WES endpoint must understand and be able to access URLs supplied in the input.  This is implementation specific.  The &#x60;workflow_type&#x60; is the type of workflow language and must be \&quot;CWL\&quot; or \&quot;WDL\&quot; currently (or another alternative  supported by this WES instance).  The &#x60;workflow_type_version&#x60; is the version of the workflow language submitted and must be one supported by this WES instance.  See the &#x60;RunRequest&#x60; documentation for details about other fields.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void runWorkflowTest() throws ApiException {
        String workflowParams = null;
        String workflowType = null;
        String workflowTypeVersion = null;
        String tags = null;
        String workflowEngineParameters = null;
        String workflowUrl = null;
        List<File> workflowAttachment = null;
        RunId response = api.runWorkflow(workflowParams, workflowType, workflowTypeVersion, tags, workflowEngineParameters, workflowUrl, workflowAttachment);
        // TODO: test validations
    }

}
