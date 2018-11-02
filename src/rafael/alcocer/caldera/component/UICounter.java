/**
 * Copyright [2018] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.component;

import java.io.IOException;
import java.util.Map;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.convert.IntegerConverter;

@FacesComponent("CounterID")
public class UICounter extends UIInput {

    public UICounter() {
        setConverter(new IntegerConverter());
        setRendererType(null);
    }

    public void encodeBegin(FacesContext fc) throws IOException {
        ResponseWriter writer = fc.getResponseWriter();

        // <input type="submit" name="..." value="-" />
        writer.startElement("input", this);
        writer.writeAttribute("type", "submit", null);
        writer.writeAttribute("name", getClientId(fc) + '-', null);
        writer.writeAttribute("value", "-", "value");
        writer.endElement("input");

        // <input type="text" name="..." value="current value" size="2" />
        writer.startElement("input", this);
        writer.writeAttribute("type", "text", null);
        writer.writeAttribute("name", getClientId(fc), null);
        writer.writeAttribute("value", getValue(), "value");
        writer.writeAttribute("size", getAttributes().get("size"), "size");
        writer.endElement("input");

        // <input type="submit" name="..." value=+-" />
        writer.startElement("input", this);
        writer.writeAttribute("type", "submit", null);
        writer.writeAttribute("name", getClientId(fc) + '+', null);
        writer.writeAttribute("value", "+", "value");
        writer.endElement("input");
    }

    public void decode(FacesContext fc) {
        Map<String, String> params = fc.getExternalContext().getRequestParameterMap();

        int counter = 0;

        if (params.containsKey(getClientId() + '-')) {
            counter--;
        } else if (params.containsKey(getClientId() + '+')) {
            counter++;
        } else {
            counter = 0;
        }

        int submittedValue = Integer.parseInt((String) params.get(getClientId()));

        setSubmittedValue(submittedValue + counter);
    }
}
