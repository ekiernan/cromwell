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
import cromwell.client.model.WorkflowDescription;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WomtoolApi
 */
@Disabled
public class WomtoolApiTest {

    private final WomtoolApi api = new WomtoolApi();

    /**
     * Machine-readable description of a workflow, including inputs and outputs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void describeTest() throws ApiException {
        String version = null;
        String workflowSource = null;
        String workflowUrl = null;
        String workflowInputs = null;
        String workflowType = null;
        String workflowTypeVersion = null;
        WorkflowDescription response = api.describe(version, workflowSource, workflowUrl, workflowInputs, workflowType, workflowTypeVersion);
        // TODO: test validations
    }

}