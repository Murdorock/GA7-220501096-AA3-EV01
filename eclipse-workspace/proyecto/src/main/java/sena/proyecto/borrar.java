package sena.proyecto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class borrar 
{
    public static void main( String[] args )
    {
    	// Creación del EntityManagerFactory
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("control");
    	
    	// Creación del EntityManager
    	EntityManager em = emf.createEntityManager();
    	
    	// Inicio de la transacción
    	em.getTransaction().begin();
    	
    	// Consulta HQL para eliminar un cliente por su IdClientes
    	String hql = "delete from clientes where IdClientes = :IdClientes";
    	Query query = em.createQuery(hql);
    	query.setParameter("IdClientes", 17);
    	query.executeUpdate();
    	
    	// Confirmación de la transacción
    	em.getTransaction().commit();
    	
    	// Cierre del EntityManager
    	em.close();
    	
    	// Cierre del EntityManagerFactory
    	emf.close();
    }
}
