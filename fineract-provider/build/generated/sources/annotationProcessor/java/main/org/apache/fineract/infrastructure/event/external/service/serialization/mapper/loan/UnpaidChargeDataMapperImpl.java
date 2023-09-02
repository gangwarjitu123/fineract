package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.avro.loan.v1.UnpaidChargeDataV1;
import org.apache.fineract.portfolio.loanaccount.data.UnpaidChargeData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class UnpaidChargeDataMapperImpl implements UnpaidChargeDataMapper {

    @Override
    public UnpaidChargeDataV1 map(UnpaidChargeData source) {
        if ( source == null ) {
            return null;
        }

        UnpaidChargeDataV1 unpaidChargeDataV1 = new UnpaidChargeDataV1();

        if ( source.getChargeId() != null ) {
            unpaidChargeDataV1.setChargeId( source.getChargeId() );
        }
        unpaidChargeDataV1.setChargeName( source.getChargeName() );
        unpaidChargeDataV1.setOutstandingAmount( source.getOutstandingAmount() );

        return unpaidChargeDataV1;
    }

    @Override
    public List<UnpaidChargeDataV1> map(List<UnpaidChargeData> source) {
        if ( source == null ) {
            return null;
        }

        List<UnpaidChargeDataV1> list = new ArrayList<UnpaidChargeDataV1>( source.size() );
        for ( UnpaidChargeData unpaidChargeData : source ) {
            list.add( map( unpaidChargeData ) );
        }

        return list;
    }
}
