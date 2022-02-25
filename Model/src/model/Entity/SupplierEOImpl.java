package model.Entity;

import java.util.Random;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 25 05:49:24 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SupplierEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SupplierId {
            public Object get(SupplierEOImpl obj) {
                return obj.getSupplierId();
            }

            public void put(SupplierEOImpl obj, Object value) {
                obj.setSupplierId((Number)value);
            }
        }
        ,
        SupplierName {
            public Object get(SupplierEOImpl obj) {
                return obj.getSupplierName();
            }

            public void put(SupplierEOImpl obj, Object value) {
                obj.setSupplierName((String)value);
            }
        }
        ,
        Address {
            public Object get(SupplierEOImpl obj) {
                return obj.getAddress();
            }

            public void put(SupplierEOImpl obj, Object value) {
                obj.setAddress((String)value);
            }
        }
        ,
        BranchId {
            public Object get(SupplierEOImpl obj) {
                return obj.getBranchId();
            }

            public void put(SupplierEOImpl obj, Object value) {
                obj.setBranchId((Number)value);
            }
        }
        ,
        ProductsEO {
            public Object get(SupplierEOImpl obj) {
                return obj.getProductsEO();
            }

            public void put(SupplierEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BranchesEO {
            public Object get(SupplierEOImpl obj) {
                return obj.getBranchesEO();
            }

            public void put(SupplierEOImpl obj, Object value) {
                obj.setBranchesEO((EntityImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SupplierEOImpl object);

        public abstract void put(SupplierEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int SUPPLIERID = AttributesEnum.SupplierId.index();
    public static final int SUPPLIERNAME = AttributesEnum.SupplierName.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int BRANCHID = AttributesEnum.BranchId.index();
    public static final int PRODUCTSEO = AttributesEnum.ProductsEO.index();
    public static final int BRANCHESEO = AttributesEnum.BranchesEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SupplierEOImpl() {
    }

    /**
     * Gets the attribute value for SupplierId, using the alias name SupplierId.
     * @return the SupplierId
     */
    public Number getSupplierId() {
        return (Number)getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierId.
     * @param value value to set the SupplierId
     */
    public void setSupplierId(Number value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for SupplierName, using the alias name SupplierName.
     * @return the SupplierName
     */
    public String getSupplierName() {
        return (String)getAttributeInternal(SUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierName.
     * @param value value to set the SupplierName
     */
    public void setSupplierName(String value) {
        setAttributeInternal(SUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for Address, using the alias name Address.
     * @return the Address
     */
    public String getAddress() {
        return (String)getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Address.
     * @param value value to set the Address
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for BranchId, using the alias name BranchId.
     * @return the BranchId
     */
    public Number getBranchId() {
        return (Number)getAttributeInternal(BRANCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchId.
     * @param value value to set the BranchId
     */
    public void setBranchId(Number value) {
        setAttributeInternal(BRANCHID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getProductsEO() {
        return (RowIterator)getAttributeInternal(PRODUCTSEO);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getBranchesEO() {
        return (EntityImpl)getAttributeInternal(BRANCHESEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setBranchesEO(EntityImpl value) {
        setAttributeInternal(BRANCHESEO, value);
    }

    /**
     * @param supplierId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number supplierId) {
        return new Key(new Object[]{supplierId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.Entity.SupplierEO");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        Random random = new Random();
                int x = random.nextInt(1000);
                Number num = new Number(x);
                this.setSupplierId(num);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation ==DML_INSERT){
                    SequenceImpl se = new SequenceImpl("SUP_SEQ",getDBTransaction());
                    this.setSupplierId(se.getSequenceNumber());
        }
        super.doDML(operation, e);
    }
}
