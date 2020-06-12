package pl.tomaszosuch.springangularhttp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomaszosuch.springangularhttp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
