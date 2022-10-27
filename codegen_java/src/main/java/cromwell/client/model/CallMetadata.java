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


package cromwell.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import cromwell.client.model.FailureMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cromwell.client.JSON;

/**
 * Call level metadata
 */
@ApiModel(description = "Call level metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T15:48:40.234026Z[Etc/UTC]")
public class CallMetadata {
  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Object inputs;

  public static final String SERIALIZED_NAME_EXECUTION_STATUS = "executionStatus";
  @SerializedName(SERIALIZED_NAME_EXECUTION_STATUS)
  private String executionStatus;

  public static final String SERIALIZED_NAME_BACKEND = "backend";
  @SerializedName(SERIALIZED_NAME_BACKEND)
  private String backend;

  public static final String SERIALIZED_NAME_BACKEND_STATUS = "backendStatus";
  @SerializedName(SERIALIZED_NAME_BACKEND_STATUS)
  private String backendStatus;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_FAILURES = "failures";
  @SerializedName(SERIALIZED_NAME_FAILURES)
  private FailureMessage failures;

  public static final String SERIALIZED_NAME_RETURN_CODE = "returnCode";
  @SerializedName(SERIALIZED_NAME_RETURN_CODE)
  private Integer returnCode;

  public static final String SERIALIZED_NAME_STDOUT = "stdout";
  @SerializedName(SERIALIZED_NAME_STDOUT)
  private String stdout;

  public static final String SERIALIZED_NAME_STDERR = "stderr";
  @SerializedName(SERIALIZED_NAME_STDERR)
  private String stderr;

  public static final String SERIALIZED_NAME_BACKEND_LOGS = "backendLogs";
  @SerializedName(SERIALIZED_NAME_BACKEND_LOGS)
  private Object backendLogs;

  public CallMetadata() {
  }

  public CallMetadata inputs(Object inputs) {
    
    this.inputs = inputs;
    return this;
  }

   /**
   * Mapping of input fully qualified names to stringified values
   * @return inputs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Mapping of input fully qualified names to stringified values")

  public Object getInputs() {
    return inputs;
  }


  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }


  public CallMetadata executionStatus(String executionStatus) {
    
    this.executionStatus = executionStatus;
    return this;
  }

   /**
   * Status in Cromwell execution terms.
   * @return executionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Status in Cromwell execution terms.")

  public String getExecutionStatus() {
    return executionStatus;
  }


  public void setExecutionStatus(String executionStatus) {
    this.executionStatus = executionStatus;
  }


  public CallMetadata backend(String backend) {
    
    this.backend = backend;
    return this;
  }

   /**
   * The type of backend on which the call executed (e.g. JES, SGE, Local)
   * @return backend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of backend on which the call executed (e.g. JES, SGE, Local)")

  public String getBackend() {
    return backend;
  }


  public void setBackend(String backend) {
    this.backend = backend;
  }


  public CallMetadata backendStatus(String backendStatus) {
    
    this.backendStatus = backendStatus;
    return this;
  }

   /**
   * Status in backend-specific terms.  Currently this will only be defined for the JES backend.
   * @return backendStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status in backend-specific terms.  Currently this will only be defined for the JES backend.")

  public String getBackendStatus() {
    return backendStatus;
  }


  public void setBackendStatus(String backendStatus) {
    this.backendStatus = backendStatus;
  }


  public CallMetadata start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Start datetime of the call execution in ISO8601 format with milliseconds
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start datetime of the call execution in ISO8601 format with milliseconds")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public CallMetadata end(OffsetDateTime end) {
    
    this.end = end;
    return this;
  }

   /**
   * End datetime of the call execution in ISO8601 format with milliseconds
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End datetime of the call execution in ISO8601 format with milliseconds")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public CallMetadata jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Backend-specific job ID
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Backend-specific job ID")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public CallMetadata failures(FailureMessage failures) {
    
    this.failures = failures;
    return this;
  }

   /**
   * Get failures
   * @return failures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FailureMessage getFailures() {
    return failures;
  }


  public void setFailures(FailureMessage failures) {
    this.failures = failures;
  }


  public CallMetadata returnCode(Integer returnCode) {
    
    this.returnCode = returnCode;
    return this;
  }

   /**
   * Call execution return code
   * @return returnCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Call execution return code")

  public Integer getReturnCode() {
    return returnCode;
  }


  public void setReturnCode(Integer returnCode) {
    this.returnCode = returnCode;
  }


  public CallMetadata stdout(String stdout) {
    
    this.stdout = stdout;
    return this;
  }

   /**
   * Path to the standard output file for this call
   * @return stdout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the standard output file for this call")

  public String getStdout() {
    return stdout;
  }


  public void setStdout(String stdout) {
    this.stdout = stdout;
  }


  public CallMetadata stderr(String stderr) {
    
    this.stderr = stderr;
    return this;
  }

   /**
   * Path to the standard error file for this call
   * @return stderr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the standard error file for this call")

  public String getStderr() {
    return stderr;
  }


  public void setStderr(String stderr) {
    this.stderr = stderr;
  }


  public CallMetadata backendLogs(Object backendLogs) {
    
    this.backendLogs = backendLogs;
    return this;
  }

   /**
   * Paths to backend specific logs for this call
   * @return backendLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paths to backend specific logs for this call")

  public Object getBackendLogs() {
    return backendLogs;
  }


  public void setBackendLogs(Object backendLogs) {
    this.backendLogs = backendLogs;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public CallMetadata putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallMetadata callMetadata = (CallMetadata) o;
    return Objects.equals(this.inputs, callMetadata.inputs) &&
        Objects.equals(this.executionStatus, callMetadata.executionStatus) &&
        Objects.equals(this.backend, callMetadata.backend) &&
        Objects.equals(this.backendStatus, callMetadata.backendStatus) &&
        Objects.equals(this.start, callMetadata.start) &&
        Objects.equals(this.end, callMetadata.end) &&
        Objects.equals(this.jobId, callMetadata.jobId) &&
        Objects.equals(this.failures, callMetadata.failures) &&
        Objects.equals(this.returnCode, callMetadata.returnCode) &&
        Objects.equals(this.stdout, callMetadata.stdout) &&
        Objects.equals(this.stderr, callMetadata.stderr) &&
        Objects.equals(this.backendLogs, callMetadata.backendLogs)&&
        Objects.equals(this.additionalProperties, callMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, executionStatus, backend, backendStatus, start, end, jobId, failures, returnCode, stdout, stderr, backendLogs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallMetadata {\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    executionStatus: ").append(toIndentedString(executionStatus)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    backendStatus: ").append(toIndentedString(backendStatus)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
    sb.append("    backendLogs: ").append(toIndentedString(backendLogs)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("inputs");
    openapiFields.add("executionStatus");
    openapiFields.add("backend");
    openapiFields.add("backendStatus");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("jobId");
    openapiFields.add("failures");
    openapiFields.add("returnCode");
    openapiFields.add("stdout");
    openapiFields.add("stderr");
    openapiFields.add("backendLogs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inputs");
    openapiRequiredFields.add("executionStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CallMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CallMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallMetadata is not found in the empty JSON string", CallMetadata.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CallMetadata.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("executionStatus") != null && !jsonObj.get("executionStatus").isJsonNull()) && !jsonObj.get("executionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `executionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("executionStatus").toString()));
      }
      if ((jsonObj.get("backend") != null && !jsonObj.get("backend").isJsonNull()) && !jsonObj.get("backend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backend").toString()));
      }
      if ((jsonObj.get("backendStatus") != null && !jsonObj.get("backendStatus").isJsonNull()) && !jsonObj.get("backendStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backendStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backendStatus").toString()));
      }
      if ((jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) && !jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      // validate the optional field `failures`
      if (jsonObj.get("failures") != null && !jsonObj.get("failures").isJsonNull()) {
        FailureMessage.validateJsonObject(jsonObj.getAsJsonObject("failures"));
      }
      if ((jsonObj.get("stdout") != null && !jsonObj.get("stdout").isJsonNull()) && !jsonObj.get("stdout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stdout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stdout").toString()));
      }
      if ((jsonObj.get("stderr") != null && !jsonObj.get("stderr").isJsonNull()) && !jsonObj.get("stderr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stderr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stderr").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<CallMetadata>() {
           @Override
           public void write(JsonWriter out, CallMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CallMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CallMetadata instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallMetadata
  * @throws IOException if the JSON string is invalid with respect to CallMetadata
  */
  public static CallMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallMetadata.class);
  }

 /**
  * Convert an instance of CallMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

