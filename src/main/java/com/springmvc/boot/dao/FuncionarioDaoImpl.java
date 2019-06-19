
package com.springmvc.boot.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.boot.domain.Funcionario;


@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
