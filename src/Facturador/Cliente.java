package Facturador;

public class Cliente {
	private String name;
	private Integer numberPhone;
	
	
	public Cliente(String name, Integer numberPhone) {
		this.name = name;
		this.numberPhone = numberPhone;
	}
	
	@Override
	public String toString() {
		return String.format("Cliente ", name,numberPhone);
	}
	
	public String name() {
		return name;
	}
	public Integer numberPhone() {
		return numberPhone;
	}

	public Integer getNumero() {
		return numberPhone;
	}
}
