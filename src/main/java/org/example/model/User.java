package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user")// not required can be used when name are conflicting with sql terms
public class User extends BaseModel{

   private String name;
   private String email;

//   @ManyToOne
//   private Attribute attribute1;
//
//   @OneToMany(mappedBy = "otherAttributeName")
//   List<Attribute> attribute2;
//
//   @Enumerated(EnumType.ORDINAL)
//   private Attribute attribute3;
}
