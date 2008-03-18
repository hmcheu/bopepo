/*
 * Copyright 2007, JMatryx Group
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright 2007, Grupo JMatryx
 * 
 * Licenciado sob a licença da Apache, versão 2.0 (a “licença”); você não pode
 * usar este arquivo exceto na conformidade com a licença. Você pode obter uma
 * cópia da licença em
 * 
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">
 * http://www.apache.org/licenses/LICENSE-2.0 </a>
 * 
 * A menos que seja requerido pela aplicação da lei ou esteja de acordo com a
 * escrita, o software distribuído sob esta licença é distribuído “COMO É”
 * BASE,SEM AS GARANTIAS OU às CONDIÇÕES DO TIPO, expresso ou implicado. Veja a
 * licença para as permissões sobre a línguagem específica e limitações quando
 * sob licença.
 * 
 * 
 * Created at / Criado em : 17/03/2007 - 17:40:31
 * 
 */

package br.com.nordestefomento.jrimum.domkee.entity;

import java.util.Collection;

import br.com.nordestefomento.jrimum.domkee.ientity.IBanco;


// TODO Verificar a necessidade de se criar uma família de classes de
// ContaBancaria, uma para cada banco, e seus respectivos autenticadores.

/**
 * Entidade responsável pelo armazenamento de informações relacionadas à uma conta bancária. Esta classe fornece serviços para obtenção de dados de uma conta de forma diferenciada.
 * @author   Gabriel Guimarães
 * @author   <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author   Misael Barreto 
 * @author   Rômulo Augusto
 * @author   <a href="http://www.nordeste-fomento.com.br">Nordeste Fomento Mercantil</a>
 * @since   JMatryx 1.0
 * @version   1.0
 */
public class ContaBancaria {

	private static final long serialVersionUID = 3409504109013559999L;

	private IBanco banco;

	private Agencia agencia;
	
	private NumeroDaConta numeroDaConta;
	
	private Integer codigoDaCarteira  = 0;

	private Collection<Pessoa> titulares;
	
	public ContaBancaria() {}
	
	public ContaBancaria(IBanco banco) {
		
		this.banco = banco;
	}

	public Integer getCodigoDaCarteira() {
		return codigoDaCarteira;
	}

	public void setCodigoDaCarteira(Integer codigoDaCarteira) {
		this.codigoDaCarteira = codigoDaCarteira;
	}

	public IBanco getBanco() {
		return banco;
	}

	public void setBanco(IBanco banco) {
		this.banco = banco;
	}

	public Collection<Pessoa> getTitulares() {
		return titulares;
	}

	public void setTitulares(Collection<Pessoa> titulares) {
		this.titulares = titulares;
	}
	
	public void addTitular(Pessoa titular) {

	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public NumeroDaConta getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(NumeroDaConta numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
}
