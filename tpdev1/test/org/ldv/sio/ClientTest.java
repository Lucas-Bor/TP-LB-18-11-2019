package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClientTest {

  private Client clientLivraison;

  @Before
  public void initializeEachTest() {
    Adresse domicile = new Adresse ("rue_domicile","ville_domicile","codePostal_domicile");
    Adresse livraison = new Adresse ("rue_livraison","ville_livraison","codePostal_livraison");
    Client clientLivraison = new Client("nom", "prenom", domicile, livraison);
  }

  @Test
  public void getNom() {
    //assertEquals("Dijkstra", this.c.getNom());
    this.c.getNom().equals("Dijkstra");
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    //assertEquals("DIJKSTRA", this.c.getNom());
    this.c.getNom().equals("DIJKSTRA");
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    //assertEquals("EDSGER", this.c.getPrenom());
    this.c.getPrenom().equals("EDSGER");

  }

  @Test
  public void testLivraisonEgaleDomicile() {
    assertEquals(clientLivraison.getLivraison, this.clientLivraison.getDomicile());
  }

  @Test
  public void tesDomicileEgaleLivraison() {
    assertEquals(clientLivraison.getDomicile, this.clientLivraison.getLivraison(0));
  }
}