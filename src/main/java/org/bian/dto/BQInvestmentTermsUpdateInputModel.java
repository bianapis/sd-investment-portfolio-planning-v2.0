package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord;
import org.bian.dto.BQInvestmentTermsUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsUpdateInputModel
 */
public class BQInvestmentTermsUpdateInputModel   {
  private BQInvestmentTermsUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private String managedInvestmentPortfolioAgreementInstanceReference = null;

  private String investmentTermsInstanceReference = null;

  private BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord = null;

  private Object investmentTermsUpdateActionTaskRecord = null;

  private String investmentTermsUpdateActionRequest = null;


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public BQInvestmentTermsUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(BQInvestmentTermsUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return investmentTermsUpdateActionTaskRecord
  **/

  public Object getInvestmentTermsUpdateActionTaskRecord() {
    return investmentTermsUpdateActionTaskRecord;
  }

  public void setInvestmentTermsUpdateActionTaskRecord(Object investmentTermsUpdateActionTaskRecord) {
    this.investmentTermsUpdateActionTaskRecord = investmentTermsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return investmentTermsUpdateActionRequest
  **/

  public String getInvestmentTermsUpdateActionRequest() {
    return investmentTermsUpdateActionRequest;
  }

  public void setInvestmentTermsUpdateActionRequest(String investmentTermsUpdateActionRequest) {
    this.investmentTermsUpdateActionRequest = investmentTermsUpdateActionRequest;
  }


}

