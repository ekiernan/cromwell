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
import cromwell.client.model.ServiceOrganization;
import cromwell.client.model.ServiceType;
import cromwell.client.model.WorkflowTypeVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * ServiceInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T15:48:40.234026Z[Etc/UTC]")
public class ServiceInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ServiceType type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private ServiceOrganization organization;

  public static final String SERIALIZED_NAME_CONTACT_URL = "contactUrl";
  @SerializedName(SERIALIZED_NAME_CONTACT_URL)
  private URI contactUrl;

  public static final String SERIALIZED_NAME_DOCUMENTATION_URL = "documentationUrl";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION_URL)
  private URI documentationUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

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

  public ServiceInfo() {
  }

  public ServiceInfo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of this service. Reverse domain name notation is recommended, though not required. The identifier should attempt to be globally unique so it can be used in downstream aggregator services e.g. Service Registry.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "org.ga4gh.myservice", required = true, value = "Unique ID of this service. Reverse domain name notation is recommended, though not required. The identifier should attempt to be globally unique so it can be used in downstream aggregator services e.g. Service Registry.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ServiceInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of this service. Should be human readable.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My project", required = true, value = "Name of this service. Should be human readable.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServiceInfo type(ServiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ServiceType getType() {
    return type;
  }


  public void setType(ServiceType type) {
    this.type = type;
  }


  public ServiceInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the service. Should be human readable and provide information about the service.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This service provides...", value = "Description of the service. Should be human readable and provide information about the service.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceInfo organization(ServiceOrganization organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ServiceOrganization getOrganization() {
    return organization;
  }


  public void setOrganization(ServiceOrganization organization) {
    this.organization = organization;
  }


  public ServiceInfo contactUrl(URI contactUrl) {
    
    this.contactUrl = contactUrl;
    return this;
  }

   /**
   * URL of the contact for the provider of this service, e.g. a link to a contact form (RFC 3986 format), or an email (RFC 2368 format).
   * @return contactUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mailto:support@example.com", value = "URL of the contact for the provider of this service, e.g. a link to a contact form (RFC 3986 format), or an email (RFC 2368 format).")

  public URI getContactUrl() {
    return contactUrl;
  }


  public void setContactUrl(URI contactUrl) {
    this.contactUrl = contactUrl;
  }


  public ServiceInfo documentationUrl(URI documentationUrl) {
    
    this.documentationUrl = documentationUrl;
    return this;
  }

   /**
   * URL of the documentation of this service (RFC 3986 format). This should help someone learn how to use your service, including any specifics required to access data, e.g. authentication.
   * @return documentationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://docs.myservice.example.com", value = "URL of the documentation of this service (RFC 3986 format). This should help someone learn how to use your service, including any specifics required to access data, e.g. authentication.")

  public URI getDocumentationUrl() {
    return documentationUrl;
  }


  public void setDocumentationUrl(URI documentationUrl) {
    this.documentationUrl = documentationUrl;
  }


  public ServiceInfo createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp describing when the service was first deployed and available (RFC 3339 format)
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-06-04T12:58:19Z", value = "Timestamp describing when the service was first deployed and available (RFC 3339 format)")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ServiceInfo updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp describing when the service was last updated (RFC 3339 format)
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-06-04T12:58:19Z", value = "Timestamp describing when the service was last updated (RFC 3339 format)")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ServiceInfo environment(String environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Environment the service is running in. Use this to distinguish between production, development and testing/staging deployments. Suggested values are prod, test, dev, staging. However this is advised and not enforced.
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "Environment the service is running in. Use this to distinguish between production, development and testing/staging deployments. Suggested values are prod, test, dev, staging. However this is advised and not enforced.")

  public String getEnvironment() {
    return environment;
  }


  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public ServiceInfo version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the service being described. Semantic versioning is recommended, but other identifiers, such as dates or commit hashes, are also allowed. The version should be changed whenever the service is updated.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.0.0", required = true, value = "Version of the service being described. Semantic versioning is recommended, but other identifiers, such as dates or commit hashes, are also allowed. The version should be changed whenever the service is updated.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ServiceInfo workflowTypeVersions(Map<String, WorkflowTypeVersion> workflowTypeVersions) {
    
    this.workflowTypeVersions = workflowTypeVersions;
    return this;
  }

  public ServiceInfo putWorkflowTypeVersionsItem(String key, WorkflowTypeVersion workflowTypeVersionsItem) {
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


  public ServiceInfo supportedWesVersions(List<String> supportedWesVersions) {
    
    this.supportedWesVersions = supportedWesVersions;
    return this;
  }

  public ServiceInfo addSupportedWesVersionsItem(String supportedWesVersionsItem) {
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


  public ServiceInfo supportedFilesystemProtocols(List<String> supportedFilesystemProtocols) {
    
    this.supportedFilesystemProtocols = supportedFilesystemProtocols;
    return this;
  }

  public ServiceInfo addSupportedFilesystemProtocolsItem(String supportedFilesystemProtocolsItem) {
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


  public ServiceInfo workflowEngineVersions(Map<String, String> workflowEngineVersions) {
    
    this.workflowEngineVersions = workflowEngineVersions;
    return this;
  }

  public ServiceInfo putWorkflowEngineVersionsItem(String key, String workflowEngineVersionsItem) {
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


  public ServiceInfo defaultWorkflowEngineParameters(List<DefaultWorkflowEngineParameter> defaultWorkflowEngineParameters) {
    
    this.defaultWorkflowEngineParameters = defaultWorkflowEngineParameters;
    return this;
  }

  public ServiceInfo addDefaultWorkflowEngineParametersItem(DefaultWorkflowEngineParameter defaultWorkflowEngineParametersItem) {
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


  public ServiceInfo systemStateCounts(Map<String, Long> systemStateCounts) {
    
    this.systemStateCounts = systemStateCounts;
    return this;
  }

  public ServiceInfo putSystemStateCountsItem(String key, Long systemStateCountsItem) {
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


  public ServiceInfo authInstructionsUrl(String authInstructionsUrl) {
    
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


  public ServiceInfo tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ServiceInfo putTagsItem(String key, String tagsItem) {
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
  public ServiceInfo putAdditionalProperty(String key, Object value) {
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
    ServiceInfo serviceInfo = (ServiceInfo) o;
    return Objects.equals(this.id, serviceInfo.id) &&
        Objects.equals(this.name, serviceInfo.name) &&
        Objects.equals(this.type, serviceInfo.type) &&
        Objects.equals(this.description, serviceInfo.description) &&
        Objects.equals(this.organization, serviceInfo.organization) &&
        Objects.equals(this.contactUrl, serviceInfo.contactUrl) &&
        Objects.equals(this.documentationUrl, serviceInfo.documentationUrl) &&
        Objects.equals(this.createdAt, serviceInfo.createdAt) &&
        Objects.equals(this.updatedAt, serviceInfo.updatedAt) &&
        Objects.equals(this.environment, serviceInfo.environment) &&
        Objects.equals(this.version, serviceInfo.version) &&
        Objects.equals(this.workflowTypeVersions, serviceInfo.workflowTypeVersions) &&
        Objects.equals(this.supportedWesVersions, serviceInfo.supportedWesVersions) &&
        Objects.equals(this.supportedFilesystemProtocols, serviceInfo.supportedFilesystemProtocols) &&
        Objects.equals(this.workflowEngineVersions, serviceInfo.workflowEngineVersions) &&
        Objects.equals(this.defaultWorkflowEngineParameters, serviceInfo.defaultWorkflowEngineParameters) &&
        Objects.equals(this.systemStateCounts, serviceInfo.systemStateCounts) &&
        Objects.equals(this.authInstructionsUrl, serviceInfo.authInstructionsUrl) &&
        Objects.equals(this.tags, serviceInfo.tags)&&
        Objects.equals(this.additionalProperties, serviceInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, description, organization, contactUrl, documentationUrl, createdAt, updatedAt, environment, version, workflowTypeVersions, supportedWesVersions, supportedFilesystemProtocols, workflowEngineVersions, defaultWorkflowEngineParameters, systemStateCounts, authInstructionsUrl, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    contactUrl: ").append(toIndentedString(contactUrl)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("description");
    openapiFields.add("organization");
    openapiFields.add("contactUrl");
    openapiFields.add("documentationUrl");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("environment");
    openapiFields.add("version");
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
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("organization");
    openapiRequiredFields.add("version");
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
  * @throws IOException if the JSON Object is invalid with respect to ServiceInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceInfo is not found in the empty JSON string", ServiceInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        ServiceType.validateJsonObject(jsonObj.getAsJsonObject("type"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `organization`
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) {
        ServiceOrganization.validateJsonObject(jsonObj.getAsJsonObject("organization"));
      }
      if ((jsonObj.get("contactUrl") != null && !jsonObj.get("contactUrl").isJsonNull()) && !jsonObj.get("contactUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactUrl").toString()));
      }
      if ((jsonObj.get("documentationUrl") != null && !jsonObj.get("documentationUrl").isJsonNull()) && !jsonObj.get("documentationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentationUrl").toString()));
      }
      if ((jsonObj.get("environment") != null && !jsonObj.get("environment").isJsonNull()) && !jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
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
       if (!ServiceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceInfo>() {
           @Override
           public void write(JsonWriter out, ServiceInfo value) throws IOException {
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
           public ServiceInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceInfo
  * @throws IOException if the JSON string is invalid with respect to ServiceInfo
  */
  public static ServiceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceInfo.class);
  }

 /**
  * Convert an instance of ServiceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

