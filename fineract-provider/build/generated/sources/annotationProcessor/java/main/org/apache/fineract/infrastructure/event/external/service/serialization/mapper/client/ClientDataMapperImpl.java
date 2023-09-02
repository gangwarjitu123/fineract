package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.apache.fineract.avro.client.v1.ClientCollateralManagementDataV1;
import org.apache.fineract.avro.client.v1.ClientDataV1;
import org.apache.fineract.avro.client.v1.ClientTimelineDataV1;
import org.apache.fineract.avro.generic.v1.CalendarDataV1;
import org.apache.fineract.avro.generic.v1.CodeValueDataV1;
import org.apache.fineract.avro.generic.v1.EnumOptionDataV1;
import org.apache.fineract.avro.group.v1.GroupGeneralDataV1;
import org.apache.fineract.avro.group.v1.GroupRoleDataV1;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.ExternalIdMapper;
import org.apache.fineract.portfolio.calendar.data.CalendarData;
import org.apache.fineract.portfolio.client.data.ClientCollateralManagementData;
import org.apache.fineract.portfolio.client.data.ClientData;
import org.apache.fineract.portfolio.client.data.ClientTimelineData;
import org.apache.fineract.portfolio.group.data.GroupGeneralData;
import org.apache.fineract.portfolio.group.data.GroupRoleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ClientDataMapperImpl implements ClientDataMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;
    private final ExternalIdMapper externalIdMapper;

    @Autowired
    public ClientDataMapperImpl(AvroDateTimeMapper avroDateTimeMapper, ExternalIdMapper externalIdMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
        this.externalIdMapper = externalIdMapper;
    }

    @Override
    public ClientDataV1 map(ClientData source) {
        if ( source == null ) {
            return null;
        }

        ClientDataV1 clientDataV1 = new ClientDataV1();

        clientDataV1.setId( source.getId() );
        clientDataV1.setAccountNo( source.getAccountNo() );
        clientDataV1.setExternalId( externalIdMapper.mapExternalId( source.getExternalId() ) );
        clientDataV1.setStatus( enumOptionDataToEnumOptionDataV1( source.getStatus() ) );
        clientDataV1.setSubStatus( codeValueDataToCodeValueDataV1( source.getSubStatus() ) );
        clientDataV1.setActive( source.getActive() );
        clientDataV1.setActivationDate( avroDateTimeMapper.mapLocalDate( source.getActivationDate() ) );
        clientDataV1.setFirstname( source.getFirstname() );
        clientDataV1.setMiddlename( source.getMiddlename() );
        clientDataV1.setLastname( source.getLastname() );
        clientDataV1.setFullname( source.getFullname() );
        clientDataV1.setDisplayName( source.getDisplayName() );
        clientDataV1.setMobileNo( source.getMobileNo() );
        clientDataV1.setEmailAddress( source.getEmailAddress() );
        clientDataV1.setDateOfBirth( avroDateTimeMapper.mapLocalDate( source.getDateOfBirth() ) );
        clientDataV1.setGender( codeValueDataToCodeValueDataV1( source.getGender() ) );
        clientDataV1.setClientType( codeValueDataToCodeValueDataV1( source.getClientType() ) );
        clientDataV1.setClientClassification( codeValueDataToCodeValueDataV1( source.getClientClassification() ) );
        clientDataV1.setIsStaff( source.getIsStaff() );
        clientDataV1.setOfficeId( source.getOfficeId() );
        clientDataV1.setOfficeName( source.getOfficeName() );
        clientDataV1.setTransferToOfficeId( source.getTransferToOfficeId() );
        clientDataV1.setTransferToOfficeName( source.getTransferToOfficeName() );
        clientDataV1.setImageId( source.getImageId() );
        clientDataV1.setImagePresent( source.getImagePresent() );
        clientDataV1.setStaffId( source.getStaffId() );
        clientDataV1.setStaffName( source.getStaffName() );
        clientDataV1.setTimeline( clientTimelineDataToClientTimelineDataV1( source.getTimeline() ) );
        clientDataV1.setSavingsProductId( source.getSavingsProductId() );
        clientDataV1.setSavingsProductName( source.getSavingsProductName() );
        clientDataV1.setSavingsAccountId( source.getSavingsAccountId() );
        clientDataV1.setLegalForm( enumOptionDataToEnumOptionDataV1( source.getLegalForm() ) );
        clientDataV1.setClientCollateralManagements( clientCollateralManagementDataSetToClientCollateralManagementDataV1List( source.getClientCollateralManagements() ) );
        clientDataV1.setGroups( groupGeneralDataCollectionToGroupGeneralDataV1List( source.getGroups() ) );

        return clientDataV1;
    }

    protected EnumOptionDataV1 enumOptionDataToEnumOptionDataV1(EnumOptionData enumOptionData) {
        if ( enumOptionData == null ) {
            return null;
        }

        EnumOptionDataV1 enumOptionDataV1 = new EnumOptionDataV1();

        if ( enumOptionData.getId() != null ) {
            enumOptionDataV1.setId( enumOptionData.getId().intValue() );
        }
        enumOptionDataV1.setCode( enumOptionData.getCode() );
        enumOptionDataV1.setValue( enumOptionData.getValue() );

        return enumOptionDataV1;
    }

    protected CodeValueDataV1 codeValueDataToCodeValueDataV1(CodeValueData codeValueData) {
        if ( codeValueData == null ) {
            return null;
        }

        CodeValueDataV1 codeValueDataV1 = new CodeValueDataV1();

        codeValueDataV1.setId( codeValueData.getId() );
        codeValueDataV1.setName( codeValueData.getName() );
        codeValueDataV1.setPosition( codeValueData.getPosition() );
        codeValueDataV1.setDescription( codeValueData.getDescription() );
        codeValueDataV1.setActive( codeValueData.isActive() );
        codeValueDataV1.setMandatory( codeValueData.isMandatory() );

        return codeValueDataV1;
    }

    protected ClientTimelineDataV1 clientTimelineDataToClientTimelineDataV1(ClientTimelineData clientTimelineData) {
        if ( clientTimelineData == null ) {
            return null;
        }

        ClientTimelineDataV1 clientTimelineDataV1 = new ClientTimelineDataV1();

        clientTimelineDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( clientTimelineData.getSubmittedOnDate() ) );
        clientTimelineDataV1.setSubmittedByUsername( clientTimelineData.getSubmittedByUsername() );
        clientTimelineDataV1.setSubmittedByFirstname( clientTimelineData.getSubmittedByFirstname() );
        clientTimelineDataV1.setSubmittedByLastname( clientTimelineData.getSubmittedByLastname() );
        clientTimelineDataV1.setActivatedOnDate( avroDateTimeMapper.mapLocalDate( clientTimelineData.getActivatedOnDate() ) );
        clientTimelineDataV1.setActivatedByUsername( clientTimelineData.getActivatedByUsername() );
        clientTimelineDataV1.setActivatedByFirstname( clientTimelineData.getActivatedByFirstname() );
        clientTimelineDataV1.setActivatedByLastname( clientTimelineData.getActivatedByLastname() );
        clientTimelineDataV1.setClosedOnDate( avroDateTimeMapper.mapLocalDate( clientTimelineData.getClosedOnDate() ) );
        clientTimelineDataV1.setClosedByUsername( clientTimelineData.getClosedByUsername() );
        clientTimelineDataV1.setClosedByFirstname( clientTimelineData.getClosedByFirstname() );
        clientTimelineDataV1.setClosedByLastname( clientTimelineData.getClosedByLastname() );

        return clientTimelineDataV1;
    }

    protected ClientCollateralManagementDataV1 clientCollateralManagementDataToClientCollateralManagementDataV1(ClientCollateralManagementData clientCollateralManagementData) {
        if ( clientCollateralManagementData == null ) {
            return null;
        }

        ClientCollateralManagementDataV1 clientCollateralManagementDataV1 = new ClientCollateralManagementDataV1();

        clientCollateralManagementDataV1.setQuantity( clientCollateralManagementData.getQuantity() );
        clientCollateralManagementDataV1.setId( clientCollateralManagementData.getId() );
        clientCollateralManagementDataV1.setPctToBase( clientCollateralManagementData.getPctToBase() );
        clientCollateralManagementDataV1.setUnitPrice( clientCollateralManagementData.getUnitPrice() );
        clientCollateralManagementDataV1.setTotal( clientCollateralManagementData.getTotal() );
        clientCollateralManagementDataV1.setTotalCollateral( clientCollateralManagementData.getTotalCollateral() );
        clientCollateralManagementDataV1.setName( clientCollateralManagementData.getName() );

        return clientCollateralManagementDataV1;
    }

    protected List<ClientCollateralManagementDataV1> clientCollateralManagementDataSetToClientCollateralManagementDataV1List(Set<ClientCollateralManagementData> set) {
        if ( set == null ) {
            return null;
        }

        List<ClientCollateralManagementDataV1> list = new ArrayList<ClientCollateralManagementDataV1>( set.size() );
        for ( ClientCollateralManagementData clientCollateralManagementData : set ) {
            list.add( clientCollateralManagementDataToClientCollateralManagementDataV1( clientCollateralManagementData ) );
        }

        return list;
    }

    protected GroupRoleDataV1 groupRoleDataToGroupRoleDataV1(GroupRoleData groupRoleData) {
        if ( groupRoleData == null ) {
            return null;
        }

        GroupRoleDataV1 groupRoleDataV1 = new GroupRoleDataV1();

        groupRoleDataV1.setId( groupRoleData.getId() );
        groupRoleDataV1.setRole( codeValueDataToCodeValueDataV1( groupRoleData.getRole() ) );
        groupRoleDataV1.setClientId( groupRoleData.getClientId() );
        groupRoleDataV1.setClientName( groupRoleData.getClientName() );

        return groupRoleDataV1;
    }

    protected List<GroupRoleDataV1> groupRoleDataCollectionToGroupRoleDataV1List(Collection<GroupRoleData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<GroupRoleDataV1> list = new ArrayList<GroupRoleDataV1>( collection.size() );
        for ( GroupRoleData groupRoleData : collection ) {
            list.add( groupRoleDataToGroupRoleDataV1( groupRoleData ) );
        }

        return list;
    }

    protected List<String> localDateCollectionToStringList(Collection<LocalDate> collection) {
        if ( collection == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>( collection.size() );
        for ( LocalDate localDate : collection ) {
            list.add( avroDateTimeMapper.mapLocalDate( localDate ) );
        }

        return list;
    }

    protected CalendarDataV1 calendarDataToCalendarDataV1(CalendarData calendarData) {
        if ( calendarData == null ) {
            return null;
        }

        CalendarDataV1 calendarDataV1 = new CalendarDataV1();

        calendarDataV1.setId( calendarData.getId() );
        calendarDataV1.setCalendarInstanceId( calendarData.getCalendarInstanceId() );
        calendarDataV1.setEntityId( calendarData.getEntityId() );
        calendarDataV1.setEntityType( enumOptionDataToEnumOptionDataV1( calendarData.getEntityType() ) );
        calendarDataV1.setTitle( calendarData.getTitle() );
        calendarDataV1.setDescription( calendarData.getDescription() );
        calendarDataV1.setLocation( calendarData.getLocation() );
        calendarDataV1.setStartDate( avroDateTimeMapper.mapLocalDate( calendarData.getStartDate() ) );
        calendarDataV1.setEndDate( avroDateTimeMapper.mapLocalDate( calendarData.getEndDate() ) );
        if ( calendarData.getMeetingTime() != null ) {
            calendarDataV1.setMeetingTime( DateTimeFormatter.ISO_LOCAL_TIME.format( calendarData.getMeetingTime() ) );
        }
        calendarDataV1.setDuration( calendarData.getDuration() );
        calendarDataV1.setType( enumOptionDataToEnumOptionDataV1( calendarData.getType() ) );
        calendarDataV1.setRepeating( calendarData.isRepeating() );
        calendarDataV1.setRecurrence( calendarData.getRecurrence() );
        calendarDataV1.setFrequency( enumOptionDataToEnumOptionDataV1( calendarData.getFrequency() ) );
        calendarDataV1.setInterval( calendarData.getInterval() );
        calendarDataV1.setRepeatsOnDay( enumOptionDataToEnumOptionDataV1( calendarData.getRepeatsOnDay() ) );
        calendarDataV1.setRepeatsOnNthDayOfMonth( enumOptionDataToEnumOptionDataV1( calendarData.getRepeatsOnNthDayOfMonth() ) );
        calendarDataV1.setRemindBy( enumOptionDataToEnumOptionDataV1( calendarData.getRemindBy() ) );
        calendarDataV1.setFirstReminder( calendarData.getFirstReminder() );
        calendarDataV1.setSecondReminder( calendarData.getSecondReminder() );
        calendarDataV1.setRecurringDates( localDateCollectionToStringList( calendarData.getRecurringDates() ) );
        calendarDataV1.setNextTenRecurringDates( localDateCollectionToStringList( calendarData.getNextTenRecurringDates() ) );
        calendarDataV1.setHumanReadable( calendarData.getHumanReadable() );
        calendarDataV1.setRecentEligibleMeetingDate( avroDateTimeMapper.mapLocalDate( calendarData.getRecentEligibleMeetingDate() ) );
        calendarDataV1.setCreatedDate( avroDateTimeMapper.mapOffsetDateTime( calendarData.getCreatedDate() ) );
        calendarDataV1.setLastUpdatedDate( avroDateTimeMapper.mapOffsetDateTime( calendarData.getLastUpdatedDate() ) );
        calendarDataV1.setCreatedByUserId( calendarData.getCreatedByUserId() );
        calendarDataV1.setCreatedByUsername( calendarData.getCreatedByUsername() );
        calendarDataV1.setLastUpdatedByUserId( calendarData.getLastUpdatedByUserId() );
        calendarDataV1.setLastUpdatedByUsername( calendarData.getLastUpdatedByUsername() );
        calendarDataV1.setRepeatsOnDayOfMonth( calendarData.getRepeatsOnDayOfMonth() );

        return calendarDataV1;
    }

    protected List<CalendarDataV1> calendarDataCollectionToCalendarDataV1List(Collection<CalendarData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<CalendarDataV1> list = new ArrayList<CalendarDataV1>( collection.size() );
        for ( CalendarData calendarData : collection ) {
            list.add( calendarDataToCalendarDataV1( calendarData ) );
        }

        return list;
    }

    protected GroupGeneralDataV1 groupGeneralDataToGroupGeneralDataV1(GroupGeneralData groupGeneralData) {
        if ( groupGeneralData == null ) {
            return null;
        }

        GroupGeneralDataV1 groupGeneralDataV1 = new GroupGeneralDataV1();

        groupGeneralDataV1.setId( groupGeneralData.getId() );
        groupGeneralDataV1.setAccountNo( groupGeneralData.getAccountNo() );
        groupGeneralDataV1.setName( groupGeneralData.getName() );
        groupGeneralDataV1.setExternalId( groupGeneralData.getExternalId() );
        groupGeneralDataV1.setStatus( enumOptionDataToEnumOptionDataV1( groupGeneralData.getStatus() ) );
        groupGeneralDataV1.setActive( groupGeneralData.getActive() );
        groupGeneralDataV1.setActivationDate( avroDateTimeMapper.mapLocalDate( groupGeneralData.getActivationDate() ) );
        groupGeneralDataV1.setOfficeId( groupGeneralData.getOfficeId() );
        groupGeneralDataV1.setOfficeName( groupGeneralData.getOfficeName() );
        groupGeneralDataV1.setCenterId( groupGeneralData.getCenterId() );
        groupGeneralDataV1.setCenterName( groupGeneralData.getCenterName() );
        groupGeneralDataV1.setStaffId( groupGeneralData.getStaffId() );
        groupGeneralDataV1.setStaffName( groupGeneralData.getStaffName() );
        groupGeneralDataV1.setHierarchy( groupGeneralData.getHierarchy() );
        groupGeneralDataV1.setGroupLevel( groupGeneralData.getGroupLevel() );
        groupGeneralDataV1.setGroupRoles( groupRoleDataCollectionToGroupRoleDataV1List( groupGeneralData.getGroupRoles() ) );
        groupGeneralDataV1.setCalendarsData( calendarDataCollectionToCalendarDataV1List( groupGeneralData.getCalendarsData() ) );
        groupGeneralDataV1.setCollectionMeetingCalendar( calendarDataToCalendarDataV1( groupGeneralData.getCollectionMeetingCalendar() ) );

        return groupGeneralDataV1;
    }

    protected List<GroupGeneralDataV1> groupGeneralDataCollectionToGroupGeneralDataV1List(Collection<GroupGeneralData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<GroupGeneralDataV1> list = new ArrayList<GroupGeneralDataV1>( collection.size() );
        for ( GroupGeneralData groupGeneralData : collection ) {
            list.add( groupGeneralDataToGroupGeneralDataV1( groupGeneralData ) );
        }

        return list;
    }
}
