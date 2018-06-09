class Constructor{
	private String textToOutput;

	public void setTextToOutput(String textToOutput){
		this.textToOutput = textToOutput;
	}

	public String getTextToOutput(){
		return this.textToOutput;
	}

	public void speak(){
		System.out.println(this.getTextToOutput());
	}

	public Constructor(){
		this.textToOutput = "Hello World!";
	}

	public Constructor(String textToOutput){
		this.textToOutput = textToOutput;
	}

	public static void main(String args[]){
		Constructor defaultConstructor = new Constructor();
		defaultConstructor.speak();
		Constructor custom = new Constructor("Custom output text");
		custom.speak();
	}

}
