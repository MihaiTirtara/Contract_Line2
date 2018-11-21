package model;
import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class companyIban
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   company company;
   String Iban;
   ArrayList<companyIban> list;
   
   public companyIban(company company, String Iban)
   {
      this.company = company;
      this.Iban = Iban;
      
      list = new ArrayList<companyIban>();
      
   }
   
   public void addCompanyWithIban(companyIban comp)
   {
      list.add(comp);
   }

   public company getCompany()
   {
      return company;
   }

   public void setCompany(company company)
   {
      this.company = company;
   }

   public String getIban()
   {
      return Iban;
   }

   public void setIban(String iban)
   {
      Iban = iban;
   }

   public ArrayList<companyIban> getList()
   {
      return list;
   }

   public void setList(ArrayList<companyIban> list)
   {
      this.list = list;
   }
   
   
   
   
}
