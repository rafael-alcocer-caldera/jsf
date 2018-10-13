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

import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.inject.Named;

/**
 * Declarando este Listener como @ManagedBean o @Named funciona para
 * <f:actionListener binding="#{...}" />
 * 
 * <h:commandButton value="MyActionListener2 Named Bean with binding">
 *     <f:actionListener binding="#{myActionListener2}" /> 
 * </h:commandButton>
 * 
 * Si no se incluye la anotacion @ManagedBean o @Named no funciona para
 * <f:actionListener binding="#{...}" />
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@Named
public class MyActionListener2 implements ActionListener {

    public void processAction(ActionEvent event) {
	System.out.println("##### MyActionListener2...");
	System.out.println("<f:actionListener binding=\"#{myActionListener2}\" />");
    }
}
