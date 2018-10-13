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
package rafael.alcocer.caldera.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

/**
 * Esta clase puede ser @ManagedBean o @Named.
 * 
 * <h:commandButton value="Uno" actionListener="#{actionListenerBean.uno}" />
 * 
 * <h:commandButton value="Dos Tres Cuatro" actionListener="#{actionListenerBean.dos}">
 *     <f:actionListener binding="#{actionListenerBean.tres()}" />
 *     <f:actionListener binding="#{actionListenerBean.cuatro()}" />
 * </h:commandButton>
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@ManagedBean
public class ActionListenerBean {

    public void uno() {
	System.out.println("##### Uno...");
	System.out.println("<h:commandButton value=\"Uno\" actionListener=\"#{actionListenerBean.uno}\" />");
    }

    public void dos(ActionEvent event) {
	System.out.println("##### Dos...");
	System.out.println("<h:commandButton value=\"Dos\" actionListener=\"#{actionListenerBean.dos}\">");
    }

    public void tres() {
	System.out.println("##### Tres...");
	System.out.println("<f:actionListener binding=\"#{actionListenerBean.tres}\" />");
    }

    public void cuatro(String s) {
	System.out.println("##### Cuatro..." + s);
	System.out.println("<f:actionListener binding=\"#{actionListenerBean.cuatro}\" />");
    }
}
