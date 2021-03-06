/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.02 at 11:50:02 AM BST 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}orcid"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}credit-name" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "orcid", "creditName" })
@XmlRootElement(name = "delegate-summary")
public class DelegateSummary implements Serializable {

    @XmlElement(required = true)
    protected Orcid orcid;
    @XmlElement(name = "credit-name")
    protected CreditName creditName;

    public DelegateSummary() {
        super();
    }

    public DelegateSummary(Orcid orcid) {
        super();
        this.orcid = orcid;
    }

    /**
     * Gets the value of the orcid property.
     * 
     * @return
     *     possible object is
     *     {@link Orcid }
     *     
     */
    public Orcid getOrcid() {
        return orcid;
    }

    /**
     * Sets the value of the orcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orcid }
     *     
     */
    public void setOrcid(Orcid value) {
        this.orcid = value;
    }

    /**
     * Gets the value of the creditName property.
     * 
     * @return
     *     possible object is
     *     {@link CreditName }
     *     
     */
    public CreditName getCreditName() {
        return creditName;
    }

    /**
     * Sets the value of the creditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditName }
     *     
     */
    public void setCreditName(CreditName value) {
        this.creditName = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DelegateSummary)) {
            return false;
        }

        DelegateSummary that = (DelegateSummary) o;

        if (creditName != null ? !creditName.equals(that.creditName) : that.creditName != null) {
            return false;
        }
        if (orcid != null ? !orcid.equals(that.orcid) : that.orcid != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = orcid != null ? orcid.hashCode() : 0;
        result = 31 * result + (creditName != null ? creditName.hashCode() : 0);
        return result;
    }
}
