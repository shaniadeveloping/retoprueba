package reto3.interfaces;

import reto3.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceSupplements extends MongoRepository <Supplements, String>{
}
