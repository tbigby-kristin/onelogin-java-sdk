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
 * GetScoreInsights200ResponseScores
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T10:01:18.133614-08:00[America/Los_Angeles]")
public class GetScoreInsights200ResponseScores {
  public static final String SERIALIZED_NAME_MINIMAL = "minimal";
  @SerializedName(SERIALIZED_NAME_MINIMAL)
  private Integer minimal;

  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private Integer low;

  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Integer medium;

  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private Integer high;

  public static final String SERIALIZED_NAME_VERY_HIGH = "very_high";
  @SerializedName(SERIALIZED_NAME_VERY_HIGH)
  private Integer veryHigh;

  public GetScoreInsights200ResponseScores() {
  }

  public GetScoreInsights200ResponseScores minimal(Integer minimal) {
    
    this.minimal = minimal;
    return this;
  }

   /**
   * Get minimal
   * @return minimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinimal() {
    return minimal;
  }


  public void setMinimal(Integer minimal) {
    this.minimal = minimal;
  }


  public GetScoreInsights200ResponseScores low(Integer low) {
    
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLow() {
    return low;
  }


  public void setLow(Integer low) {
    this.low = low;
  }


  public GetScoreInsights200ResponseScores medium(Integer medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMedium() {
    return medium;
  }


  public void setMedium(Integer medium) {
    this.medium = medium;
  }


  public GetScoreInsights200ResponseScores high(Integer high) {
    
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHigh() {
    return high;
  }


  public void setHigh(Integer high) {
    this.high = high;
  }


  public GetScoreInsights200ResponseScores veryHigh(Integer veryHigh) {
    
    this.veryHigh = veryHigh;
    return this;
  }

   /**
   * Get veryHigh
   * @return veryHigh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVeryHigh() {
    return veryHigh;
  }


  public void setVeryHigh(Integer veryHigh) {
    this.veryHigh = veryHigh;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetScoreInsights200ResponseScores getScoreInsights200ResponseScores = (GetScoreInsights200ResponseScores) o;
    return Objects.equals(this.minimal, getScoreInsights200ResponseScores.minimal) &&
        Objects.equals(this.low, getScoreInsights200ResponseScores.low) &&
        Objects.equals(this.medium, getScoreInsights200ResponseScores.medium) &&
        Objects.equals(this.high, getScoreInsights200ResponseScores.high) &&
        Objects.equals(this.veryHigh, getScoreInsights200ResponseScores.veryHigh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimal, low, medium, high, veryHigh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScoreInsights200ResponseScores {\n");
    sb.append("    minimal: ").append(toIndentedString(minimal)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    veryHigh: ").append(toIndentedString(veryHigh)).append("\n");
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
    openapiFields.add("minimal");
    openapiFields.add("low");
    openapiFields.add("medium");
    openapiFields.add("high");
    openapiFields.add("very_high");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetScoreInsights200ResponseScores
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetScoreInsights200ResponseScores.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetScoreInsights200ResponseScores is not found in the empty JSON string", GetScoreInsights200ResponseScores.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetScoreInsights200ResponseScores.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetScoreInsights200ResponseScores` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetScoreInsights200ResponseScores.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetScoreInsights200ResponseScores' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetScoreInsights200ResponseScores> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetScoreInsights200ResponseScores.class));

       return (TypeAdapter<T>) new TypeAdapter<GetScoreInsights200ResponseScores>() {
           @Override
           public void write(JsonWriter out, GetScoreInsights200ResponseScores value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetScoreInsights200ResponseScores read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetScoreInsights200ResponseScores given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetScoreInsights200ResponseScores
  * @throws IOException if the JSON string is invalid with respect to GetScoreInsights200ResponseScores
  */
  public static GetScoreInsights200ResponseScores fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetScoreInsights200ResponseScores.class);
  }

 /**
  * Convert an instance of GetScoreInsights200ResponseScores to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

