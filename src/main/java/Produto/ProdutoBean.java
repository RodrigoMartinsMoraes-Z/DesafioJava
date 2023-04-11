package Produto;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Named
@ViewScoped
public class ProdutoBean {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private List<ProdutoEntity> entities;
    private ProdutoEntity entity;
    
    @PostConstruct
    public void init() {
        entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        entityManager = entityManagerFactory.createEntityManager();
        entities = findAllEntities();
        entity = new ProdutoEntity();
    }

    public void saveEntity() {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entity = new ProdutoEntity();
        entities = findAllEntities();
    }

    @SuppressWarnings("unchecked")
	public List<ProdutoEntity> findAllEntities() {
        Query query = entityManager.createQuery("SELECT e FROM ProdutoEntity e");
        return query.getResultList();
    }

    public List<ProdutoEntity> getEntities() {
        return entities;
    }

    public ProdutoEntity getEntity() {
        return entity;
    }

    public void setEntity(ProdutoEntity entity) {
        this.entity = entity;
    }
}
