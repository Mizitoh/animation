package model;

public class Complements implements Cloneable {
	private final String linha3;
	private final String linha4;
	
	public Complements(String linha3, String linha4) {
		super();
		this.linha3 = linha3;
		this.linha4 = linha4;
	}

	public String getLinha3() {
		return linha3;
	}

	public String getLinha4() {
		return linha4;
	}

	@Override
	public String toString() {
		return  linha3 + "\n" + linha4;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static class Builder {
		private String linha3;
		private String linha4;
		
		private Builder(String linha3, String linha4) {
			this.linha3 = linha3;
			this.linha4 = linha4;
		}
		
		public Builder withLinha3(String linha3) {
			this.linha3 = linha3;
			return this;
		}
		
		public Builder withLinha4(String linha4) {
			this.linha4 = linha4;
			return this;
		}
		
		public Complements now() {
			return new Complements(linha3, linha4);
		}
	}

}
