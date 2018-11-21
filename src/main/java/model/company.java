package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class company
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String name;
  @Column (name = "capital")
  Capital cap;
  String cEO;
  Adress adres;
  
  AccountList participants;

  
  
   
  company(int Id, String name, String cEO, AccountList participants, Adress adres)
  {
     
     this.id = Id;
     this.name = name;
     this.cEO = cEO;
     this.participants = participants;
     this.adres = adres;
     
    
     
  }
  
  
  public int getId()
  {
     return id;
  }

public String getName()
{
   return name;
}

public void setName(String name)
{
   this.name = name;
}

public Capital getCap()
{
   return cap;
}

public void setCap(Capital cap)
{
   this.cap = cap;
}

public AccountList getParticipants()
{
   return participants;
}

public void setParticipants(AccountList participants)
{
   this.participants = participants;
}

public String getcEO()
{
   return cEO;
}

public void setcEO(String cEO)
{
   this.cEO = cEO;
}

public Adress getAdres()
{
   return adres;
}

public void setAdres(Adress adres)
{
   this.adres = adres;
}


public boolean equals(Object obj)
{
   if (!(obj instanceof company))
   {
      return false;
   }

   company other = (company) obj;
   return name.equals(other.name) && adres.equals(other.adres);
         
         

}
  
  
  
  
   
   
}
