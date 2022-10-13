package org.wso2.apk.apimgt.rest.api.publisher.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;



public class SubscriberInfoDTO   {
  
    private String name = null;
    private List<ClaimDTO> claims = new ArrayList<ClaimDTO>();

  /**
   **/
  public SubscriberInfoDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "admin", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public SubscriberInfoDTO claims(List<ClaimDTO> claims) {
    this.claims = claims;
    return this;
  }

  
  @ApiModelProperty(value = "")
      @Valid
  @JsonProperty("claims")
  public List<ClaimDTO> getClaims() {
    return claims;
  }
  public void setClaims(List<ClaimDTO> claims) {
    this.claims = claims;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberInfoDTO subscriberInfo = (SubscriberInfoDTO) o;
    return Objects.equals(name, subscriberInfo.name) &&
        Objects.equals(claims, subscriberInfo.claims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, claims);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberInfoDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
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
