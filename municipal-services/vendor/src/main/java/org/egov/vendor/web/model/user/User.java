package org.egov.vendor.web.model.user;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.egov.common.contract.request.Role;
import org.egov.tracer.annotations.CustomSafeHtml;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Validated
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	@JsonProperty("id")
    private Long id;

    @Size(max=64)
    @CustomSafeHtml
    @JsonProperty("uuid")
    private String uuid;

    @Size(max=64)
    @CustomSafeHtml
    @JsonProperty("userName")
    private String userName;

    @Size(max=64)
    @CustomSafeHtml
    @JsonProperty("password")
    private String password;

    @CustomSafeHtml
    @JsonProperty("salutation")
    private String salutation;

    @NotNull
    @CustomSafeHtml
    @Size(max=100)
    @Pattern(regexp = "^[a-zA-Z0-9 \\-'`\\.]*$", message = "Invalid name. Only alphabets and special characters -, ',`, .")
    @JsonProperty("name")
    private String name;

    @NotNull
    @CustomSafeHtml
    @JsonProperty("gender")
    private String gender;

    // @NotNull
    @CustomSafeHtml
   // @Pattern(regexp = "^[0-9]{10}$", message = "MobileNumber should be 10 digit number")
    @JsonProperty("mobileNumber")
    private String mobileNumber;

    @Size(max=128)
    @CustomSafeHtml
    @JsonProperty("emailId")
    private String emailId;

    @Size(max=50)
    @CustomSafeHtml
    @JsonProperty("altContactNumber")
    private String altContactNumber;

    @Size(max=10)
    @CustomSafeHtml
    @JsonProperty("pan")
    private String pan;

    @CustomSafeHtml
    @Pattern(regexp = "^[0-9]{12}$", message = "AdharNumber should be 12 digit number")
    @JsonProperty("aadhaarNumber")
    private String aadhaarNumber;

    @Size(max=300)
    @CustomSafeHtml
    @JsonProperty("permanentAddress")
    private String permanentAddress;

    @Size(max=300)
    @CustomSafeHtml
    @JsonProperty("permanentCity")
    private String permanentCity;

    @Size(max=10)
    @CustomSafeHtml
    @JsonProperty("permanentPinCode")
    private String permanentPincode;

    @Size(max=300)
    @CustomSafeHtml
    @JsonProperty("correspondenceCity")
    private String correspondenceCity;

    @Size(max=10)
    @CustomSafeHtml
    @JsonProperty("correspondencePinCode")
    private String correspondencePincode;

    @Size(max=300)
    @CustomSafeHtml
    @JsonProperty("correspondenceAddress")
    private String correspondenceAddress;

    @JsonProperty("active")
    private Boolean active;

    
    @JsonProperty("dob")
    private Long dob;

    @JsonProperty("pwdExpiryDate")
    private Long pwdExpiryDate;

    @Size(max=16)
    @CustomSafeHtml
    @JsonProperty("locale")
    private String locale;

    @Size(max=50)
    @CustomSafeHtml
    @JsonProperty("type")
    private String type;

    @Size(max=36)
    @CustomSafeHtml
    @JsonProperty("signature")
    private String signature;

    @JsonProperty("accountLocked")
    private Boolean accountLocked;

    @JsonProperty("roles")
    @Valid
    private List<Role> roles;

    @CustomSafeHtml
    @Size(max=100)
    @JsonProperty("fatherOrHusbandName")
    private String fatherOrHusbandName;

    @JsonProperty("relationship")
    private GuardianRelation relationship;


    public enum GuardianRelation {
        FATHER, MOTHER, HUSBAND, OTHER;
    }
    
    @Size(max=32)
    @CustomSafeHtml
    @JsonProperty("bloodGroup")
    private String bloodGroup;

    @Size(max=300)
    @CustomSafeHtml
    @JsonProperty("identificationMark")
    private String identificationMark;

    @Size(max=36)
    @JsonProperty("photo")
    private String photo;

    @Size(max=64)
    @CustomSafeHtml
    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("createdDate")
    private Long createdDate;

    @Size(max=64)
    @CustomSafeHtml
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;

    @JsonProperty("lastModifiedDate")
    private Long lastModifiedDate;

    @CustomSafeHtml
    @JsonProperty("otpReference")
    private String otpReference;

    @Size(max=256)
    @NonNull
    @CustomSafeHtml
    @JsonProperty("tenantId")
    private String tenantId;
    
   	
}
