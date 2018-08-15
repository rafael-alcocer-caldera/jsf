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
public class BookmarkBean {

    private String nombre;
    private String apellido;
    private String resultado;

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public String getResultado() {
	String n = "NOMBRE: " + this.nombre;
	String a = "APELLIDO: " + this.apellido;

	this.resultado = n + "  " + a;

	return resultado;

    }

}
