
package org.opentravel.ota._2003._05.aircommontypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies charges and/or penalties associated with making ticket changes after purchase.
 * 
 * <p>Java class for VoluntaryChangesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoluntaryChangesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Penalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
 *                 &lt;attribute name="PenaltyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DepartureStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Percentage" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="VolChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoluntaryChangesType", propOrder = {
    "penalty"
})
public class VoluntaryChangesType {

    @XmlElement(name = "Penalty")
    protected VoluntaryChangesType.Penalty penalty;
    @XmlAttribute(name = "VolChangeInd")
    protected Boolean volChangeInd;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link VoluntaryChangesType.Penalty }
     *     
     */
    public VoluntaryChangesType.Penalty getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoluntaryChangesType.Penalty }
     *     
     */
    public void setPenalty(VoluntaryChangesType.Penalty value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the volChangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolChangeInd() {
        return volChangeInd;
    }

    /**
     * Sets the value of the volChangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolChangeInd(Boolean value) {
        this.volChangeInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/CommonTypes}CurrencyAmountGroup"/>
     *       &lt;attribute name="PenaltyType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DepartureStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}Percentage" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Penalty {

        @XmlAttribute(name = "PenaltyType")
        protected String penaltyType;
        @XmlAttribute(name = "DepartureStatus")
        protected String departureStatus;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the penaltyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPenaltyType() {
            return penaltyType;
        }

        /**
         * Sets the value of the penaltyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPenaltyType(String value) {
            this.penaltyType = value;
        }

        /**
         * Gets the value of the departureStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureStatus() {
            return departureStatus;
        }

        /**
         * Sets the value of the departureStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureStatus(String value) {
            this.departureStatus = value;
        }

        /**
         * Gets the value of the percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * Sets the value of the percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

    }

}
