package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>, Comparator<Produto> {
  private String nome;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  private Long codigo;
  private Double preco;
  private Integer quantitade;

  @Override
  public String toString() {
    return "{" +
        " nome='" + getNome() + "'" +
        ", codigo='" + getCodigo() + "'" +
        ", preco='" + getPreco() + "'" +
        ", quantitade='" + getQuantitade() + "'" +
        "}";
  }

  public Produto(String nome, Long codigo, Double preco, Integer quantitade) {
    this.nome = nome;
    this.codigo = codigo;
    this.preco = preco;
    this.quantitade = quantitade;
  }

  public Produto() {
  }

  public Long getCodigo() {
    return this.codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public Double getPreco() {
    return this.preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public Integer getQuantitade() {
    return this.quantitade;
  }

  public void setQuantitade(Integer quantitade) {
    this.quantitade = quantitade;
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Produto))
      return false;
    Produto other = (Produto) obj;
    return Objects.equals(codigo, other.codigo);
  }

  @Override
  public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
  }

  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }

}
