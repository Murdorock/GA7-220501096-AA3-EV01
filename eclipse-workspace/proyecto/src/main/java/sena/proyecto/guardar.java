package sena.proyecto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class guardar 
{
    public static void main( String[] args )
    {    	
    	// Creación del EntityManagerFactory
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("control");
    	
    	// Creación del EntityManager
    	EntityManager em = emf.createEntityManager();
    	
    	// Creación de un objeto cliente
    	clientes a = new clientes("15268745","alonso","rodriguez","alorod@ki.co","3025236895");
    	
    	// Inicio de la transacción
    	em.getTransaction().begin();
    	
    	// Persistencia del objeto cliente en la base de datos
    	em.persist(a);
    	
    	// Confirmación de la transacción
    	em.getTransaction().commit();
    	
    	// Cierre del EntityManager
    	em.close();
    	
    	// Cierre del EntityManagerFactory
    	emf.close();
    }
}
