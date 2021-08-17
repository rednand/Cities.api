package com.github.rednand.cities.api.staties.entities;

import com.github.rednand.cities.api.countries.entities.Country;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;


@Entity(name = "State")
@Table(name = "estado")
/*@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})*/
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

  // 1st
  @Column(name = "pais")
  private Integer countryId;


    // 2nd - @ManyToOne
   /* @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;
*/
    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public State() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public List<Integer> getDdd() {
        return ddd;
    }
    public Country getCountry() {
        return country;
    }

  /*public Integer getCountryId() {
      return countryId;
  }*/
}