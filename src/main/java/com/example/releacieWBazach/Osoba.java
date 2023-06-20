package com.example.bazaDanych;
import javax.persistence.*;
@Entity
@Table(name="KsiazkaTelefoniczna")
public class Osoba {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String imie;
   private String nazwisko;
   @Column(name="numer", nullable=false)
   private String telefon;
   @Transient
   boolean  nowy;

   public Osoba(String imie, String nazwisko, String telefon, String email, String opis, boolean nowy) {
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.telefon = telefon;
       this.email = email;
       this.opis = opis;
       this.nowy = nowy;
   }

   public Osoba() {