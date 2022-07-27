package it2.develhope.Angelo.crudrestapi.repositories;

import it2.develhope.Angelo.crudrestapi.entities.Product;
import it2.develhope.Angelo.crudrestapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//annoto @RepositoryRestResource
@RepositoryRestResource(path = "repo-products", //posso anche aggiungere una path
        collectionResourceDescription = @Description("This is a description"),//posso aggiungere una descrizione generale
        collectionResourceRel = "product", //nome del prodotto
        itemResourceDescription = @Description("Single item description")) //posso aggiungere una descrizione oggetto
public interface ProductRepository extends JpaRepository<Product, Long> {
}
