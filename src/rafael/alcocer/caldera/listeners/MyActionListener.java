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

/**
 * Declarando este Listener como @ManagedBean, @Named o sin ninguna anotacion,
 * funciona para <f:actionListener type="...">.
 * 
 * <h:commandButton value="MyActionListener with type">
 *     <f:actionListener type="rafael.alcocer.caldera.listeners.MyActionListener" />
 * </h:commandButton>
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
public class MyActionListener implements ActionListener {

    public void processAction(ActionEvent event) {
	System.out.println("##### MyActionListener...");
	System.out.println("<f:actionListener type=\"rafael.alcocer.caldera.listeners.MyActionListener\" />");
    }
}
