package br.com.blm.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.blm.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
