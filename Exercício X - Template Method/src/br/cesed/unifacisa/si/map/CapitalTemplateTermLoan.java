package br.cesed.unifacisa.si.map;

public class CapitalTemplateTermLoan extends CapitalTemplate
{
	@Override
	public double capital(Loan loan) 
	{
		return loan.getCommitment() * capitalLoan(loan);
	}
}
