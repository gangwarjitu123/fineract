package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.accounting.glaccount.data.GLAccountData;
import org.apache.fineract.avro.generic.v1.CodeValueDataV1;
import org.apache.fineract.avro.generic.v1.CurrencyDataV1;
import org.apache.fineract.avro.generic.v1.EnumOptionDataV1;
import org.apache.fineract.avro.gl.v1.GLAccountDataV1;
import org.apache.fineract.avro.loan.v1.LoanChargeDataRangeViewV1;
import org.apache.fineract.avro.loan.v1.LoanChargeDataV1;
import org.apache.fineract.avro.loan.v1.LoanInstallmentChargeDataV1;
import org.apache.fineract.avro.payment.v1.PaymentTypeDataV1;
import org.apache.fineract.avro.portfolio.v1.ChargeDataV1;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroMonthDayMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.ExternalIdMapper;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.apache.fineract.portfolio.charge.data.ChargeData;
import org.apache.fineract.portfolio.loanaccount.data.LoanChargeData;
import org.apache.fineract.portfolio.loanaccount.data.LoanInstallmentChargeData;
import org.apache.fineract.portfolio.paymenttype.data.PaymentTypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:19+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanChargeDataMapperImpl implements LoanChargeDataMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;
    private final AvroMonthDayMapper avroMonthDayMapper;
    private final ExternalIdMapper externalIdMapper;

    @Autowired
    public LoanChargeDataMapperImpl(AvroDateTimeMapper avroDateTimeMapper, AvroMonthDayMapper avroMonthDayMapper, ExternalIdMapper externalIdMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
        this.avroMonthDayMapper = avroMonthDayMapper;
        this.externalIdMapper = externalIdMapper;
    }

    @Override
    public LoanChargeDataV1 map(LoanChargeData source) {
        if ( source == null ) {
            return null;
        }

        LoanChargeDataV1 loanChargeDataV1 = new LoanChargeDataV1();

        loanChargeDataV1.setId( source.getId() );
        loanChargeDataV1.setChargeId( source.getChargeId() );
        loanChargeDataV1.setName( source.getName() );
        loanChargeDataV1.setChargeTimeType( enumOptionDataToEnumOptionDataV1( source.getChargeTimeType() ) );
        loanChargeDataV1.setDueDate( avroDateTimeMapper.mapLocalDate( source.getDueDate() ) );
        loanChargeDataV1.setChargeCalculationType( enumOptionDataToEnumOptionDataV1( source.getChargeCalculationType() ) );
        loanChargeDataV1.setPercentage( source.getPercentage() );
        loanChargeDataV1.setAmountPercentageAppliedTo( source.getAmountPercentageAppliedTo() );
        loanChargeDataV1.setCurrency( currencyDataToCurrencyDataV1( source.getCurrency() ) );
        loanChargeDataV1.setAmount( source.getAmount() );
        loanChargeDataV1.setAmountPaid( source.getAmountPaid() );
        loanChargeDataV1.setAmountWaived( source.getAmountWaived() );
        loanChargeDataV1.setAmountWrittenOff( source.getAmountWrittenOff() );
        loanChargeDataV1.setAmountOutstanding( source.getAmountOutstanding() );
        loanChargeDataV1.setAmountOrPercentage( source.getAmountOrPercentage() );
        loanChargeDataV1.setChargeOptions( chargeDataCollectionToChargeDataV1List( source.getChargeOptions() ) );
        loanChargeDataV1.setPenalty( source.isPenalty() );
        loanChargeDataV1.setChargePaymentMode( enumOptionDataToEnumOptionDataV1( source.getChargePaymentMode() ) );
        loanChargeDataV1.setPaid( source.isPaid() );
        loanChargeDataV1.setWaived( source.isWaived() );
        loanChargeDataV1.setChargePayable( source.isChargePayable() );
        loanChargeDataV1.setLoanId( source.getLoanId() );
        loanChargeDataV1.setMinCap( source.getMinCap() );
        loanChargeDataV1.setMaxCap( source.getMaxCap() );
        loanChargeDataV1.setInstallmentChargeData( loanInstallmentChargeDataCollectionToLoanInstallmentChargeDataV1List( source.getInstallmentChargeData() ) );
        loanChargeDataV1.setAmountAccrued( source.getAmountAccrued() );
        loanChargeDataV1.setAmountUnrecognized( source.getAmountUnrecognized() );
        loanChargeDataV1.setExternalId( externalIdMapper.mapExternalId( source.getExternalId() ) );
        loanChargeDataV1.setExternalLoanId( externalIdMapper.mapExternalId( source.getExternalLoanId() ) );
        loanChargeDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( source.getSubmittedOnDate() ) );

        return loanChargeDataV1;
    }

    @Override
    public LoanChargeDataRangeViewV1 mapRangeView(LoanChargeData source) {
        if ( source == null ) {
            return null;
        }

        LoanChargeDataRangeViewV1 loanChargeDataRangeViewV1 = new LoanChargeDataRangeViewV1();

        if ( source.getId() != null ) {
            loanChargeDataRangeViewV1.setId( source.getId() );
        }
        loanChargeDataRangeViewV1.setName( source.getName() );
        loanChargeDataRangeViewV1.setCurrency( currencyDataToCurrencyDataV1( source.getCurrency() ) );
        loanChargeDataRangeViewV1.setAmount( source.getAmount() );

        return loanChargeDataRangeViewV1;
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

    protected LoanInstallmentChargeDataV1 loanInstallmentChargeDataToLoanInstallmentChargeDataV1(LoanInstallmentChargeData loanInstallmentChargeData) {
        if ( loanInstallmentChargeData == null ) {
            return null;
        }

        LoanInstallmentChargeDataV1 loanInstallmentChargeDataV1 = new LoanInstallmentChargeDataV1();

        loanInstallmentChargeDataV1.setInstallmentNumber( loanInstallmentChargeData.getInstallmentNumber() );
        loanInstallmentChargeDataV1.setDueDate( avroDateTimeMapper.mapLocalDate( loanInstallmentChargeData.getDueDate() ) );
        loanInstallmentChargeDataV1.setAmount( loanInstallmentChargeData.getAmount() );
        loanInstallmentChargeDataV1.setAmountOutstanding( loanInstallmentChargeData.getAmountOutstanding() );
        loanInstallmentChargeDataV1.setAmountWaived( loanInstallmentChargeData.getAmountWaived() );
        loanInstallmentChargeDataV1.setPaid( loanInstallmentChargeData.isPaid() );
        loanInstallmentChargeDataV1.setWaived( loanInstallmentChargeData.isWaived() );
        loanInstallmentChargeDataV1.setAmountAccrued( loanInstallmentChargeData.getAmountAccrued() );
        loanInstallmentChargeDataV1.setAmountUnrecognized( loanInstallmentChargeData.getAmountUnrecognized() );

        return loanInstallmentChargeDataV1;
    }

    protected List<LoanInstallmentChargeDataV1> loanInstallmentChargeDataCollectionToLoanInstallmentChargeDataV1List(Collection<LoanInstallmentChargeData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanInstallmentChargeDataV1> list = new ArrayList<LoanInstallmentChargeDataV1>( collection.size() );
        for ( LoanInstallmentChargeData loanInstallmentChargeData : collection ) {
            list.add( loanInstallmentChargeDataToLoanInstallmentChargeDataV1( loanInstallmentChargeData ) );
        }

        return list;
    }
}
