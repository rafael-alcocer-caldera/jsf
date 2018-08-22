/**
 * Copyright [2018] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import rafael.alcocer.caldera.beans.CreditCard4;
import rafael.alcocer.caldera.utils.Utils;

/**
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@FacesConverter(forClass = CreditCard4.class)
public class CustomConverter4 implements Converter {

    /**
     * Converts a string into an object of the desired type, throwing a
     * ConverterException if the conversion cannot be carried out. This method
     * is called when a string is submitted from the client, typically in a text
     * field.
     * 
     * Aqui convierto el String xxxxxxxxxxxxxxxx a Objeto xxxxxxxxxxxxxxxx
     * 
     * Aqui convierto el String xxxx#xxxx#xxxx#xxxx a Objeto xxxxxxxxxxxxxxxx
     */
    public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
	return Utils.getAsObject4(value);
    }

    /**
     * Converts an object into a string representation to be displayed in the
     * client interface.
     * 
     * Aqui convierto el Objeto xxxxxxxxxxxxxxxx a String xxxx-xxxx-xxxx-xxxx
     * 
     * Aqui convierto el Objeto xxxx#xxxx#xxxx#xxxx a String xxxx-xxxx-xxxx-xxxx
     */
    public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException {
	return Utils.getAsString(value);
    }
}
