package model.Entity;

import java.util.Random;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 25 05:39:39 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PrdtRcptEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        PrdtRcptId {
            public Object get(PrdtRcptEOImpl obj) {
                return obj.getPrdtRcptId();
            }

            public void put(PrdtRcptEOImpl obj, Object value) {
                obj.setPrdtRcptId((Number)value);
            }
        }
        ,
        RcptId {
            public Object get(PrdtRcptEOImpl obj) {
                return obj.getRcptId();
            }

            public void put(PrdtRcptEOImpl obj, Object value) {
                obj.setRcptId((Number)value);
            }
        }
        ,
        PrdtId {
            public Object get(PrdtRcptEOImpl obj) {
                return obj.getPrdtId();
            }

            public void put(PrdtRcptEOImpl obj, Object value) {
                obj.setPrdtId((Number)value);
            }
        }
        ,
        ProductsEO {
            public Object get(PrdtRcptEOImpl obj) {
                return obj.getProductsEO();
            }

            public void put(PrdtRcptEOImpl obj, Object value) {
                obj.setProductsEO((EntityImpl)value);
            }
        }
        ,
        RecptsEO {
            public Object get(PrdtRcptEOImpl obj) {
                return obj.getRecptsEO();
            }

            public void put(PrdtRcptEOImpl obj, Object value) {
                obj.setRecptsEO((EntityImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PrdtRcptEOImpl object);

        public abstract void put(PrdtRcptEOImpl object, Object value);

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
    public static final int PRDTRCPTID = AttributesEnum.PrdtRcptId.index();
    public static final int RCPTID = AttributesEnum.RcptId.index();
    public static final int PRDTID = AttributesEnum.PrdtId.index();
    public static final int PRODUCTSEO = AttributesEnum.ProductsEO.index();
    public static final int RECPTSEO = AttributesEnum.RecptsEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PrdtRcptEOImpl() {
    }

    /**
     * Gets the attribute value for PrdtRcptId, using the alias name PrdtRcptId.
     * @return the PrdtRcptId
     */
    public Number getPrdtRcptId() {
        return (Number)getAttributeInternal(PRDTRCPTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrdtRcptId.
     * @param value value to set the PrdtRcptId
     */
    public void setPrdtRcptId(Number value) {
        setAttributeInternal(PRDTRCPTID, value);
    }

    /**
     * Gets the attribute value for RcptId, using the alias name RcptId.
     * @return the RcptId
     */
    public Number getRcptId() {
        return (Number)getAttributeInternal(RCPTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RcptId.
     * @param value value to set the RcptId
     */
    public void setRcptId(Number value) {
        setAttributeInternal(RCPTID, value);
    }

    /**
     * Gets the attribute value for PrdtId, using the alias name PrdtId.
     * @return the PrdtId
     */
    public Number getPrdtId() {
        return (Number)getAttributeInternal(PRDTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrdtId.
     * @param value value to set the PrdtId
     */
    public void setPrdtId(Number value) {
        setAttributeInternal(PRDTID, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getProductsEO() {
        return (EntityImpl)getAttributeInternal(PRODUCTSEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setProductsEO(EntityImpl value) {
        setAttributeInternal(PRODUCTSEO, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getRecptsEO() {
        return (EntityImpl)getAttributeInternal(RECPTSEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setRecptsEO(EntityImpl value) {
        setAttributeInternal(RECPTSEO, value);
    }

    /**
     * @param prdtRcptId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number prdtRcptId) {
        return new Key(new Object[]{prdtRcptId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.Entity.PrdtRcptEO");
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
        this.setPrdtRcptId(num);
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
                    SequenceImpl se = new SequenceImpl("PD_RCPT_SEQ",getDBTransaction());
                    this.setPrdtRcptId(se.getSequenceNumber());
        }
        super.doDML(operation, e);
    }
}