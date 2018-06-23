

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestImmutable {
	public static void main(String[] args) {
		Company c=new Company(105, "Sony");
		
		final ArrayList<Integer> intOflist=new ArrayList<>(Arrays.asList(65,12,89,56,23));
		//intOflist.size(45);
		final Laptop lap1=new Laptop(102, "normal", 35000, c,intOflist);
		Laptop l2=new Laptop(12, "hsb", 586123, c, intOflist);
	
		System.out.println(lap1);
	}

}
