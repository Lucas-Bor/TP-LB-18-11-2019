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
  public void setNom() {
    this.clientLivraison.setNom(this.clientLivraison.getNom().toUpperCase());
    assertEquals("nom", this.clientLivraison.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("prenom", this.c.getPrenom());
  }

  @Test
  public void setLivraison() {
    assertEquals(clientLivraison.getMivraison, this.clientLivraison.getDomicile());
  }

  @Test
  public void setDomicile() {
    assertEquals(clientLivraison.getDomicile, this.clientLivraison.getLivraison());
  }
}