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
import org.apache.fineract.avro.loan.v1.DelinquencyBucketDataV1;
import org.apache.fineract.avro.loan.v1.DelinquencyRangeDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductBorrowerCycleVariationDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductGuaranteeDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductInterestRecalculationDataV1;
import org.apache.fineract.avro.payment.v1.PaymentTypeDataV1;
import org.apache.fineract.avro.portfolio.v1.ChargeDataV1;
import org.apache.fineract.avro.portfolio.v1.RateDataV1;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroMonthDayMapper;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.apache.fineract.portfolio.charge.data.ChargeData;
import org.apache.fineract.portfolio.delinquency.data.DelinquencyBucketData;
import org.apache.fineract.portfolio.delinquency.data.DelinquencyRangeData;
import org.apache.fineract.portfolio.loanproduct.data.LoanProductBorrowerCycleVariationData;
import org.apache.fineract.portfolio.loanproduct.data.LoanProductData;
import org.apache.fineract.portfolio.loanproduct.data.LoanProductGuaranteeData;
import org.apache.fineract.portfolio.loanproduct.data.LoanProductInterestRecalculationData;
import org.apache.fineract.portfolio.paymenttype.data.PaymentTypeData;
import org.apache.fineract.portfolio.rate.data.RateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T15:00:18+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanProductDataMapperImpl implements LoanProductDataMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;
    private final AvroMonthDayMapper avroMonthDayMapper;

    @Autowired
    public LoanProductDataMapperImpl(AvroDateTimeMapper avroDateTimeMapper, AvroMonthDayMapper avroMonthDayMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
        this.avroMonthDayMapper = avroMonthDayMapper;
    }

    @Override
    public LoanProductDataV1 map(LoanProductData source) {
        if ( source == null ) {
            return null;
        }

        LoanProductDataV1 loanProductDataV1 = new LoanProductDataV1();

        loanProductDataV1.setId( source.getId() );
        loanProductDataV1.setName( source.getName() );
        loanProductDataV1.setShortName( source.getShortName() );
        loanProductDataV1.setDescription( source.getDescription() );
        loanProductDataV1.setFundId( source.getFundId() );
        loanProductDataV1.setFundName( source.getFundName() );
        loanProductDataV1.setIncludeInBorrowerCycle( source.isIncludeInBorrowerCycle() );
        loanProductDataV1.setUseBorrowerCycle( source.isUseBorrowerCycle() );
        loanProductDataV1.setStartDate( avroDateTimeMapper.mapLocalDate( source.getStartDate() ) );
        loanProductDataV1.setCloseDate( avroDateTimeMapper.mapLocalDate( source.getCloseDate() ) );
        loanProductDataV1.setStatus( source.getStatus() );
        loanProductDataV1.setExternalId( source.getExternalId() );
        loanProductDataV1.setCurrency( currencyDataToCurrencyDataV1( source.getCurrency() ) );
        loanProductDataV1.setPrincipal( source.getPrincipal() );
        loanProductDataV1.setMinPrincipal( source.getMinPrincipal() );
        loanProductDataV1.setMaxPrincipal( source.getMaxPrincipal() );
        loanProductDataV1.setNumberOfRepayments( source.getNumberOfRepayments() );
        loanProductDataV1.setMinNumberOfRepayments( source.getMinNumberOfRepayments() );
        loanProductDataV1.setMaxNumberOfRepayments( source.getMaxNumberOfRepayments() );
        loanProductDataV1.setRepaymentEvery( source.getRepaymentEvery() );
        loanProductDataV1.setRepaymentFrequencyType( enumOptionDataToEnumOptionDataV1( source.getRepaymentFrequencyType() ) );
        loanProductDataV1.setInterestRatePerPeriod( source.getInterestRatePerPeriod() );
        loanProductDataV1.setMinInterestRatePerPeriod( source.getMinInterestRatePerPeriod() );
        loanProductDataV1.setMaxInterestRatePerPeriod( source.getMaxInterestRatePerPeriod() );
        loanProductDataV1.setInterestRateFrequencyType( enumOptionDataToEnumOptionDataV1( source.getInterestRateFrequencyType() ) );
        loanProductDataV1.setAnnualInterestRate( source.getAnnualInterestRate() );
        loanProductDataV1.setIsLinkedToFloatingInterestRates( source.isIsLinkedToFloatingInterestRates() );
        if ( source.getFloatingRateId() != null ) {
            loanProductDataV1.setFloatingRateId( source.getFloatingRateId().longValue() );
        }
        loanProductDataV1.setFloatingRateName( source.getFloatingRateName() );
        loanProductDataV1.setInterestRateDifferential( source.getInterestRateDifferential() );
        loanProductDataV1.setMinDifferentialLendingRate( source.getMinDifferentialLendingRate() );
        loanProductDataV1.setDefaultDifferentialLendingRate( source.getDefaultDifferentialLendingRate() );
        loanProductDataV1.setMaxDifferentialLendingRate( source.getMaxDifferentialLendingRate() );
        loanProductDataV1.setIsFloatingInterestRateCalculationAllowed( source.isIsFloatingInterestRateCalculationAllowed() );
        loanProductDataV1.setAllowVariableInstallments( source.isAllowVariableInstallments() );
        loanProductDataV1.setMinimumGap( source.getMinimumGap() );
        loanProductDataV1.setMaximumGap( source.getMaximumGap() );
        loanProductDataV1.setAmortizationType( enumOptionDataToEnumOptionDataV1( source.getAmortizationType() ) );
        loanProductDataV1.setInterestType( enumOptionDataToEnumOptionDataV1( source.getInterestType() ) );
        loanProductDataV1.setInterestCalculationPeriodType( enumOptionDataToEnumOptionDataV1( source.getInterestCalculationPeriodType() ) );
        loanProductDataV1.setAllowPartialPeriodInterestCalculation( source.getAllowPartialPeriodInterestCalculation() );
        loanProductDataV1.setInArrearsTolerance( source.getInArrearsTolerance() );
        loanProductDataV1.setTransactionProcessingStrategyCode( source.getTransactionProcessingStrategyCode() );
        loanProductDataV1.setTransactionProcessingStrategyName( source.getTransactionProcessingStrategyName() );
        loanProductDataV1.setGraceOnPrincipalPayment( source.getGraceOnPrincipalPayment() );
        loanProductDataV1.setRecurringMoratoriumOnPrincipalPeriods( source.getRecurringMoratoriumOnPrincipalPeriods() );
        loanProductDataV1.setGraceOnInterestPayment( source.getGraceOnInterestPayment() );
        loanProductDataV1.setGraceOnInterestCharged( source.getGraceOnInterestCharged() );
        loanProductDataV1.setGraceOnArrearsAgeing( source.getGraceOnArrearsAgeing() );
        loanProductDataV1.setOverdueDaysForNPA( source.getOverdueDaysForNPA() );
        loanProductDataV1.setDaysInMonthType( enumOptionDataToEnumOptionDataV1( source.getDaysInMonthType() ) );
        loanProductDataV1.setDaysInYearType( enumOptionDataToEnumOptionDataV1( source.getDaysInYearType() ) );
        loanProductDataV1.setIsInterestRecalculationEnabled( source.isIsInterestRecalculationEnabled() );
        loanProductDataV1.setInterestRecalculationData( loanProductInterestRecalculationDataToLoanProductInterestRecalculationDataV1( source.getInterestRecalculationData() ) );
        loanProductDataV1.setMinimumDaysBetweenDisbursalAndFirstRepayment( source.getMinimumDaysBetweenDisbursalAndFirstRepayment() );
        loanProductDataV1.setCanDefineInstallmentAmount( source.isCanDefineInstallmentAmount() );
        loanProductDataV1.setInstallmentAmountInMultiplesOf( source.getInstallmentAmountInMultiplesOf() );
        loanProductDataV1.setCharges( chargeDataCollectionToChargeDataV1List( source.getCharges() ) );
        loanProductDataV1.setPrincipalVariationsForBorrowerCycle( loanProductBorrowerCycleVariationDataCollectionToLoanProductBorrowerCycleVariationDataV1List( source.getPrincipalVariationsForBorrowerCycle() ) );
        loanProductDataV1.setInterestRateVariationsForBorrowerCycle( loanProductBorrowerCycleVariationDataCollectionToLoanProductBorrowerCycleVariationDataV1List( source.getInterestRateVariationsForBorrowerCycle() ) );
        loanProductDataV1.setNumberOfRepaymentVariationsForBorrowerCycle( loanProductBorrowerCycleVariationDataCollectionToLoanProductBorrowerCycleVariationDataV1List( source.getNumberOfRepaymentVariationsForBorrowerCycle() ) );
        loanProductDataV1.setIsRatesEnabled( source.isIsRatesEnabled() );
        loanProductDataV1.setRates( rateDataCollectionToRateDataV1List( source.getRates() ) );
        loanProductDataV1.setMultiDisburseLoan( source.getMultiDisburseLoan() );
        loanProductDataV1.setMaxTrancheCount( source.getMaxTrancheCount() );
        loanProductDataV1.setOutstandingLoanBalance( source.getOutstandingLoanBalance() );
        loanProductDataV1.setDisallowExpectedDisbursements( source.getDisallowExpectedDisbursements() );
        loanProductDataV1.setAllowApprovedDisbursedAmountsOverApplied( source.getAllowApprovedDisbursedAmountsOverApplied() );
        loanProductDataV1.setOverAppliedCalculationType( source.getOverAppliedCalculationType() );
        loanProductDataV1.setOverAppliedNumber( source.getOverAppliedNumber() );
        loanProductDataV1.setPrincipalThresholdForLastInstallment( source.getPrincipalThresholdForLastInstallment() );
        loanProductDataV1.setHoldGuaranteeFunds( source.getHoldGuaranteeFunds() );
        loanProductDataV1.setProductGuaranteeData( loanProductGuaranteeDataToLoanProductGuaranteeDataV1( source.getProductGuaranteeData() ) );
        loanProductDataV1.setAccountMovesOutOfNPAOnlyOnArrearsCompletion( source.getAccountMovesOutOfNPAOnlyOnArrearsCompletion() );
        loanProductDataV1.setSyncExpectedWithDisbursementDate( source.isSyncExpectedWithDisbursementDate() );
        loanProductDataV1.setIsEqualAmortization( source.isIsEqualAmortization() );
        loanProductDataV1.setFixedPrincipalPercentagePerInstallment( source.getFixedPrincipalPercentagePerInstallment() );
        loanProductDataV1.setDelinquencyBucket( delinquencyBucketDataToDelinquencyBucketDataV1( source.getDelinquencyBucket() ) );

        return loanProductDataV1;
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

    protected LoanProductInterestRecalculationDataV1 loanProductInterestRecalculationDataToLoanProductInterestRecalculationDataV1(LoanProductInterestRecalculationData loanProductInterestRecalculationData) {
        if ( loanProductInterestRecalculationData == null ) {
            return null;
        }

        LoanProductInterestRecalculationDataV1 loanProductInterestRecalculationDataV1 = new LoanProductInterestRecalculationDataV1();

        loanProductInterestRecalculationDataV1.setId( loanProductInterestRecalculationData.getId() );
        loanProductInterestRecalculationDataV1.setProductId( loanProductInterestRecalculationData.getProductId() );
        loanProductInterestRecalculationDataV1.setInterestRecalculationCompoundingType( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getInterestRecalculationCompoundingType() ) );
        loanProductInterestRecalculationDataV1.setRescheduleStrategyType( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getRescheduleStrategyType() ) );
        loanProductInterestRecalculationDataV1.setRecalculationRestFrequencyType( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getRecalculationRestFrequencyType() ) );
        loanProductInterestRecalculationDataV1.setRecalculationRestFrequencyInterval( loanProductInterestRecalculationData.getRecalculationRestFrequencyInterval() );
        loanProductInterestRecalculationDataV1.setRecalculationRestFrequencyNthDay( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getRecalculationRestFrequencyNthDay() ) );
        loanProductInterestRecalculationDataV1.setRecalculationRestFrequencyWeekday( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getRecalculationRestFrequencyWeekday() ) );
        loanProductInterestRecalculationDataV1.setRecalculationRestFrequencyOnDay( loanProductInterestRecalculationData.getRecalculationRestFrequencyOnDay() );
        loanProductInterestRecalculationDataV1.setRecalculationCompoundingFrequencyType( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getRecalculationCompoundingFrequencyType() ) );
        loanProductInterestRecalculationDataV1.setRecalculationCompoundingFrequencyInterval( loanProductInterestRecalculationData.getRecalculationCompoundingFrequencyInterval() );
        loanProductInterestRecalculationDataV1.setRecalculationCompoundingFrequencyNthDay( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getRecalculationCompoundingFrequencyNthDay() ) );
        loanProductInterestRecalculationDataV1.setRecalculationCompoundingFrequencyWeekday( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getRecalculationCompoundingFrequencyWeekday() ) );
        loanProductInterestRecalculationDataV1.setRecalculationCompoundingFrequencyOnDay( loanProductInterestRecalculationData.getRecalculationCompoundingFrequencyOnDay() );
        loanProductInterestRecalculationDataV1.setIsArrearsBasedOnOriginalSchedule( loanProductInterestRecalculationData.isIsArrearsBasedOnOriginalSchedule() );
        loanProductInterestRecalculationDataV1.setIsCompoundingToBePostedAsTransaction( loanProductInterestRecalculationData.isIsCompoundingToBePostedAsTransaction() );
        loanProductInterestRecalculationDataV1.setPreClosureInterestCalculationStrategy( enumOptionDataToEnumOptionDataV1( loanProductInterestRecalculationData.getPreClosureInterestCalculationStrategy() ) );
        loanProductInterestRecalculationDataV1.setAllowCompoundingOnEod( loanProductInterestRecalculationData.isAllowCompoundingOnEod() );

        return loanProductInterestRecalculationDataV1;
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

    protected LoanProductBorrowerCycleVariationDataV1 loanProductBorrowerCycleVariationDataToLoanProductBorrowerCycleVariationDataV1(LoanProductBorrowerCycleVariationData loanProductBorrowerCycleVariationData) {
        if ( loanProductBorrowerCycleVariationData == null ) {
            return null;
        }

        LoanProductBorrowerCycleVariationDataV1 loanProductBorrowerCycleVariationDataV1 = new LoanProductBorrowerCycleVariationDataV1();

        loanProductBorrowerCycleVariationDataV1.setId( loanProductBorrowerCycleVariationData.getId() );
        loanProductBorrowerCycleVariationDataV1.setBorrowerCycleNumber( loanProductBorrowerCycleVariationData.getBorrowerCycleNumber() );
        loanProductBorrowerCycleVariationDataV1.setParamType( enumOptionDataToEnumOptionDataV1( loanProductBorrowerCycleVariationData.getParamType() ) );
        loanProductBorrowerCycleVariationDataV1.setValueConditionType( enumOptionDataToEnumOptionDataV1( loanProductBorrowerCycleVariationData.getValueConditionType() ) );
        loanProductBorrowerCycleVariationDataV1.setMinValue( loanProductBorrowerCycleVariationData.getMinValue() );
        loanProductBorrowerCycleVariationDataV1.setMaxValue( loanProductBorrowerCycleVariationData.getMaxValue() );
        loanProductBorrowerCycleVariationDataV1.setDefaultValue( loanProductBorrowerCycleVariationData.getDefaultValue() );

        return loanProductBorrowerCycleVariationDataV1;
    }

    protected List<LoanProductBorrowerCycleVariationDataV1> loanProductBorrowerCycleVariationDataCollectionToLoanProductBorrowerCycleVariationDataV1List(Collection<LoanProductBorrowerCycleVariationData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanProductBorrowerCycleVariationDataV1> list = new ArrayList<LoanProductBorrowerCycleVariationDataV1>( collection.size() );
        for ( LoanProductBorrowerCycleVariationData loanProductBorrowerCycleVariationData : collection ) {
            list.add( loanProductBorrowerCycleVariationDataToLoanProductBorrowerCycleVariationDataV1( loanProductBorrowerCycleVariationData ) );
        }

        return list;
    }

    protected RateDataV1 rateDataToRateDataV1(RateData rateData) {
        if ( rateData == null ) {
            return null;
        }

        RateDataV1 rateDataV1 = new RateDataV1();

        rateDataV1.setId( rateData.getId() );
        rateDataV1.setName( rateData.getName() );
        rateDataV1.setPercentage( rateData.getPercentage() );
        rateDataV1.setProductApply( enumOptionDataToEnumOptionDataV1( rateData.getProductApply() ) );
        rateDataV1.setActive( rateData.isActive() );

        return rateDataV1;
    }

    protected List<RateDataV1> rateDataCollectionToRateDataV1List(Collection<RateData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<RateDataV1> list = new ArrayList<RateDataV1>( collection.size() );
        for ( RateData rateData : collection ) {
            list.add( rateDataToRateDataV1( rateData ) );
        }

        return list;
    }

    protected LoanProductGuaranteeDataV1 loanProductGuaranteeDataToLoanProductGuaranteeDataV1(LoanProductGuaranteeData loanProductGuaranteeData) {
        if ( loanProductGuaranteeData == null ) {
            return null;
        }

        LoanProductGuaranteeDataV1 loanProductGuaranteeDataV1 = new LoanProductGuaranteeDataV1();

        loanProductGuaranteeDataV1.setId( loanProductGuaranteeData.getId() );
        loanProductGuaranteeDataV1.setProductId( loanProductGuaranteeData.getProductId() );
        loanProductGuaranteeDataV1.setMandatoryGuarantee( loanProductGuaranteeData.getMandatoryGuarantee() );
        loanProductGuaranteeDataV1.setMinimumGuaranteeFromOwnFunds( loanProductGuaranteeData.getMinimumGuaranteeFromOwnFunds() );
        loanProductGuaranteeDataV1.setMinimumGuaranteeFromGuarantor( loanProductGuaranteeData.getMinimumGuaranteeFromGuarantor() );

        return loanProductGuaranteeDataV1;
    }

    protected DelinquencyRangeDataV1 delinquencyRangeDataToDelinquencyRangeDataV1(DelinquencyRangeData delinquencyRangeData) {
        if ( delinquencyRangeData == null ) {
            return null;
        }

        DelinquencyRangeDataV1 delinquencyRangeDataV1 = new DelinquencyRangeDataV1();

        delinquencyRangeDataV1.setId( delinquencyRangeData.getId() );
        delinquencyRangeDataV1.setClassification( delinquencyRangeData.getClassification() );
        delinquencyRangeDataV1.setMinimumAgeDays( delinquencyRangeData.getMinimumAgeDays() );
        delinquencyRangeDataV1.setMaximumAgeDays( delinquencyRangeData.getMaximumAgeDays() );

        return delinquencyRangeDataV1;
    }

    protected List<DelinquencyRangeDataV1> delinquencyRangeDataListToDelinquencyRangeDataV1List(List<DelinquencyRangeData> list) {
        if ( list == null ) {
            return null;
        }

        List<DelinquencyRangeDataV1> list1 = new ArrayList<DelinquencyRangeDataV1>( list.size() );
        for ( DelinquencyRangeData delinquencyRangeData : list ) {
            list1.add( delinquencyRangeDataToDelinquencyRangeDataV1( delinquencyRangeData ) );
        }

        return list1;
    }

    protected DelinquencyBucketDataV1 delinquencyBucketDataToDelinquencyBucketDataV1(DelinquencyBucketData delinquencyBucketData) {
        if ( delinquencyBucketData == null ) {
            return null;
        }

        DelinquencyBucketDataV1 delinquencyBucketDataV1 = new DelinquencyBucketDataV1();

        delinquencyBucketDataV1.setId( delinquencyBucketData.getId() );
        delinquencyBucketDataV1.setName( delinquencyBucketData.getName() );
        delinquencyBucketDataV1.setRanges( delinquencyRangeDataListToDelinquencyRangeDataV1List( delinquencyBucketData.getRanges() ) );

        return delinquencyBucketDataV1;
    }
}
