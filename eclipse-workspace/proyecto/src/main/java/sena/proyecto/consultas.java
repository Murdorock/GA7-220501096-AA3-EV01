package sena.proyecto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import antlr.collections.*;
//import org.hibernate.mapping.*;
import java.util.*;

public class consultas
{

    public static void main( String[] args )
    {
    	// Creación del EntityManagerFactory
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("control");
    	
    	// Creación del EntityManager
    	EntityManager em = emf.createEntityManager();
    	
    	// Inicio de la transacción
    	em.getTransaction().begin();
    	
    	// Consulta HQL para consultar un cliente por su IdClientes
    	Query consulta = em.createQuery("FROM clientes WHERE idClientes = :idClientes");
    	consulta.setParameter("idClientes", 3);
    	
    	List<clientes> resultlist = consulta.getResultList();

    	// Confirmación de la transacción
    	em.getTransaction().commit();
    	
    	// Cierre del EntityManager
    	em.close();
    	
    	// Cierre del EntityManagerFactory
    	emf.close();
    }
}
