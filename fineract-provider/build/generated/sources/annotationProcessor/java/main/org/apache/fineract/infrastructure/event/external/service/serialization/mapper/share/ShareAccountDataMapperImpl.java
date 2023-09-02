package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.share;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.avro.generic.v1.CurrencyDataV1;
import org.apache.fineract.avro.generic.v1.EnumOptionDataV1;
import org.apache.fineract.avro.share.v1.ShareAccountApplicationTimelineDataV1;
import org.apache.fineract.avro.share.v1.ShareAccountDataV1;
import org.apache.fineract.avro.share.v1.ShareAccountStatusEnumDataV1;
import org.apache.fineract.avro.share.v1.ShareAccountSummaryDataV1;
import org.apache.fineract.avro.share.v1.ShareAccountTransactionDataV1;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.apache.fineract.portfolio.accountdetails.data.ShareAccountSummaryData;
import org.apache.fineract.portfolio.shareaccounts.data.ShareAccountApplicationTimelineData;
import org.apache.fineract.portfolio.shareaccounts.data.ShareAccountData;
import org.apache.fineract.portfolio.shareaccounts.data.ShareAccountStatusEnumData;
import org.apache.fineract.portfolio.shareaccounts.data.ShareAccountTransactionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ShareAccountDataMapperImpl implements ShareAccountDataMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;

    @Autowired
    public ShareAccountDataMapperImpl(AvroDateTimeMapper avroDateTimeMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
    }

    @Override
    public ShareAccountDataV1 map(ShareAccountData source) {
        if ( source == null ) {
            return null;
        }

        ShareAccountDataV1 shareAccountDataV1 = new ShareAccountDataV1();

        shareAccountDataV1.setId( source.getId() );
        shareAccountDataV1.setAccountNo( source.getAccountNo() );
        shareAccountDataV1.setExternalId( source.getExternalId() );
        shareAccountDataV1.setSavingsAccountNumber( source.getSavingsAccountNumber() );
        shareAccountDataV1.setClientId( source.getClientId() );
        shareAccountDataV1.setClientName( source.getClientName() );
        shareAccountDataV1.setDefaultShares( source.getDefaultShares() );
        shareAccountDataV1.setProductId( source.getProductId() );
        shareAccountDataV1.setProductName( source.getProductName() );
        shareAccountDataV1.setStatus( shareAccountStatusEnumDataToShareAccountStatusEnumDataV1( source.getStatus() ) );
        shareAccountDataV1.setTimeline( shareAccountApplicationTimelineDataToShareAccountApplicationTimelineDataV1( source.getTimeline() ) );
        shareAccountDataV1.setCurrency( currencyDataToCurrencyDataV1( source.getCurrency() ) );
        shareAccountDataV1.setSummary( shareAccountSummaryDataToShareAccountSummaryDataV1( source.getSummary() ) );
        shareAccountDataV1.setPurchasedShares( shareAccountTransactionDataCollectionToShareAccountTransactionDataV1List( source.getPurchasedShares() ) );
        shareAccountDataV1.setSavingsAccountId( source.getSavingsAccountId() );
        shareAccountDataV1.setCurrentMarketPrice( source.getCurrentMarketPrice() );
        shareAccountDataV1.setLockinPeriod( source.getLockinPeriod() );
        shareAccountDataV1.setLockPeriodTypeEnum( enumOptionDataToEnumOptionDataV1( source.getLockPeriodTypeEnum() ) );
        shareAccountDataV1.setMinimumActivePeriod( source.getMinimumActivePeriod() );
        shareAccountDataV1.setMinimumActivePeriodTypeEnum( enumOptionDataToEnumOptionDataV1( source.getMinimumActivePeriodTypeEnum() ) );
        shareAccountDataV1.setAllowDividendCalculationForInactiveClients( source.getAllowDividendCalculationForInactiveClients() );

        return shareAccountDataV1;
    }

    protected ShareAccountStatusEnumDataV1 shareAccountStatusEnumDataToShareAccountStatusEnumDataV1(ShareAccountStatusEnumData shareAccountStatusEnumData) {
        if ( shareAccountStatusEnumData == null ) {
            return null;
        }

        ShareAccountStatusEnumDataV1 shareAccountStatusEnumDataV1 = new ShareAccountStatusEnumDataV1();

        shareAccountStatusEnumDataV1.setId( shareAccountStatusEnumData.getId() );
        shareAccountStatusEnumDataV1.setCode( shareAccountStatusEnumData.getCode() );
        shareAccountStatusEnumDataV1.setValue( shareAccountStatusEnumData.getValue() );
        shareAccountStatusEnumDataV1.setSubmittedAndPendingApproval( shareAccountStatusEnumData.isSubmittedAndPendingApproval() );
        shareAccountStatusEnumDataV1.setApproved( shareAccountStatusEnumData.isApproved() );
        shareAccountStatusEnumDataV1.setRejected( shareAccountStatusEnumData.isRejected() );
        shareAccountStatusEnumDataV1.setActive( shareAccountStatusEnumData.isActive() );
        shareAccountStatusEnumDataV1.setClosed( shareAccountStatusEnumData.isClosed() );

        return shareAccountStatusEnumDataV1;
    }

    protected ShareAccountApplicationTimelineDataV1 shareAccountApplicationTimelineDataToShareAccountApplicationTimelineDataV1(ShareAccountApplicationTimelineData shareAccountApplicationTimelineData) {
        if ( shareAccountApplicationTimelineData == null ) {
            return null;
        }

        ShareAccountApplicationTimelineDataV1 shareAccountApplicationTimelineDataV1 = new ShareAccountApplicationTimelineDataV1();

        shareAccountApplicationTimelineDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( shareAccountApplicationTimelineData.getSubmittedOnDate() ) );
        shareAccountApplicationTimelineDataV1.setSubmittedByUsername( shareAccountApplicationTimelineData.getSubmittedByUsername() );
        shareAccountApplicationTimelineDataV1.setSubmittedByFirstname( shareAccountApplicationTimelineData.getSubmittedByFirstname() );
        shareAccountApplicationTimelineDataV1.setSubmittedByLastname( shareAccountApplicationTimelineData.getSubmittedByLastname() );
        shareAccountApplicationTimelineDataV1.setRejectedDate( avroDateTimeMapper.mapLocalDate( shareAccountApplicationTimelineData.getRejectedDate() ) );
        shareAccountApplicationTimelineDataV1.setRejectedByUsername( shareAccountApplicationTimelineData.getRejectedByUsername() );
        shareAccountApplicationTimelineDataV1.setRejectedByFirstname( shareAccountApplicationTimelineData.getRejectedByFirstname() );
        shareAccountApplicationTimelineDataV1.setRejectedByLastname( shareAccountApplicationTimelineData.getRejectedByLastname() );
        shareAccountApplicationTimelineDataV1.setApprovedDate( avroDateTimeMapper.mapLocalDate( shareAccountApplicationTimelineData.getApprovedDate() ) );
        shareAccountApplicationTimelineDataV1.setApprovedByUsername( shareAccountApplicationTimelineData.getApprovedByUsername() );
        shareAccountApplicationTimelineDataV1.setApprovedByFirstname( shareAccountApplicationTimelineData.getApprovedByFirstname() );
        shareAccountApplicationTimelineDataV1.setApprovedByLastname( shareAccountApplicationTimelineData.getApprovedByLastname() );
        shareAccountApplicationTimelineDataV1.setActivatedDate( avroDateTimeMapper.mapLocalDate( shareAccountApplicationTimelineData.getActivatedDate() ) );
        shareAccountApplicationTimelineDataV1.setActivatedByUsername( shareAccountApplicationTimelineData.getActivatedByUsername() );
        shareAccountApplicationTimelineDataV1.setActivatedByFirstname( shareAccountApplicationTimelineData.getActivatedByFirstname() );
        shareAccountApplicationTimelineDataV1.setActivatedByLastname( shareAccountApplicationTimelineData.getActivatedByLastname() );
        shareAccountApplicationTimelineDataV1.setClosedDate( avroDateTimeMapper.mapLocalDate( shareAccountApplicationTimelineData.getClosedDate() ) );
        shareAccountApplicationTimelineDataV1.setClosedByUsername( shareAccountApplicationTimelineData.getClosedByUsername() );
        shareAccountApplicationTimelineDataV1.setClosedByFirstname( shareAccountApplicationTimelineData.getClosedByFirstname() );
        shareAccountApplicationTimelineDataV1.setClosedByLastname( shareAccountApplicationTimelineData.getClosedByLastname() );

        return shareAccountApplicationTimelineDataV1;
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

    protected ShareAccountSummaryDataV1 shareAccountSummaryDataToShareAccountSummaryDataV1(ShareAccountSummaryData shareAccountSummaryData) {
        if ( shareAccountSummaryData == null ) {
            return null;
        }

        ShareAccountSummaryDataV1 shareAccountSummaryDataV1 = new ShareAccountSummaryDataV1();

        shareAccountSummaryDataV1.setId( shareAccountSummaryData.getId() );
        shareAccountSummaryDataV1.setAccountNo( shareAccountSummaryData.getAccountNo() );
        shareAccountSummaryDataV1.setTotalApprovedShares( shareAccountSummaryData.getTotalApprovedShares() );
        shareAccountSummaryDataV1.setTotalPendingForApprovalShares( shareAccountSummaryData.getTotalPendingForApprovalShares() );
        shareAccountSummaryDataV1.setExternalId( shareAccountSummaryData.getExternalId() );
        shareAccountSummaryDataV1.setProductId( shareAccountSummaryData.getProductId() );
        shareAccountSummaryDataV1.setProductName( shareAccountSummaryData.getProductName() );
        shareAccountSummaryDataV1.setShortProductName( shareAccountSummaryData.getShortProductName() );
        shareAccountSummaryDataV1.setStatus( shareAccountStatusEnumDataToShareAccountStatusEnumDataV1( shareAccountSummaryData.getStatus() ) );
        shareAccountSummaryDataV1.setCurrency( currencyDataToCurrencyDataV1( shareAccountSummaryData.getCurrency() ) );
        shareAccountSummaryDataV1.setTimeline( shareAccountApplicationTimelineDataToShareAccountApplicationTimelineDataV1( shareAccountSummaryData.getTimeline() ) );

        return shareAccountSummaryDataV1;
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

    protected ShareAccountTransactionDataV1 shareAccountTransactionDataToShareAccountTransactionDataV1(ShareAccountTransactionData shareAccountTransactionData) {
        if ( shareAccountTransactionData == null ) {
            return null;
        }

        ShareAccountTransactionDataV1 shareAccountTransactionDataV1 = new ShareAccountTransactionDataV1();

        shareAccountTransactionDataV1.setId( shareAccountTransactionData.getId() );
        shareAccountTransactionDataV1.setAccountId( shareAccountTransactionData.getAccountId() );
        shareAccountTransactionDataV1.setPurchasedDate( avroDateTimeMapper.mapLocalDate( shareAccountTransactionData.getPurchasedDate() ) );
        shareAccountTransactionDataV1.setNumberOfShares( shareAccountTransactionData.getNumberOfShares() );
        shareAccountTransactionDataV1.setPurchasedPrice( shareAccountTransactionData.getPurchasedPrice() );
        shareAccountTransactionDataV1.setStatus( enumOptionDataToEnumOptionDataV1( shareAccountTransactionData.getStatus() ) );
        shareAccountTransactionDataV1.setType( enumOptionDataToEnumOptionDataV1( shareAccountTransactionData.getType() ) );
        shareAccountTransactionDataV1.setAmount( shareAccountTransactionData.getAmount() );
        shareAccountTransactionDataV1.setChargeAmount( shareAccountTransactionData.getChargeAmount() );
        shareAccountTransactionDataV1.setAmountPaid( shareAccountTransactionData.getAmountPaid() );

        return shareAccountTransactionDataV1;
    }

    protected List<ShareAccountTransactionDataV1> shareAccountTransactionDataCollectionToShareAccountTransactionDataV1List(Collection<ShareAccountTransactionData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<ShareAccountTransactionDataV1> list = new ArrayList<ShareAccountTransactionDataV1>( collection.size() );
        for ( ShareAccountTransactionData shareAccountTransactionData : collection ) {
            list.add( shareAccountTransactionDataToShareAccountTransactionDataV1( shareAccountTransactionData ) );
        }

        return list;
    }
}
