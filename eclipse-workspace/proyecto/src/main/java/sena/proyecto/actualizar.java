package sena.proyecto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class actualizar
{
    public static void main( String[] args )
    {
    	// Creación del EntityManagerFactory
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("control");
    	
    	// Creación del EntityManager
    	EntityManager em = emf.createEntityManager();
    	
    	// Inicio de la transacción
    	em.getTransaction().begin();
    	
    	// Consulta HQL para actualizar cedula de un cliente por su IdClientes
    	String hql = "update clientes set Cedula = :nuevoValor where idClientes = :idClientes";
    	Query query = em.createQuery(hql);
    	query.setParameter("nuevoValor", 458965);
    	query.setParameter("idClientes", 11);
    	query.executeUpdate();
    	
    	// Confirmación de la transacción
    	em.getTransaction().commit();
    	
    	// Cierre del EntityManager
    	em.close();
    	
    	// Cierre del EntityManagerFactory
    	emf.close();
    }
}
