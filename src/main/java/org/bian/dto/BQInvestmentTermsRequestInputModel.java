package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord;
import org.bian.dto.BQInvestmentTermsRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsRequestInputModel
 */
public class BQInvestmentTermsRequestInputModel   {
  private BQInvestmentTermsRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private String investmentTermsInstanceReference = null;

  private BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord = null;

  private Object investmentTermsRequestActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public BQInvestmentTermsRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(BQInvestmentTermsRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Managed Investment Portfolio Agreement instance 
   * @return managedInvestmentPortfolioAgreementInstanceReference
  **/

  public String getManagedInvestmentPortfolioAgreementInstanceReference() {
    return managedInvestmentPortfolioAgreementInstanceReference;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceReference(String managedInvestmentPortfolioAgreementInstanceReference) {
    this.managedInvestmentPortfolioAgreementInstanceReference = managedInvestmentPortfolioAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Investment Terms instance 
   * @return investmentTermsInstanceReference
  **/

  public String getInvestmentTermsInstanceReference() {
    return investmentTermsInstanceReference;
  }

  public void setInvestmentTermsInstanceReference(String investmentTermsInstanceReference) {
    this.investmentTermsInstanceReference = investmentTermsInstanceReference;
  }


  /**
   * Get investmentTermsInstanceRecord
   * @return investmentTermsInstanceRecord
  **/

  public BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord getInvestmentTermsInstanceRecord() {
    return investmentTermsInstanceRecord;
  }

  public void setInvestmentTermsInstanceRecord(BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord) {
    this.investmentTermsInstanceRecord = investmentTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return investmentTermsRequestActionTaskRecord
  **/

  public Object getInvestmentTermsRequestActionTaskRecord() {
    return investmentTermsRequestActionTaskRecord;
  }

  public void setInvestmentTermsRequestActionTaskRecord(Object investmentTermsRequestActionTaskRecord) {
    this.investmentTermsRequestActionTaskRecord = investmentTermsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRManagedInvestmentPortfolioAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

