package org.example.repository;

import org.example.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel,Long> {

    ItemModel findByNome(String nome);
}
