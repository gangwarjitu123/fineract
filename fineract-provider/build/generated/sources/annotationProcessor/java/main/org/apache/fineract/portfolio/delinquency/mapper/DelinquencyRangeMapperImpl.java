package org.apache.fineract.portfolio.delinquency.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.portfolio.delinquency.data.DelinquencyRangeData;
import org.apache.fineract.portfolio.delinquency.domain.DelinquencyRange;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class DelinquencyRangeMapperImpl implements DelinquencyRangeMapper {

    @Override
    public DelinquencyRangeData map(DelinquencyRange source) {
        if ( source == null ) {
            return null;
        }

        Long id = null;
        String classification = null;
        Integer minimumAgeDays = null;
        Integer maximumAgeDays = null;

        id = source.getId();
        classification = source.getClassification();
        minimumAgeDays = source.getMinimumAgeDays();
        maximumAgeDays = source.getMaximumAgeDays();

        DelinquencyRangeData delinquencyRangeData = new DelinquencyRangeData( id, classification, minimumAgeDays, maximumAgeDays );

        return delinquencyRangeData;
    }

    @Override
    public List<DelinquencyRangeData> map(List<DelinquencyRange> sources) {
        if ( sources == null ) {
            return null;
        }

        List<DelinquencyRangeData> list = new ArrayList<DelinquencyRangeData>( sources.size() );
        for ( DelinquencyRange delinquencyRange : sources ) {
            list.add( map( delinquencyRange ) );
        }

        return list;
    }
}
