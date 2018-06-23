

import java.util.ArrayList;

public class Laptop {
	

		final private  int lap_id;
		final  private String lap_model;
		final  private int lap_price;
		final private Company cop;
		final private ArrayList<Integer> intOflist;
		
		
		
	 public Laptop(int lap_id, String lap_model, int lap_price,Company cop,ArrayList<Integer> intOflist) {
		super();
		this.lap_id = lap_id;
		this.lap_model = lap_model;
		this.lap_price = lap_price;
		this.cop=cop;
		this.intOflist=intOflist;
	}

	 public static Laptop getInstance(int lap_id, String lap_model,int lap_price,Company cop,ArrayList<Integer> intOflist){
		 return new Laptop(lap_id,lap_model,lap_price,cop,intOflist);
		 
		// TODO Auto-generated constructor stub
	}
	
	public Company getCop() {
		return cop;
	}

	public ArrayList<Integer> getIntOflist() {
		//return intOflist;
		return new ArrayList<>(intOflist);
	}

	@Override
	public String toString() {
		return "Laptop [lap_id=" + lap_id + ", lap_model=" + lap_model + ", lap_price=" + lap_price + ",cop=" +cop + ", intOflist=" + intOflist + "]";
	}
	public int getLap_id() {
		return lap_id;
	} 
	
	public String getLap_model() {
		return lap_model;
	}
	
	public int getLap_price() {
		return lap_price;
	}
	
	

}
