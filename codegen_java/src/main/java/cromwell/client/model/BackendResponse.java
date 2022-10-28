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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * BackendResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T17:59:53.222573Z[Etc/UTC]")
public class BackendResponse {
  public static final String SERIALIZED_NAME_SUPPORTED_BACKENDS = "supportedBackends";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_BACKENDS)
  private List<String> supportedBackends = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEFAULT_BACKEND = "defaultBackend";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BACKEND)
  private String defaultBackend;

  public BackendResponse() {
  }

  public BackendResponse supportedBackends(List<String> supportedBackends) {
    
    this.supportedBackends = supportedBackends;
    return this;
  }

  public BackendResponse addSupportedBackendsItem(String supportedBackendsItem) {
    this.supportedBackends.add(supportedBackendsItem);
    return this;
  }

   /**
   * The backends supported by this server
   * @return supportedBackends
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The backends supported by this server")

  public List<String> getSupportedBackends() {
    return supportedBackends;
  }


  public void setSupportedBackends(List<String> supportedBackends) {
    this.supportedBackends = supportedBackends;
  }


  public BackendResponse defaultBackend(String defaultBackend) {
    
    this.defaultBackend = defaultBackend;
    return this;
  }

   /**
   * The default backend of this server
   * @return defaultBackend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The default backend of this server")

  public String getDefaultBackend() {
    return defaultBackend;
  }


  public void setDefaultBackend(String defaultBackend) {
    this.defaultBackend = defaultBackend;
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
  public BackendResponse putAdditionalProperty(String key, Object value) {
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
    BackendResponse backendResponse = (BackendResponse) o;
    return Objects.equals(this.supportedBackends, backendResponse.supportedBackends) &&
        Objects.equals(this.defaultBackend, backendResponse.defaultBackend)&&
        Objects.equals(this.additionalProperties, backendResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedBackends, defaultBackend, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackendResponse {\n");
    sb.append("    supportedBackends: ").append(toIndentedString(supportedBackends)).append("\n");
    sb.append("    defaultBackend: ").append(toIndentedString(defaultBackend)).append("\n");
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
    openapiFields.add("supportedBackends");
    openapiFields.add("defaultBackend");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("supportedBackends");
    openapiRequiredFields.add("defaultBackend");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BackendResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BackendResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BackendResponse is not found in the empty JSON string", BackendResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BackendResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("supportedBackends") != null && !jsonObj.get("supportedBackends").isJsonNull()) && !jsonObj.get("supportedBackends").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedBackends` to be an array in the JSON string but got `%s`", jsonObj.get("supportedBackends").toString()));
      }
      if ((jsonObj.get("defaultBackend") != null && !jsonObj.get("defaultBackend").isJsonNull()) && !jsonObj.get("defaultBackend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultBackend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultBackend").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BackendResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BackendResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BackendResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BackendResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BackendResponse>() {
           @Override
           public void write(JsonWriter out, BackendResponse value) throws IOException {
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
           public BackendResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BackendResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BackendResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BackendResponse
  * @throws IOException if the JSON string is invalid with respect to BackendResponse
  */
  public static BackendResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BackendResponse.class);
  }

 /**
  * Convert an instance of BackendResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

