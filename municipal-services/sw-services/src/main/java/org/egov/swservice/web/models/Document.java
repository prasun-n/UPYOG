package org.egov.swservice.web.models;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.egov.tracer.annotations.CustomSafeHtml;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of= {"fileStoreId","documentUid","id"})
public class Document {

  @CustomSafeHtml
  @JsonProperty("id")
  private String id ;

  @JsonProperty("documentType")
  @CustomSafeHtml
  @NotNull
  private String documentType ;

  @JsonProperty("fileStoreId")
  @CustomSafeHtml
  @NotNull
  private String fileStoreId ;

  @CustomSafeHtml
  @JsonProperty("documentUid")
  private String documentUid ;

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails;

  @JsonProperty("status")
  private Status status;
}

