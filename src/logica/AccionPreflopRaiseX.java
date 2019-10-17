package logica;

import constantes.AccionEnum;

/**
 * Esta clase representa un RAISE preflop que haremos sobre otro raise,
 * por eso tendr� un atributo que ser� el multiplicador a aplicar al raise del villano.
 */
public class AccionPreflopRaiseX implements AccionPreflop {

	private double multiplicador;
	
	public AccionPreflopRaiseX(double multiplicador) {
		this.multiplicador = multiplicador;
	}

	public double getMultiplicador() {
		return multiplicador;
	}

	@Override
	public Accion getAccionFinal(double ciegaGrande, double tamanyoUltimoRaiseFichas, double ciegasEfectivas) {
		return new Accion(AccionEnum.RAISE, tamanyoUltimoRaiseFichas*multiplicador);
	}

	public String toString(){return "Rx"+multiplicador;}
}
