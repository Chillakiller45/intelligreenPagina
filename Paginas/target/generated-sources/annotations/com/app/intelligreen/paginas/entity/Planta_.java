package com.app.intelligreen.paginas.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Planta.class)
public abstract class Planta_ {

	public static volatile SingularAttribute<Planta, Date> fechaAlta;
	public static volatile SingularAttribute<Planta, Usuarios> idUsuario;
	public static volatile SingularAttribute<Planta, String> nombrePlanta;
	public static volatile SingularAttribute<Planta, Integer> idPlanta;
	public static volatile SingularAttribute<Planta, Especie> idEspecie;

}

