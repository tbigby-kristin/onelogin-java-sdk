/*
 * OneLogin API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onelogin.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.onelogin.sdk.model.HookConditionsInner;
import com.onelogin.sdk.model.HookOptions;
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

import com.onelogin.sdk.JSON;

/**
 * Hook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T10:01:18.133614-08:00[America/Los_Angeles]")
public class Hook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = true;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout = 1;

  public static final String SERIALIZED_NAME_ENV_VARS = "env_vars";
  @SerializedName(SERIALIZED_NAME_ENV_VARS)
  private List<String> envVars = new ArrayList<>();

  public static final String SERIALIZED_NAME_RUNTIME = "runtime";
  @SerializedName(SERIALIZED_NAME_RUNTIME)
  private String runtime;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries = 0;

  public static final String SERIALIZED_NAME_PACKAGES = "packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private Object packages;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private String function;

  public static final String SERIALIZED_NAME_CONTEXT_VERSION = "context_version";
  @SerializedName(SERIALIZED_NAME_CONTEXT_VERSION)
  private String contextVersion;

  /**
   * String describing the state of the hook function. When a hook is ready and disabled is false it will be executed.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    READY("ready"),
    
    CREATE_QUEUED("create-queued"),
    
    CREATE_RUNNING("create-running"),
    
    CREATE_FAILED("create-failed"),
    
    UPDATE_QUEUED("update-queued"),
    
    UPDATE_RUNNING("update-running"),
    
    UPDATE_FAILED("update-failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private HookOptions options;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<HookConditionsInner> conditions = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public Hook() {
  }

  public Hook id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Hook unique ID in OneLogin.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Hook unique ID in OneLogin.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Hook type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A string describing the type of hook. e.g. &#x60;pre-authentication&#x60;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A string describing the type of hook. e.g. `pre-authentication`")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Hook disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Boolean to enable or disable the hook. Disabled hooks will not run.
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Boolean to enable or disable the hook. Disabled hooks will not run.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public Hook timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * The number of seconds to allow the hook function to run before before timing out. Maximum timeout varies based on the type of hook.
   * @return timeout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of seconds to allow the hook function to run before before timing out. Maximum timeout varies based on the type of hook.")

  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public Hook envVars(List<String> envVars) {
    
    this.envVars = envVars;
    return this;
  }

  public Hook addEnvVarsItem(String envVarsItem) {
    this.envVars.add(envVarsItem);
    return this;
  }

   /**
   * Environment Variable objects that will be available via process.env.ENV_VAR_NAME in the hook code.
   * @return envVars
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Environment Variable objects that will be available via process.env.ENV_VAR_NAME in the hook code.")

  public List<String> getEnvVars() {
    return envVars;
  }


  public void setEnvVars(List<String> envVars) {
    this.envVars = envVars;
  }


  public Hook runtime(String runtime) {
    
    this.runtime = runtime;
    return this;
  }

   /**
   * The Smart Hooks supported Node.js version to execute this hook with.
   * @return runtime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Smart Hooks supported Node.js version to execute this hook with.")

  public String getRuntime() {
    return runtime;
  }


  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }


  public Hook retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * Number of retries if execution fails.
   * maximum: 4
   * @return retries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of retries if execution fails.")

  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public Hook packages(Object packages) {
    
    this.packages = packages;
    return this;
  }

   /**
   * An object containing NPM packages that are bundled with the hook function.
   * @return packages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An object containing NPM packages that are bundled with the hook function.")

  public Object getPackages() {
    return packages;
  }


  public void setPackages(Object packages) {
    this.packages = packages;
  }


  public Hook function(String function) {
    
    this.function = function;
    return this;
  }

   /**
   * A base64 encoded string containing the javascript function code.
   * @return function
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A base64 encoded string containing the javascript function code.")

  public String getFunction() {
    return function;
  }


  public void setFunction(String function) {
    this.function = function;
  }


  public Hook contextVersion(String contextVersion) {
    
    this.contextVersion = contextVersion;
    return this;
  }

   /**
   * The semantic version of the content that will be injected into this hook.
   * @return contextVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The semantic version of the content that will be injected into this hook.")

  public String getContextVersion() {
    return contextVersion;
  }


  public void setContextVersion(String contextVersion) {
    this.contextVersion = contextVersion;
  }


  public Hook status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * String describing the state of the hook function. When a hook is ready and disabled is false it will be executed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String describing the state of the hook function. When a hook is ready and disabled is false it will be executed.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Hook options(HookOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HookOptions getOptions() {
    return options;
  }


  public void setOptions(HookOptions options) {
    this.options = options;
  }


  public Hook conditions(List<HookConditionsInner> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public Hook addConditionsItem(HookConditionsInner conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * An array of objects that let you limit the execution of a hook to users in specific roles.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects that let you limit the execution of a hook to users in specific roles.")

  public List<HookConditionsInner> getConditions() {
    return conditions;
  }


  public void setConditions(List<HookConditionsInner> conditions) {
    this.conditions = conditions;
  }


  public Hook createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO8601 format date that they hook function was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 format date that they hook function was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Hook updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO8601 format date that they hook function was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 format date that they hook function was last updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hook hook = (Hook) o;
    return Objects.equals(this.id, hook.id) &&
        Objects.equals(this.type, hook.type) &&
        Objects.equals(this.disabled, hook.disabled) &&
        Objects.equals(this.timeout, hook.timeout) &&
        Objects.equals(this.envVars, hook.envVars) &&
        Objects.equals(this.runtime, hook.runtime) &&
        Objects.equals(this.retries, hook.retries) &&
        Objects.equals(this.packages, hook.packages) &&
        Objects.equals(this.function, hook.function) &&
        Objects.equals(this.contextVersion, hook.contextVersion) &&
        Objects.equals(this.status, hook.status) &&
        Objects.equals(this.options, hook.options) &&
        Objects.equals(this.conditions, hook.conditions) &&
        Objects.equals(this.createdAt, hook.createdAt) &&
        Objects.equals(this.updatedAt, hook.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, disabled, timeout, envVars, runtime, retries, packages, function, contextVersion, status, options, conditions, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    contextVersion: ").append(toIndentedString(contextVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("disabled");
    openapiFields.add("timeout");
    openapiFields.add("env_vars");
    openapiFields.add("runtime");
    openapiFields.add("retries");
    openapiFields.add("packages");
    openapiFields.add("function");
    openapiFields.add("context_version");
    openapiFields.add("status");
    openapiFields.add("options");
    openapiFields.add("conditions");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("disabled");
    openapiRequiredFields.add("timeout");
    openapiRequiredFields.add("env_vars");
    openapiRequiredFields.add("runtime");
    openapiRequiredFields.add("retries");
    openapiRequiredFields.add("packages");
    openapiRequiredFields.add("function");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Hook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Hook.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Hook is not found in the empty JSON string", Hook.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Hook.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Hook` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Hook.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("env_vars") != null && !jsonObj.get("env_vars").isJsonNull()) && !jsonObj.get("env_vars").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `env_vars` to be an array in the JSON string but got `%s`", jsonObj.get("env_vars").toString()));
      }
      if ((jsonObj.get("runtime") != null && !jsonObj.get("runtime").isJsonNull()) && !jsonObj.get("runtime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runtime").toString()));
      }
      if ((jsonObj.get("function") != null && !jsonObj.get("function").isJsonNull()) && !jsonObj.get("function").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `function` to be a primitive type in the JSON string but got `%s`", jsonObj.get("function").toString()));
      }
      if ((jsonObj.get("context_version") != null && !jsonObj.get("context_version").isJsonNull()) && !jsonObj.get("context_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `context_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("context_version").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        HookOptions.validateJsonObject(jsonObj.getAsJsonObject("options"));
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            HookConditionsInner.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Hook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Hook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Hook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Hook.class));

       return (TypeAdapter<T>) new TypeAdapter<Hook>() {
           @Override
           public void write(JsonWriter out, Hook value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Hook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Hook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Hook
  * @throws IOException if the JSON string is invalid with respect to Hook
  */
  public static Hook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Hook.class);
  }

 /**
  * Convert an instance of Hook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

