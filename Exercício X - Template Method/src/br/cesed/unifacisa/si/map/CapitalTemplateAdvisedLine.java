package br.cesed.unifacisa.si.map;

public class CapitalTemplateAdvisedLine extends CapitalTemplate
{
	@Override
	public double capital(Loan loan)
	{
		return loan.getCommitment() * capitalLoan(loan) * loan.getUnusedPercentage();
	}
}
