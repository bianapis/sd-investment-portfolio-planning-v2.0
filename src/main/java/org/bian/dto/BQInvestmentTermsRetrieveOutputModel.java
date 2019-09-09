package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord;
import org.bian.dto.BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceAnalysis;
import org.bian.dto.BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceReport;
import org.bian.dto.BQInvestmentTermsRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInvestmentTermsRetrieveOutputModel
 */
public class BQInvestmentTermsRetrieveOutputModel   {
  private BQInvestmentTermsRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private BQInvestmentTermsEvaluateInputModelInvestmentTermsInstanceRecord investmentTermsInstanceRecord = null;

  private String investmentTermsRetrieveActionTaskReference = null;

  private Object investmentTermsRetrieveActionTaskRecord = null;

  private String investmentTermsRetrieveActionResponse = null;

  private BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceReport investmentTermsInstanceReport = null;

  private BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceAnalysis investmentTermsInstanceAnalysis = null;


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public BQInvestmentTermsRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(BQInvestmentTermsRetrieveOutputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Investment Terms instance retrieve service call 
   * @return investmentTermsRetrieveActionTaskReference
  **/

  public String getInvestmentTermsRetrieveActionTaskReference() {
    return investmentTermsRetrieveActionTaskReference;
  }

  public void setInvestmentTermsRetrieveActionTaskReference(String investmentTermsRetrieveActionTaskReference) {
    this.investmentTermsRetrieveActionTaskReference = investmentTermsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return investmentTermsRetrieveActionTaskRecord
  **/

  public Object getInvestmentTermsRetrieveActionTaskRecord() {
    return investmentTermsRetrieveActionTaskRecord;
  }

  public void setInvestmentTermsRetrieveActionTaskRecord(Object investmentTermsRetrieveActionTaskRecord) {
    this.investmentTermsRetrieveActionTaskRecord = investmentTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return investmentTermsRetrieveActionResponse
  **/

  public String getInvestmentTermsRetrieveActionResponse() {
    return investmentTermsRetrieveActionResponse;
  }

  public void setInvestmentTermsRetrieveActionResponse(String investmentTermsRetrieveActionResponse) {
    this.investmentTermsRetrieveActionResponse = investmentTermsRetrieveActionResponse;
  }


  /**
   * Get investmentTermsInstanceReport
   * @return investmentTermsInstanceReport
  **/

  public BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceReport getInvestmentTermsInstanceReport() {
    return investmentTermsInstanceReport;
  }

  public void setInvestmentTermsInstanceReport(BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceReport investmentTermsInstanceReport) {
    this.investmentTermsInstanceReport = investmentTermsInstanceReport;
  }


  /**
   * Get investmentTermsInstanceAnalysis
   * @return investmentTermsInstanceAnalysis
  **/

  public BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceAnalysis getInvestmentTermsInstanceAnalysis() {
    return investmentTermsInstanceAnalysis;
  }

  public void setInvestmentTermsInstanceAnalysis(BQInvestmentTermsRetrieveOutputModelInvestmentTermsInstanceAnalysis investmentTermsInstanceAnalysis) {
    this.investmentTermsInstanceAnalysis = investmentTermsInstanceAnalysis;
  }


}

