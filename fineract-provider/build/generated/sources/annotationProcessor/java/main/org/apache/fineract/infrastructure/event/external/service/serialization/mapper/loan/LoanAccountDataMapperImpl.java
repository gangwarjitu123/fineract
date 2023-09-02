package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.accounting.glaccount.data.GLAccountData;
import org.apache.fineract.avro.generic.v1.CalendarDataV1;
import org.apache.fineract.avro.generic.v1.CodeValueDataV1;
import org.apache.fineract.avro.generic.v1.CurrencyDataV1;
import org.apache.fineract.avro.generic.v1.EnumOptionDataV1;
import org.apache.fineract.avro.gl.v1.GLAccountDataV1;
import org.apache.fineract.avro.loan.v1.CollectionDataV1;
import org.apache.fineract.avro.loan.v1.DelinquencyBucketDataV1;
import org.apache.fineract.avro.loan.v1.DelinquencyRangeDataV1;
import org.apache.fineract.avro.loan.v1.DisbursementDataV1;
import org.apache.fineract.avro.loan.v1.LoanAccountDataV1;
import org.apache.fineract.avro.loan.v1.LoanAccountSummaryDataV1;
import org.apache.fineract.avro.loan.v1.LoanApplicationTimelineDataV1;
import org.apache.fineract.avro.loan.v1.LoanChargeDataV1;
import org.apache.fineract.avro.loan.v1.LoanInterestRecalculationDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductBorrowerCycleVariationDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductGuaranteeDataV1;
import org.apache.fineract.avro.loan.v1.LoanProductInterestRecalculationDataV1;
import org.apache.fineract.avro.loan.v1.LoanScheduleDataV1;
import org.apache.fineract.avro.loan.v1.LoanSchedulePeriodDataV1;
import org.apache.fineract.avro.loan.v1.LoanStatusEnumDataV1;
import org.apache.fineract.avro.loan.v1.LoanSummaryDataV1;
import org.apache.fineract.avro.loan.v1.LoanTermVariationsDataV1;
import org.apache.fineract.avro.loan.v1.LoanTransactionDataV1;
import org.apache.fineract.avro.payment.v1.PaymentTypeDataV1;
import org.apache.fineract.avro.portfolio.v1.ChargeDataV1;
import org.apache.fineract.avro.portfolio.v1.PortfolioAccountDataV1;
import org.apache.fineract.avro.portfolio.v1.RateDataV1;
import org.apache.fineract.infrastructure.codes.data.CodeValueData;
import org.apache.fineract.infrastructure.core.data.EnumOptionData;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroMonthDayMapper;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.ExternalIdMapper;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.apache.fineract.portfolio.account.data.PortfolioAccountData;
import org.apache.fineract.portfolio.accountdetails.data.LoanAccountSummaryData;
import org.apache.fineract.portfolio.calendar.data.CalendarData;
import org.apache.fineract.portfolio.charge.data.ChargeData;
import org.apache.fineract.portfolio.delinquency.data.DelinquencyBucketData;
import org.apache.fineract.portfolio.delinquency.data.DelinquencyRangeData;
import org.apache.fineract.portfolio.loanaccount.data.CollectionData;
import org.apache.fineract.portfolio.loanaccount.data.DisbursementData;
import org.apache.fineract.portfolio.loanaccount.data.LoanAccountData;
import org.apache.fineract.portfolio.loanaccount.data.LoanApplicationTimelineData;
import org.apache.fineract.portfolio.loanaccount.data.LoanChargeData;
import org.apache.fineract.portfolio.loanaccount.data.LoanInterestRecalculationData;
import org.apache.fineract.portfolio.loanaccount.data.LoanStatusEnumData;
import org.apache.fineract.portfolio.loanaccount.data.LoanSummaryData;
import org.apache.fineract.portfolio.loanaccount.data.LoanTermVariationsData;
import org.apache.fineract.portfolio.loanaccount.data.LoanTransactionData;
import org.apache.fineract.portfolio.loanaccount.loanschedule.data.LoanScheduleData;
import org.apache.fineract.portfolio.loanaccount.loanschedule.data.LoanSchedulePeriodData;
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
    date = "2023-09-02T15:00:20+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class LoanAccountDataMapperImpl implements LoanAccountDataMapper {

    private final LoanTransactionDataMapper loanTransactionDataMapper;
    private final LoanChargeDataMapper loanChargeDataMapper;
    private final AvroDateTimeMapper avroDateTimeMapper;
    private final AvroMonthDayMapper avroMonthDayMapper;
    private final ExternalIdMapper externalIdMapper;

    @Autowired
    public LoanAccountDataMapperImpl(LoanTransactionDataMapper loanTransactionDataMapper, LoanChargeDataMapper loanChargeDataMapper, AvroDateTimeMapper avroDateTimeMapper, AvroMonthDayMapper avroMonthDayMapper, ExternalIdMapper externalIdMapper) {

        this.loanTransactionDataMapper = loanTransactionDataMapper;
        this.loanChargeDataMapper = loanChargeDataMapper;
        this.avroDateTimeMapper = avroDateTimeMapper;
        this.avroMonthDayMapper = avroMonthDayMapper;
        this.externalIdMapper = externalIdMapper;
    }

    @Override
    public LoanAccountDataV1 map(LoanAccountData source) {
        if ( source == null ) {
            return null;
        }

        LoanAccountDataV1 loanAccountDataV1 = new LoanAccountDataV1();

        loanAccountDataV1.setIsLoanProductLinkedToFloatingRate( source.isLoanProductLinkedToFloatingRate() );
        loanAccountDataV1.setIsFloatingInterestRate( source.isFloatingInterestRate() );
        loanAccountDataV1.setIsTopup( source.isTopup() );
        loanAccountDataV1.setIsInterestRecalculationEnabled( source.isInterestRecalculationEnabled() );
        loanAccountDataV1.setId( source.getId() );
        loanAccountDataV1.setAccountNo( source.getAccountNo() );
        loanAccountDataV1.setExternalId( externalIdMapper.mapExternalId( source.getExternalId() ) );
        loanAccountDataV1.setStatus( loanStatusEnumDataToLoanStatusEnumDataV1( source.getStatus() ) );
        loanAccountDataV1.setSubStatus( enumOptionDataToEnumOptionDataV1( source.getSubStatus() ) );
        loanAccountDataV1.setClientId( source.getClientId() );
        loanAccountDataV1.setClientAccountNo( source.getClientAccountNo() );
        loanAccountDataV1.setClientName( source.getClientName() );
        loanAccountDataV1.setClientOfficeId( source.getClientOfficeId() );
        loanAccountDataV1.setClientExternalId( externalIdMapper.mapExternalId( source.getClientExternalId() ) );
        loanAccountDataV1.setLoanProductId( source.getLoanProductId() );
        loanAccountDataV1.setLoanProductName( source.getLoanProductName() );
        loanAccountDataV1.setLoanProductDescription( source.getLoanProductDescription() );
        loanAccountDataV1.setFundId( source.getFundId() );
        loanAccountDataV1.setFundName( source.getFundName() );
        loanAccountDataV1.setLoanPurposeId( source.getLoanPurposeId() );
        loanAccountDataV1.setLoanPurposeName( source.getLoanPurposeName() );
        loanAccountDataV1.setLoanOfficerId( source.getLoanOfficerId() );
        loanAccountDataV1.setLoanOfficerName( source.getLoanOfficerName() );
        loanAccountDataV1.setLoanType( enumOptionDataToEnumOptionDataV1( source.getLoanType() ) );
        loanAccountDataV1.setPrincipal( source.getPrincipal() );
        loanAccountDataV1.setApprovedPrincipal( source.getApprovedPrincipal() );
        loanAccountDataV1.setProposedPrincipal( source.getProposedPrincipal() );
        loanAccountDataV1.setNetDisbursalAmount( source.getNetDisbursalAmount() );
        loanAccountDataV1.setTermFrequency( source.getTermFrequency() );
        loanAccountDataV1.setTermPeriodFrequencyType( enumOptionDataToEnumOptionDataV1( source.getTermPeriodFrequencyType() ) );
        loanAccountDataV1.setNumberOfRepayments( source.getNumberOfRepayments() );
        loanAccountDataV1.setRepaymentEvery( source.getRepaymentEvery() );
        loanAccountDataV1.setRepaymentFrequencyType( enumOptionDataToEnumOptionDataV1( source.getRepaymentFrequencyType() ) );
        loanAccountDataV1.setRepaymentFrequencyNthDayType( enumOptionDataToEnumOptionDataV1( source.getRepaymentFrequencyNthDayType() ) );
        loanAccountDataV1.setRepaymentFrequencyDayOfWeekType( enumOptionDataToEnumOptionDataV1( source.getRepaymentFrequencyDayOfWeekType() ) );
        loanAccountDataV1.setInterestRatePerPeriod( source.getInterestRatePerPeriod() );
        loanAccountDataV1.setInterestRateFrequencyType( enumOptionDataToEnumOptionDataV1( source.getInterestRateFrequencyType() ) );
        loanAccountDataV1.setAnnualInterestRate( source.getAnnualInterestRate() );
        loanAccountDataV1.setInterestRateDifferential( source.getInterestRateDifferential() );
        loanAccountDataV1.setAmortizationType( enumOptionDataToEnumOptionDataV1( source.getAmortizationType() ) );
        loanAccountDataV1.setInterestType( enumOptionDataToEnumOptionDataV1( source.getInterestType() ) );
        loanAccountDataV1.setInterestCalculationPeriodType( enumOptionDataToEnumOptionDataV1( source.getInterestCalculationPeriodType() ) );
        loanAccountDataV1.setAllowPartialPeriodInterestCalculation( source.getAllowPartialPeriodInterestCalculation() );
        loanAccountDataV1.setInArrearsTolerance( source.getInArrearsTolerance() );
        loanAccountDataV1.setTransactionProcessingStrategyCode( source.getTransactionProcessingStrategyCode() );
        loanAccountDataV1.setTransactionProcessingStrategyName( source.getTransactionProcessingStrategyName() );
        loanAccountDataV1.setGraceOnPrincipalPayment( source.getGraceOnPrincipalPayment() );
        loanAccountDataV1.setRecurringMoratoriumOnPrincipalPeriods( source.getRecurringMoratoriumOnPrincipalPeriods() );
        loanAccountDataV1.setGraceOnInterestPayment( source.getGraceOnInterestPayment() );
        loanAccountDataV1.setGraceOnInterestCharged( source.getGraceOnInterestCharged() );
        loanAccountDataV1.setGraceOnArrearsAgeing( source.getGraceOnArrearsAgeing() );
        loanAccountDataV1.setInterestChargedFromDate( avroDateTimeMapper.mapLocalDate( source.getInterestChargedFromDate() ) );
        loanAccountDataV1.setExpectedFirstRepaymentOnDate( avroDateTimeMapper.mapLocalDate( source.getExpectedFirstRepaymentOnDate() ) );
        loanAccountDataV1.setSyncDisbursementWithMeeting( source.getSyncDisbursementWithMeeting() );
        loanAccountDataV1.setTimeline( loanApplicationTimelineDataToLoanApplicationTimelineDataV1( source.getTimeline() ) );
        loanAccountDataV1.setSummary( loanSummaryDataToLoanSummaryDataV1( source.getSummary() ) );
        loanAccountDataV1.setRepaymentSchedule( loanScheduleDataToLoanScheduleDataV1( source.getRepaymentSchedule() ) );
        loanAccountDataV1.setTransactions( loanTransactionDataCollectionToLoanTransactionDataV1List( source.getTransactions() ) );
        loanAccountDataV1.setCharges( loanChargeDataCollectionToLoanChargeDataV1List( source.getCharges() ) );
        loanAccountDataV1.setMeeting( calendarDataToCalendarDataV1( source.getMeeting() ) );
        loanAccountDataV1.setDisbursementDetails( disbursementDataCollectionToDisbursementDataV1List( source.getDisbursementDetails() ) );
        loanAccountDataV1.setOriginalSchedule( loanScheduleDataToLoanScheduleDataV1( source.getOriginalSchedule() ) );
        loanAccountDataV1.setTotalOverpaid( source.getTotalOverpaid() );
        loanAccountDataV1.setLoanCounter( source.getLoanCounter() );
        loanAccountDataV1.setLoanProductCounter( source.getLoanProductCounter() );
        loanAccountDataV1.setLinkedAccount( portfolioAccountDataToPortfolioAccountDataV1( source.getLinkedAccount() ) );
        loanAccountDataV1.setMultiDisburseLoan( source.getMultiDisburseLoan() );
        loanAccountDataV1.setDisallowExpectedDisbursements( source.getDisallowExpectedDisbursements() );
        loanAccountDataV1.setCanDefineInstallmentAmount( source.getCanDefineInstallmentAmount() );
        loanAccountDataV1.setFixedEmiAmount( source.getFixedEmiAmount() );
        loanAccountDataV1.setMaxOutstandingLoanBalance( source.getMaxOutstandingLoanBalance() );
        loanAccountDataV1.setCanDisburse( source.getCanDisburse() );
        loanAccountDataV1.setEmiAmountVariations( loanTermVariationsDataCollectionToLoanTermVariationsDataV1List( source.getEmiAmountVariations() ) );
        loanAccountDataV1.setClientActiveLoanOptions( loanAccountSummaryDataCollectionToLoanAccountSummaryDataV1List( source.getClientActiveLoanOptions() ) );
        loanAccountDataV1.setCanUseForTopup( source.getCanUseForTopup() );
        loanAccountDataV1.setClosureLoanId( source.getClosureLoanId() );
        loanAccountDataV1.setClosureLoanAccountNo( source.getClosureLoanAccountNo() );
        loanAccountDataV1.setTopupAmount( source.getTopupAmount() );
        loanAccountDataV1.setProduct( loanProductDataToLoanProductDataV1( source.getProduct() ) );
        loanAccountDataV1.setInArrears( source.getInArrears() );
        loanAccountDataV1.setIsNPA( source.getIsNPA() );
        loanAccountDataV1.setOverdueCharges( chargeDataCollectionToChargeDataV1List( source.getOverdueCharges() ) );
        loanAccountDataV1.setDaysInMonthType( enumOptionDataToEnumOptionDataV1( source.getDaysInMonthType() ) );
        loanAccountDataV1.setDaysInYearType( enumOptionDataToEnumOptionDataV1( source.getDaysInYearType() ) );
        loanAccountDataV1.setInterestRecalculationData( loanInterestRecalculationDataToLoanInterestRecalculationDataV1( source.getInterestRecalculationData() ) );
        loanAccountDataV1.setCreateStandingInstructionAtDisbursement( source.getCreateStandingInstructionAtDisbursement() );
        loanAccountDataV1.setDelinquent( collectionDataToCollectionDataV1( source.getDelinquent() ) );
        loanAccountDataV1.setDelinquencyRange( delinquencyRangeDataToDelinquencyRangeDataV1( source.getDelinquencyRange() ) );
        loanAccountDataV1.setOverpaidOnDate( avroDateTimeMapper.mapLocalDate( source.getOverpaidOnDate() ) );
        loanAccountDataV1.setLastClosedBusinessDate( avroDateTimeMapper.mapLocalDate( source.getLastClosedBusinessDate() ) );
        loanAccountDataV1.setChargedOff( source.getChargedOff() );

        return loanAccountDataV1;
    }

    protected LoanStatusEnumDataV1 loanStatusEnumDataToLoanStatusEnumDataV1(LoanStatusEnumData loanStatusEnumData) {
        if ( loanStatusEnumData == null ) {
            return null;
        }

        LoanStatusEnumDataV1 loanStatusEnumDataV1 = new LoanStatusEnumDataV1();

        if ( loanStatusEnumData.getId() != null ) {
            loanStatusEnumDataV1.setId( loanStatusEnumData.getId().intValue() );
        }
        loanStatusEnumDataV1.setCode( loanStatusEnumData.getCode() );
        loanStatusEnumDataV1.setValue( loanStatusEnumData.getValue() );
        loanStatusEnumDataV1.setPendingApproval( loanStatusEnumData.isPendingApproval() );
        loanStatusEnumDataV1.setWaitingForDisbursal( loanStatusEnumData.isWaitingForDisbursal() );
        loanStatusEnumDataV1.setActive( loanStatusEnumData.isActive() );
        loanStatusEnumDataV1.setClosedObligationsMet( loanStatusEnumData.isClosedObligationsMet() );
        loanStatusEnumDataV1.setClosedWrittenOff( loanStatusEnumData.isClosedWrittenOff() );
        loanStatusEnumDataV1.setClosedRescheduled( loanStatusEnumData.isClosedRescheduled() );
        loanStatusEnumDataV1.setClosed( loanStatusEnumData.isClosed() );
        loanStatusEnumDataV1.setOverpaid( loanStatusEnumData.isOverpaid() );

        return loanStatusEnumDataV1;
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

    protected LoanApplicationTimelineDataV1 loanApplicationTimelineDataToLoanApplicationTimelineDataV1(LoanApplicationTimelineData loanApplicationTimelineData) {
        if ( loanApplicationTimelineData == null ) {
            return null;
        }

        LoanApplicationTimelineDataV1 loanApplicationTimelineDataV1 = new LoanApplicationTimelineDataV1();

        loanApplicationTimelineDataV1.setSubmittedOnDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getSubmittedOnDate() ) );
        loanApplicationTimelineDataV1.setSubmittedByUsername( loanApplicationTimelineData.getSubmittedByUsername() );
        loanApplicationTimelineDataV1.setSubmittedByFirstname( loanApplicationTimelineData.getSubmittedByFirstname() );
        loanApplicationTimelineDataV1.setSubmittedByLastname( loanApplicationTimelineData.getSubmittedByLastname() );
        loanApplicationTimelineDataV1.setRejectedOnDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getRejectedOnDate() ) );
        loanApplicationTimelineDataV1.setRejectedByUsername( loanApplicationTimelineData.getRejectedByUsername() );
        loanApplicationTimelineDataV1.setRejectedByFirstname( loanApplicationTimelineData.getRejectedByFirstname() );
        loanApplicationTimelineDataV1.setRejectedByLastname( loanApplicationTimelineData.getRejectedByLastname() );
        loanApplicationTimelineDataV1.setWithdrawnOnDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getWithdrawnOnDate() ) );
        loanApplicationTimelineDataV1.setWithdrawnByUsername( loanApplicationTimelineData.getWithdrawnByUsername() );
        loanApplicationTimelineDataV1.setWithdrawnByFirstname( loanApplicationTimelineData.getWithdrawnByFirstname() );
        loanApplicationTimelineDataV1.setWithdrawnByLastname( loanApplicationTimelineData.getWithdrawnByLastname() );
        loanApplicationTimelineDataV1.setApprovedOnDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getApprovedOnDate() ) );
        loanApplicationTimelineDataV1.setApprovedByUsername( loanApplicationTimelineData.getApprovedByUsername() );
        loanApplicationTimelineDataV1.setApprovedByFirstname( loanApplicationTimelineData.getApprovedByFirstname() );
        loanApplicationTimelineDataV1.setApprovedByLastname( loanApplicationTimelineData.getApprovedByLastname() );
        loanApplicationTimelineDataV1.setExpectedDisbursementDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getExpectedDisbursementDate() ) );
        loanApplicationTimelineDataV1.setActualDisbursementDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getActualDisbursementDate() ) );
        loanApplicationTimelineDataV1.setDisbursedByUsername( loanApplicationTimelineData.getDisbursedByUsername() );
        loanApplicationTimelineDataV1.setDisbursedByFirstname( loanApplicationTimelineData.getDisbursedByFirstname() );
        loanApplicationTimelineDataV1.setDisbursedByLastname( loanApplicationTimelineData.getDisbursedByLastname() );
        loanApplicationTimelineDataV1.setClosedOnDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getClosedOnDate() ) );
        loanApplicationTimelineDataV1.setClosedByUsername( loanApplicationTimelineData.getClosedByUsername() );
        loanApplicationTimelineDataV1.setClosedByFirstname( loanApplicationTimelineData.getClosedByFirstname() );
        loanApplicationTimelineDataV1.setClosedByLastname( loanApplicationTimelineData.getClosedByLastname() );
        loanApplicationTimelineDataV1.setExpectedMaturityDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getExpectedMaturityDate() ) );
        loanApplicationTimelineDataV1.setWriteOffOnDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getWriteOffOnDate() ) );
        loanApplicationTimelineDataV1.setWriteOffByUsername( loanApplicationTimelineData.getWriteOffByUsername() );
        loanApplicationTimelineDataV1.setWriteOffByFirstname( loanApplicationTimelineData.getWriteOffByFirstname() );
        loanApplicationTimelineDataV1.setWriteOffByLastname( loanApplicationTimelineData.getWriteOffByLastname() );
        loanApplicationTimelineDataV1.setChargedOffOnDate( avroDateTimeMapper.mapLocalDate( loanApplicationTimelineData.getChargedOffOnDate() ) );
        loanApplicationTimelineDataV1.setChargedOffByUsername( loanApplicationTimelineData.getChargedOffByUsername() );
        loanApplicationTimelineDataV1.setChargedOffByFirstname( loanApplicationTimelineData.getChargedOffByFirstname() );
        loanApplicationTimelineDataV1.setChargedOffByLastname( loanApplicationTimelineData.getChargedOffByLastname() );

        return loanApplicationTimelineDataV1;
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

    protected LoanSummaryDataV1 loanSummaryDataToLoanSummaryDataV1(LoanSummaryData loanSummaryData) {
        if ( loanSummaryData == null ) {
            return null;
        }

        LoanSummaryDataV1 loanSummaryDataV1 = new LoanSummaryDataV1();

        loanSummaryDataV1.setCurrency( currencyDataToCurrencyDataV1( loanSummaryData.getCurrency() ) );
        loanSummaryDataV1.setPrincipalDisbursed( loanSummaryData.getPrincipalDisbursed() );
        loanSummaryDataV1.setPrincipalAdjustments( loanSummaryData.getPrincipalAdjustments() );
        loanSummaryDataV1.setPrincipalPaid( loanSummaryData.getPrincipalPaid() );
        loanSummaryDataV1.setPrincipalWrittenOff( loanSummaryData.getPrincipalWrittenOff() );
        loanSummaryDataV1.setPrincipalOutstanding( loanSummaryData.getPrincipalOutstanding() );
        loanSummaryDataV1.setPrincipalOverdue( loanSummaryData.getPrincipalOverdue() );
        loanSummaryDataV1.setInterestCharged( loanSummaryData.getInterestCharged() );
        loanSummaryDataV1.setInterestPaid( loanSummaryData.getInterestPaid() );
        loanSummaryDataV1.setInterestWaived( loanSummaryData.getInterestWaived() );
        loanSummaryDataV1.setInterestWrittenOff( loanSummaryData.getInterestWrittenOff() );
        loanSummaryDataV1.setInterestOutstanding( loanSummaryData.getInterestOutstanding() );
        loanSummaryDataV1.setInterestOverdue( loanSummaryData.getInterestOverdue() );
        loanSummaryDataV1.setFeeChargesCharged( loanSummaryData.getFeeChargesCharged() );
        loanSummaryDataV1.setFeeChargesDueAtDisbursementCharged( loanSummaryData.getFeeChargesDueAtDisbursementCharged() );
        loanSummaryDataV1.setFeeChargesPaid( loanSummaryData.getFeeChargesPaid() );
        loanSummaryDataV1.setFeeChargesWaived( loanSummaryData.getFeeChargesWaived() );
        loanSummaryDataV1.setFeeChargesWrittenOff( loanSummaryData.getFeeChargesWrittenOff() );
        loanSummaryDataV1.setFeeChargesOutstanding( loanSummaryData.getFeeChargesOutstanding() );
        loanSummaryDataV1.setFeeChargesOverdue( loanSummaryData.getFeeChargesOverdue() );
        loanSummaryDataV1.setPenaltyChargesCharged( loanSummaryData.getPenaltyChargesCharged() );
        loanSummaryDataV1.setPenaltyChargesPaid( loanSummaryData.getPenaltyChargesPaid() );
        loanSummaryDataV1.setPenaltyChargesWaived( loanSummaryData.getPenaltyChargesWaived() );
        loanSummaryDataV1.setPenaltyChargesWrittenOff( loanSummaryData.getPenaltyChargesWrittenOff() );
        loanSummaryDataV1.setPenaltyChargesOutstanding( loanSummaryData.getPenaltyChargesOutstanding() );
        loanSummaryDataV1.setPenaltyChargesOverdue( loanSummaryData.getPenaltyChargesOverdue() );
        loanSummaryDataV1.setTotalExpectedRepayment( loanSummaryData.getTotalExpectedRepayment() );
        loanSummaryDataV1.setTotalRepayment( loanSummaryData.getTotalRepayment() );
        loanSummaryDataV1.setTotalExpectedCostOfLoan( loanSummaryData.getTotalExpectedCostOfLoan() );
        loanSummaryDataV1.setTotalCostOfLoan( loanSummaryData.getTotalCostOfLoan() );
        loanSummaryDataV1.setTotalWaived( loanSummaryData.getTotalWaived() );
        loanSummaryDataV1.setTotalWrittenOff( loanSummaryData.getTotalWrittenOff() );
        loanSummaryDataV1.setTotalOutstanding( loanSummaryData.getTotalOutstanding() );
        loanSummaryDataV1.setTotalOverdue( loanSummaryData.getTotalOverdue() );
        loanSummaryDataV1.setTotalRecovered( loanSummaryData.getTotalRecovered() );
        loanSummaryDataV1.setOverdueSinceDate( avroDateTimeMapper.mapLocalDate( loanSummaryData.getOverdueSinceDate() ) );
        loanSummaryDataV1.setWriteoffReasonId( loanSummaryData.getWriteoffReasonId() );
        loanSummaryDataV1.setWriteoffReason( loanSummaryData.getWriteoffReason() );
        loanSummaryDataV1.setTotalMerchantRefund( loanSummaryData.getTotalMerchantRefund() );
        loanSummaryDataV1.setTotalMerchantRefundReversed( loanSummaryData.getTotalMerchantRefundReversed() );
        loanSummaryDataV1.setTotalPayoutRefund( loanSummaryData.getTotalPayoutRefund() );
        loanSummaryDataV1.setTotalPayoutRefundReversed( loanSummaryData.getTotalPayoutRefundReversed() );
        loanSummaryDataV1.setTotalGoodwillCredit( loanSummaryData.getTotalGoodwillCredit() );
        loanSummaryDataV1.setTotalGoodwillCreditReversed( loanSummaryData.getTotalGoodwillCreditReversed() );
        loanSummaryDataV1.setTotalChargeAdjustment( loanSummaryData.getTotalChargeAdjustment() );
        loanSummaryDataV1.setTotalChargeAdjustmentReversed( loanSummaryData.getTotalChargeAdjustmentReversed() );
        loanSummaryDataV1.setTotalChargeback( loanSummaryData.getTotalChargeback() );
        loanSummaryDataV1.setTotalCreditBalanceRefund( loanSummaryData.getTotalCreditBalanceRefund() );
        loanSummaryDataV1.setTotalCreditBalanceRefundReversed( loanSummaryData.getTotalCreditBalanceRefundReversed() );
        loanSummaryDataV1.setTotalRepaymentTransaction( loanSummaryData.getTotalRepaymentTransaction() );
        loanSummaryDataV1.setTotalRepaymentTransactionReversed( loanSummaryData.getTotalRepaymentTransactionReversed() );
        loanSummaryDataV1.setChargeOffReasonId( loanSummaryData.getChargeOffReasonId() );
        loanSummaryDataV1.setChargeOffReason( loanSummaryData.getChargeOffReason() );

        return loanSummaryDataV1;
    }

    protected LoanSchedulePeriodDataV1 loanSchedulePeriodDataToLoanSchedulePeriodDataV1(LoanSchedulePeriodData loanSchedulePeriodData) {
        if ( loanSchedulePeriodData == null ) {
            return null;
        }

        LoanSchedulePeriodDataV1 loanSchedulePeriodDataV1 = new LoanSchedulePeriodDataV1();

        loanSchedulePeriodDataV1.setPeriod( loanSchedulePeriodData.getPeriod() );
        loanSchedulePeriodDataV1.setFromDate( avroDateTimeMapper.mapLocalDate( loanSchedulePeriodData.getFromDate() ) );
        loanSchedulePeriodDataV1.setDueDate( avroDateTimeMapper.mapLocalDate( loanSchedulePeriodData.getDueDate() ) );
        loanSchedulePeriodDataV1.setObligationsMetOnDate( avroDateTimeMapper.mapLocalDate( loanSchedulePeriodData.getObligationsMetOnDate() ) );
        loanSchedulePeriodDataV1.setComplete( loanSchedulePeriodData.getComplete() );
        loanSchedulePeriodDataV1.setDaysInPeriod( loanSchedulePeriodData.getDaysInPeriod() );
        loanSchedulePeriodDataV1.setPrincipalDisbursed( loanSchedulePeriodData.getPrincipalDisbursed() );
        loanSchedulePeriodDataV1.setPrincipalOriginalDue( loanSchedulePeriodData.getPrincipalOriginalDue() );
        loanSchedulePeriodDataV1.setPrincipalDue( loanSchedulePeriodData.getPrincipalDue() );
        loanSchedulePeriodDataV1.setPrincipalPaid( loanSchedulePeriodData.getPrincipalPaid() );
        loanSchedulePeriodDataV1.setPrincipalWrittenOff( loanSchedulePeriodData.getPrincipalWrittenOff() );
        loanSchedulePeriodDataV1.setPrincipalOutstanding( loanSchedulePeriodData.getPrincipalOutstanding() );
        loanSchedulePeriodDataV1.setPrincipalLoanBalanceOutstanding( loanSchedulePeriodData.getPrincipalLoanBalanceOutstanding() );
        loanSchedulePeriodDataV1.setInterestOriginalDue( loanSchedulePeriodData.getInterestOriginalDue() );
        loanSchedulePeriodDataV1.setInterestDue( loanSchedulePeriodData.getInterestDue() );
        loanSchedulePeriodDataV1.setInterestPaid( loanSchedulePeriodData.getInterestPaid() );
        loanSchedulePeriodDataV1.setInterestWaived( loanSchedulePeriodData.getInterestWaived() );
        loanSchedulePeriodDataV1.setInterestWrittenOff( loanSchedulePeriodData.getInterestWrittenOff() );
        loanSchedulePeriodDataV1.setInterestOutstanding( loanSchedulePeriodData.getInterestOutstanding() );
        loanSchedulePeriodDataV1.setFeeChargesDue( loanSchedulePeriodData.getFeeChargesDue() );
        loanSchedulePeriodDataV1.setFeeChargesPaid( loanSchedulePeriodData.getFeeChargesPaid() );
        loanSchedulePeriodDataV1.setFeeChargesWaived( loanSchedulePeriodData.getFeeChargesWaived() );
        loanSchedulePeriodDataV1.setFeeChargesWrittenOff( loanSchedulePeriodData.getFeeChargesWrittenOff() );
        loanSchedulePeriodDataV1.setFeeChargesOutstanding( loanSchedulePeriodData.getFeeChargesOutstanding() );
        loanSchedulePeriodDataV1.setPenaltyChargesDue( loanSchedulePeriodData.getPenaltyChargesDue() );
        loanSchedulePeriodDataV1.setPenaltyChargesPaid( loanSchedulePeriodData.getPenaltyChargesPaid() );
        loanSchedulePeriodDataV1.setPenaltyChargesWaived( loanSchedulePeriodData.getPenaltyChargesWaived() );
        loanSchedulePeriodDataV1.setPenaltyChargesWrittenOff( loanSchedulePeriodData.getPenaltyChargesWrittenOff() );
        loanSchedulePeriodDataV1.setPenaltyChargesOutstanding( loanSchedulePeriodData.getPenaltyChargesOutstanding() );
        loanSchedulePeriodDataV1.setTotalOriginalDueForPeriod( loanSchedulePeriodData.getTotalOriginalDueForPeriod() );
        loanSchedulePeriodDataV1.setTotalDueForPeriod( loanSchedulePeriodData.getTotalDueForPeriod() );
        loanSchedulePeriodDataV1.setTotalPaidForPeriod( loanSchedulePeriodData.getTotalPaidForPeriod() );
        loanSchedulePeriodDataV1.setTotalPaidInAdvanceForPeriod( loanSchedulePeriodData.getTotalPaidInAdvanceForPeriod() );
        loanSchedulePeriodDataV1.setTotalPaidLateForPeriod( loanSchedulePeriodData.getTotalPaidLateForPeriod() );
        loanSchedulePeriodDataV1.setTotalWaivedForPeriod( loanSchedulePeriodData.getTotalWaivedForPeriod() );
        loanSchedulePeriodDataV1.setTotalWrittenOffForPeriod( loanSchedulePeriodData.getTotalWrittenOffForPeriod() );
        loanSchedulePeriodDataV1.setTotalOutstandingForPeriod( loanSchedulePeriodData.getTotalOutstandingForPeriod() );
        loanSchedulePeriodDataV1.setTotalOverdue( loanSchedulePeriodData.getTotalOverdue() );
        loanSchedulePeriodDataV1.setTotalActualCostOfLoanForPeriod( loanSchedulePeriodData.getTotalActualCostOfLoanForPeriod() );
        loanSchedulePeriodDataV1.setTotalInstallmentAmountForPeriod( loanSchedulePeriodData.getTotalInstallmentAmountForPeriod() );
        loanSchedulePeriodDataV1.setTotalCredits( loanSchedulePeriodData.getTotalCredits() );

        return loanSchedulePeriodDataV1;
    }

    protected List<LoanSchedulePeriodDataV1> loanSchedulePeriodDataCollectionToLoanSchedulePeriodDataV1List(Collection<LoanSchedulePeriodData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanSchedulePeriodDataV1> list = new ArrayList<LoanSchedulePeriodDataV1>( collection.size() );
        for ( LoanSchedulePeriodData loanSchedulePeriodData : collection ) {
            list.add( loanSchedulePeriodDataToLoanSchedulePeriodDataV1( loanSchedulePeriodData ) );
        }

        return list;
    }

    protected LoanScheduleDataV1 loanScheduleDataToLoanScheduleDataV1(LoanScheduleData loanScheduleData) {
        if ( loanScheduleData == null ) {
            return null;
        }

        LoanScheduleDataV1 loanScheduleDataV1 = new LoanScheduleDataV1();

        loanScheduleDataV1.setCurrency( currencyDataToCurrencyDataV1( loanScheduleData.getCurrency() ) );
        loanScheduleDataV1.setLoanTermInDays( loanScheduleData.getLoanTermInDays() );
        loanScheduleDataV1.setTotalPrincipalDisbursed( loanScheduleData.getTotalPrincipalDisbursed() );
        loanScheduleDataV1.setTotalPrincipalExpected( loanScheduleData.getTotalPrincipalExpected() );
        loanScheduleDataV1.setTotalPrincipalPaid( loanScheduleData.getTotalPrincipalPaid() );
        loanScheduleDataV1.setTotalInterestCharged( loanScheduleData.getTotalInterestCharged() );
        loanScheduleDataV1.setTotalFeeChargesCharged( loanScheduleData.getTotalFeeChargesCharged() );
        loanScheduleDataV1.setTotalPenaltyChargesCharged( loanScheduleData.getTotalPenaltyChargesCharged() );
        loanScheduleDataV1.setTotalWaived( loanScheduleData.getTotalWaived() );
        loanScheduleDataV1.setTotalWrittenOff( loanScheduleData.getTotalWrittenOff() );
        loanScheduleDataV1.setTotalRepaymentExpected( loanScheduleData.getTotalRepaymentExpected() );
        loanScheduleDataV1.setTotalRepayment( loanScheduleData.getTotalRepayment() );
        loanScheduleDataV1.setTotalPaidInAdvance( loanScheduleData.getTotalPaidInAdvance() );
        loanScheduleDataV1.setTotalPaidLate( loanScheduleData.getTotalPaidLate() );
        loanScheduleDataV1.setTotalOutstanding( loanScheduleData.getTotalOutstanding() );
        loanScheduleDataV1.setPeriods( loanSchedulePeriodDataCollectionToLoanSchedulePeriodDataV1List( loanScheduleData.getPeriods() ) );
        loanScheduleDataV1.setFuturePeriods( loanSchedulePeriodDataCollectionToLoanSchedulePeriodDataV1List( loanScheduleData.getFuturePeriods() ) );

        return loanScheduleDataV1;
    }

    protected List<LoanTransactionDataV1> loanTransactionDataCollectionToLoanTransactionDataV1List(Collection<LoanTransactionData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanTransactionDataV1> list = new ArrayList<LoanTransactionDataV1>( collection.size() );
        for ( LoanTransactionData loanTransactionData : collection ) {
            list.add( loanTransactionDataMapper.map( loanTransactionData ) );
        }

        return list;
    }

    protected List<LoanChargeDataV1> loanChargeDataCollectionToLoanChargeDataV1List(Collection<LoanChargeData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanChargeDataV1> list = new ArrayList<LoanChargeDataV1>( collection.size() );
        for ( LoanChargeData loanChargeData : collection ) {
            list.add( loanChargeDataMapper.map( loanChargeData ) );
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

    protected DisbursementDataV1 disbursementDataToDisbursementDataV1(DisbursementData disbursementData) {
        if ( disbursementData == null ) {
            return null;
        }

        DisbursementDataV1 disbursementDataV1 = new DisbursementDataV1();

        if ( disbursementData.getId() != null ) {
            disbursementDataV1.setId( disbursementData.getId().intValue() );
        }
        disbursementDataV1.setExpectedDisbursementDate( avroDateTimeMapper.mapLocalDate( disbursementData.getExpectedDisbursementDate() ) );
        disbursementDataV1.setActualDisbursementDate( avroDateTimeMapper.mapLocalDate( disbursementData.getActualDisbursementDate() ) );
        disbursementDataV1.setPrincipal( disbursementData.getPrincipal() );
        disbursementDataV1.setNetDisbursalAmount( disbursementData.getNetDisbursalAmount() );
        disbursementDataV1.setLoanChargeId( disbursementData.getLoanChargeId() );
        disbursementDataV1.setChargeAmount( disbursementData.getChargeAmount() );
        disbursementDataV1.setWaivedChargeAmount( disbursementData.getWaivedChargeAmount() );

        return disbursementDataV1;
    }

    protected List<DisbursementDataV1> disbursementDataCollectionToDisbursementDataV1List(Collection<DisbursementData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<DisbursementDataV1> list = new ArrayList<DisbursementDataV1>( collection.size() );
        for ( DisbursementData disbursementData : collection ) {
            list.add( disbursementDataToDisbursementDataV1( disbursementData ) );
        }

        return list;
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

    protected LoanTermVariationsDataV1 loanTermVariationsDataToLoanTermVariationsDataV1(LoanTermVariationsData loanTermVariationsData) {
        if ( loanTermVariationsData == null ) {
            return null;
        }

        LoanTermVariationsDataV1 loanTermVariationsDataV1 = new LoanTermVariationsDataV1();

        loanTermVariationsDataV1.setId( loanTermVariationsData.getId() );
        loanTermVariationsDataV1.setTermType( enumOptionDataToEnumOptionDataV1( loanTermVariationsData.getTermType() ) );
        loanTermVariationsDataV1.setTermVariationApplicableFrom( avroDateTimeMapper.mapLocalDate( loanTermVariationsData.getTermVariationApplicableFrom() ) );
        loanTermVariationsDataV1.setDecimalValue( loanTermVariationsData.getDecimalValue() );
        loanTermVariationsDataV1.setDateValue( avroDateTimeMapper.mapLocalDate( loanTermVariationsData.getDateValue() ) );
        loanTermVariationsDataV1.setIsSpecificToInstallment( loanTermVariationsData.isIsSpecificToInstallment() );
        loanTermVariationsDataV1.setIsProcessed( loanTermVariationsData.getIsProcessed() );

        return loanTermVariationsDataV1;
    }

    protected List<LoanTermVariationsDataV1> loanTermVariationsDataCollectionToLoanTermVariationsDataV1List(Collection<LoanTermVariationsData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanTermVariationsDataV1> list = new ArrayList<LoanTermVariationsDataV1>( collection.size() );
        for ( LoanTermVariationsData loanTermVariationsData : collection ) {
            list.add( loanTermVariationsDataToLoanTermVariationsDataV1( loanTermVariationsData ) );
        }

        return list;
    }

    protected LoanAccountSummaryDataV1 loanAccountSummaryDataToLoanAccountSummaryDataV1(LoanAccountSummaryData loanAccountSummaryData) {
        if ( loanAccountSummaryData == null ) {
            return null;
        }

        LoanAccountSummaryDataV1 loanAccountSummaryDataV1 = new LoanAccountSummaryDataV1();

        loanAccountSummaryDataV1.setId( loanAccountSummaryData.getId() );
        loanAccountSummaryDataV1.setAccountNo( loanAccountSummaryData.getAccountNo() );
        loanAccountSummaryDataV1.setParentAccountNumber( loanAccountSummaryData.getParentAccountNumber() );
        loanAccountSummaryDataV1.setExternalId( loanAccountSummaryData.getExternalId() );
        loanAccountSummaryDataV1.setProductId( loanAccountSummaryData.getProductId() );
        loanAccountSummaryDataV1.setProductName( loanAccountSummaryData.getProductName() );
        loanAccountSummaryDataV1.setShortProductName( loanAccountSummaryData.getShortProductName() );
        loanAccountSummaryDataV1.setStatus( loanStatusEnumDataToLoanStatusEnumDataV1( loanAccountSummaryData.getStatus() ) );
        loanAccountSummaryDataV1.setLoanType( enumOptionDataToEnumOptionDataV1( loanAccountSummaryData.getLoanType() ) );
        loanAccountSummaryDataV1.setLoanCycle( loanAccountSummaryData.getLoanCycle() );
        loanAccountSummaryDataV1.setTimeline( loanApplicationTimelineDataToLoanApplicationTimelineDataV1( loanAccountSummaryData.getTimeline() ) );
        loanAccountSummaryDataV1.setInArrears( loanAccountSummaryData.getInArrears() );
        loanAccountSummaryDataV1.setOriginalLoan( loanAccountSummaryData.getOriginalLoan() );
        loanAccountSummaryDataV1.setLoanBalance( loanAccountSummaryData.getLoanBalance() );
        loanAccountSummaryDataV1.setAmountPaid( loanAccountSummaryData.getAmountPaid() );

        return loanAccountSummaryDataV1;
    }

    protected List<LoanAccountSummaryDataV1> loanAccountSummaryDataCollectionToLoanAccountSummaryDataV1List(Collection<LoanAccountSummaryData> collection) {
        if ( collection == null ) {
            return null;
        }

        List<LoanAccountSummaryDataV1> list = new ArrayList<LoanAccountSummaryDataV1>( collection.size() );
        for ( LoanAccountSummaryData loanAccountSummaryData : collection ) {
            list.add( loanAccountSummaryDataToLoanAccountSummaryDataV1( loanAccountSummaryData ) );
        }

        return list;
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

    protected LoanProductDataV1 loanProductDataToLoanProductDataV1(LoanProductData loanProductData) {
        if ( loanProductData == null ) {
            return null;
        }

        LoanProductDataV1 loanProductDataV1 = new LoanProductDataV1();

        loanProductDataV1.setId( loanProductData.getId() );
        loanProductDataV1.setName( loanProductData.getName() );
        loanProductDataV1.setShortName( loanProductData.getShortName() );
        loanProductDataV1.setDescription( loanProductData.getDescription() );
        loanProductDataV1.setFundId( loanProductData.getFundId() );
        loanProductDataV1.setFundName( loanProductData.getFundName() );
        loanProductDataV1.setIncludeInBorrowerCycle( loanProductData.isIncludeInBorrowerCycle() );
        loanProductDataV1.setUseBorrowerCycle( loanProductData.isUseBorrowerCycle() );
        loanProductDataV1.setStartDate( avroDateTimeMapper.mapLocalDate( loanProductData.getStartDate() ) );
        loanProductDataV1.setCloseDate( avroDateTimeMapper.mapLocalDate( loanProductData.getCloseDate() ) );
        loanProductDataV1.setStatus( loanProductData.getStatus() );
        loanProductDataV1.setExternalId( loanProductData.getExternalId() );
        loanProductDataV1.setCurrency( currencyDataToCurrencyDataV1( loanProductData.getCurrency() ) );
        loanProductDataV1.setPrincipal( loanProductData.getPrincipal() );
        loanProductDataV1.setMinPrincipal( loanProductData.getMinPrincipal() );
        loanProductDataV1.setMaxPrincipal( loanProductData.getMaxPrincipal() );
        loanProductDataV1.setNumberOfRepayments( loanProductData.getNumberOfRepayments() );
        loanProductDataV1.setMinNumberOfRepayments( loanProductData.getMinNumberOfRepayments() );
        loanProductDataV1.setMaxNumberOfRepayments( loanProductData.getMaxNumberOfRepayments() );
        loanProductDataV1.setRepaymentEvery( loanProductData.getRepaymentEvery() );
        loanProductDataV1.setRepaymentFrequencyType( enumOptionDataToEnumOptionDataV1( loanProductData.getRepaymentFrequencyType() ) );
        loanProductDataV1.setInterestRatePerPeriod( loanProductData.getInterestRatePerPeriod() );
        loanProductDataV1.setMinInterestRatePerPeriod( loanProductData.getMinInterestRatePerPeriod() );
        loanProductDataV1.setMaxInterestRatePerPeriod( loanProductData.getMaxInterestRatePerPeriod() );
        loanProductDataV1.setInterestRateFrequencyType( enumOptionDataToEnumOptionDataV1( loanProductData.getInterestRateFrequencyType() ) );
        loanProductDataV1.setAnnualInterestRate( loanProductData.getAnnualInterestRate() );
        loanProductDataV1.setIsLinkedToFloatingInterestRates( loanProductData.isIsLinkedToFloatingInterestRates() );
        if ( loanProductData.getFloatingRateId() != null ) {
            loanProductDataV1.setFloatingRateId( loanProductData.getFloatingRateId().longValue() );
        }
        loanProductDataV1.setFloatingRateName( loanProductData.getFloatingRateName() );
        loanProductDataV1.setInterestRateDifferential( loanProductData.getInterestRateDifferential() );
        loanProductDataV1.setMinDifferentialLendingRate( loanProductData.getMinDifferentialLendingRate() );
        loanProductDataV1.setDefaultDifferentialLendingRate( loanProductData.getDefaultDifferentialLendingRate() );
        loanProductDataV1.setMaxDifferentialLendingRate( loanProductData.getMaxDifferentialLendingRate() );
        loanProductDataV1.setIsFloatingInterestRateCalculationAllowed( loanProductData.isIsFloatingInterestRateCalculationAllowed() );
        loanProductDataV1.setAllowVariableInstallments( loanProductData.isAllowVariableInstallments() );
        loanProductDataV1.setMinimumGap( loanProductData.getMinimumGap() );
        loanProductDataV1.setMaximumGap( loanProductData.getMaximumGap() );
        loanProductDataV1.setAmortizationType( enumOptionDataToEnumOptionDataV1( loanProductData.getAmortizationType() ) );
        loanProductDataV1.setInterestType( enumOptionDataToEnumOptionDataV1( loanProductData.getInterestType() ) );
        loanProductDataV1.setInterestCalculationPeriodType( enumOptionDataToEnumOptionDataV1( loanProductData.getInterestCalculationPeriodType() ) );
        loanProductDataV1.setAllowPartialPeriodInterestCalculation( loanProductData.getAllowPartialPeriodInterestCalculation() );
        loanProductDataV1.setInArrearsTolerance( loanProductData.getInArrearsTolerance() );
        loanProductDataV1.setTransactionProcessingStrategyCode( loanProductData.getTransactionProcessingStrategyCode() );
        loanProductDataV1.setTransactionProcessingStrategyName( loanProductData.getTransactionProcessingStrategyName() );
        loanProductDataV1.setGraceOnPrincipalPayment( loanProductData.getGraceOnPrincipalPayment() );
        loanProductDataV1.setRecurringMoratoriumOnPrincipalPeriods( loanProductData.getRecurringMoratoriumOnPrincipalPeriods() );
        loanProductDataV1.setGraceOnInterestPayment( loanProductData.getGraceOnInterestPayment() );
        loanProductDataV1.setGraceOnInterestCharged( loanProductData.getGraceOnInterestCharged() );
        loanProductDataV1.setGraceOnArrearsAgeing( loanProductData.getGraceOnArrearsAgeing() );
        loanProductDataV1.setOverdueDaysForNPA( loanProductData.getOverdueDaysForNPA() );
        loanProductDataV1.setDaysInMonthType( enumOptionDataToEnumOptionDataV1( loanProductData.getDaysInMonthType() ) );
        loanProductDataV1.setDaysInYearType( enumOptionDataToEnumOptionDataV1( loanProductData.getDaysInYearType() ) );
        loanProductDataV1.setIsInterestRecalculationEnabled( loanProductData.isIsInterestRecalculationEnabled() );
        loanProductDataV1.setInterestRecalculationData( loanProductInterestRecalculationDataToLoanProductInterestRecalculationDataV1( loanProductData.getInterestRecalculationData() ) );
        loanProductDataV1.setMinimumDaysBetweenDisbursalAndFirstRepayment( loanProductData.getMinimumDaysBetweenDisbursalAndFirstRepayment() );
        loanProductDataV1.setCanDefineInstallmentAmount( loanProductData.isCanDefineInstallmentAmount() );
        loanProductDataV1.setInstallmentAmountInMultiplesOf( loanProductData.getInstallmentAmountInMultiplesOf() );
        loanProductDataV1.setCharges( chargeDataCollectionToChargeDataV1List( loanProductData.getCharges() ) );
        loanProductDataV1.setPrincipalVariationsForBorrowerCycle( loanProductBorrowerCycleVariationDataCollectionToLoanProductBorrowerCycleVariationDataV1List( loanProductData.getPrincipalVariationsForBorrowerCycle() ) );
        loanProductDataV1.setInterestRateVariationsForBorrowerCycle( loanProductBorrowerCycleVariationDataCollectionToLoanProductBorrowerCycleVariationDataV1List( loanProductData.getInterestRateVariationsForBorrowerCycle() ) );
        loanProductDataV1.setNumberOfRepaymentVariationsForBorrowerCycle( loanProductBorrowerCycleVariationDataCollectionToLoanProductBorrowerCycleVariationDataV1List( loanProductData.getNumberOfRepaymentVariationsForBorrowerCycle() ) );
        loanProductDataV1.setIsRatesEnabled( loanProductData.isIsRatesEnabled() );
        loanProductDataV1.setRates( rateDataCollectionToRateDataV1List( loanProductData.getRates() ) );
        loanProductDataV1.setMultiDisburseLoan( loanProductData.getMultiDisburseLoan() );
        loanProductDataV1.setMaxTrancheCount( loanProductData.getMaxTrancheCount() );
        loanProductDataV1.setOutstandingLoanBalance( loanProductData.getOutstandingLoanBalance() );
        loanProductDataV1.setDisallowExpectedDisbursements( loanProductData.getDisallowExpectedDisbursements() );
        loanProductDataV1.setAllowApprovedDisbursedAmountsOverApplied( loanProductData.getAllowApprovedDisbursedAmountsOverApplied() );
        loanProductDataV1.setOverAppliedCalculationType( loanProductData.getOverAppliedCalculationType() );
        loanProductDataV1.setOverAppliedNumber( loanProductData.getOverAppliedNumber() );
        loanProductDataV1.setPrincipalThresholdForLastInstallment( loanProductData.getPrincipalThresholdForLastInstallment() );
        loanProductDataV1.setHoldGuaranteeFunds( loanProductData.getHoldGuaranteeFunds() );
        loanProductDataV1.setProductGuaranteeData( loanProductGuaranteeDataToLoanProductGuaranteeDataV1( loanProductData.getProductGuaranteeData() ) );
        loanProductDataV1.setAccountMovesOutOfNPAOnlyOnArrearsCompletion( loanProductData.getAccountMovesOutOfNPAOnlyOnArrearsCompletion() );
        loanProductDataV1.setSyncExpectedWithDisbursementDate( loanProductData.isSyncExpectedWithDisbursementDate() );
        loanProductDataV1.setIsEqualAmortization( loanProductData.isIsEqualAmortization() );
        loanProductDataV1.setFixedPrincipalPercentagePerInstallment( loanProductData.getFixedPrincipalPercentagePerInstallment() );
        loanProductDataV1.setDelinquencyBucket( delinquencyBucketDataToDelinquencyBucketDataV1( loanProductData.getDelinquencyBucket() ) );

        return loanProductDataV1;
    }

    protected LoanInterestRecalculationDataV1 loanInterestRecalculationDataToLoanInterestRecalculationDataV1(LoanInterestRecalculationData loanInterestRecalculationData) {
        if ( loanInterestRecalculationData == null ) {
            return null;
        }

        LoanInterestRecalculationDataV1 loanInterestRecalculationDataV1 = new LoanInterestRecalculationDataV1();

        if ( loanInterestRecalculationData.getId() != null ) {
            loanInterestRecalculationDataV1.setId( loanInterestRecalculationData.getId().intValue() );
        }
        loanInterestRecalculationDataV1.setLoanId( loanInterestRecalculationData.getLoanId() );
        loanInterestRecalculationDataV1.setInterestRecalculationCompoundingType( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getInterestRecalculationCompoundingType() ) );
        loanInterestRecalculationDataV1.setRescheduleStrategyType( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getRescheduleStrategyType() ) );
        loanInterestRecalculationDataV1.setCalendarData( calendarDataToCalendarDataV1( loanInterestRecalculationData.getCalendarData() ) );
        loanInterestRecalculationDataV1.setRecalculationRestFrequencyType( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getRecalculationRestFrequencyType() ) );
        loanInterestRecalculationDataV1.setRecalculationRestFrequencyInterval( loanInterestRecalculationData.getRecalculationRestFrequencyInterval() );
        loanInterestRecalculationDataV1.setRecalculationRestFrequencyNthDay( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getRecalculationRestFrequencyNthDay() ) );
        loanInterestRecalculationDataV1.setRecalculationRestFrequencyWeekday( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getRecalculationRestFrequencyWeekday() ) );
        loanInterestRecalculationDataV1.setRecalculationRestFrequencyOnDay( loanInterestRecalculationData.getRecalculationRestFrequencyOnDay() );
        loanInterestRecalculationDataV1.setRecalculationCompoundingFrequencyType( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getRecalculationCompoundingFrequencyType() ) );
        loanInterestRecalculationDataV1.setRecalculationCompoundingFrequencyInterval( loanInterestRecalculationData.getRecalculationCompoundingFrequencyInterval() );
        loanInterestRecalculationDataV1.setRecalculationCompoundingFrequencyNthDay( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getRecalculationCompoundingFrequencyNthDay() ) );
        loanInterestRecalculationDataV1.setRecalculationCompoundingFrequencyWeekday( enumOptionDataToEnumOptionDataV1( loanInterestRecalculationData.getRecalculationCompoundingFrequencyWeekday() ) );
        loanInterestRecalculationDataV1.setRecalculationCompoundingFrequencyOnDay( loanInterestRecalculationData.getRecalculationCompoundingFrequencyOnDay() );
        loanInterestRecalculationDataV1.setIsCompoundingToBePostedAsTransaction( loanInterestRecalculationData.getIsCompoundingToBePostedAsTransaction() );
        loanInterestRecalculationDataV1.setCompoundingCalendarData( calendarDataToCalendarDataV1( loanInterestRecalculationData.getCompoundingCalendarData() ) );
        loanInterestRecalculationDataV1.setAllowCompoundingOnEod( loanInterestRecalculationData.getAllowCompoundingOnEod() );

        return loanInterestRecalculationDataV1;
    }

    protected CollectionDataV1 collectionDataToCollectionDataV1(CollectionData collectionData) {
        if ( collectionData == null ) {
            return null;
        }

        CollectionDataV1 collectionDataV1 = new CollectionDataV1();

        collectionDataV1.setAvailableDisbursementAmount( collectionData.getAvailableDisbursementAmount() );
        if ( collectionData.getPastDueDays() != null ) {
            collectionDataV1.setPastDueDays( collectionData.getPastDueDays().intValue() );
        }
        collectionDataV1.setNextPaymentDueDate( avroDateTimeMapper.mapLocalDate( collectionData.getNextPaymentDueDate() ) );
        if ( collectionData.getDelinquentDays() != null ) {
            collectionDataV1.setDelinquentDays( collectionData.getDelinquentDays().intValue() );
        }
        collectionDataV1.setDelinquentDate( avroDateTimeMapper.mapLocalDate( collectionData.getDelinquentDate() ) );
        collectionDataV1.setDelinquentAmount( collectionData.getDelinquentAmount() );
        collectionDataV1.setLastPaymentDate( avroDateTimeMapper.mapLocalDate( collectionData.getLastPaymentDate() ) );
        collectionDataV1.setLastPaymentAmount( collectionData.getLastPaymentAmount() );
        collectionDataV1.setLastRepaymentDate( avroDateTimeMapper.mapLocalDate( collectionData.getLastRepaymentDate() ) );
        collectionDataV1.setLastRepaymentAmount( collectionData.getLastRepaymentAmount() );

        return collectionDataV1;
    }
}
