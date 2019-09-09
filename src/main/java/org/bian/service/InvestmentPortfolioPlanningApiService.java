/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InvestmentPortfolioPlanningApiService {

	SDInvestmentPortfolioPlanningActivateOutputModel activate(SDInvestmentPortfolioPlanningActivateInputModel request);
	
	SDInvestmentPortfolioPlanningConfigureOutputModel configure(String sdReferenceId, SDInvestmentPortfolioPlanningConfigureInputModel request);
	
	CRManagedInvestmentPortfolioAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementControlInputModel request);
	
	CRManagedInvestmentPortfolioAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRManagedInvestmentPortfolioAgreementEvaluateInputModel request);
	
	BQInvestmentTermsEvaluateOutputModel evaluateInvestmentterms(String sdReferenceId, String crReferenceId, BQInvestmentTermsEvaluateInputModel request);
	
	CRManagedInvestmentPortfolioAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementExchangeInputModel request);
	
	SDInvestmentPortfolioPlanningFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentPortfolioPlanningFeedbackInputModel request);
	
	CRManagedInvestmentPortfolioAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementGrantInputModel request);
	
	BQInvestmentTermsRequestOutputModel requestInvestmentterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInvestmentTermsRequestInputModel request);
	
	CRManagedInvestmentPortfolioAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementRequestInputModel request);
	
	CRManagedInvestmentPortfolioAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQInvestmentTermsRetrieveOutputModel retrieveInvestmentterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDInvestmentPortfolioPlanningRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRManagedInvestmentPortfolioAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAgreementUpdateInputModel request);
	
	BQInvestmentTermsUpdateOutputModel updateInvestmentterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInvestmentTermsUpdateInputModel request);
	
}
