package campeonato.modelo.padel;

import java.util.Objects;

import campeonato.modelo.base.ParticipanteAbstracto;

public class ParejaPadel extends ParticipanteAbstracto {
	private String nombreJugador1; 
	private String nombreJugadro2;
	
	public ParejaPadel() {
		super();
	}

	public ParejaPadel(String nombre) {
		super(nombre);
	}

	public ParejaPadel(String nombre, String nombreJugador1, String nombreJugadro2) {
		super(nombre);
		this.nombreJugador1 = nombreJugador1;
		this.nombreJugadro2 = nombreJugadro2;
	}



	public String getNombre() {
		return "%s (%s, %s)".formatted(nombre, nombreJugador1, nombreJugadro2);
	}

	public String getNombreJugador1() {
		return nombreJugador1;
	}

	public void setNombreJugador1(String nombreJugador1) {
		this.nombreJugador1 = nombreJugador1;
	}

	public String getNombreJugadro2() {
		return nombreJugadro2;
	}

	public void setNombreJugadro2(String nombreJugadro2) {
		this.nombreJugadro2 = nombreJugadro2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nombreJugador1, nombreJugadro2);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParejaPadel other = (ParejaPadel) obj;
		return Objects.equals(nombreJugador1, other.nombreJugador1)
				&& Objects.equals(nombreJugadro2, other.nombreJugadro2);
	}

	@Override
	public String toString() {
		return "ParejaPadel [nombreJugador1=" + nombreJugador1 + ", nombreJugadro2=" + nombreJugadro2 + "]";
	}
	
	
}
