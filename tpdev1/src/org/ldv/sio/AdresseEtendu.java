package org.ldv.sio;

public class AdresseEtendu {
  private String email;
  private String url;

  public AdresseEtendu (String email, String url) {
    this.email = email;
    this.url = url;
  }

  public String getEmail() {
    return email;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "AdresseEtendu {" +
            "email ='" + email + '\'' +
            ",url ='" + url + '\'' +
            '}';
  }
}
