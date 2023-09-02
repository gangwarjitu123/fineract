package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

import javax.annotation.processing.Generated;
import org.apache.fineract.avro.loan.v1.DelinquencyRangeDataV1;
import org.apache.fineract.portfolio.delinquency.data.DelinquencyRangeData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanDelinquencyRangeDataMapperImpl implements LoanDelinquencyRangeDataMapper {

    @Override
    public DelinquencyRangeDataV1 map(DelinquencyRangeData source) {
        if ( source == null ) {
            return null;
        }

        DelinquencyRangeDataV1 delinquencyRangeDataV1 = new DelinquencyRangeDataV1();

        delinquencyRangeDataV1.setId( source.getId() );
        delinquencyRangeDataV1.setClassification( source.getClassification() );
        delinquencyRangeDataV1.setMinimumAgeDays( source.getMinimumAgeDays() );
        delinquencyRangeDataV1.setMaximumAgeDays( source.getMaximumAgeDays() );

        return delinquencyRangeDataV1;
    }
}
