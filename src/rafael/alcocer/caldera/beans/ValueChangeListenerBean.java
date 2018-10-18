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

import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

/**
 * Esta clase puede ser @ManagedBean o @Named.
 * 
 * <h:commandButton value="Uno" actionListener="#{actionListenerBean.uno}" />
 * 
 * <h:commandButton value="Dos Tres Cuatro" actionListener=
 * "#{actionListenerBean.dos}">
 * <f:actionListener binding="#{actionListenerBean.tres()}" />
 * <f:actionListener binding="#{actionListenerBean.cuatro()}" />
 * </h:commandButton>
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@Named
public class ValueChangeListenerBean {

    private String text;
    private String text2;
    private String text3;
    private String text4;

    public void uno() {
	System.out.println("##### Uno...");
	System.out.println(
		"<h:selectOneMenu value=\"#{valueChangeListenerBean.text3}\" valueChangeListener=\"#{valueChangeListenerBean.uno}\" onchange=\"submit()\">");
    }

    public void dos(ValueChangeEvent event) {
	System.out.println("##### Dos...");
	System.out.println("<h:inputText value=\"#{valueChangeListenerBean.text4}\" valueChangeListener=\"#{valueChangeListenerBean.dos}\" onblur=\"submit()\">");
    }

    public void tres() {
	System.out.println("##### Tres...");
	System.out.println("<f:valueChangeListener binding=\"#{valueChangeListenerBean.tres()}\" />");
    }

    public void cuatro(String s) {
	System.out.println("##### Cuatro..." + s);
	System.out.println("<f:valueChangeListener binding=\"#{valueChangeListenerBean.cuatro('HOLA')}\" />");
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public String getText2() {
	return text2;
    }

    public void setText2(String text2) {
	this.text2 = text2;
    }

    public String getText3() {
	return text3;
    }

    public void setText3(String text3) {
	this.text3 = text3;
    }

    public String getText4() {
	return text4;
    }

    public void setText4(String text4) {
	this.text4 = text4;
    }
}
