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
import cromwell.client.model.DefaultWorkflowEngineParameter;
import cromwell.client.model.WorkflowTypeVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ServiceInfoAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T17:59:53.222573Z[Etc/UTC]")
public class ServiceInfoAllOf {
  public static final String SERIALIZED_NAME_WORKFLOW_TYPE_VERSIONS = "workflow_type_versions";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_VERSIONS)
  private Map<String, WorkflowTypeVersion> workflowTypeVersions = new HashMap<>();

  public static final String SERIALIZED_NAME_SUPPORTED_WES_VERSIONS = "supported_wes_versions";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_WES_VERSIONS)
  private List<String> supportedWesVersions = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_FILESYSTEM_PROTOCOLS = "supported_filesystem_protocols";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_FILESYSTEM_PROTOCOLS)
  private List<String> supportedFilesystemProtocols = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKFLOW_ENGINE_VERSIONS = "workflow_engine_versions";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ENGINE_VERSIONS)
  private Map<String, String> workflowEngineVersions = new HashMap<>();

  public static final String SERIALIZED_NAME_DEFAULT_WORKFLOW_ENGINE_PARAMETERS = "default_workflow_engine_parameters";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORKFLOW_ENGINE_PARAMETERS)
  private List<DefaultWorkflowEngineParameter> defaultWorkflowEngineParameters = new ArrayList<>();

  public static final String SERIALIZED_NAME_SYSTEM_STATE_COUNTS = "system_state_counts";
  @SerializedName(SERIALIZED_NAME_SYSTEM_STATE_COUNTS)
  private Map<String, Long> systemStateCounts = new HashMap<>();

  public static final String SERIALIZED_NAME_AUTH_INSTRUCTIONS_URL = "auth_instructions_url";
  @SerializedName(SERIALIZED_NAME_AUTH_INSTRUCTIONS_URL)
  private String authInstructionsUrl;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public ServiceInfoAllOf() {
  }

  public ServiceInfoAllOf workflowTypeVersions(Map<String, WorkflowTypeVersion> workflowTypeVersions) {
    
    this.workflowTypeVersions = workflowTypeVersions;
    return this;
  }

  public ServiceInfoAllOf putWorkflowTypeVersionsItem(String key, WorkflowTypeVersion workflowTypeVersionsItem) {
    this.workflowTypeVersions.put(key, workflowTypeVersionsItem);
    return this;
  }

   /**
   * Get workflowTypeVersions
   * @return workflowTypeVersions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, WorkflowTypeVersion> getWorkflowTypeVersions() {
    return workflowTypeVersions;
  }


  public void setWorkflowTypeVersions(Map<String, WorkflowTypeVersion> workflowTypeVersions) {
    this.workflowTypeVersions = workflowTypeVersions;
  }


  public ServiceInfoAllOf supportedWesVersions(List<String> supportedWesVersions) {
    
    this.supportedWesVersions = supportedWesVersions;
    return this;
  }

  public ServiceInfoAllOf addSupportedWesVersionsItem(String supportedWesVersionsItem) {
    this.supportedWesVersions.add(supportedWesVersionsItem);
    return this;
  }

   /**
   * The version(s) of the WES schema supported by this service
   * @return supportedWesVersions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The version(s) of the WES schema supported by this service")

  public List<String> getSupportedWesVersions() {
    return supportedWesVersions;
  }


  public void setSupportedWesVersions(List<String> supportedWesVersions) {
    this.supportedWesVersions = supportedWesVersions;
  }


  public ServiceInfoAllOf supportedFilesystemProtocols(List<String> supportedFilesystemProtocols) {
    
    this.supportedFilesystemProtocols = supportedFilesystemProtocols;
    return this;
  }

  public ServiceInfoAllOf addSupportedFilesystemProtocolsItem(String supportedFilesystemProtocolsItem) {
    this.supportedFilesystemProtocols.add(supportedFilesystemProtocolsItem);
    return this;
  }

   /**
   * The filesystem protocols supported by this service, currently these may include common protocols using the terms &#39;http&#39;, &#39;https&#39;, &#39;sftp&#39;, &#39;s3&#39;, &#39;gs&#39;, &#39;file&#39;, or &#39;synapse&#39;, but others  are possible and the terms beyond these core protocols are currently not fixed.   This section reports those protocols (either common or not) supported by this WES service.
   * @return supportedFilesystemProtocols
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The filesystem protocols supported by this service, currently these may include common protocols using the terms 'http', 'https', 'sftp', 's3', 'gs', 'file', or 'synapse', but others  are possible and the terms beyond these core protocols are currently not fixed.   This section reports those protocols (either common or not) supported by this WES service.")

  public List<String> getSupportedFilesystemProtocols() {
    return supportedFilesystemProtocols;
  }


  public void setSupportedFilesystemProtocols(List<String> supportedFilesystemProtocols) {
    this.supportedFilesystemProtocols = supportedFilesystemProtocols;
  }


  public ServiceInfoAllOf workflowEngineVersions(Map<String, String> workflowEngineVersions) {
    
    this.workflowEngineVersions = workflowEngineVersions;
    return this;
  }

  public ServiceInfoAllOf putWorkflowEngineVersionsItem(String key, String workflowEngineVersionsItem) {
    this.workflowEngineVersions.put(key, workflowEngineVersionsItem);
    return this;
  }

   /**
   * Get workflowEngineVersions
   * @return workflowEngineVersions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getWorkflowEngineVersions() {
    return workflowEngineVersions;
  }


  public void setWorkflowEngineVersions(Map<String, String> workflowEngineVersions) {
    this.workflowEngineVersions = workflowEngineVersions;
  }


  public ServiceInfoAllOf defaultWorkflowEngineParameters(List<DefaultWorkflowEngineParameter> defaultWorkflowEngineParameters) {
    
    this.defaultWorkflowEngineParameters = defaultWorkflowEngineParameters;
    return this;
  }

  public ServiceInfoAllOf addDefaultWorkflowEngineParametersItem(DefaultWorkflowEngineParameter defaultWorkflowEngineParametersItem) {
    this.defaultWorkflowEngineParameters.add(defaultWorkflowEngineParametersItem);
    return this;
  }

   /**
   * Each workflow engine can present additional parameters that can be sent to the workflow engine. This message will list the default values, and their types for each workflow engine.
   * @return defaultWorkflowEngineParameters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Each workflow engine can present additional parameters that can be sent to the workflow engine. This message will list the default values, and their types for each workflow engine.")

  public List<DefaultWorkflowEngineParameter> getDefaultWorkflowEngineParameters() {
    return defaultWorkflowEngineParameters;
  }


  public void setDefaultWorkflowEngineParameters(List<DefaultWorkflowEngineParameter> defaultWorkflowEngineParameters) {
    this.defaultWorkflowEngineParameters = defaultWorkflowEngineParameters;
  }


  public ServiceInfoAllOf systemStateCounts(Map<String, Long> systemStateCounts) {
    
    this.systemStateCounts = systemStateCounts;
    return this;
  }

  public ServiceInfoAllOf putSystemStateCountsItem(String key, Long systemStateCountsItem) {
    this.systemStateCounts.put(key, systemStateCountsItem);
    return this;
  }

   /**
   * Get systemStateCounts
   * @return systemStateCounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Long> getSystemStateCounts() {
    return systemStateCounts;
  }


  public void setSystemStateCounts(Map<String, Long> systemStateCounts) {
    this.systemStateCounts = systemStateCounts;
  }


  public ServiceInfoAllOf authInstructionsUrl(String authInstructionsUrl) {
    
    this.authInstructionsUrl = authInstructionsUrl;
    return this;
  }

   /**
   * A web page URL with human-readable instructions on how to get an authorization token for use with a specific WES endpoint.
   * @return authInstructionsUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A web page URL with human-readable instructions on how to get an authorization token for use with a specific WES endpoint.")

  public String getAuthInstructionsUrl() {
    return authInstructionsUrl;
  }


  public void setAuthInstructionsUrl(String authInstructionsUrl) {
    this.authInstructionsUrl = authInstructionsUrl;
  }


  public ServiceInfoAllOf tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ServiceInfoAllOf putTagsItem(String key, String tagsItem) {
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
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
  public ServiceInfoAllOf putAdditionalProperty(String key, Object value) {
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
    ServiceInfoAllOf serviceInfoAllOf = (ServiceInfoAllOf) o;
    return Objects.equals(this.workflowTypeVersions, serviceInfoAllOf.workflowTypeVersions) &&
        Objects.equals(this.supportedWesVersions, serviceInfoAllOf.supportedWesVersions) &&
        Objects.equals(this.supportedFilesystemProtocols, serviceInfoAllOf.supportedFilesystemProtocols) &&
        Objects.equals(this.workflowEngineVersions, serviceInfoAllOf.workflowEngineVersions) &&
        Objects.equals(this.defaultWorkflowEngineParameters, serviceInfoAllOf.defaultWorkflowEngineParameters) &&
        Objects.equals(this.systemStateCounts, serviceInfoAllOf.systemStateCounts) &&
        Objects.equals(this.authInstructionsUrl, serviceInfoAllOf.authInstructionsUrl) &&
        Objects.equals(this.tags, serviceInfoAllOf.tags)&&
        Objects.equals(this.additionalProperties, serviceInfoAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowTypeVersions, supportedWesVersions, supportedFilesystemProtocols, workflowEngineVersions, defaultWorkflowEngineParameters, systemStateCounts, authInstructionsUrl, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInfoAllOf {\n");
    sb.append("    workflowTypeVersions: ").append(toIndentedString(workflowTypeVersions)).append("\n");
    sb.append("    supportedWesVersions: ").append(toIndentedString(supportedWesVersions)).append("\n");
    sb.append("    supportedFilesystemProtocols: ").append(toIndentedString(supportedFilesystemProtocols)).append("\n");
    sb.append("    workflowEngineVersions: ").append(toIndentedString(workflowEngineVersions)).append("\n");
    sb.append("    defaultWorkflowEngineParameters: ").append(toIndentedString(defaultWorkflowEngineParameters)).append("\n");
    sb.append("    systemStateCounts: ").append(toIndentedString(systemStateCounts)).append("\n");
    sb.append("    authInstructionsUrl: ").append(toIndentedString(authInstructionsUrl)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("workflow_type_versions");
    openapiFields.add("supported_wes_versions");
    openapiFields.add("supported_filesystem_protocols");
    openapiFields.add("workflow_engine_versions");
    openapiFields.add("default_workflow_engine_parameters");
    openapiFields.add("system_state_counts");
    openapiFields.add("auth_instructions_url");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflow_type_versions");
    openapiRequiredFields.add("supported_wes_versions");
    openapiRequiredFields.add("supported_filesystem_protocols");
    openapiRequiredFields.add("workflow_engine_versions");
    openapiRequiredFields.add("default_workflow_engine_parameters");
    openapiRequiredFields.add("system_state_counts");
    openapiRequiredFields.add("auth_instructions_url");
    openapiRequiredFields.add("tags");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceInfoAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceInfoAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceInfoAllOf is not found in the empty JSON string", ServiceInfoAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceInfoAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("supported_wes_versions") != null && !jsonObj.get("supported_wes_versions").isJsonNull()) && !jsonObj.get("supported_wes_versions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_wes_versions` to be an array in the JSON string but got `%s`", jsonObj.get("supported_wes_versions").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("supported_filesystem_protocols") != null && !jsonObj.get("supported_filesystem_protocols").isJsonNull()) && !jsonObj.get("supported_filesystem_protocols").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_filesystem_protocols` to be an array in the JSON string but got `%s`", jsonObj.get("supported_filesystem_protocols").toString()));
      }
      JsonArray jsonArraydefaultWorkflowEngineParameters = jsonObj.getAsJsonArray("default_workflow_engine_parameters");
      if (jsonArraydefaultWorkflowEngineParameters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("default_workflow_engine_parameters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `default_workflow_engine_parameters` to be an array in the JSON string but got `%s`", jsonObj.get("default_workflow_engine_parameters").toString()));
        }

        // validate the optional field `default_workflow_engine_parameters` (array)
        for (int i = 0; i < jsonArraydefaultWorkflowEngineParameters.size(); i++) {
          DefaultWorkflowEngineParameter.validateJsonObject(jsonArraydefaultWorkflowEngineParameters.get(i).getAsJsonObject());
        };
      }
      if ((jsonObj.get("auth_instructions_url") != null && !jsonObj.get("auth_instructions_url").isJsonNull()) && !jsonObj.get("auth_instructions_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_instructions_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_instructions_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceInfoAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceInfoAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceInfoAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceInfoAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceInfoAllOf>() {
           @Override
           public void write(JsonWriter out, ServiceInfoAllOf value) throws IOException {
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
           public ServiceInfoAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceInfoAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceInfoAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceInfoAllOf
  * @throws IOException if the JSON string is invalid with respect to ServiceInfoAllOf
  */
  public static ServiceInfoAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceInfoAllOf.class);
  }

 /**
  * Convert an instance of ServiceInfoAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

