package model.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Feb 27 06:35:23 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProductsVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ProductsVOImpl() {
    }

    /**
     * Returns the variable value for PrdtId.
     * @return variable value for PrdtId
     */
    public String getPrdtId() {
        return (String)ensureVariableManager().getVariableValue("PrdtId");
    }

    /**
     * Sets <code>value</code> for variable PrdtId.
     * @param value value to bind as PrdtId
     */
    public void setPrdtId(String value) {
        ensureVariableManager().setVariableValue("PrdtId", value);
    }
}
