/*
 * openscim scim core
 * http://code.google.com/p/openscim/
 * Copyright (C) 2011 Matthew Crooke <matthewcrooke@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package openscim.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}openAttrs">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}include"/>
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}import"/>
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}redefine"/>
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation"/>
 *         &lt;/choice>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://www.w3.org/2001/XMLSchema}schemaTop"/>
 *           &lt;element ref="{http://www.w3.org/2001/XMLSchema}annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="finalDefault" type="{http://www.w3.org/2001/XMLSchema}fullDerivationSet" default="" />
 *       &lt;attribute name="blockDefault" type="{http://www.w3.org/2001/XMLSchema}blockSet" default="" />
 *       &lt;attribute name="attributeFormDefault" type="{http://www.w3.org/2001/XMLSchema}formChoice" default="unqualified" />
 *       &lt;attribute name="elementFormDefault" type="{http://www.w3.org/2001/XMLSchema}formChoice" default="unqualified" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "includeOrImportOrRedefine",
    "simpleTypeOrComplexTypeOrGroup"
})
@XmlRootElement(name = "schema")
public class Schema
    extends OpenAttrs
{

    @XmlElements({
        @XmlElement(name = "include", type = Include.class),
        @XmlElement(name = "redefine", type = Redefine.class),
        @XmlElement(name = "import", type = Import.class),
        @XmlElement(name = "annotation", type = Annotation.class)
    })
    protected List<OpenAttrs> includeOrImportOrRedefine;
    @XmlElements({
        @XmlElement(name = "element", type = TopLevelElement.class),
        @XmlElement(name = "complexType", type = TopLevelComplexType.class),
        @XmlElement(name = "annotation", type = Annotation.class),
        @XmlElement(name = "notation", type = Notation.class),
        @XmlElement(name = "attributeGroup", type = NamedAttributeGroup.class),
        @XmlElement(name = "attribute", type = TopLevelAttribute.class),
        @XmlElement(name = "group", type = NamedGroup.class),
        @XmlElement(name = "simpleType", type = TopLevelSimpleType.class)
    })
    protected List<OpenAttrs> simpleTypeOrComplexTypeOrGroup;
    @XmlAttribute(name = "targetNamespace")
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;
    @XmlAttribute(name = "finalDefault")
    @XmlSchemaType(name = "fullDerivationSet")
    protected List<String> finalDefault;
    @XmlAttribute(name = "blockDefault")
    @XmlSchemaType(name = "blockSet")
    protected List<String> blockDefault;
    @XmlAttribute(name = "attributeFormDefault")
    protected FormChoice attributeFormDefault;
    @XmlAttribute(name = "elementFormDefault")
    protected FormChoice elementFormDefault;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the includeOrImportOrRedefine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeOrImportOrRedefine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeOrImportOrRedefine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * {@link Redefine }
     * {@link Import }
     * {@link Annotation }
     * 
     * 
     */
    public List<OpenAttrs> getIncludeOrImportOrRedefine() {
        if (includeOrImportOrRedefine == null) {
            includeOrImportOrRedefine = new ArrayList<OpenAttrs>();
        }
        return this.includeOrImportOrRedefine;
    }

    /**
     * Gets the value of the simpleTypeOrComplexTypeOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleTypeOrComplexTypeOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleTypeOrComplexTypeOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopLevelElement }
     * {@link TopLevelComplexType }
     * {@link Annotation }
     * {@link Notation }
     * {@link NamedAttributeGroup }
     * {@link TopLevelAttribute }
     * {@link NamedGroup }
     * {@link TopLevelSimpleType }
     * 
     * 
     */
    public List<OpenAttrs> getSimpleTypeOrComplexTypeOrGroup() {
        if (simpleTypeOrComplexTypeOrGroup == null) {
            simpleTypeOrComplexTypeOrGroup = new ArrayList<OpenAttrs>();
        }
        return this.simpleTypeOrComplexTypeOrGroup;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the finalDefault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalDefault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFinalDefault() {
        if (finalDefault == null) {
            finalDefault = new ArrayList<String>();
        }
        return this.finalDefault;
    }

    /**
     * Gets the value of the blockDefault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockDefault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBlockDefault() {
        if (blockDefault == null) {
            blockDefault = new ArrayList<String>();
        }
        return this.blockDefault;
    }

    /**
     * Gets the value of the attributeFormDefault property.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getAttributeFormDefault() {
        if (attributeFormDefault == null) {
            return FormChoice.UNQUALIFIED;
        } else {
            return attributeFormDefault;
        }
    }

    /**
     * Sets the value of the attributeFormDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setAttributeFormDefault(FormChoice value) {
        this.attributeFormDefault = value;
    }

    /**
     * Gets the value of the elementFormDefault property.
     * 
     * @return
     *     possible object is
     *     {@link FormChoice }
     *     
     */
    public FormChoice getElementFormDefault() {
        if (elementFormDefault == null) {
            return FormChoice.UNQUALIFIED;
        } else {
            return elementFormDefault;
        }
    }

    /**
     * Sets the value of the elementFormDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormChoice }
     *     
     */
    public void setElementFormDefault(FormChoice value) {
        this.elementFormDefault = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
