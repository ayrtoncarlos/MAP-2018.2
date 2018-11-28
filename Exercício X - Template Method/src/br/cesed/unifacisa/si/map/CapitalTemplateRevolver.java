package br.cesed.unifacisa.si.map;

public class CapitalTemplateRevolver extends CapitalTemplate
{
	@Override
	public double capital(Loan loan) 
	{
		return capitalLoan(loan) * loan.outstandingRiskAmount()
				+ (loan.unusedRiskAmount() * duration(loan) * unusedRiskFactor(loan));
	}

	private int unusedRiskFactor(Loan loan) 
	{
		return 0;
	}
}
