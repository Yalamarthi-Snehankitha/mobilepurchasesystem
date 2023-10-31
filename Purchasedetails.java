package anudip.MobilePurchaseSystem.entity;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//annotation to create table
@Entity
//annotation to give table name
@Table(name="Purchasedetails")
public class Purchasedetails
{
	//annotation for primary key
	@Id
	//annotation to generate automatic sequence
	@GeneratedValue(generator="sequence-generator",strategy=GenerationType.SEQUENCE)
	private int purchaseId;
	//annotation to give column name
	@Column(name="Customername")
	private String cname;
	private String mailId;
	private String phoneno;
	//gives current date and time
	private Date purchasedate=new Date();
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mobileId",referencedColumnName="mobileid")
	private Mobiles Mobiles;
	
	//getters and setters
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public Mobiles getMobiles() {
		return Mobiles;
	}
	public void setMobiles(Mobiles mobiles) {
		Mobiles = mobiles;
	}
	@Override
	public String toString() {
		return "Purchasedetails [purchaseId=" + purchaseId + ", cname=" + cname + ", mailId=" + mailId + ", phoneno="
				+ phoneno + ", purchasedate=" + purchasedate + "]";
	}
	
	
}
