package model.Entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 25 06:34:51 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustomersEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CustId {
            public Object get(CustomersEOImpl obj) {
                return obj.getCustId();
            }

            public void put(CustomersEOImpl obj, Object value) {
                obj.setCustId((Number)value);
            }
        }
        ,
        CustName {
            public Object get(CustomersEOImpl obj) {
                return obj.getCustName();
            }

            public void put(CustomersEOImpl obj, Object value) {
                obj.setCustName((String)value);
            }
        }
        ,
        Address {
            public Object get(CustomersEOImpl obj) {
                return obj.getAddress();
            }

            public void put(CustomersEOImpl obj, Object value) {
                obj.setAddress((String)value);
            }
        }
        ,
        CustPrdtEO {
            public Object get(CustomersEOImpl obj) {
                return obj.getCustPrdtEO();
            }

            public void put(CustomersEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrdersEO {
            public Object get(CustomersEOImpl obj) {
                return obj.getOrdersEO();
            }

            public void put(CustomersEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RecptsEO {
            public Object get(CustomersEOImpl obj) {
                return obj.getRecptsEO();
            }

            public void put(CustomersEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CustomersEOImpl object);

        public abstract void put(CustomersEOImpl object, Object value);

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
    public static final int CUSTID = AttributesEnum.CustId.index();
    public static final int CUSTNAME = AttributesEnum.CustName.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int CUSTPRDTEO = AttributesEnum.CustPrdtEO.index();
    public static final int ORDERSEO = AttributesEnum.OrdersEO.index();
    public static final int RECPTSEO = AttributesEnum.RecptsEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CustomersEOImpl() {
    }

    /**
     * Gets the attribute value for CustId, using the alias name CustId.
     * @return the CustId
     */
    public Number getCustId() {
        return (Number)getAttributeInternal(CUSTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustId.
     * @param value value to set the CustId
     */
    public void setCustId(Number value) {
        setAttributeInternal(CUSTID, value);
    }

    /**
     * Gets the attribute value for CustName, using the alias name CustName.
     * @return the CustName
     */
    public String getCustName() {
        return (String)getAttributeInternal(CUSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustName.
     * @param value value to set the CustName
     */
    public void setCustName(String value) {
        setAttributeInternal(CUSTNAME, value);
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
    public RowIterator getCustPrdtEO() {
        return (RowIterator)getAttributeInternal(CUSTPRDTEO);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getOrdersEO() {
        return (RowIterator)getAttributeInternal(ORDERSEO);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getRecptsEO() {
        return (RowIterator)getAttributeInternal(RECPTSEO);
    }

    /**
     * @param custId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number custId) {
        return new Key(new Object[]{custId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.Entity.CustomersEO");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
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
        super.doDML(operation, e);
    }
}
