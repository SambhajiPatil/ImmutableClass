

final public class Company {

	
	final private int copid;
	final private String copname;
	
	public Company(int copid, String copname) {
		super();
		this.copid = copid;
		this.copname = copname;
	}

	@Override
	public String toString() {
		return "Company [copid=" + copid + ", copname=" + copname + "]";
	}
	
	
	
}
