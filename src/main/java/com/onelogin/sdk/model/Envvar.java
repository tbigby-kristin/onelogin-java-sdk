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
 * Envvar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T10:01:18.133614-08:00[America/Los_Angeles]")
public class Envvar {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public Envvar() {
  }

  public Envvar id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the Hook Environment Variable
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the Hook Environment Variable")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Envvar name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the environment variable.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the environment variable.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Envvar createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO8601 formatted date that the environment variable was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO8601 formatted date that the environment variable was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Envvar updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The ISO8601 formatted date that the environment variable was last updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO8601 formatted date that the environment variable was last updated.")

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
    Envvar envvar = (Envvar) o;
    return Objects.equals(this.id, envvar.id) &&
        Objects.equals(this.name, envvar.name) &&
        Objects.equals(this.createdAt, envvar.createdAt) &&
        Objects.equals(this.updatedAt, envvar.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Envvar {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Envvar
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Envvar.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Envvar is not found in the empty JSON string", Envvar.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Envvar.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Envvar` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
       if (!Envvar.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Envvar' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Envvar> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Envvar.class));

       return (TypeAdapter<T>) new TypeAdapter<Envvar>() {
           @Override
           public void write(JsonWriter out, Envvar value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Envvar read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Envvar given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Envvar
  * @throws IOException if the JSON string is invalid with respect to Envvar
  */
  public static Envvar fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Envvar.class);
  }

 /**
  * Convert an instance of Envvar to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

