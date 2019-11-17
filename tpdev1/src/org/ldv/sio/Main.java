package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Adresse domicile = new Adresse ("rue du clocher","Melun","77000");
    Adresse livraison = new Adresse ("rue du cinema","Marseille","13001");
    Adresse livraison2 = new Adresse ("rue du cimetière","Paris","75001");
    AdresseEtendu etendu = new AdresseEtendu ("edsger@dijstra.org","https://fr.wikipedia.org/wiki/Edsger_Dijkstra");

    Client clientDomicile = new Client("nom", "prenom", domicile);

    System.out.println(clientDomicile.toString());

    Client clientLivraison = new Client("nom", "prenom", domicile, livraison, livraison2);

    System.out.println(clientLivraison.toString());

    Client clientComplet = new Client("nom", "prenom", domicile, livraison, livraison2, etendu);
    
    System.out.println(clientComplet.toString());
  }
}
