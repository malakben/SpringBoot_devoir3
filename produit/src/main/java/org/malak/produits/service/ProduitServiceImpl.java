package org.malak.produits.service;

import java.util.List;

import org.malak.produits.Repose.ProduitRepository;
import org.malak.produits.model.Categorie;
import org.malak.produits.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService{
	
	@Autowired //injection de setter ou de constructeur
	ProduitRepository produitRepository ;

	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);	
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
		}

	@Override
	public List<Produit> getAllProduits() {
	return produitRepository.findAll();
	}
	@Override
	public List<Produit> findByNomProduit(String nom) {
	return produitRepository.findByNomProduit(nom);
	}
	@Override
	public List<Produit> findByNomProduitContains(String nom) {
	return produitRepository.findByNomProduitContains(nom);
	}
	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return null;
   }

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		return produitRepository.findByCategorie(categorie);
	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		return produitRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
		return produitRepository.findByOrderByNomProduitAsc();
	}

	@Override
	public List<Produit> trierProduitsNomsPrix() {
		return produitRepository.trierProduitsNomsPrix();
	}
}