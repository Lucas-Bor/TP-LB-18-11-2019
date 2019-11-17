package org.ldv.sio;

public class Adresse {
  private String rue;
  private String ville;
  private String codePostal;

  public Adresse (String rue, String ville, String codePostal) {
    this.rue = rue;
    this.ville = ville;
    this.codePostal = codePostal;
  }

  public String getRue() {
    return rue;
  }

  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public String getCodePostal() {
    return codePostal;
  }

  public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
  }

  @Override
  public String toString() {
    return "Adresse {" +
            "rue ='" + rue + '\'' +
            ",ville ='" + ville + '\'' +
            ",code postal ='" + codePostal+ '\'' +
            '}';
  }
}
