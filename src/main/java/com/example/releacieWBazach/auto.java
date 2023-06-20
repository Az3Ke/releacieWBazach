package com.example.releacieWBazach;
import javax.persistence.*;

@Entity
@Table(name="auto")
public class auto {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String model;
   private String rokprodukcji;
   private String przebieg;
   private String rejestracja;

   public auto(String model, String rokprodukcji, String przebieg, String rejestracja) {
       this.model = model;
       this.rokprodukcji = rokprodukcji;
       this.przebieg = przebieg;
       this.rejestracja = rejestracja;
   }

   public auto() {
   }

   public Integer getId() {
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public String getRokProdukcji() {
       return rokprodukcji;
   }

   public void setRokProdukcji(String rokprodukcji) {
       this.rokprodukcji = rokprodukcji;
   }

   public String getPrzebieg() {
       return przebieg;
   }

   public void setPrzebieg(String przebieg) {
       this.przebieg = przebieg;
   }

   public String getRejestracja() {
       return rejestracja;
   }

   public void setRejestracja(String rejestracja) {
       this.rejestracja = rejestracja;
   }

   @Override
   public String toString() {
       return "auto{" +
               "id=" + id +
               ", model='" + model + '\'' +
               ", rokprodukcji='" + rokprodukcji + '\'' +
               ", przebieg='" + przebieg + '\'' +
               ", rejestracja='" + rejestracja + '\'' +
               '}';
   }
}
