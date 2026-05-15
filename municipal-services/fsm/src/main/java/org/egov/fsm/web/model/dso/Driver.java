package org.egov.fsm.web.model.dso;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.egov.fsm.web.model.AuditDetails;
import org.egov.fsm.web.model.user.User;
import org.egov.tracer.annotations.CustomSafeHtml;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Capture the Driver information in the system.
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-06T05:34:12.238Z[GMT]")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Driver {

	@CustomSafeHtml
	@JsonProperty("id")
	private String id;

	@JsonProperty("tenantId")
	@CustomSafeHtml
	@Size(max = 64)
	private String tenantId;

	@JsonProperty("name")
	@CustomSafeHtml
	@Size(max = 128)
	private String name;

	@JsonProperty("owner")
	@Valid
	private User owner;

	@JsonProperty("ownerId")
	@CustomSafeHtml
	@Size(max = 64)
	private String ownerId;

	@JsonProperty("additionalDetails")
	private Object additionalDetails;

	@CustomSafeHtml
	@JsonProperty("description")
	private String description;

	@CustomSafeHtml
	@JsonProperty("licenseNumber")
	private String licenseNumber;

	@JsonProperty("vendor")
	@Valid
	private Vendor vendor;

	/**
	 * Inactive records will be consider as soft deleted
	 */
	public enum StatusEnum {
		ACTIVE("ACTIVE"), INACTIVE("INACTIVE"), DISABLED("DISABLED");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {

			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("status")
	private StatusEnum status;

	@JsonProperty("auditDetails")
	private AuditDetails auditDetails;

	@JsonProperty("vendorDriverStatus")
	private StatusEnum vendorDriverStatus;

}
