class ChainedConstructor{
	private int someData;
	private String someString;

	//Default constructor
	public ChainedConstructor(){
		this.someData = 1337;
		this.someString = "I'm uber uber leet";
	}

	public ChainedConstructor(int someData){
		this.someData = someData;
	}

	public ChainedConstructor(int someData, String someString){
		this(someData);
		this.someString = someString;
	}

	public String dataLeak(){
		return this.someString + this.someData;
	}

	public int getSomeData(){
		return this.someData;
	}

	public void setSomeData(int someData){
		this.someData = someData;
	}

	public String getSomeString(){
		return this.someString;
	}

	public void setSomeString(String someString){
		this.someString = someString;
	}

	public static void main(String args[]){
		ChainedConstructor cc = new ChainedConstructor(123, "Data leak this!  ");
		System.out.println(cc.dataLeak());
	}
}
