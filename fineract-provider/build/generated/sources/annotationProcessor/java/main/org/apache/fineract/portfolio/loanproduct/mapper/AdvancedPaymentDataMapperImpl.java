package org.apache.fineract.portfolio.loanproduct.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.portfolio.loanaccount.domain.LoanPaymentAllocationRule;
import org.apache.fineract.portfolio.loanproduct.data.AdvancedPaymentData;
import org.apache.fineract.portfolio.loanproduct.domain.LoanProductPaymentAllocationRule;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:18+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class AdvancedPaymentDataMapperImpl implements AdvancedPaymentDataMapper {

    @Override
    public List<AdvancedPaymentData> mapLoanProductPaymentAllocationRule(List<LoanProductPaymentAllocationRule> paymentAllocationRule) {
        if ( paymentAllocationRule == null ) {
            return null;
        }

        List<AdvancedPaymentData> list = new ArrayList<AdvancedPaymentData>( paymentAllocationRule.size() );
        for ( LoanProductPaymentAllocationRule loanProductPaymentAllocationRule : paymentAllocationRule ) {
            list.add( mapLoanProductPaymentAllocationRule( loanProductPaymentAllocationRule ) );
        }

        return list;
    }

    @Override
    public List<AdvancedPaymentData> mapLoanPaymentAllocationRule(List<LoanPaymentAllocationRule> paymentAllocationRule) {
        if ( paymentAllocationRule == null ) {
            return null;
        }

        List<AdvancedPaymentData> list = new ArrayList<AdvancedPaymentData>( paymentAllocationRule.size() );
        for ( LoanPaymentAllocationRule loanPaymentAllocationRule : paymentAllocationRule ) {
            list.add( mapLoanPaymentAllocationRule( loanPaymentAllocationRule ) );
        }

        return list;
    }

    @Override
    public AdvancedPaymentData mapLoanProductPaymentAllocationRule(LoanProductPaymentAllocationRule paymentAllocationRule) {
        if ( paymentAllocationRule == null ) {
            return null;
        }

        List<AdvancedPaymentData.PaymentAllocationOrder> paymentAllocationOrder = null;
        String transactionType = null;
        String futureInstallmentAllocationRule = null;

        paymentAllocationOrder = mapAllocationTypes( paymentAllocationRule.getAllocationTypes() );
        if ( paymentAllocationRule.getTransactionType() != null ) {
            transactionType = paymentAllocationRule.getTransactionType().name();
        }
        if ( paymentAllocationRule.getFutureInstallmentAllocationRule() != null ) {
            futureInstallmentAllocationRule = paymentAllocationRule.getFutureInstallmentAllocationRule().name();
        }

        AdvancedPaymentData advancedPaymentData = new AdvancedPaymentData( transactionType, futureInstallmentAllocationRule, paymentAllocationOrder );

        return advancedPaymentData;
    }

    @Override
    public AdvancedPaymentData mapLoanPaymentAllocationRule(LoanPaymentAllocationRule paymentAllocationRule) {
        if ( paymentAllocationRule == null ) {
            return null;
        }

        List<AdvancedPaymentData.PaymentAllocationOrder> paymentAllocationOrder = null;
        String transactionType = null;
        String futureInstallmentAllocationRule = null;

        paymentAllocationOrder = mapAllocationTypes( paymentAllocationRule.getAllocationTypes() );
        if ( paymentAllocationRule.getTransactionType() != null ) {
            transactionType = paymentAllocationRule.getTransactionType().name();
        }
        if ( paymentAllocationRule.getFutureInstallmentAllocationRule() != null ) {
            futureInstallmentAllocationRule = paymentAllocationRule.getFutureInstallmentAllocationRule().name();
        }

        AdvancedPaymentData advancedPaymentData = new AdvancedPaymentData( transactionType, futureInstallmentAllocationRule, paymentAllocationOrder );

        return advancedPaymentData;
    }
}
