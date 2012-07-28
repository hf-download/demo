package org.hf;

public class PolicyImpl implements Policy {

  private Insured insured = null;

  public PolicyImpl() {
    this.insured = new InsuredImpl();
  }
  
  public Insured getInsured() {
    return this.insured;
  }

  public void setInsured(Insured insured) {
    this.insured = insured;
  }
}
