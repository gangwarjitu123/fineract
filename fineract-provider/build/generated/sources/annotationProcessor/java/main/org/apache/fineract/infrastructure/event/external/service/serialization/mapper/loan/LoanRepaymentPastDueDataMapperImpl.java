package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

import javax.annotation.processing.Generated;
import org.apache.fineract.avro.loan.v1.RepaymentPastDueDataV1;
import org.apache.fineract.portfolio.loanaccount.data.LoanRepaymentPastDueData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanRepaymentPastDueDataMapperImpl implements LoanRepaymentPastDueDataMapper {

    @Override
    public RepaymentPastDueDataV1 map(LoanRepaymentPastDueData source) {
        if ( source == null ) {
            return null;
        }

        RepaymentPastDueDataV1 repaymentPastDueDataV1 = new RepaymentPastDueDataV1();

        repaymentPastDueDataV1.setTotalAmount( source.getTotalAmount() );
        repaymentPastDueDataV1.setPrincipalAmount( source.getPrincipalAmount() );
        repaymentPastDueDataV1.setInterestAmount( source.getInterestAmount() );
        repaymentPastDueDataV1.setFeeAmount( source.getFeeAmount() );
        repaymentPastDueDataV1.setPenaltyAmount( source.getPenaltyAmount() );

        return repaymentPastDueDataV1;
    }
}
