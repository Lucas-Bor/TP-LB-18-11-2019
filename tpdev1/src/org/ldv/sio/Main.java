package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Adresse domicile = new Adresse ("rue du clocher","Melun","77000");
    Adresse livraison = new Adresse ("rue du cinema","Marseille","13001");
    Adresse livraison2 = new Adresse ("rue du cimetière","Paris","75001");
    // AdresseEtendu etendu = new AdresseEtendu ("edsger@dijstra.org","https://fr.wikipedia.org/wiki/Edsger_Dijkstra");

    // Client clientDomicile = new Client("Dijkstra", "Kernighan", domicile);

    Client clientComplet = new Client("Dijkstra", "Kernighan", domicile, livraison, livraison2);
    
    System.out.println("nom = " + clientComplet.getNom() + "  rue = "+ clientComplet.getDomicile().getRue() + "  codePostal = " + clientComplet.getDomicile().getCodePostal() + "   ville = " + clientComplet.getDomicile().getVille()); 
    System.out.println("adresse de livraison numero 1 : rue = " + clientComplet.getLivraison(0).getRue() + ", codePostal = " + clientComplet.getLivraison(0).getCodePostal() + ", ville = " + clientComplet.getLivraison(0).getVille());
    System.out.println("adresse de livraison numero 2 : rue = " + clientComplet.getLivraison2(0).getRue() + ", codePostal = " + clientComplet.getLivraison2(0).getCodePostal() + ", ville = " + clientComplet.getLivraison2(0).getVille());
  }
}
