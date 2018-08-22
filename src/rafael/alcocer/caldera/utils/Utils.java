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
package rafael.alcocer.caldera.utils;

import java.util.regex.Pattern;

import javax.faces.convert.ConverterException;

import rafael.alcocer.caldera.beans.CreditCard;
import rafael.alcocer.caldera.beans.CreditCard3;
import rafael.alcocer.caldera.beans.CreditCard4;

public class Utils {

    public static CreditCard getAsObject(String value) {
	if (Pattern.matches("[0-9]{16}", value)) {
	    return new CreditCard(value);
	} else if (Pattern.matches("[0-9]{4}[#][0-9]{4}[#][0-9]{4}[#][0-9]{4}", value)) {
	    return new CreditCard(value);
	} else {
	    throw new ConverterException("Formato de Tarjeta de Credito invalido");
	}
    }
    
    public static CreditCard3 getAsObject3(String value) {
	if (Pattern.matches("[0-9]{16}", value)) {
	    return new CreditCard3(value);
	} else if (Pattern.matches("[0-9]{4}[#][0-9]{4}[#][0-9]{4}[#][0-9]{4}", value)) {
	    return new CreditCard3(value);
	} else {
	    throw new ConverterException("Formato de Tarjeta de Credito invalido");
	}
    }
    
    public static CreditCard4 getAsObject4(String value) {
	if (Pattern.matches("[0-9]{16}", value)) {
	    return new CreditCard4(value);
	} else if (Pattern.matches("[0-9]{4}[#][0-9]{4}[#][0-9]{4}[#][0-9]{4}", value)) {
	    return new CreditCard4(value);
	} else {
	    throw new ConverterException("Formato de Tarjeta de Credito invalido");
	}
    }
    
    public static String getAsString(Object value) {
	String s = value.toString();
	StringBuilder builder = new StringBuilder(s);

	if (s.length() == 16) {
	    builder.insert(4, '-');
	    builder.insert(9, '-');
	    builder.insert(14, '-');
	} else if (s.length() == 19) {
	    builder.replace(4, 5, "-");
	    builder.replace(9, 10, "-");
	    builder.replace(14, 15, "-");
	}

	return builder.toString();
    }
}
