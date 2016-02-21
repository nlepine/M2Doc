/*
 * XML Type:  CT_DocPartGallery
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocPartGallery(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartGalleryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartGallery
{
    
    public CTDocPartGalleryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    
    
    /**
     * Gets the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery.Enum getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery.Enum val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setEnumValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocPartGallery)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
}