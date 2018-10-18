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
package rafael.alcocer.caldera.listeners;

import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.inject.Named;

/**
 * Declarando este Listener como @ManagedBean o @Named funciona para
 * <f:valueChangeListener binding="#{...}" />
 * 
 * <h:inputText value="#{valueChangeListenerBean.text}" onkeyup="submit()">
 *     <f:valueChangeListener binding="#{myValueChangeListener2}" />
 * </h:inputText>
 * 
 * Si no se incluye la anotacion @ManagedBean o @Named no funciona para
 * <f:valueChangeListener binding="#{...}" />
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@Named
public class MyValueChangeListener2 implements ValueChangeListener {

    public void processValueChange(ValueChangeEvent event) {
	System.out.println("##### MyValueChangeListener2...");
	System.out.println("<f:valueChangeListener binding=\"#{myValueChangeListener2}\" />");
	System.out.println("##### " + event.getNewValue());
    }
}
