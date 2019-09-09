package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord;
import org.bian.dto.BQInvestmentTermsUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsUpdateOutputModel
 */
public class BQInvestmentTermsUpdateOutputModel   {
  private BQInvestmentTermsUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord = null;

  private String investmentTermsUpdateActionTaskReference = null;

  private Object investmentTermsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return investmentTermsUpdateActionTaskReference
  **/

  public String getInvestmentTermsUpdateActionTaskReference() {
    return investmentTermsUpdateActionTaskReference;
  }

  public void setInvestmentTermsUpdateActionTaskReference(String investmentTermsUpdateActionTaskReference) {
    this.investmentTermsUpdateActionTaskReference = investmentTermsUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

