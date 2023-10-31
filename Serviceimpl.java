package anudip.MobilePurchaseSystem.service;

import java.util.List;

import anudip.MobilePurchaseSystem.dao.Daoimpl;
import anudip.MobilePurchaseSystem.entity.Mobiles;

public class Serviceimpl 
{
	Daoimpl dao=new Daoimpl();
	public void insertpurchasedetails()
	{
		dao.insertpurchasedetails();
	}
	public void insertmobile()
	{
		dao.insertmobile();
	}
	public void delete(int id)
	{
		dao.delete(id);
	}
	public void update(int id)
	{
		dao.update(id);
	}
	public void search()
	{
		dao.search();
	}
	public List<Mobiles> display()
	{
		return dao.display();
	}
}
