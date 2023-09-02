package org.apache.fineract.portfolio.delinquency.mapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.portfolio.delinquency.data.DelinquencyRangeData;
import org.apache.fineract.portfolio.delinquency.data.LoanDelinquencyTagHistoryData;
import org.apache.fineract.portfolio.delinquency.domain.LoanDelinquencyTagHistory;
import org.apache.fineract.portfolio.loanaccount.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:18+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanDelinquencyTagMapperImpl implements LoanDelinquencyTagMapper {

    private final DelinquencyRangeMapper delinquencyRangeMapper;

    @Autowired
    public LoanDelinquencyTagMapperImpl(DelinquencyRangeMapper delinquencyRangeMapper) {

        this.delinquencyRangeMapper = delinquencyRangeMapper;
    }

    @Override
    public LoanDelinquencyTagHistoryData map(LoanDelinquencyTagHistory source) {
        if ( source == null ) {
            return null;
        }

        Long loanId = null;
        Long id = null;
        DelinquencyRangeData delinquencyRange = null;
        LocalDate addedOnDate = null;
        LocalDate liftedOnDate = null;

        loanId = sourceLoanId( source );
        id = source.getId();
        delinquencyRange = delinquencyRangeMapper.map( source.getDelinquencyRange() );
        addedOnDate = source.getAddedOnDate();
        liftedOnDate = source.getLiftedOnDate();

        LoanDelinquencyTagHistoryData loanDelinquencyTagHistoryData = new LoanDelinquencyTagHistoryData( id, loanId, delinquencyRange, addedOnDate, liftedOnDate );

        return loanDelinquencyTagHistoryData;
    }

    @Override
    public List<LoanDelinquencyTagHistoryData> map(List<LoanDelinquencyTagHistory> sources) {
        if ( sources == null ) {
            return null;
        }

        List<LoanDelinquencyTagHistoryData> list = new ArrayList<LoanDelinquencyTagHistoryData>( sources.size() );
        for ( LoanDelinquencyTagHistory loanDelinquencyTagHistory : sources ) {
            list.add( map( loanDelinquencyTagHistory ) );
        }

        return list;
    }

    private Long sourceLoanId(LoanDelinquencyTagHistory loanDelinquencyTagHistory) {
        if ( loanDelinquencyTagHistory == null ) {
            return null;
        }
        Loan loan = loanDelinquencyTagHistory.getLoan();
        if ( loan == null ) {
            return null;
        }
        Long id = loan.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
