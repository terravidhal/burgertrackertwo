package com.dojo.burgertrackerone.burgertrackerone.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.burgertrackerone.burgertrackerone.models.Burger;



@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> { // pas besoin de l'implementer dns "Service" à  cause du extends
	
	//  cette méthode récupère tous les livres de la base de données 
    
    /*  les methodes qui renvoient un type precis(voir docu "CrudRepository"), n'ont
    pas besoin d'etre preciser explicitement , par contr celle(coe findAll();
     ci dessous) qui renvoie des objets 'iterables" on doit preciser quelle type d"objet 
     est dns l tableau' */
         List<Burger> findAll();
}
