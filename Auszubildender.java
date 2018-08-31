package datenbank;

import java.awt.Color;

import basis.Start;
import datenbankergänzung.Basisdatensatz;
import datenbankergänzung.Stammdaten;
import hilfe.Datum;

/**
 * Grundgerüst zum Verwalten eines Auszubildenden.
 * @author FMausbe
 */
public class Auszubildender extends Basisdatensatz{

	private String strNachname;
	private String strVorname;
	private Datum greBeginn;
	private Datum greEnde;
	private int intAusbildungsgang;
	private int intStudiengang;
	private int intSchwerpunkt1;
	private int intSchwerpunkt2;
	private Color colFarbe;
	
	/* ************************************************************************
	 * Konstruktoren
	 *************************************************************************/
	/**************************************************************************
	 * Großer Konstruktor.
	 * Konstruktor empfängt alle Daten.
	 * @param parIntId ID des Basisdatensatzes in der Tabelle
	 * @param parIntAngelegtvon AccountID des Anlegers
	 * @param parGreAngelegtam Datum des Anlegens
	 * @param parIntGeändertvon AccountID des letzten Änderers
	 * @param parGreGeändertam Datum des letzten Änderns
	 * @param parStrNachname Nachname des Auszubildenden
	 * @param parStrVorname Vorname des Auszubildenden
	 * @param parGreBeginn Beginn der Ausbildung
	 * @param parGreEnde Ende der Ausbildung
	 * @param parIntAusbildungsgang ID des Ausbildungsgangs
	 * @param parIntStudiengang ID des Studiengangs
	 * @param parIntSchwerpunkt1 ID des ersten Schwerpunkts
	 * @param parIntSchwerpunkt2 ID des zweiten Schwerpunkts
	 * @param parColFarbe Farbe des Auszubildenden
	 */
	public Auszubildender(int parIntId, int parIntAngelegtvon, Datum parGreAngelegtam, int parIntGeändertvon, Datum parGreGeändertam, String parStrNachname, String parStrVorname, Datum parGreBeginn, Datum parGreEnde, int parIntAusbildungsgang, int parIntStudiengang, int parIntSchwerpunkt1, int parIntSchwerpunkt2, Color parColFarbe) {
		super(parIntId, parIntAngelegtvon, parGreAngelegtam, parIntGeändertvon, parGreGeändertam);
	}
	public Auszubildender(int parIntId, String parStrNachname, String parStrVorname, Datum parGreBeginn, Datum parGreEnde, int parIntAusbildungsgang, int parIntStudiengang, int parIntSchwerpunkt1, int parIntSchwerpunkt2, Color parColFarbe) {
		setIntId(parIntId);
		setIntAngelegtvon(Start.cmd.getIntAccount());
		setGreAngelegtam(new Datum());
		setIntGeändertvon(Start.cmd.getIntAccount());
		setGreGeändertam(new Datum());
		setStrNachname(parStrNachname);
		setStrVorname(parStrVorname);
		setGreBeginn(parGreBeginn);
		setGreEnde(parGreEnde);
		setIntAusbildungsgang(parIntAusbildungsgang);
		setIntStudiengang(parIntStudiengang);
		setIntSchwerpunkt1(parIntSchwerpunkt1);
		setIntSchwerpunkt2(parIntSchwerpunkt2);
		setColFarbe(parColFarbe);
	}
	/**************************************************************************
	 * String Konstruktor.
	 * Empfängt die Daten über einen String, den er auseinander nimmt.
	 * Aufbau des Strings:
	 * ID;ErstelltVon;ErstelltAm;GeändertVon;GeändertAm;strNachname;strVorname;datBeginn;datEnde;intAusbildungsgang;intStudiengang;Schwerpunkt1;Schwerpunkt2;colFarbe
	 * @param parStrDatensatz Datensatz aus der entsprechenden csv-Datei.
	 */
	public Auszubildender(String parStrDatensatz){
		super();
		String[] strDatensatz = parStrDatensatz.split(";");
		setIntId(Integer.parseInt(strDatensatz[0]));
		setIntAngelegtvon(Integer.parseInt(strDatensatz[1]));
		setGreAngelegtam(new Datum(strDatensatz[2]));
		setIntGeändertvon(Integer.parseInt(strDatensatz[3]));
		setGreGeändertam(new Datum(strDatensatz[4]));
		setStrNachname(strDatensatz[5]);
		setStrVorname(strDatensatz[6]);
		setGreBeginn(new Datum(strDatensatz[7]));
		setGreEnde(new Datum(strDatensatz[8]));
		setIntAusbildungsgang(Integer.parseInt(strDatensatz[9]));
		setIntStudiengang(Integer.parseInt(strDatensatz[10]));
		setIntSchwerpunkt1(Integer.parseInt(strDatensatz[11]));
		setIntSchwerpunkt2(Integer.parseInt(strDatensatz[12]));
		setColFarbe(Color.decode(strDatensatz[13]));
	}
	/* ************************************************************************
	 * Direkte Setter
	 *************************************************************************/
	/**
	 * Einlesen des Nachnamens des Auszubildenden.
	 * @param parStrNachname Nachname des Auszubildenden
	 */
	public void setStrNachname(String parStrNachname) {
		this.strNachname = parStrNachname;
	}
	/**
	 * Einlesen des Vornamens des Auszubildenden.
	 * @param parStrVorname Vorname des Auszubildenden
	 */
	public void setStrVorname(String parStrVorname) {
		this.strVorname = parStrVorname;
	}
	/**
	 * Einlesen des Beginns der Ausbildung.
	 * @param parGreBeginn Beginn der Ausbildung
	 */
	public void setGreBeginn(Datum parGreBeginn) {
		this.greBeginn = parGreBeginn;
	}
	/**
	 * Einlesen des Endes der Ausbildung.
	 * @param parGreEnde Ende der Ausbildung
	 */
	public void setGreEnde(Datum parGreEnde) {
		this.greEnde = parGreEnde;
	}
	/**
	 * Einlesen der ID des Ausbildungsgangs.
	 * @param parIntAusbildungsgang ID des Ausbildungsgangs
	 */
	public void setIntAusbildungsgang(int parIntAusbildungsgang) {
		this.intAusbildungsgang = parIntAusbildungsgang;
	}
	/**
	 * Einlesen der ID des Studiengangs.
	 * @param parIntStudiengang ID des Studiengangs
	 */
	public void setIntStudiengang(int parIntStudiengang) {
		this.intStudiengang = parIntStudiengang;
	}
	/**
	 * Einlesen der ID des ersten Schwerpunkts.
	 * @param parIntSchwerpunkt1 ID des ersten Schwerpunkts
	 */
	public void setIntSchwerpunkt1(int parIntSchwerpunkt1) {
		this.intSchwerpunkt1 = parIntSchwerpunkt1;
	}
	/**
	 * Einlesen der ID des zweiten Schwerpunkts.
	 * @param parIntSchwerpunkt2 ID des zweiten Schwerpunkts
	 */
	public void setIntSchwerpunkt2(int parIntSchwerpunkt2) {
		this.intSchwerpunkt2 = parIntSchwerpunkt2;
	}
	/**
	 * Einlesen der Farbe des Auszubildenden.
	 * @param parColFarbe Farbe des Auszubildenden
	 */
	public void setColFarbe(Color parColFarbe) {
		this.colFarbe = parColFarbe;
	}

	
	/* ************************************************************************
	 * Direkte Getter
	 *************************************************************************/
	/**************************************************************************
	 * Ausgabe des Strings des Auszubildenden.
	 * @return Datenzeile in der csv-Datei
	 */
	public String getAsString() {
		return (getIntId() + ";"
				+ getIntAngelegtvon() + ";"
				+ getGreAngelegtam().getDatum() + ";"
				+ getIntGeändertvon() + ";"
				+ getGreGeändertam().getDatum() + ";"
				+ getStrNachname(null) + ";"
				+ getStrVorname(null) + ";"
				+ getGreBeginn().getDatum() + ";"
				+ getGreEnde().getDatum() + ";"
				+ getIntAusbildungsgang() + ";"
				+ getIntStudiengang() + ";"
				+ getIntSchwerpunkt1() + ";"
				+ getIntSchwerpunkt2() + ";"
				+ getColFarbe().getRGB() + "\n");
	}
	/**************************************************************************
	 * Ausgabe des Nachnamens des Auszubildenden. Wenn kein Nachname vorhanden ist, werden zwei Leerzeichen ausgegeben.
	 * @return Nachname des Auszubildenden
	 */
	public String getStrNachname() {
		if (strNachname.equals("-")) return "  ";
		if (strNachname.length() == 0) return "  ";
		if (strNachname.length() == 1) return strNachname + " ";
		return strNachname;
	}
	/**
	 * Ausgabe des Nachnamens des Auszubildenden. Wenn kein Nachname vorhanden ist, wird ein "-" ausgegeben.
	 * @return Nachname des Auszubildenden
	 */
	public String getStrNachname(Object parObjObjekt) {
		if (strNachname.length() == 0) return "-";
		return strNachname;
	}
	/**
	 * Ausgabe des Vornamens des Auszubildenden. Wenn kein Vorname vorhanden ist, wird ein Leerzeichen ausgegeben.
	 * @return Vorname des Auszubildenden
	 */
	public String getStrVorname() {
		if (strVorname.equals("-")) return " ";
		if (strVorname.length() == 0) return " ";
		return strVorname;
	}
	/**
	 * Ausgabe des Vornamens des Auszubildenden. Wenn kein Vorname vorhanden ist, wird ein "-" ausgegeben.
	 * @return Vorname des Auszubildenden
	 */
	public String getStrVorname(Object parObjObjekt) {
		if (strVorname.length() == 0) return "-";
		return strVorname;
	}
	/**
	 * Ausgabe des Beginns der Ausbildung.
	 * @return Beginn der Ausbildung
	 */
	public Datum getGreBeginn() {
		return greBeginn;
	}
	/**
	 * Ausgabe des Endes der Ausbildung.
	 * @return Ende der Ausbildung
	 */
	public Datum getGreEnde() {
		return greEnde;
	}
	/**
	 * Ausgabe der ID des Ausbildungsgangs.
	 * @return ID des Ausbildungsgangs
	 */
	public int getIntAusbildungsgang() {
		return intAusbildungsgang;
	}
	/**
	 * Ausgabe der ID des Studiengangs.
	 * @return ID des Studiengangs
	 */
	public int getIntStudiengang() {
		boolean bolVorhanden = false;
		for (Studiengang s: Stammdaten.getLisStudiengänge()){
			if (s.getIntId() == intStudiengang) bolVorhanden = true;
		}
		return ((bolVorhanden)? intStudiengang : 0);
	}
	/**
	 * Ausgabe der ID des ersten Schwerpunkts.
	 * @return ID des ersten Schwerpunkts
	 */
	public int getIntSchwerpunkt1() {
		boolean bolVorhanden = false;
		for (Schwerpunkt s: Stammdaten.getLisSchwerpunkte()){
			if (s.getIntId() == intSchwerpunkt1) bolVorhanden = true;
		}
		return ((bolVorhanden)? intSchwerpunkt1 : 0);
	}
	/**
	 * Ausgabe der ID des zweiten Schwerpunkts.
	 * @return ID des zweiten Schwerpunkts
	 */
	public int getIntSchwerpunkt2() {
		boolean bolVorhanden = false;
		for (Schwerpunkt s: Stammdaten.getLisSchwerpunkte()){
			if (s.getIntId() == intSchwerpunkt2) bolVorhanden = true;
		}
		return ((bolVorhanden)? intSchwerpunkt2 : 0);
	}
	/**
	 * Ausgabe der Farbe des Auszubildenden.
	 * @return Farbe des Auszubildenden
	 */
	public Color getColFarbe() {
		return colFarbe;
	}

	/* ************************************************************************
	 * Erweiterte Getter
	 *************************************************************************/
	/**************************************************************************
	 * Ausgabe der Bezeichnung des Ausbildungsgangs
	 * @return Bezeichnung des Ausbildungsgangs
	 */
	public String getStrAusbildungsgang(){
		for (Ausbildungsgang augAusbildungsgang: Stammdaten.getLisAusbildungsgänge()){
			if (augAusbildungsgang.getIntId() == getIntAusbildungsgang()) return augAusbildungsgang.getStrBezeichnung();
		}
		return "ID: " + String.valueOf(getIntAusbildungsgang());
	}
	/**************************************************************************
	 * Ausgabe der Bezeichnung des Studiengangs
	 * @return Bezeichnung des Studiengangs
	 */
	public String getStrStudiengang(){
		for (Studiengang stuStudiengang: Stammdaten.getLisStudiengänge()){
			if (stuStudiengang.getIntId() == getIntStudiengang()) return stuStudiengang.getStrBezeichnung();
		}
		return "ID: " + String.valueOf(getIntStudiengang());
	}
	/**************************************************************************
	 * Ausgabe der Bezeichnung des ersten Schwerpunktes
	 * @return Bezeichnung des ersten Schwerpunkts
	 */
	public String getStrSchwerpunkt1(){
		for (Schwerpunkt schSchwerpunkt: Stammdaten.getLisSchwerpunkte()){
			if (schSchwerpunkt.getIntId() == getIntSchwerpunkt1()) return schSchwerpunkt.getStrBezeichnung();
		}
		return "ID: " + String.valueOf(getIntSchwerpunkt1());
	}
	/**************************************************************************
	 * Ausgabe der Bezeichnung des zweiten Schwerpunktes
	 * @return Bezeichnung des zweiten Schwerpunkts
	 */
	public String getStrSchwerpunkt2(){
		for (Schwerpunkt schSchwerpunkt: Stammdaten.getLisSchwerpunkte()){
			if (schSchwerpunkt.getIntId() == getIntSchwerpunkt2()) return schSchwerpunkt.getStrBezeichnung();
		}
		return "ID: " + String.valueOf(getIntSchwerpunkt2());
	}
	
	public Auszubildender clone() throws CloneNotSupportedException{
		try {
			return (Auszubildender) super.clone();
		} catch (Exception e){
			return null;
		}
	}

}
