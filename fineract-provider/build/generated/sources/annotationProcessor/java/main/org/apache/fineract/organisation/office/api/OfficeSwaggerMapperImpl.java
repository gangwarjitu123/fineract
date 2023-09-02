package org.apache.fineract.organisation.office.api;

import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResult;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.ExternalIdMapper;
import org.apache.fineract.organisation.office.data.OfficeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class OfficeSwaggerMapperImpl implements OfficeSwaggerMapper {

    private final ExternalIdMapper externalIdMapper;

    @Autowired
    public OfficeSwaggerMapperImpl(ExternalIdMapper externalIdMapper) {

        this.externalIdMapper = externalIdMapper;
    }

    @Override
    public OfficesApiResourceSwagger.PutOfficesOfficeIdResponse toPutOfficesOfficeIdResponse(CommandProcessingResult commandProcessingResult) {
        if ( commandProcessingResult == null ) {
            return null;
        }

        OfficesApiResourceSwagger.PutOfficesOfficeIdResponse putOfficesOfficeIdResponse = new OfficesApiResourceSwagger.PutOfficesOfficeIdResponse();

        putOfficesOfficeIdResponse.officeId = commandProcessingResult.getOfficeId();
        putOfficesOfficeIdResponse.resourceId = commandProcessingResult.getResourceId();
        if ( commandProcessingResult.hasChanges() ) {
            putOfficesOfficeIdResponse.changes = toPutOfficesOfficeIdResponseChanges( commandProcessingResult.getChanges() );
        }

        return putOfficesOfficeIdResponse;
    }

    @Override
    public OfficesApiResourceSwagger.GetOfficesResponse toGetOfficesResponse(OfficeData officeData) {
        if ( officeData == null ) {
            return null;
        }

        OfficesApiResourceSwagger.GetOfficesResponse getOfficesResponse = new OfficesApiResourceSwagger.GetOfficesResponse();

        getOfficesResponse.id = officeData.getId();
        getOfficesResponse.name = officeData.getName();
        getOfficesResponse.nameDecorated = officeData.getNameDecorated();
        getOfficesResponse.externalId = externalIdMapper.mapExternalId( officeData.getExternalId() );
        getOfficesResponse.openingDate = officeData.getOpeningDate();
        getOfficesResponse.hierarchy = officeData.getHierarchy();
        getOfficesResponse.dateFormat = officeData.getDateFormat();
        getOfficesResponse.locale = officeData.getLocale();
        getOfficesResponse.allowedParents = officeDataCollectionToGetOfficesResponseCollection( officeData.getAllowedParents() );

        return getOfficesResponse;
    }

    protected Collection<OfficesApiResourceSwagger.GetOfficesResponse> officeDataCollectionToGetOfficesResponseCollection(Collection<OfficeData> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<OfficesApiResourceSwagger.GetOfficesResponse> collection1 = new ArrayList<OfficesApiResourceSwagger.GetOfficesResponse>( collection.size() );
        for ( OfficeData officeData : collection ) {
            collection1.add( toGetOfficesResponse( officeData ) );
        }

        return collection1;
    }
}
