package model;

public class Stage implements Cloneable {
	private final String linha1;
	private final String linha2;
	private final Complements linha3;
	
	public Stage(String linha1, String linha2, Complements linha3) {
		super();
		this.linha1 = linha1;
		this.linha2 = linha2;
		this.linha3 = linha3;
	}

	public String getLinha1() {
		return linha1;
	}



	public String getLinha2() {
		return linha2;
	}



	public Complements getLinha3() {
		return linha3;
	}


	@Override
	public String toString() {
		return linha1 + "\n" + linha2 + "\n" + linha3;
	}
	
	@Override
	protected Stage clone() throws CloneNotSupportedException {
		Complements cloneAddlinha3 = (Complements) linha3.clone();
		return new Stage(linha1, linha2, cloneAddlinha3);
	}
	
	public Builder cloneBuilder() {
		return new Builder(linha1, linha2, linha3);
	}
	
	public static class Builder {
		private String linha1;
		private String linha2;
		private Complements linha3;
		
		private Builder(String linha1, String linha2, Complements linha3) {
			this.linha1 = linha1;
			this.linha2 = linha2;
			this.linha3 = linha3;
		}
		
		public Builder withLinha1(String linha1) {
			this.linha1 = linha1;
			return this;
		}
		
		public Builder withLinha2(String linha2) {
			this.linha2 = linha2;
			return this;
		}

		public Builder withLinha3(Complements linha3) {
			this.linha3 = linha3;
			return this;
		}
				
		public Stage now() {
			return new Stage(linha1, linha2, linha3);
		}
	}

}
