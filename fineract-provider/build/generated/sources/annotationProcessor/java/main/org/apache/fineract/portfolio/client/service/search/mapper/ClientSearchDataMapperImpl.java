package org.apache.fineract.portfolio.client.service.search.mapper;

import javax.annotation.processing.Generated;
import org.apache.fineract.portfolio.client.domain.search.SearchedClient;
import org.apache.fineract.portfolio.client.service.search.domain.ClientSearchData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:19+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ClientSearchDataMapperImpl implements ClientSearchDataMapper {

    @Override
    public ClientSearchData map(SearchedClient source) {
        if ( source == null ) {
            return null;
        }

        ClientSearchData clientSearchData = new ClientSearchData();

        clientSearchData.setStatus( toStatus( source ) );
        clientSearchData.setId( source.getId() );
        clientSearchData.setDisplayName( source.getDisplayName() );
        clientSearchData.setExternalId( source.getExternalId() );
        clientSearchData.setAccountNumber( source.getAccountNumber() );
        clientSearchData.setOfficeId( source.getOfficeId() );
        clientSearchData.setOfficeName( source.getOfficeName() );
        clientSearchData.setMobileNo( source.getMobileNo() );
        clientSearchData.setActivationDate( source.getActivationDate() );
        clientSearchData.setCreatedDate( source.getCreatedDate() );

        return clientSearchData;
    }
}
