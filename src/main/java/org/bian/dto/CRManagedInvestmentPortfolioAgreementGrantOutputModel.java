package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementGrantOutputModel
 */
public class CRManagedInvestmentPortfolioAgreementGrantOutputModel   {
  private String managedInvestmentPortfolioAgreementGrantActionTaskReference = null;

  private Object managedInvestmentPortfolioAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRManagedInvestmentPortfolioAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Agreement instance grant service call 
   * @return managedInvestmentPortfolioAgreementGrantActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAgreementGrantActionTaskReference() {
    return managedInvestmentPortfolioAgreementGrantActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAgreementGrantActionTaskReference(String managedInvestmentPortfolioAgreementGrantActionTaskReference) {
    this.managedInvestmentPortfolioAgreementGrantActionTaskReference = managedInvestmentPortfolioAgreementGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementGrantActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementGrantActionTaskRecord() {
    return managedInvestmentPortfolioAgreementGrantActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementGrantActionTaskRecord(Object managedInvestmentPortfolioAgreementGrantActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementGrantActionTaskRecord = managedInvestmentPortfolioAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRManagedInvestmentPortfolioAgreementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRManagedInvestmentPortfolioAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

