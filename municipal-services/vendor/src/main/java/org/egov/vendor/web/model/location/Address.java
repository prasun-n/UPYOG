package org.egov.vendor.web.model.location;

import org.egov.vendor.web.model.AuditDetails;
import org.egov.tracer.annotations.CustomSafeHtml;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Representation of a address. Indiavidual APIs may choose to extend from this
 * using allOf if more details needed to be added in their case.
 */
//@Schema(description = "Representation of a address. Indiavidual APIs may choose to extend from this using allOf if more details needed to be added in their case. ")
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-06T05:34:12.238Z[GMT]")
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Setter
@ToString
@Builder
public class Address {

	@CustomSafeHtml
	@JsonProperty("tenantId")
	private String tenantId = null;

	@CustomSafeHtml
	@JsonProperty("doorNo")
	private String doorNo = null;

	@CustomSafeHtml
	@JsonProperty("plotNo")
	private String plotNo = null;

	@CustomSafeHtml
	@JsonProperty("id")
	private String id = null;

	@CustomSafeHtml
	@JsonProperty("landmark")
	private String landmark = null;

	@CustomSafeHtml
	@JsonProperty("city")
	private String city = null;

	@CustomSafeHtml
	@JsonProperty("district")
	private String district = null;

	@CustomSafeHtml
	@JsonProperty("region")
	private String region = null;

	@CustomSafeHtml
	@JsonProperty("state")
	private String state = null;

	@CustomSafeHtml
	@JsonProperty("country")
	private String country = null;

	@CustomSafeHtml
	@JsonProperty("pincode")
	private String pincode = null;

	@JsonProperty("additionalDetails")
	private Object additionalDetails = null;

	@CustomSafeHtml
	@JsonProperty("buildingName")
	private String buildingName = null;

	@CustomSafeHtml
	@JsonProperty("street")
	private String street = null;

	@JsonProperty("locality")
	private Boundary locality = null;

	@JsonProperty("geoLocation")
	private GeoLocation geoLocation = null;

	@JsonProperty("auditDetails")
	private AuditDetails auditDetails = null;

}
