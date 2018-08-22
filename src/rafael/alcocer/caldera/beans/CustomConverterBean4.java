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

/**
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@ManagedBean
public class CustomConverterBean4 {

    private CreditCard4 creditCard4 = new CreditCard4("");

    public CreditCard4 getCreditCard4() {
	return creditCard4;
    }

    public void setCreditCard4(CreditCard4 creditCard4) {
	this.creditCard4 = creditCard4;
    }

}
