/*
 * XML Type:  CT_ConnectorNonVisual
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTConnectorNonVisual
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ConnectorNonVisual(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTConnectorNonVisualImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTConnectorNonVisual
{
    
    public CTConnectorNonVisualImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CNVPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cNvPr");
    private static final javax.xml.namespace.QName CNVCXNSPPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cNvCxnSpPr");
    private static final javax.xml.namespace.QName NVPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvPr");
    
    
    /**
     * Gets the "cNvPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps getCNvPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(CNVPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cNvPr" element
     */
    public void setCNvPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps cNvPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().find_element_user(CNVPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(CNVPR$0);
            }
            target.set(cNvPr);
        }
    }
    
    /**
     * Appends and returns a new empty "cNvPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps addNewCNvPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps)get_store().add_element_user(CNVPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "cNvCxnSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties getCNvCxnSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties)get_store().find_element_user(CNVCXNSPPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cNvCxnSpPr" element
     */
    public void setCNvCxnSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties cNvCxnSpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties)get_store().find_element_user(CNVCXNSPPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties)get_store().add_element_user(CNVCXNSPPR$2);
            }
            target.set(cNvCxnSpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "cNvCxnSpPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties addNewCNvCxnSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties)get_store().add_element_user(CNVCXNSPPR$2);
            return target;
        }
    }
    
    /**
     * Gets the "nvPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps getNvPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps)get_store().find_element_user(NVPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nvPr" element
     */
    public void setNvPr(org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps nvPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps)get_store().find_element_user(NVPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps)get_store().add_element_user(NVPR$4);
            }
            target.set(nvPr);
        }
    }
    
    /**
     * Appends and returns a new empty "nvPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps addNewNvPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps)get_store().add_element_user(NVPR$4);
            return target;
        }
    }
}
