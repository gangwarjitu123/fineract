package org.apache.fineract.portfolio.client.mapper;

import javax.annotation.processing.Generated;
import org.apache.fineract.infrastructure.documentmanagement.domain.Image;
import org.apache.fineract.organisation.office.domain.Office;
import org.apache.fineract.organisation.staff.domain.Staff;
import org.apache.fineract.portfolio.client.data.ClientData;
import org.apache.fineract.portfolio.client.domain.Client;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:19+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientData map(Client source) {
        if ( source == null ) {
            return null;
        }

        ClientData clientData = new ClientData();

        clientData.setAccountNo( source.getAccountNumber() );
        clientData.setStatus( clientStatusEnum( source ) );
        clientData.setSubStatus( clientSubStatusCode( source ) );
        clientData.setOfficeId( sourceOfficeId( source ) );
        clientData.setOfficeName( sourceOfficeName( source ) );
        clientData.setTransferToOfficeId( sourceTransferToOfficeId( source ) );
        clientData.setTransferToOfficeName( sourceTransferToOfficeName( source ) );
        clientData.setExternalId( source.getExternalId() );
        clientData.setGender( clientGenderCode( source ) );
        clientData.setImageId( sourceImageId( source ) );
        clientData.setStaffId( sourceStaffId( source ) );
        clientData.setStaffName( sourceStaffDisplayName( source ) );
        clientData.setTimeline( clientTimelineData( source ) );
        clientData.setSavingsProductId( source.getSavingsProductId() );
        if ( source.getId() != null ) {
            clientData.setSavingsProductName( String.valueOf( source.getId() ) );
        }
        clientData.setSavingsAccountId( source.getSavingsAccountId() );
        clientData.setClientType( clientTypeCode( source ) );
        clientData.setClientClassification( clientClassificationCode( source ) );
        clientData.setLegalForm( clientLegalFormEnum( source ) );
        clientData.setIsStaff( clientIsStaff( source ) );
        clientData.setId( source.getId() );
        clientData.setActive( source.isActive() );
        clientData.setActivationDate( source.getActivationDate() );
        clientData.setFirstname( source.getFirstname() );
        clientData.setMiddlename( source.getMiddlename() );
        clientData.setLastname( source.getLastname() );
        clientData.setFullname( source.getFullname() );
        clientData.setDisplayName( source.getDisplayName() );
        clientData.setMobileNo( source.getMobileNo() );
        clientData.setEmailAddress( source.getEmailAddress() );
        clientData.setDateOfBirth( source.getDateOfBirth() );
        clientData.setSubmittedOnDate( source.getSubmittedOnDate() );

        return clientData;
    }

    private Long sourceOfficeId(Client client) {
        if ( client == null ) {
            return null;
        }
        Office office = client.getOffice();
        if ( office == null ) {
            return null;
        }
        Long id = office.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String sourceOfficeName(Client client) {
        if ( client == null ) {
            return null;
        }
        Office office = client.getOffice();
        if ( office == null ) {
            return null;
        }
        String name = office.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long sourceTransferToOfficeId(Client client) {
        if ( client == null ) {
            return null;
        }
        Office transferToOffice = client.getTransferToOffice();
        if ( transferToOffice == null ) {
            return null;
        }
        Long id = transferToOffice.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String sourceTransferToOfficeName(Client client) {
        if ( client == null ) {
            return null;
        }
        Office transferToOffice = client.getTransferToOffice();
        if ( transferToOffice == null ) {
            return null;
        }
        String name = transferToOffice.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long sourceImageId(Client client) {
        if ( client == null ) {
            return null;
        }
        Image image = client.getImage();
        if ( image == null ) {
            return null;
        }
        Long id = image.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long sourceStaffId(Client client) {
        if ( client == null ) {
            return null;
        }
        Staff staff = client.getStaff();
        if ( staff == null ) {
            return null;
        }
        Long id = staff.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String sourceStaffDisplayName(Client client) {
        if ( client == null ) {
            return null;
        }
        Staff staff = client.getStaff();
        if ( staff == null ) {
            return null;
        }
        String displayName = staff.getDisplayName();
        if ( displayName == null ) {
            return null;
        }
        return displayName;
    }
}
