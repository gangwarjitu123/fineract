package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.share;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.accounting.glaccount.data.GLAccountData;
import org.apache.fineract.avro.generic.v1.CodeValueDataV1;
import org.apache.fineract.avro.generic.v1.CurrencyDataV1;
import org.apache.fineract.avro.generic.v1.EnumOptionDataV1;
import org.apache.fineract.avro.gl.v1.GLAccountDataV1;
import org.apache.fineract.avro.payment.v1.PaymentTypeDataV1;
import org.apache.fineract.avro.portfolio.v1.ChargeDataV1;
import org.apache.fineract.avro.share.v1.ShareProductDataV1;
import org.apache.fineract.avro.share.v1.ShareProductMarketPriceDataV1;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroMonthDayMapper;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.apache.fineract.portfolio.charge.data.ChargeData;
import org.apache.fineract.portfolio.paymenttype.data.PaymentTypeData;
import org.apache.fineract.portfolio.shareproducts.data.ShareProductData;
import org.apache.fineract.portfolio.shareproducts.data.ShareProductMarketPriceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ShareProductDataMapperImpl implements ShareProductDataMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;
    private final AvroMonthDayMapper avroMonthDayMapper;

    @Autowired
    public ShareProductDataMapperImpl(AvroDateTimeMapper avroDateTimeMapper, AvroMonthDayMapper avroMonthDayMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
        this.avroMonthDayMapper = avroMonthDayMapper;
    }

    @Override
    public ShareProductDataV1 map(ShareProductData source) {
        if ( source == null ) {
            return null;
        }

        ShareProductDataV1 shareProductDataV1 = new ShareProductDataV1();

        shareProductDataV1.setId( source.getId() );
        shareProductDataV1.setName( source.getName() );
        shareProductDataV1.setShortName( source.getShortName() );
        shareProductDataV1.setDescription( source.getDescription() );
        shareProductDataV1.setExternalId( source.getExternalId() );
        shareProductDataV1.setCurrency( currencyDataToCurrencyDataV1( source.getCurrency() ) );
        shareProductDataV1.setTotalShares( source.getTotalShares() );
        shareProductDataV1.setTotalSharesIssued( source.getTotalSharesIssued() );
        shareProductDataV1.setUnitPrice( source.getUnitPrice() );
        shareProductDataV1.setShareCapital( source.getShareCapital() );
        shareProductDataV1.setMinimumShares( source.getMinimumShares() );
        shareProductDataV1.setNominalShares( source.getNominalShares() );
        shareProductDataV1.setMaximumShares( source.getMaximumShares() );
        shareProductDataV1.setMarketPrice( shareProductMarketPriceDataCollectionToShareProductMarketPriceDataV1List( source.getMarketPrice() ) );
        shareProductDataV1.setCharges( chargeDataCollectionToChargeDataV1List( source.getCharges() ) );
        shareProductDataV1.setAllowDividendCalculationForInactiveClients( source.getAllowDividendCalculationForInactiveClients() );
        shareProductDataV1.setLockinPeriod( source.getLockinPeriod() );
        shareProductDataV1.setLockPeriodTypeEnum( enumOptionDataToEnumOptionDataV1( source.getLockPeriodTypeEnum() ) );
        shareProductDataV1.setMinimumActivePeriod( source.getMinimumActivePeriod() );
        shareProductDataV1.setMinimumActivePeriodForDividendsTypeEnum( enumOptionDataToEnumOptionDataV1( source.getMinimumActivePeriodForDividendsTypeEnum() ) );

        return shareProductDataV1;
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

    protected ShareProductMarketPriceDataV1 shareProductMarketPriceDataToShareProductMarketPriceDataV1(ShareProductMarketPriceData shareProductMarketPriceData) {
        if ( shareProductMarketPriceData == null ) {
            return null;
        }

        ShareProductMarketPriceDataV1 shareProductMarketPriceDataV1 = new ShareProductMarketPriceDataV1();

        shareProductMarketPriceDataV1.setId( shareProductMarketPriceData.getId() );
        shareProductMarketPriceDataV1.setFromDate( avroDateTimeMapper.mapLocalDate( shareProductMarketPriceData.getFromDate() ) );
        shareProductMarketPriceDataV1.setShareValue( shareProductMarketPriceData.getShareValue() );

        return shareProductMarketPriceDataV1;
    }

    protected List<ShareProductMarketPriceDataV1> shareProductMarketPriceDataCollectionToShareProductMarketPriceDataV1List(Collection<ShareProductMarketPriceData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<ShareProductMarketPriceDataV1> list = new ArrayList<ShareProductMarketPriceDataV1>( collection.size() );
        for ( ShareProductMarketPriceData shareProductMarketPriceData : collection ) {
            list.add( shareProductMarketPriceDataToShareProductMarketPriceDataV1( shareProductMarketPriceData ) );
        }

        return list;
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

    protected GLAccountDataV1 gLAccountDataToGLAccountDataV1(GLAccountData gLAccountData) {
        if ( gLAccountData == null ) {
            return null;
        }

        GLAccountDataV1 gLAccountDataV1 = new GLAccountDataV1();

        gLAccountDataV1.setId( gLAccountData.getId() );
        gLAccountDataV1.setName( gLAccountData.getName() );
        gLAccountDataV1.setParentId( gLAccountData.getParentId() );
        gLAccountDataV1.setGlCode( gLAccountData.getGlCode() );
        gLAccountDataV1.setDisabled( gLAccountData.getDisabled() );
        gLAccountDataV1.setManualEntriesAllowed( gLAccountData.getManualEntriesAllowed() );
        gLAccountDataV1.setType( enumOptionDataToEnumOptionDataV1( gLAccountData.getType() ) );
        gLAccountDataV1.setUsage( enumOptionDataToEnumOptionDataV1( gLAccountData.getUsage() ) );
        gLAccountDataV1.setDescription( gLAccountData.getDescription() );
        gLAccountDataV1.setNameDecorated( gLAccountData.getNameDecorated() );
        gLAccountDataV1.setTagId( codeValueDataToCodeValueDataV1( gLAccountData.getTagId() ) );
        gLAccountDataV1.setOrganizationRunningBalance( gLAccountData.getOrganizationRunningBalance() );

        return gLAccountDataV1;
    }

    protected ChargeDataV1 chargeDataToChargeDataV1(ChargeData chargeData) {
        if ( chargeData == null ) {
            return null;
        }

        ChargeDataV1 chargeDataV1 = new ChargeDataV1();

        chargeDataV1.setId( chargeData.getId() );
        chargeDataV1.setName( chargeData.getName() );
        chargeDataV1.setActive( chargeData.isActive() );
        chargeDataV1.setPenalty( chargeData.isPenalty() );
        chargeDataV1.setFreeWithdrawal( chargeData.isFreeWithdrawal() );
        chargeDataV1.setFreeWithdrawalChargeFrequency( chargeData.getFreeWithdrawalChargeFrequency() );
        chargeDataV1.setRestartFrequency( chargeData.getRestartFrequency() );
        chargeDataV1.setRestartFrequencyEnum( chargeData.getRestartFrequencyEnum() );
        chargeDataV1.setIsPaymentType( chargeData.isIsPaymentType() );
        chargeDataV1.setPaymentTypeOptions( paymentTypeDataToPaymentTypeDataV1( chargeData.getPaymentTypeOptions() ) );
        chargeDataV1.setCurrency( currencyDataToCurrencyDataV1( chargeData.getCurrency() ) );
        chargeDataV1.setAmount( chargeData.getAmount() );
        chargeDataV1.setChargeTimeType( enumOptionDataToEnumOptionDataV1( chargeData.getChargeTimeType() ) );
        chargeDataV1.setChargeAppliesTo( enumOptionDataToEnumOptionDataV1( chargeData.getChargeAppliesTo() ) );
        chargeDataV1.setChargeCalculationType( enumOptionDataToEnumOptionDataV1( chargeData.getChargeCalculationType() ) );
        chargeDataV1.setChargePaymentMode( enumOptionDataToEnumOptionDataV1( chargeData.getChargePaymentMode() ) );
        chargeDataV1.setFeeOnMonthDay( avroMonthDayMapper.mapMonthDay( chargeData.getFeeOnMonthDay() ) );
        chargeDataV1.setFeeInterval( chargeData.getFeeInterval() );
        chargeDataV1.setMinCap( chargeData.getMinCap() );
        chargeDataV1.setMaxCap( chargeData.getMaxCap() );
        chargeDataV1.setFeeFrequency( enumOptionDataToEnumOptionDataV1( chargeData.getFeeFrequency() ) );
        chargeDataV1.setIncomeOrLiabilityAccount( gLAccountDataToGLAccountDataV1( chargeData.getIncomeOrLiabilityAccount() ) );

        return chargeDataV1;
    }

    protected List<ChargeDataV1> chargeDataCollectionToChargeDataV1List(Collection<ChargeData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<ChargeDataV1> list = new ArrayList<ChargeDataV1>( collection.size() );
        for ( ChargeData chargeData : collection ) {
            list.add( chargeDataToChargeDataV1( chargeData ) );
        }

        return list;
    }
}
