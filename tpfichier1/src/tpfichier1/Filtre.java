package tpfichier1;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter {
	private char lettre;
	public Filtre(char lettreDébut) {
	lettre = lettreDébut;
	}
	public boolean accept(File repFiltre, String nom) {
	
		String s=""+lettre;
		return nom.startsWith(s);
	}
	}
