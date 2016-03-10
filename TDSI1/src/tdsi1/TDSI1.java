package tdsi1;

import PACKTDSI.Pessoa;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TDSI1 {

    public static void main(String[] args) {
        EntityManagerFactory factory
                = Persistence.createEntityManagerFactory("TDSI1PU");

        EntityManager manager = factory.createEntityManager();

        Pessoa x = new Pessoa();
        x.setId(1L);
        x.setNome("Teste DE INCLUSÃO DE DADOS");
        x.setRenda(BigDecimal.valueOf(1500));
        manager.getTransaction().begin();
        manager.persist(x);
        manager.getTransaction().commit();
        
        
        Pessoa xD = new Pessoa();
        xD.setId(2L);
        xD.setNome("PATRÃO");
        xD.setRenda(BigDecimal.valueOf(10000));
        manager.getTransaction().begin();
        manager.persist(xD);
        manager.persist(x);
        manager.getTransaction().commit();
        factory.close();
    }

}
