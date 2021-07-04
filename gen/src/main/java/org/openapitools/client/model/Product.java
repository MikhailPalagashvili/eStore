/*
 * Sample Ecommerce App
 * 'This is a ***sample ecommerce app API***.  You can find out more about Swagger at [swagger.io](http://swagger.io). Description supports markdown markup. For example, you can use the `inline code` using back ticks.' 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: mikhailpala@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.Tag;

/**
 * Product information
 */
@ApiModel(description = "Product information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-01T09:18:01.804521400-04:00[America/New_York]")
public class Product {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private java.math.BigDecimal price = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<Tag> tag = null;


  public Product id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Product identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Product name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Product Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Product description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Prodcut&#39;s description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prodcut's description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Product imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Product image&#39;s URL
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product image's URL")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Product price(java.math.BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Product price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product price")

  public java.math.BigDecimal getPrice() {
    return price;
  }


  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }


  public Product count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Product count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product count")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public Product tag(List<Tag> tag) {
    
    this.tag = tag;
    return this;
  }

  public Product addTagItem(Tag tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<Tag>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Tags associated with the product
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags associated with the product")

  public List<Tag> getTag() {
    return tag;
  }


  public void setTag(List<Tag> tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.imageUrl, product.imageUrl) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.count, product.count) &&
        Objects.equals(this.tag, product.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, imageUrl, price, count, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

}
