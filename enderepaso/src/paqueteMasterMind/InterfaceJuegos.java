package paqueteMasterMind;

public interface InterfaceJuegos {

	public abstract boolean visualizarSalida(boolean acertada, int i,
			String newParam);

	public abstract long modificarHeridos(int numRM, int numVM, int numAM,
			int numBM, int numNM, int numMM, int numGM, int numSM,
			int numRComb, int numVComb, int numAComb, int numBComb,
			int numNComb, int numMComb, int numGComb, int numSComb,
			int numRJugada, int numVJugada, int numAJugada, int numBJugada,
			int numNJugada, int numMJugada, int numGJugada, int numSJugada,
			long heridos, String newParam);

}