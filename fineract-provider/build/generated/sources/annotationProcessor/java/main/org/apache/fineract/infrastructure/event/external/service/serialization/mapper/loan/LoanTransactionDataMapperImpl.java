package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

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
import org.apache.fineract.avro.generic.v1.CurrencyDataV1;
import org.apache.fineract.avro.generic.v1.EnumOptionDataV1;
import org.apache.fineract.avro.group.v1.GroupGeneralDataV1;
import org.apache.fineract.avro.group.v1.GroupRoleDataV1;
import org.apache.fineract.avro.loan.v1.LoanChargePaidByDataV1;
import org.apache.fineract.avro.loan.v1.LoanTransactionDataV1;
import org.apache.fineract.avro.loan.v1.LoanTransactionEnumDataV1;
import org.apache.fineract.avro.loan.v1.LoanTransactionRelationDataV1;
import org.apache.fineract.avro.office.v1.OfficeDataV1;
import org.apache.fineract.avro.payment.v1.PaymentDetailDataV1;
import org.apache.fineract.avro.payment.v1.PaymentTypeDataV1;
import org.apache.fineract.avro.portfolio.v1.PortfolioAccountDataV1;
import org.apache.fineract.avro.savings.v1.AccountTransferDataV1;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.ExternalIdMapper;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.apache.fineract.organisation.office.data.OfficeData;
import org.apache.fineract.portfolio.account.data.AccountTransferData;
import org.apache.fineract.portfolio.account.data.PortfolioAccountData;
import org.apache.fineract.portfolio.calendar.data.CalendarData;
import org.apache.fineract.portfolio.client.data.ClientCollateralManagementData;
import org.apache.fineract.portfolio.client.data.ClientData;
import org.apache.fineract.portfolio.client.data.ClientTimelineData;
import org.apache.fineract.portfolio.group.data.GroupGeneralData;
import org.apache.fineract.portfolio.group.data.GroupRoleData;
import org.apache.fineract.portfolio.loanaccount.data.LoanChargePaidByData;
import org.apache.fineract.portfolio.loanaccount.data.LoanTransactionData;
import org.apache.fineract.portfolio.loanaccount.data.LoanTransactionEnumData;
import org.apache.fineract.portfolio.loanaccount.data.LoanTransactionRelationData;
import org.apache.fineract.portfolio.paymentdetail.data.PaymentDetailData;
import org.apache.fineract.portfolio.paymenttype.data.PaymentTypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:18+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanTransactionDataMapperImpl implements LoanTransactionDataMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;
    private final ExternalIdMapper externalIdMapper;

    @Autowired
    public LoanTransactionDataMapperImpl(AvroDateTimeMapper avroDateTimeMapper, ExternalIdMapper externalIdMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
        this.externalIdMapper = externalIdMapper;
    }

    @Override
    public LoanTransactionDataV1 map(LoanTransactionData source) {
        if ( source == null ) {
            return null;
        }

        LoanTransactionDataV1 loanTransactionDataV1 = new LoanTransactionDataV1();

        loanTransactionDataV1.setId( source.getId() );
        loanTransactionDataV1.setLoanId( source.getLoanId() );
        loanTransactionDataV1.setExternalLoanId( externalIdMapper.mapExternalId( source.getExternalLoanId() ) );
        loanTransactionDataV1.setOfficeId( source.getOfficeId() );
        loanTransactionDataV1.setOfficeName( source.getOfficeName() );
        loanTransactionDataV1.setType( loanTransactionEnumDataToLoanTransactionEnumDataV1( source.getType() ) );
        loanTransactionDataV1.setDate( avroDateTimeMapper.mapLocalDate( source.getDate() ) );
        loanTransactionDataV1.setCurrency( currencyDataToCurrencyDataV1( source.getCurrency() ) );
        loanTransactionDataV1.setPaymentDetailData( paymentDetailDataToPaymentDetailDataV1( source.getPaymentDetailData() ) );
        loanTransactionDataV1.setAmount( source.getAmount() );
        loanTransactionDataV1.setNetDisbursalAmount( source.getNetDisbursalAmount() );
        loanTransactionDataV1.setPrincipalPortion( source.getPrincipalPortion() );
        loanTransactionDataV1.setInterestPortion( source.getInterestPortion() );
        loanTransactionDataV1.setFeeChargesPortion( source.getFeeChargesPortion() );
        loanTransactionDataV1.setPenaltyChargesPortion( source.getPenaltyChargesPortion() );
        loanTransactionDataV1.setOverpaymentPortion( source.getOverpaymentPortion() );
        loanTransactionDataV1.setUnrecognizedIncomePortion( source.getUnrecognizedIncomePortion() );
        loanTransactionDataV1.setExternalId( externalIdMapper.mapExternalId( source.getExternalId() ) );
        loanTransactionDataV1.setTransfer( accountTransferDataToAccountTransferDataV1( source.getTransfer() ) );
        loanTransactionDataV1.setFixedEmiAmount( source.getFixedEmiAmount() );
        loanTransactionDataV1.setOutstandingLoanBalance( source.getOutstandingLoanBalance() );
        loanTransactionDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( source.getSubmittedOnDate() ) );
        loanTransactionDataV1.setManuallyReversed( source.isManuallyReversed() );
        loanTransactionDataV1.setPossibleNextRepaymentDate( avroDateTimeMapper.mapLocalDate( source.getPossibleNextRepaymentDate() ) );
        loanTransactionDataV1.setLoanChargePaidByList( loanChargePaidByDataCollectionToLoanChargePaidByDataV1List( source.getLoanChargePaidByList() ) );
        loanTransactionDataV1.setTransactionRelations( loanTransactionRelationDataListToLoanTransactionRelationDataV1List( source.getTransactionRelations() ) );
        loanTransactionDataV1.setReversedOnDate( avroDateTimeMapper.mapLocalDate( source.getReversedOnDate() ) );

        return loanTransactionDataV1;
    }

    protected LoanTransactionEnumDataV1 loanTransactionEnumDataToLoanTransactionEnumDataV1(LoanTransactionEnumData loanTransactionEnumData) {
        if ( loanTransactionEnumData == null ) {
            return null;
        }

        LoanTransactionEnumDataV1 loanTransactionEnumDataV1 = new LoanTransactionEnumDataV1();

        if ( loanTransactionEnumData.getId() != null ) {
            loanTransactionEnumDataV1.setId( loanTransactionEnumData.getId().intValue() );
        }
        loanTransactionEnumDataV1.setCode( loanTransactionEnumData.getCode() );
        loanTransactionEnumDataV1.setValue( loanTransactionEnumData.getValue() );
        loanTransactionEnumDataV1.setDisbursement( loanTransactionEnumData.isDisbursement() );
        loanTransactionEnumDataV1.setRepaymentAtDisbursement( loanTransactionEnumData.isRepaymentAtDisbursement() );
        loanTransactionEnumDataV1.setRepayment( loanTransactionEnumData.isRepayment() );
        loanTransactionEnumDataV1.setMerchantIssuedRefund( loanTransactionEnumData.isMerchantIssuedRefund() );
        loanTransactionEnumDataV1.setPayoutRefund( loanTransactionEnumData.isPayoutRefund() );
        loanTransactionEnumDataV1.setGoodwillCredit( loanTransactionEnumData.isGoodwillCredit() );
        loanTransactionEnumDataV1.setChargeRefund( loanTransactionEnumData.isChargeRefund() );
        loanTransactionEnumDataV1.setContra( loanTransactionEnumData.isContra() );
        loanTransactionEnumDataV1.setWaiveInterest( loanTransactionEnumData.isWaiveInterest() );
        loanTransactionEnumDataV1.setWaiveCharges( loanTransactionEnumData.isWaiveCharges() );
        loanTransactionEnumDataV1.setAccrual( loanTransactionEnumData.isAccrual() );
        loanTransactionEnumDataV1.setWriteOff( loanTransactionEnumData.isWriteOff() );
        loanTransactionEnumDataV1.setRecoveryRepayment( loanTransactionEnumData.isRecoveryRepayment() );
        loanTransactionEnumDataV1.setInitiateTransfer( loanTransactionEnumData.isInitiateTransfer() );
        loanTransactionEnumDataV1.setApproveTransfer( loanTransactionEnumData.isApproveTransfer() );
        loanTransactionEnumDataV1.setWithdrawTransfer( loanTransactionEnumData.isWithdrawTransfer() );
        loanTransactionEnumDataV1.setRejectTransfer( loanTransactionEnumData.isRejectTransfer() );
        loanTransactionEnumDataV1.setChargePayment( loanTransactionEnumData.isChargePayment() );
        loanTransactionEnumDataV1.setRefund( loanTransactionEnumData.isRefund() );
        loanTransactionEnumDataV1.setRefundForActiveLoans( loanTransactionEnumData.isRefundForActiveLoans() );
        loanTransactionEnumDataV1.setCreditBalanceRefund( loanTransactionEnumData.isCreditBalanceRefund() );
        loanTransactionEnumDataV1.setChargeback( loanTransactionEnumData.isChargeback() );

        return loanTransactionEnumDataV1;
    }

    protected CurrencyDataV1 currencyDataToCurrencyDataV1(CurrencyData currencyData) {
        if ( currencyData == null ) {
            return null;
        }

        CurrencyDataV1 currencyDataV1 = new CurrencyDataV1();

        currencyDataV1.setCode( currencyData.getCode() );
        currencyDataV1.setName( currencyData.getName() );
        currencyDataV1.setDecimalPlaces( currencyData.getDecimalPlaces() );
        currencyDataV1.setInMultiplesOf( currencyData.getInMultiplesOf() );
        currencyDataV1.setDisplaySymbol( currencyData.getDisplaySymbol() );
        currencyDataV1.setNameCode( currencyData.getNameCode() );
        currencyDataV1.setDisplayLabel( currencyData.getDisplayLabel() );

        return currencyDataV1;
    }

    protected PaymentTypeDataV1 paymentTypeDataToPaymentTypeDataV1(PaymentTypeData paymentTypeData) {
        if ( paymentTypeData == null ) {
            return null;
        }

        PaymentTypeDataV1 paymentTypeDataV1 = new PaymentTypeDataV1();

        paymentTypeDataV1.setId( paymentTypeData.getId() );
        paymentTypeDataV1.setName( paymentTypeData.getName() );
        paymentTypeDataV1.setDescription( paymentTypeData.getDescription() );
        paymentTypeDataV1.setIsCashPayment( paymentTypeData.getIsCashPayment() );
        if ( paymentTypeData.getPosition() != null ) {
            paymentTypeDataV1.setPosition( paymentTypeData.getPosition().longValue() );
        }
        paymentTypeDataV1.setCodeName( paymentTypeData.getCodeName() );
        paymentTypeDataV1.setIsSystemDefined( paymentTypeData.getIsSystemDefined() );

        return paymentTypeDataV1;
    }

    protected PaymentDetailDataV1 paymentDetailDataToPaymentDetailDataV1(PaymentDetailData paymentDetailData) {
        if ( paymentDetailData == null ) {
            return null;
        }

        PaymentDetailDataV1 paymentDetailDataV1 = new PaymentDetailDataV1();

        paymentDetailDataV1.setId( paymentDetailData.getId() );
        paymentDetailDataV1.setPaymentType( paymentTypeDataToPaymentTypeDataV1( paymentDetailData.getPaymentType() ) );
        paymentDetailDataV1.setAccountNumber( paymentDetailData.getAccountNumber() );
        paymentDetailDataV1.setCheckNumber( paymentDetailData.getCheckNumber() );
        paymentDetailDataV1.setRoutingCode( paymentDetailData.getRoutingCode() );
        paymentDetailDataV1.setReceiptNumber( paymentDetailData.getReceiptNumber() );
        paymentDetailDataV1.setBankNumber( paymentDetailData.getBankNumber() );

        return paymentDetailDataV1;
    }

    protected List<OfficeDataV1> officeDataCollectionToOfficeDataV1List(Collection<OfficeData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<OfficeDataV1> list = new ArrayList<OfficeDataV1>( collection.size() );
        for ( OfficeData officeData : collection ) {
            list.add( officeDataToOfficeDataV1( officeData ) );
        }

        return list;
    }

    protected OfficeDataV1 officeDataToOfficeDataV1(OfficeData officeData) {
        if ( officeData == null ) {
            return null;
        }

        OfficeDataV1 officeDataV1 = new OfficeDataV1();

        officeDataV1.setId( officeData.getId() );
        officeDataV1.setName( officeData.getName() );
        officeDataV1.setNameDecorated( officeData.getNameDecorated() );
        officeDataV1.setExternalId( externalIdMapper.mapExternalId( officeData.getExternalId() ) );
        officeDataV1.setOpeningDate( avroDateTimeMapper.mapLocalDate( officeData.getOpeningDate() ) );
        officeDataV1.setHierarchy( officeData.getHierarchy() );
        officeDataV1.setParentId( officeData.getParentId() );
        officeDataV1.setParentName( officeData.getParentName() );
        officeDataV1.setAllowedParents( officeDataCollectionToOfficeDataV1List( officeData.getAllowedParents() ) );

        return officeDataV1;
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

    protected ClientDataV1 clientDataToClientDataV1(ClientData clientData) {
        if ( clientData == null ) {
            return null;
        }

        ClientDataV1 clientDataV1 = new ClientDataV1();

        clientDataV1.setId( clientData.getId() );
        clientDataV1.setAccountNo( clientData.getAccountNo() );
        clientDataV1.setExternalId( externalIdMapper.mapExternalId( clientData.getExternalId() ) );
        clientDataV1.setStatus( enumOptionDataToEnumOptionDataV1( clientData.getStatus() ) );
        clientDataV1.setSubStatus( codeValueDataToCodeValueDataV1( clientData.getSubStatus() ) );
        clientDataV1.setActive( clientData.getActive() );
        clientDataV1.setActivationDate( avroDateTimeMapper.mapLocalDate( clientData.getActivationDate() ) );
        clientDataV1.setFirstname( clientData.getFirstname() );
        clientDataV1.setMiddlename( clientData.getMiddlename() );
        clientDataV1.setLastname( clientData.getLastname() );
        clientDataV1.setFullname( clientData.getFullname() );
        clientDataV1.setDisplayName( clientData.getDisplayName() );
        clientDataV1.setMobileNo( clientData.getMobileNo() );
        clientDataV1.setEmailAddress( clientData.getEmailAddress() );
        clientDataV1.setDateOfBirth( avroDateTimeMapper.mapLocalDate( clientData.getDateOfBirth() ) );
        clientDataV1.setGender( codeValueDataToCodeValueDataV1( clientData.getGender() ) );
        clientDataV1.setClientType( codeValueDataToCodeValueDataV1( clientData.getClientType() ) );
        clientDataV1.setClientClassification( codeValueDataToCodeValueDataV1( clientData.getClientClassification() ) );
        clientDataV1.setIsStaff( clientData.getIsStaff() );
        clientDataV1.setOfficeId( clientData.getOfficeId() );
        clientDataV1.setOfficeName( clientData.getOfficeName() );
        clientDataV1.setTransferToOfficeId( clientData.getTransferToOfficeId() );
        clientDataV1.setTransferToOfficeName( clientData.getTransferToOfficeName() );
        clientDataV1.setImageId( clientData.getImageId() );
        clientDataV1.setImagePresent( clientData.getImagePresent() );
        clientDataV1.setStaffId( clientData.getStaffId() );
        clientDataV1.setStaffName( clientData.getStaffName() );
        clientDataV1.setTimeline( clientTimelineDataToClientTimelineDataV1( clientData.getTimeline() ) );
        clientDataV1.setSavingsProductId( clientData.getSavingsProductId() );
        clientDataV1.setSavingsProductName( clientData.getSavingsProductName() );
        clientDataV1.setSavingsAccountId( clientData.getSavingsAccountId() );
        clientDataV1.setLegalForm( enumOptionDataToEnumOptionDataV1( clientData.getLegalForm() ) );
        clientDataV1.setClientCollateralManagements( clientCollateralManagementDataSetToClientCollateralManagementDataV1List( clientData.getClientCollateralManagements() ) );
        clientDataV1.setGroups( groupGeneralDataCollectionToGroupGeneralDataV1List( clientData.getGroups() ) );

        return clientDataV1;
    }

    protected PortfolioAccountDataV1 portfolioAccountDataToPortfolioAccountDataV1(PortfolioAccountData portfolioAccountData) {
        if ( portfolioAccountData == null ) {
            return null;
        }

        PortfolioAccountDataV1 portfolioAccountDataV1 = new PortfolioAccountDataV1();

        portfolioAccountDataV1.setId( portfolioAccountData.getId() );
        portfolioAccountDataV1.setAccountNo( portfolioAccountData.getAccountNo() );
        portfolioAccountDataV1.setExternalId( portfolioAccountData.getExternalId() );
        portfolioAccountDataV1.setGroupId( portfolioAccountData.getGroupId() );
        portfolioAccountDataV1.setGroupName( portfolioAccountData.getGroupName() );
        portfolioAccountDataV1.setClientId( portfolioAccountData.getClientId() );
        portfolioAccountDataV1.setClientName( portfolioAccountData.getClientName() );
        portfolioAccountDataV1.setProductId( portfolioAccountData.getProductId() );
        portfolioAccountDataV1.setProductName( portfolioAccountData.getProductName() );
        portfolioAccountDataV1.setFieldOfficerId( portfolioAccountData.getFieldOfficerId() );
        portfolioAccountDataV1.setFieldOfficerName( portfolioAccountData.getFieldOfficerName() );
        portfolioAccountDataV1.setCurrency( currencyDataToCurrencyDataV1( portfolioAccountData.getCurrency() ) );
        portfolioAccountDataV1.setAmtForTransfer( portfolioAccountData.getAmtForTransfer() );

        return portfolioAccountDataV1;
    }

    protected AccountTransferDataV1 accountTransferDataToAccountTransferDataV1(AccountTransferData accountTransferData) {
        if ( accountTransferData == null ) {
            return null;
        }

        AccountTransferDataV1 accountTransferDataV1 = new AccountTransferDataV1();

        if ( accountTransferData.getId() != null ) {
            accountTransferDataV1.setId( accountTransferData.getId().intValue() );
        }
        accountTransferDataV1.setReversed( accountTransferData.getReversed() );
        accountTransferDataV1.setCurrency( currencyDataToCurrencyDataV1( accountTransferData.getCurrency() ) );
        accountTransferDataV1.setTransferAmount( accountTransferData.getTransferAmount() );
        accountTransferDataV1.setTransferDate( avroDateTimeMapper.mapLocalDate( accountTransferData.getTransferDate() ) );
        accountTransferDataV1.setTransferDescription( accountTransferData.getTransferDescription() );
        accountTransferDataV1.setFromOffice( officeDataToOfficeDataV1( accountTransferData.getFromOffice() ) );
        accountTransferDataV1.setFromClient( clientDataToClientDataV1( accountTransferData.getFromClient() ) );
        accountTransferDataV1.setFromAccountType( enumOptionDataToEnumOptionDataV1( accountTransferData.getFromAccountType() ) );
        accountTransferDataV1.setFromAccount( portfolioAccountDataToPortfolioAccountDataV1( accountTransferData.getFromAccount() ) );
        accountTransferDataV1.setToOffice( officeDataToOfficeDataV1( accountTransferData.getToOffice() ) );
        accountTransferDataV1.setToClient( clientDataToClientDataV1( accountTransferData.getToClient() ) );
        accountTransferDataV1.setToAccountType( enumOptionDataToEnumOptionDataV1( accountTransferData.getToAccountType() ) );
        accountTransferDataV1.setToAccount( portfolioAccountDataToPortfolioAccountDataV1( accountTransferData.getToAccount() ) );

        return accountTransferDataV1;
    }

    protected LoanChargePaidByDataV1 loanChargePaidByDataToLoanChargePaidByDataV1(LoanChargePaidByData loanChargePaidByData) {
        if ( loanChargePaidByData == null ) {
            return null;
        }

        LoanChargePaidByDataV1 loanChargePaidByDataV1 = new LoanChargePaidByDataV1();

        if ( loanChargePaidByData.getId() != null ) {
            loanChargePaidByDataV1.setId( loanChargePaidByData.getId().intValue() );
        }
        loanChargePaidByDataV1.setAmount( loanChargePaidByData.getAmount() );
        loanChargePaidByDataV1.setInstallmentNumber( loanChargePaidByData.getInstallmentNumber() );
        loanChargePaidByDataV1.setChargeId( loanChargePaidByData.getChargeId() );
        loanChargePaidByDataV1.setTransactionId( loanChargePaidByData.getTransactionId() );
        loanChargePaidByDataV1.setName( loanChargePaidByData.getName() );

        return loanChargePaidByDataV1;
    }

    protected List<LoanChargePaidByDataV1> loanChargePaidByDataCollectionToLoanChargePaidByDataV1List(Collection<LoanChargePaidByData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanChargePaidByDataV1> list = new ArrayList<LoanChargePaidByDataV1>( collection.size() );
        for ( LoanChargePaidByData loanChargePaidByData : collection ) {
            list.add( loanChargePaidByDataToLoanChargePaidByDataV1( loanChargePaidByData ) );
        }

        return list;
    }

    protected LoanTransactionRelationDataV1 loanTransactionRelationDataToLoanTransactionRelationDataV1(LoanTransactionRelationData loanTransactionRelationData) {
        if ( loanTransactionRelationData == null ) {
            return null;
        }

        LoanTransactionRelationDataV1 loanTransactionRelationDataV1 = new LoanTransactionRelationDataV1();

        if ( loanTransactionRelationData.getFromLoanTransaction() != null ) {
            loanTransactionRelationDataV1.setFromLoanTransaction( loanTransactionRelationData.getFromLoanTransaction() );
        }
        loanTransactionRelationDataV1.setToLoanTransaction( loanTransactionRelationData.getToLoanTransaction() );
        loanTransactionRelationDataV1.setToLoanCharge( loanTransactionRelationData.getToLoanCharge() );
        loanTransactionRelationDataV1.setAmount( loanTransactionRelationData.getAmount() );
        if ( loanTransactionRelationData.getRelationType() != null ) {
            loanTransactionRelationDataV1.setRelationType( loanTransactionRelationData.getRelationType().name() );
        }
        loanTransactionRelationDataV1.setPaymentType( loanTransactionRelationData.getPaymentType() );

        return loanTransactionRelationDataV1;
    }

    protected List<LoanTransactionRelationDataV1> loanTransactionRelationDataListToLoanTransactionRelationDataV1List(List<LoanTransactionRelationData> list) {
        if ( list == null ) {
            return null;
        }

        List<LoanTransactionRelationDataV1> list1 = new ArrayList<LoanTransactionRelationDataV1>( list.size() );
        for ( LoanTransactionRelationData loanTransactionRelationData : list ) {
            list1.add( loanTransactionRelationDataToLoanTransactionRelationDataV1( loanTransactionRelationData ) );
        }

        return list1;
    }
}
