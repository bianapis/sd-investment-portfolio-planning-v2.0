package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAgreementUpdateOutputModel
 */
public class CRManagedInvestmentPortfolioAgreementUpdateOutputModel   {
  private CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord = null;

  private String managedInvestmentPortfolioAgreementUpdateActionTaskReference = null;

  private Object managedInvestmentPortfolioAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get managedInvestmentPortfolioAgreementInstanceRecord
   * @return managedInvestmentPortfolioAgreementInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord getManagedInvestmentPortfolioAgreementInstanceRecord() {
    return managedInvestmentPortfolioAgreementInstanceRecord;
  }

  public void setManagedInvestmentPortfolioAgreementInstanceRecord(CRManagedInvestmentPortfolioAgreementUpdateInputModelManagedInvestmentPortfolioAgreementInstanceRecord managedInvestmentPortfolioAgreementInstanceRecord) {
    this.managedInvestmentPortfolioAgreementInstanceRecord = managedInvestmentPortfolioAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return managedInvestmentPortfolioAgreementUpdateActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAgreementUpdateActionTaskReference() {
    return managedInvestmentPortfolioAgreementUpdateActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAgreementUpdateActionTaskReference(String managedInvestmentPortfolioAgreementUpdateActionTaskReference) {
    this.managedInvestmentPortfolioAgreementUpdateActionTaskReference = managedInvestmentPortfolioAgreementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return managedInvestmentPortfolioAgreementUpdateActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAgreementUpdateActionTaskRecord() {
    return managedInvestmentPortfolioAgreementUpdateActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAgreementUpdateActionTaskRecord(Object managedInvestmentPortfolioAgreementUpdateActionTaskRecord) {
    this.managedInvestmentPortfolioAgreementUpdateActionTaskRecord = managedInvestmentPortfolioAgreementUpdateActionTaskRecord;
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

