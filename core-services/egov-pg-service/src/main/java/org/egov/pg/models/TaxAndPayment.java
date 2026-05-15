package org.egov.pg.models;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.math.BigDecimal;

import org.egov.tracer.annotations.CustomSafeHtml;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TaxAndPayment {

	private BigDecimal taxAmount;

	@NotNull
	private BigDecimal amountPaid;

	@CustomSafeHtml
	@NotNull
	private String billId;
}