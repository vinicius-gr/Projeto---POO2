package model.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Encomenda.class)
public abstract class Encomenda_ {

	public static volatile SingularAttribute<Encomenda, String> codigo;
	public static volatile SingularAttribute<Encomenda, String> endereco;
	public static volatile SingularAttribute<Encomenda, Boolean> entregue;
	public static volatile SingularAttribute<Encomenda, String> destinatario;

}

