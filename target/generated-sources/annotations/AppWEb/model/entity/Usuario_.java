package AppWEb.model.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Usuario.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Usuario_ {

	public static final String NICK_NAME = "nickName";
	public static final String ID_USUARIO = "idUsuario";
	public static final String NOMBRE = "nombre";

	
	/**
	 * @see AppWEb.model.entity.Usuario#nickName
	 **/
	public static volatile SingularAttribute<Usuario, String> nickName;
	
	/**
	 * @see AppWEb.model.entity.Usuario#idUsuario
	 **/
	public static volatile SingularAttribute<Usuario, Integer> idUsuario;
	
	/**
	 * @see AppWEb.model.entity.Usuario
	 **/
	public static volatile EntityType<Usuario> class_;
	
	/**
	 * @see AppWEb.model.entity.Usuario#nombre
	 **/
	public static volatile SingularAttribute<Usuario, String> nombre;

}

