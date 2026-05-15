package org.egov.swservice.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.egov.tracer.annotations.CustomSafeHtml;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoadCuttingInfo {

  @CustomSafeHtml
  @JsonProperty("id")
  private String id ;

  @CustomSafeHtml
  @JsonProperty("roadType")
  private String roadType = null;

  @JsonProperty("roadCuttingArea")
  private Float roadCuttingArea = null;

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails;

  @JsonProperty("status")
  private Status status;
}

