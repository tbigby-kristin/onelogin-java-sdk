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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * GenerateMfaToken200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T10:01:18.133614-08:00[America/Los_Angeles]")
public class GenerateMfaToken200Response {
  public static final String SERIALIZED_NAME_MFA_TOKEN = "mfa_token";
  @SerializedName(SERIALIZED_NAME_MFA_TOKEN)
  private String mfaToken;

  public static final String SERIALIZED_NAME_REUSABLE = "reusable";
  @SerializedName(SERIALIZED_NAME_REUSABLE)
  private Boolean reusable;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_DEVICE_ID = "device_id";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public GenerateMfaToken200Response() {
  }

  public GenerateMfaToken200Response mfaToken(String mfaToken) {
    
    this.mfaToken = mfaToken;
    return this;
  }

   /**
   * Token can function as a temporary MFA token. It can be used to authenticate for any app when valid.
   * @return mfaToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token can function as a temporary MFA token. It can be used to authenticate for any app when valid.")

  public String getMfaToken() {
    return mfaToken;
  }


  public void setMfaToken(String mfaToken) {
    this.mfaToken = mfaToken;
  }


  public GenerateMfaToken200Response reusable(Boolean reusable) {
    
    this.reusable = reusable;
    return this;
  }

   /**
   * true indcates the token can be used multiple times. false indicates the token is invalid after a single use
   * @return reusable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true indcates the token can be used multiple times. false indicates the token is invalid after a single use")

  public Boolean getReusable() {
    return reusable;
  }


  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  public GenerateMfaToken200Response expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Defines the expiration time and date for the token. Format is UTC time.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the expiration time and date for the token. Format is UTC time.")

  public String getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public GenerateMfaToken200Response deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Defines the expiration time and date for the token. Format is UTC time.
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the expiration time and date for the token. Format is UTC time.")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateMfaToken200Response generateMfaToken200Response = (GenerateMfaToken200Response) o;
    return Objects.equals(this.mfaToken, generateMfaToken200Response.mfaToken) &&
        Objects.equals(this.reusable, generateMfaToken200Response.reusable) &&
        Objects.equals(this.expiresAt, generateMfaToken200Response.expiresAt) &&
        Objects.equals(this.deviceId, generateMfaToken200Response.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mfaToken, reusable, expiresAt, deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateMfaToken200Response {\n");
    sb.append("    mfaToken: ").append(toIndentedString(mfaToken)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
    openapiFields.add("mfa_token");
    openapiFields.add("reusable");
    openapiFields.add("expires_at");
    openapiFields.add("device_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateMfaToken200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GenerateMfaToken200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateMfaToken200Response is not found in the empty JSON string", GenerateMfaToken200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenerateMfaToken200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateMfaToken200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("mfa_token") != null && !jsonObj.get("mfa_token").isJsonNull()) && !jsonObj.get("mfa_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mfa_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mfa_token").toString()));
      }
      if ((jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()) && !jsonObj.get("expires_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_at").toString()));
      }
      if ((jsonObj.get("device_id") != null && !jsonObj.get("device_id").isJsonNull()) && !jsonObj.get("device_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateMfaToken200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateMfaToken200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateMfaToken200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateMfaToken200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateMfaToken200Response>() {
           @Override
           public void write(JsonWriter out, GenerateMfaToken200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateMfaToken200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateMfaToken200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateMfaToken200Response
  * @throws IOException if the JSON string is invalid with respect to GenerateMfaToken200Response
  */
  public static GenerateMfaToken200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateMfaToken200Response.class);
  }

 /**
  * Convert an instance of GenerateMfaToken200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
