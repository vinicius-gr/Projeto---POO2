package model.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reclamacao.class)
public abstract class Reclamacao_ {

	public static volatile SingularAttribute<Reclamacao, String> assunto;
	public static volatile SingularAttribute<Reclamacao, String> texto;
	public static volatile SingularAttribute<Reclamacao, Integer> codigo;
	public static volatile SingularAttribute<Reclamacao, String> respostaSindico;

}

