package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.avro.loan.v1.LoanAccountStayedLockedDataV1;
import org.apache.fineract.avro.loan.v1.LoanAccountsStayedLockedDataV1;
import org.apache.fineract.cob.data.LoanAccountStayedLockedData;
import org.apache.fineract.cob.data.LoanAccountsStayedLockedData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.ExternalIdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:18+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanAccountsStayedLockedDataMapperImpl implements LoanAccountsStayedLockedDataMapper {

    private final ExternalIdMapper externalIdMapper;

    @Autowired
    public LoanAccountsStayedLockedDataMapperImpl(ExternalIdMapper externalIdMapper) {

        this.externalIdMapper = externalIdMapper;
    }

    @Override
    public LoanAccountsStayedLockedDataV1 map(LoanAccountsStayedLockedData loanAccountStayedLockedData) {
        if ( loanAccountStayedLockedData == null ) {
            return null;
        }

        LoanAccountsStayedLockedDataV1 loanAccountsStayedLockedDataV1 = new LoanAccountsStayedLockedDataV1();

        loanAccountsStayedLockedDataV1.setLoanAccounts( loanAccountStayedLockedDataListToLoanAccountStayedLockedDataV1List( loanAccountStayedLockedData.getLoanAccounts() ) );

        return loanAccountsStayedLockedDataV1;
    }

    protected LoanAccountStayedLockedDataV1 loanAccountStayedLockedDataToLoanAccountStayedLockedDataV1(LoanAccountStayedLockedData loanAccountStayedLockedData) {
        if ( loanAccountStayedLockedData == null ) {
            return null;
        }

        LoanAccountStayedLockedDataV1 loanAccountStayedLockedDataV1 = new LoanAccountStayedLockedDataV1();

        if ( loanAccountStayedLockedData.getId() != null ) {
            loanAccountStayedLockedDataV1.setId( loanAccountStayedLockedData.getId() );
        }
        loanAccountStayedLockedDataV1.setExternalId( externalIdMapper.mapExternalId( loanAccountStayedLockedData.getExternalId() ) );
        loanAccountStayedLockedDataV1.setAccountNo( loanAccountStayedLockedData.getAccountNo() );

        return loanAccountStayedLockedDataV1;
    }

    protected List<LoanAccountStayedLockedDataV1> loanAccountStayedLockedDataListToLoanAccountStayedLockedDataV1List(List<LoanAccountStayedLockedData> list) {
        if ( list == null ) {
            return null;
        }

        List<LoanAccountStayedLockedDataV1> list1 = new ArrayList<LoanAccountStayedLockedDataV1>( list.size() );
        for ( LoanAccountStayedLockedData loanAccountStayedLockedData : list ) {
            list1.add( loanAccountStayedLockedDataToLoanAccountStayedLockedDataV1( loanAccountStayedLockedData ) );
        }

        return list1;
    }
}
