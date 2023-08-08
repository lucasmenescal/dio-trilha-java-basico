package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

  private String nome;

  private Integer codigoConvite;

  public Convidado(String nome, Integer codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getCodigoConvite() {
    return this.codigoConvite;
  }

  public void setCodigoConvite(Integer codigoConvite) {
    this.codigoConvite = codigoConvite;
  }

  @Override
  public String toString() {
    return "{" +
        " nome='" + getNome() + "'" +
        ", codigoConvite='" + getCodigoConvite() + "'" +
        "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoConvite);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Convidado))
      return false;
    Convidado other = (Convidado) obj;
    return Objects.equals(codigoConvite, other.codigoConvite);
  }

}
