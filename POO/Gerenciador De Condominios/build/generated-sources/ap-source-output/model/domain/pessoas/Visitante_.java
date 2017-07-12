package model.domain.pessoas;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Visitante.class)
public abstract class Visitante_ extends model.domain.pessoas.Pessoa_ {

	public static volatile SingularAttribute<Visitante, Boolean> prestadorDeServico;
	public static volatile SingularAttribute<Visitante, Date> horaDeEntrada;
	public static volatile SingularAttribute<Visitante, Date> horaDeSaida;

}

