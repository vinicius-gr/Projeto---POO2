package model.domain.pessoas;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ extends model.domain.pessoas.PessoaVinculada_ {

	public static volatile SingularAttribute<Funcionario, Date> horarioSaida;
	public static volatile SingularAttribute<Funcionario, Date> horarioEntrada;
	public static volatile SingularAttribute<Funcionario, String> setorDeServico;

}

