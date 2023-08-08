package set.Pesquisa;

import java.util.Objects;

public class Contato {

  public Contato(String nome, Integer numero) {
    this.nome = nome;
    this.numero = numero;
  }

  private String nome;

  private Integer numero;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getNumero() {
    return this.numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "{" +
        " nome='" + getNome() + "'" +
        ", numero='" + getNumero() + "'" +
        "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Contato))
      return false;
    Contato other = (Contato) obj;
    return Objects.equals(nome, other.nome);
  }

}
