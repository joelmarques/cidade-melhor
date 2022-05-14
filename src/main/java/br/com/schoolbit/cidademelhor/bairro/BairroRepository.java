package br.com.schoolbit.cidademelhor.bairro;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends MongoRepository<BairroModel, String> {
}