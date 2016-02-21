/*
 * XML Type:  CT_ModifyVerifier
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML CT_ModifyVerifier(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public interface CTModifyVerifier extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTModifyVerifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctmodifyverifier3bb5type");
    
    /**
     * Gets the "cryptProviderType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv.Enum getCryptProviderType();
    
    /**
     * Gets (as xml) the "cryptProviderType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv xgetCryptProviderType();
    
    /**
     * Sets the "cryptProviderType" attribute
     */
    void setCryptProviderType(org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv.Enum cryptProviderType);
    
    /**
     * Sets (as xml) the "cryptProviderType" attribute
     */
    void xsetCryptProviderType(org.openxmlformats.schemas.presentationml.x2006.main.STCryptProv cryptProviderType);
    
    /**
     * Gets the "cryptAlgorithmClass" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass.Enum getCryptAlgorithmClass();
    
    /**
     * Gets (as xml) the "cryptAlgorithmClass" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass xgetCryptAlgorithmClass();
    
    /**
     * Sets the "cryptAlgorithmClass" attribute
     */
    void setCryptAlgorithmClass(org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass.Enum cryptAlgorithmClass);
    
    /**
     * Sets (as xml) the "cryptAlgorithmClass" attribute
     */
    void xsetCryptAlgorithmClass(org.openxmlformats.schemas.presentationml.x2006.main.STAlgClass cryptAlgorithmClass);
    
    /**
     * Gets the "cryptAlgorithmType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STAlgType.Enum getCryptAlgorithmType();
    
    /**
     * Gets (as xml) the "cryptAlgorithmType" attribute
     */
    org.openxmlformats.schemas.presentationml.x2006.main.STAlgType xgetCryptAlgorithmType();
    
    /**
     * Sets the "cryptAlgorithmType" attribute
     */
    void setCryptAlgorithmType(org.openxmlformats.schemas.presentationml.x2006.main.STAlgType.Enum cryptAlgorithmType);
    
    /**
     * Sets (as xml) the "cryptAlgorithmType" attribute
     */
    void xsetCryptAlgorithmType(org.openxmlformats.schemas.presentationml.x2006.main.STAlgType cryptAlgorithmType);
    
    /**
     * Gets the "cryptAlgorithmSid" attribute
     */
    long getCryptAlgorithmSid();
    
    /**
     * Gets (as xml) the "cryptAlgorithmSid" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCryptAlgorithmSid();
    
    /**
     * Sets the "cryptAlgorithmSid" attribute
     */
    void setCryptAlgorithmSid(long cryptAlgorithmSid);
    
    /**
     * Sets (as xml) the "cryptAlgorithmSid" attribute
     */
    void xsetCryptAlgorithmSid(org.apache.xmlbeans.XmlUnsignedInt cryptAlgorithmSid);
    
    /**
     * Gets the "spinCount" attribute
     */
    long getSpinCount();
    
    /**
     * Gets (as xml) the "spinCount" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetSpinCount();
    
    /**
     * Sets the "spinCount" attribute
     */
    void setSpinCount(long spinCount);
    
    /**
     * Sets (as xml) the "spinCount" attribute
     */
    void xsetSpinCount(org.apache.xmlbeans.XmlUnsignedInt spinCount);
    
    /**
     * Gets the "saltData" attribute
     */
    java.lang.String getSaltData();
    
    /**
     * Gets (as xml) the "saltData" attribute
     */
    org.apache.xmlbeans.XmlString xgetSaltData();
    
    /**
     * Sets the "saltData" attribute
     */
    void setSaltData(java.lang.String saltData);
    
    /**
     * Sets (as xml) the "saltData" attribute
     */
    void xsetSaltData(org.apache.xmlbeans.XmlString saltData);
    
    /**
     * Gets the "hashData" attribute
     */
    java.lang.String getHashData();
    
    /**
     * Gets (as xml) the "hashData" attribute
     */
    org.apache.xmlbeans.XmlString xgetHashData();
    
    /**
     * Sets the "hashData" attribute
     */
    void setHashData(java.lang.String hashData);
    
    /**
     * Sets (as xml) the "hashData" attribute
     */
    void xsetHashData(org.apache.xmlbeans.XmlString hashData);
    
    /**
     * Gets the "cryptProvider" attribute
     */
    java.lang.String getCryptProvider();
    
    /**
     * Gets (as xml) the "cryptProvider" attribute
     */
    org.apache.xmlbeans.XmlString xgetCryptProvider();
    
    /**
     * True if has "cryptProvider" attribute
     */
    boolean isSetCryptProvider();
    
    /**
     * Sets the "cryptProvider" attribute
     */
    void setCryptProvider(java.lang.String cryptProvider);
    
    /**
     * Sets (as xml) the "cryptProvider" attribute
     */
    void xsetCryptProvider(org.apache.xmlbeans.XmlString cryptProvider);
    
    /**
     * Unsets the "cryptProvider" attribute
     */
    void unsetCryptProvider();
    
    /**
     * Gets the "algIdExt" attribute
     */
    long getAlgIdExt();
    
    /**
     * Gets (as xml) the "algIdExt" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetAlgIdExt();
    
    /**
     * True if has "algIdExt" attribute
     */
    boolean isSetAlgIdExt();
    
    /**
     * Sets the "algIdExt" attribute
     */
    void setAlgIdExt(long algIdExt);
    
    /**
     * Sets (as xml) the "algIdExt" attribute
     */
    void xsetAlgIdExt(org.apache.xmlbeans.XmlUnsignedInt algIdExt);
    
    /**
     * Unsets the "algIdExt" attribute
     */
    void unsetAlgIdExt();
    
    /**
     * Gets the "algIdExtSource" attribute
     */
    java.lang.String getAlgIdExtSource();
    
    /**
     * Gets (as xml) the "algIdExtSource" attribute
     */
    org.apache.xmlbeans.XmlString xgetAlgIdExtSource();
    
    /**
     * True if has "algIdExtSource" attribute
     */
    boolean isSetAlgIdExtSource();
    
    /**
     * Sets the "algIdExtSource" attribute
     */
    void setAlgIdExtSource(java.lang.String algIdExtSource);
    
    /**
     * Sets (as xml) the "algIdExtSource" attribute
     */
    void xsetAlgIdExtSource(org.apache.xmlbeans.XmlString algIdExtSource);
    
    /**
     * Unsets the "algIdExtSource" attribute
     */
    void unsetAlgIdExtSource();
    
    /**
     * Gets the "cryptProviderTypeExt" attribute
     */
    long getCryptProviderTypeExt();
    
    /**
     * Gets (as xml) the "cryptProviderTypeExt" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCryptProviderTypeExt();
    
    /**
     * True if has "cryptProviderTypeExt" attribute
     */
    boolean isSetCryptProviderTypeExt();
    
    /**
     * Sets the "cryptProviderTypeExt" attribute
     */
    void setCryptProviderTypeExt(long cryptProviderTypeExt);
    
    /**
     * Sets (as xml) the "cryptProviderTypeExt" attribute
     */
    void xsetCryptProviderTypeExt(org.apache.xmlbeans.XmlUnsignedInt cryptProviderTypeExt);
    
    /**
     * Unsets the "cryptProviderTypeExt" attribute
     */
    void unsetCryptProviderTypeExt();
    
    /**
     * Gets the "cryptProviderTypeExtSource" attribute
     */
    java.lang.String getCryptProviderTypeExtSource();
    
    /**
     * Gets (as xml) the "cryptProviderTypeExtSource" attribute
     */
    org.apache.xmlbeans.XmlString xgetCryptProviderTypeExtSource();
    
    /**
     * True if has "cryptProviderTypeExtSource" attribute
     */
    boolean isSetCryptProviderTypeExtSource();
    
    /**
     * Sets the "cryptProviderTypeExtSource" attribute
     */
    void setCryptProviderTypeExtSource(java.lang.String cryptProviderTypeExtSource);
    
    /**
     * Sets (as xml) the "cryptProviderTypeExtSource" attribute
     */
    void xsetCryptProviderTypeExtSource(org.apache.xmlbeans.XmlString cryptProviderTypeExtSource);
    
    /**
     * Unsets the "cryptProviderTypeExtSource" attribute
     */
    void unsetCryptProviderTypeExtSource();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier newInstance() {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}