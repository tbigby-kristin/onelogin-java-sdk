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
 * V1VerifyFactorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T10:01:18.133614-08:00[America/Los_Angeles]")
public class V1VerifyFactorRequest {
  public static final String SERIALIZED_NAME_DEVICE_ID = "device_id";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_STATE_TOKEN = "state_token";
  @SerializedName(SERIALIZED_NAME_STATE_TOKEN)
  private String stateToken;

  public static final String SERIALIZED_NAME_OTP_TOKEN = "otp_token";
  @SerializedName(SERIALIZED_NAME_OTP_TOKEN)
  private String otpToken;

  public static final String SERIALIZED_NAME_DO_NOT_NOTIFY = "do_not_notify";
  @SerializedName(SERIALIZED_NAME_DO_NOT_NOTIFY)
  private Boolean doNotNotify;

  public V1VerifyFactorRequest() {
  }

  public V1VerifyFactorRequest deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Provide the MFA device_id you are submitting for verification. The device_id is supplied by the Create Session Login Token API
   * @return deviceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Provide the MFA device_id you are submitting for verification. The device_id is supplied by the Create Session Login Token API")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public V1VerifyFactorRequest stateToken(String stateToken) {
    
    this.stateToken = stateToken;
    return this;
  }

   /**
   * Token of MFA device_id you are submitting for verification. The state_token is supplied by the Create Session Login Token API.
   * @return stateToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Token of MFA device_id you are submitting for verification. The state_token is supplied by the Create Session Login Token API.")

  public String getStateToken() {
    return stateToken;
  }


  public void setStateToken(String stateToken) {
    this.stateToken = stateToken;
  }


  public V1VerifyFactorRequest otpToken(String otpToken) {
    
    this.otpToken = otpToken;
    return this;
  }

   /**
   * Provide the OTP value for the MFA factor you are submitting for verification.
   * @return otpToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provide the OTP value for the MFA factor you are submitting for verification.")

  public String getOtpToken() {
    return otpToken;
  }


  public void setOtpToken(String otpToken) {
    this.otpToken = otpToken;
  }


  public V1VerifyFactorRequest doNotNotify(Boolean doNotNotify) {
    
    this.doNotNotify = doNotNotify;
    return this;
  }

   /**
   * When verifying MFA via Protect Push, true stops additional push notifications being sent to the OneLogin Protect device.
   * @return doNotNotify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When verifying MFA via Protect Push, true stops additional push notifications being sent to the OneLogin Protect device.")

  public Boolean getDoNotNotify() {
    return doNotNotify;
  }


  public void setDoNotNotify(Boolean doNotNotify) {
    this.doNotNotify = doNotNotify;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VerifyFactorRequest v1VerifyFactorRequest = (V1VerifyFactorRequest) o;
    return Objects.equals(this.deviceId, v1VerifyFactorRequest.deviceId) &&
        Objects.equals(this.stateToken, v1VerifyFactorRequest.stateToken) &&
        Objects.equals(this.otpToken, v1VerifyFactorRequest.otpToken) &&
        Objects.equals(this.doNotNotify, v1VerifyFactorRequest.doNotNotify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, stateToken, otpToken, doNotNotify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VerifyFactorRequest {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    stateToken: ").append(toIndentedString(stateToken)).append("\n");
    sb.append("    otpToken: ").append(toIndentedString(otpToken)).append("\n");
    sb.append("    doNotNotify: ").append(toIndentedString(doNotNotify)).append("\n");
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
    openapiFields.add("device_id");
    openapiFields.add("state_token");
    openapiFields.add("otp_token");
    openapiFields.add("do_not_notify");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device_id");
    openapiRequiredFields.add("state_token");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1VerifyFactorRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (V1VerifyFactorRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1VerifyFactorRequest is not found in the empty JSON string", V1VerifyFactorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1VerifyFactorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1VerifyFactorRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1VerifyFactorRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("device_id") != null && !jsonObj.get("device_id").isJsonNull()) && !jsonObj.get("device_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_id").toString()));
      }
      if ((jsonObj.get("state_token") != null && !jsonObj.get("state_token").isJsonNull()) && !jsonObj.get("state_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_token").toString()));
      }
      if ((jsonObj.get("otp_token") != null && !jsonObj.get("otp_token").isJsonNull()) && !jsonObj.get("otp_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otp_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otp_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1VerifyFactorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1VerifyFactorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1VerifyFactorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1VerifyFactorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<V1VerifyFactorRequest>() {
           @Override
           public void write(JsonWriter out, V1VerifyFactorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1VerifyFactorRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1VerifyFactorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1VerifyFactorRequest
  * @throws IOException if the JSON string is invalid with respect to V1VerifyFactorRequest
  */
  public static V1VerifyFactorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1VerifyFactorRequest.class);
  }

 /**
  * Convert an instance of V1VerifyFactorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

