package org.malak.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.malak.produits.Repose.ProduitRepository;
import org.malak.produits.model.Categorie;
import org.malak.produits.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProduitApplicationTests {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit("PC de malak",3000.999,new Date());
	produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{
		Produit p = produitRepository.findById(9L).get();
		System.out.println(p);
	}

	@Test
	public void testUpdateProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);
		System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(1L);
	}
	@Test
	public void testFindAllProduitProduits()
	{
		List<Produit> prods =produitRepository.findAll();//recuperation des produits
		for (Produit p:prods)
			System.out.println(p);//affichage des produits 
	}
	
	@Test
	public void testFindProduitByNom()
	{
		List<Produit> prods= produitRepository.findByNomProduit("PC hp");
		for (Produit p:prods)
			System.out.println(p);
	}

	@Test
	public void testFindProduitByContains()
	{
		List<Produit> prods= produitRepository.findByNomProduitContains("P");
		for (Produit p:prods)
			System.out.println(p);
	}
	@Test
	public void testfindByNomPrix()
	{
	List<Produit> prods = produitRepository.findByNomPrix("imprimante", 500.0);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	List<Produit> prods = produitRepository.findByCategorie(cat);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void findByCategorieIdCat()
	{
	List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
	for (Produit p : prods)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}
}
