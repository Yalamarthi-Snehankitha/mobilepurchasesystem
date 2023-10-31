package anudip.MobilePurchaseSystem.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@NamedQueries(@NamedQuery(name="view",query="select mobile from Mobiles mobile"))
//annotation for creating table
@Entity
//annotation to give table name
@Table(name="Mobiles")
public class Mobiles 
{
	//annotation for primary key
	@Id
	private int mobileid;
	private String name;
	private int price;
	private int quantity;
	
	@OneToMany(mappedBy="Mobiles")
	private List<Purchasedetails> Purchasedetails;
	
	//getters and setters
	public long getMobileid() 
	{
		return mobileid;
	}
	public void setMobileid(int mobileid) 
	{
		this.mobileid = mobileid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Mobiles [mobileid=" + mobileid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
