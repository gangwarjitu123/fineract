package org.apache.fineract.portfolio.loanaccount.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.portfolio.loanaccount.data.LoanTransactionRelationData;
import org.apache.fineract.portfolio.loanaccount.domain.LoanCharge;
import org.apache.fineract.portfolio.loanaccount.domain.LoanTransaction;
import org.apache.fineract.portfolio.loanaccount.domain.LoanTransactionRelation;
import org.apache.fineract.portfolio.loanaccount.domain.LoanTransactionRelationTypeEnum;
import org.apache.fineract.portfolio.paymentdetail.domain.PaymentDetail;
import org.apache.fineract.portfolio.paymenttype.domain.PaymentType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanTransactionRelationMapperImpl implements LoanTransactionRelationMapper {

    @Override
    public LoanTransactionRelationData map(LoanTransactionRelation source) {
        if ( source == null ) {
            return null;
        }

        Long fromLoanTransaction = null;
        Long toLoanTransaction = null;
        Long toLoanCharge = null;
        BigDecimal amount = null;
        String paymentType = null;
        LoanTransactionRelationTypeEnum relationType = null;

        fromLoanTransaction = sourceFromTransactionId( source );
        toLoanTransaction = sourceToTransactionId( source );
        toLoanCharge = sourceToChargeId( source );
        amount = sourceToTransactionAmount( source );
        paymentType = sourceToTransactionPaymentDetailPaymentTypeName( source );
        relationType = source.getRelationType();

        LoanTransactionRelationData loanTransactionRelationData = new LoanTransactionRelationData( fromLoanTransaction, toLoanTransaction, toLoanCharge, relationType, amount, paymentType );

        return loanTransactionRelationData;
    }

    @Override
    public List<LoanTransactionRelationData> map(List<LoanTransactionRelation> sources) {
        if ( sources == null ) {
            return null;
        }

        List<LoanTransactionRelationData> list = new ArrayList<LoanTransactionRelationData>( sources.size() );
        for ( LoanTransactionRelation loanTransactionRelation : sources ) {
            list.add( map( loanTransactionRelation ) );
        }

        return list;
    }

    private Long sourceFromTransactionId(LoanTransactionRelation loanTransactionRelation) {
        if ( loanTransactionRelation == null ) {
            return null;
        }
        LoanTransaction fromTransaction = loanTransactionRelation.getFromTransaction();
        if ( fromTransaction == null ) {
            return null;
        }
        Long id = fromTransaction.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long sourceToTransactionId(LoanTransactionRelation loanTransactionRelation) {
        if ( loanTransactionRelation == null ) {
            return null;
        }
        LoanTransaction toTransaction = loanTransactionRelation.getToTransaction();
        if ( toTransaction == null ) {
            return null;
        }
        Long id = toTransaction.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long sourceToChargeId(LoanTransactionRelation loanTransactionRelation) {
        if ( loanTransactionRelation == null ) {
            return null;
        }
        LoanCharge toCharge = loanTransactionRelation.getToCharge();
        if ( toCharge == null ) {
            return null;
        }
        Long id = toCharge.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private BigDecimal sourceToTransactionAmount(LoanTransactionRelation loanTransactionRelation) {
        if ( loanTransactionRelation == null ) {
            return null;
        }
        LoanTransaction toTransaction = loanTransactionRelation.getToTransaction();
        if ( toTransaction == null ) {
            return null;
        }
        BigDecimal amount = toTransaction.getAmount();
        if ( amount == null ) {
            return null;
        }
        return amount;
    }

    private String sourceToTransactionPaymentDetailPaymentTypeName(LoanTransactionRelation loanTransactionRelation) {
        if ( loanTransactionRelation == null ) {
            return null;
        }
        LoanTransaction toTransaction = loanTransactionRelation.getToTransaction();
        if ( toTransaction == null ) {
            return null;
        }
        PaymentDetail paymentDetail = toTransaction.getPaymentDetail();
        if ( paymentDetail == null ) {
            return null;
        }
        PaymentType paymentType = paymentDetail.getPaymentType();
        if ( paymentType == null ) {
            return null;
        }
        String name = paymentType.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
