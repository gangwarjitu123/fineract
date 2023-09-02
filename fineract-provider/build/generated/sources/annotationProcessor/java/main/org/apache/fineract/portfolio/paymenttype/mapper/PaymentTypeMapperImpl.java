package org.apache.fineract.portfolio.paymenttype.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.portfolio.paymenttype.data.PaymentTypeData;
import org.apache.fineract.portfolio.paymenttype.domain.PaymentType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class PaymentTypeMapperImpl implements PaymentTypeMapper {

    @Override
    public PaymentTypeData map(PaymentType source) {
        if ( source == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;
        Boolean isCashPayment = null;
        Integer position = null;
        String codeName = null;
        Boolean isSystemDefined = null;

        id = source.getId();
        name = source.getName();
        description = source.getDescription();
        isCashPayment = source.getIsCashPayment();
        if ( source.getPosition() != null ) {
            position = source.getPosition().intValue();
        }
        codeName = source.getCodeName();
        isSystemDefined = source.getIsSystemDefined();

        PaymentTypeData paymentTypeData = new PaymentTypeData( id, name, description, isCashPayment, position, codeName, isSystemDefined );

        return paymentTypeData;
    }

    @Override
    public List<PaymentTypeData> map(List<PaymentType> sources) {
        if ( sources == null ) {
            return null;
        }

        List<PaymentTypeData> list = new ArrayList<PaymentTypeData>( sources.size() );
        for ( PaymentType paymentType : sources ) {
            list.add( map( paymentType ) );
        }

        return list;
    }
}
