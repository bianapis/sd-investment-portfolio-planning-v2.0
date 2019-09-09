package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord;
import org.bian.dto.BQInvestmentTermsRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsRequestOutputModel
 */
public class BQInvestmentTermsRequestOutputModel   {
  private BQInvestmentTermsRequestInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord = null;

  private String investmentTermsRequestActionTaskReference = null;

  private Object investmentTermsRequestActionTaskRecord = null;

  private String investmentTermsRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Investment Terms instance request service call 
   * @return investmentTermsRequestActionTaskReference
  **/

  public String getInvestmentTermsRequestActionTaskReference() {
    return investmentTermsRequestActionTaskReference;
  }

  public void setInvestmentTermsRequestActionTaskReference(String investmentTermsRequestActionTaskReference) {
    this.investmentTermsRequestActionTaskReference = investmentTermsRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Investment Terms service request record 
   * @return investmentTermsRequestRecordReference
  **/

  public String getInvestmentTermsRequestRecordReference() {
    return investmentTermsRequestRecordReference;
  }

  public void setInvestmentTermsRequestRecordReference(String investmentTermsRequestRecordReference) {
    this.investmentTermsRequestRecordReference = investmentTermsRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

