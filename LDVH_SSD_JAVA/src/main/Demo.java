package main;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import ldvh.livre.GestionLivre;
import ldvh.livre.Objet;
import ldvh.livre.Section;

public class Demo {
	public static void main(String[] args) {
		int entree = 0;
		Scanner readedValue = null;
		ArrayList<GestionLivre> livres = new ArrayList<>();
		while(true) {
			if(entree == 0) {
				System.out.println("__________MENU__________");
				System.out.println("Ouvrir livre           1");
				System.out.println("Creer nouveau livre    2");
				System.out.println("Importer livre         3");
				System.out.println("Supprimer livre        4");
				System.out.println("Quitter                5");
				
				readedValue = new Scanner(System.in);
				int value = readedValue.nextInt();
				readedValue = null;
				if(value != 0 && value != 1 && value != 2 && value != 3 && value != 4 && value != 5 ) {
					System.out.println("Choisissez 1, 2, 3, 4 ou 5...");
					entree = 0;
				}
				else if (value == 5) {
					System.out.println("Au revoir !");
					break;
				}
				else
					entree = value;
			}
			else if(entree == 1) {
				while(true) {
					GestionLivre livreOuvert = null;
					System.out.println("__________LIVRES__________");
					System.out.println("Retour vers le menu      0");
					int i = 1;
					for(GestionLivre livre : livres) {
						System.out.println(livre.getLivre().getTitre()+"    "+i);
						i++;
					}
					readedValue = new Scanner(System.in);
					int value = readedValue.nextInt();
					if(value > i)
						System.out.println("Choisissez un nombre valide..");
					else if(value == 0) {
						entree = 0;
						break;
					}
					else {
						livreOuvert = livres.get(value-1);
						while(true) {
							System.out.println("____"+livreOuvert.getLivre().getTitre()+"____");
							System.out.println("Retour vers le menu des livres 0");
							System.out.println("Editer le titre du livre       1");
							System.out.println("Editer les auteurs du livre    2");
							System.out.println("Editer les objets du livre     3");
							System.out.println("Editer les sections            4");
							System.out.println("Visualiser le graphe           5");
							System.out.println("Generer version PDF            6");
							System.out.println("Generer version HTML           7");
							readedValue = new Scanner(System.in);
							int entreeLivre = readedValue.nextInt();
							if(entreeLivre > 7)
								System.out.println("Choisissez un nombre valide..");
							else if(entreeLivre == 0)
								break;
							else if(entreeLivre == 1) {
								System.out.println("Annuler                 0");
								System.out.println("Choisissez un nouveau titre pour votre livre...");
								Scanner scannerTitre = new Scanner(System.in);
								String newTitre = scannerTitre.nextLine();
								if(!newTitre.equals("0"))	
									livreOuvert.editTitreLivre(newTitre);
							}
							else if(entreeLivre == 2) {
								while(true) {
									System.out.println("Annuler                 0");
									System.out.println("Ajouter auteur          1");
									System.out.println("Supprimer auteur        2");
									Scanner scannerAuteur = new Scanner(System.in);
									int valueAuteur = scannerAuteur.nextInt();
									if(valueAuteur > 2)
										System.out.println("Choisisez un nombre valide...");
									else if (valueAuteur == 0)
										break;
									else if (valueAuteur == 1) {
										List<String> auteurs = livreOuvert.getLivre().getNomAuteur();
										System.out.println("Entrez le nom de l'auteur a ajouter...");
										Scanner scannerNomAuteur = new Scanner(System.in);
										String nomAuteur = scannerNomAuteur.nextLine();
										auteurs.add(nomAuteur);
										livreOuvert.editAuteursLivre(auteurs);
									}
									else {
										List<String> auteurs = livreOuvert.getLivre().getNomAuteur();
										System.out.println("Entrez le nom de l'auteur a supprimer...");
										Scanner scannerNomAuteur = new Scanner(System.in);
										String nomAuteur = scannerNomAuteur.nextLine();
										auteurs.remove(nomAuteur);
										livreOuvert.editAuteursLivre(auteurs);
									}
								}	
							}
							else if(entreeLivre == 3){
								while(true) {
									System.out.println("_______Edition des objets_______");
									System.out.println("Annuler                         0");
									System.out.println("Ajouter objet                   1");
									System.out.println("Editer un objet                 2");
									System.out.println("Supprimer objet                 3");
									System.out.println("Proprietes d'objet              4");
									Scanner scannerObjet = new Scanner(System.in);
									int valueObjet = scannerObjet.nextInt();
									if(valueObjet == 0)
										break;
									else if(valueObjet == 1) {
										System.out.println("Choisissez le nom de votre objet...");
										scannerObjet = new Scanner(System.in);
										String nomObjet = scannerObjet.nextLine();
										try {
											livreOuvert.addObjetsLivre(Arrays.asList(nomObjet));
										} catch (Exception e) {
											e.getMessage();
										}
									}
									else if(valueObjet == 2) {
										int cptObjet = 1;
										HashMap<Integer,Objet> hashObjet = new HashMap<>();
										for(Objet o : livreOuvert.getObjetsLivre().values()) {
											System.out.println(o.getNom()+"         "+cptObjet);
											hashObjet.put(cptObjet, o);
											cptObjet++;
										}
										int numObjet = -1;
										while(numObjet != 0) {
											System.out.println("Choisissez l'objet a modifier ou 0 pour annuler...");
											scannerObjet = new Scanner(System.in);
											numObjet = scannerObjet.nextInt();
											System.out.println("Choisissez le nouveau nom de l'objet...");
											scannerObjet = new Scanner(System.in);
											String nomObjet = scannerObjet.nextLine();
											livreOuvert.getObjetsLivre().get(hashObjet.get(numObjet).getNom()).setNom(nomObjet);
										}
									}
								}
							}
							else if(entreeLivre == 4) {
								while(true) {
									System.out.println("_______Edition des sections_______");
									System.out.println("Annuler                         0");
									System.out.println("Ajouter section                 1");
									System.out.println("Editer section                  2");
									System.out.println("Supprimer section               3");
									Scanner scannerSection = new Scanner(System.in);
									int valueSection = scannerSection.nextInt();
									if(valueSection > 3)
										System.out.println("Choisisez un nombre valide...");
									else if(valueSection == 0)
										break;
									else if(valueSection == 1) {
										System.out.println("Numéro de section...");
										scannerSection = new Scanner(System.in);
										int idSection = scannerSection.nextInt();
										System.out.println("Texte de la section...");
										scannerSection = new Scanner(System.in);
										String texte = scannerSection.nextLine();
										System.out.println("Choisissez les objets...");
										System.out.println("Fin ajout             0");
										int cptObjet = 1;
										HashMap<Integer,Objet> hashObjet = new HashMap<>();
										for(Objet o : livreOuvert.getObjetsLivre().values()) {
											System.out.println(o.getNom()+"         "+cptObjet);
											hashObjet.put(cptObjet, o);
											cptObjet++;
										}

										scannerSection = new Scanner(System.in);
										int valObjet = scannerSection.nextInt();
										List<String> objets = new ArrayList<String>();
										while(valObjet != 0) {
											scannerSection = new Scanner(System.in);
											valObjet = scannerSection.nextInt();
											objets.add(hashObjet.get(valObjet).getNom());
										}
										try {
											livreOuvert.addSection(idSection, texte, objets);
										} catch (Exception e) {
											e.getMessage();
										}
									}
									else if(valueSection == 2) {
										Section section = null;
										while(section == null) {
											System.out.println("Choissisez un numero de section..");
											scannerSection = new Scanner(System.in);
											int idSection = scannerSection.nextInt();
											section = livreOuvert.getSectionId(idSection);
										}
										while(true) {
											System.out.println("_______Edition de la section"+section.getNumero()+"_______");
											System.out.println("Annuler                         0");
											System.out.println("Visualiser la section           1");
											System.out.println("Modifier numero de la section   2");
											System.out.println("Modifier le texte de la section 3");
											System.out.println("Modifier la liste des objets    4");
											System.out.println("Editer les enchainements        5");
											scannerSection = new Scanner(System.in);
											int entreeSection = scannerSection.nextInt();
											if(entreeSection != 0 && entreeSection != 1 && entreeSection != 2 && entreeSection != 3 && entreeSection != 4 && entreeSection != 5 ) {
												System.out.println("Choissisez un numero valide..");
											}
											else if(entreeSection == 0){
												break;
											}
											else if(entreeSection == 1){
												System.out.println("Section : "+section.getNumero());
												System.out.println(section.getTexte());
												System.out.println("Objets de la section : ");
												for(Objet o : section.getObjetsSection().values())
													System.out.println(o.getNom());
											}
											else if(entreeSection == 2){
												System.out.println("Choissisez un nouveau numero pour votre section..");
												scannerSection = new Scanner(System.in);
												int newIdSection = scannerSection.nextInt();
												try {
													livreOuvert.editIdSection(section.getNumero(), newIdSection);
												} catch (Exception e) {
													e.getMessage();
												}
											}
											else if(entreeSection == 3){
												System.out.println("Choissisez un nouveau texte pour votre section..");
												scannerSection = new Scanner(System.in);
												String newText = scannerSection.nextLine();
												livreOuvert.editTextSection(section.getNumero(),newText);
											}
											else if(entreeSection == 4){
											}
											else if(entreeSection == 5){
											}
										}
									}else if(valueSection == 3) {
										Section section = null;
										while(section == null) {
											System.out.println("Choissisez un numero de section..");
											scannerSection = new Scanner(System.in);
											int idSection = scannerSection.nextInt();
											section = livreOuvert.getSectionId(idSection);
										}
										livreOuvert.deleteSection(section.getNumero());
									}
								}
								
								
							}
						}
					}
				}
			}
			else if(entree == 2) {
				GestionLivre newLivre = new GestionLivre();
				System.out.println("Donnez un titre à votre livre...");
				Scanner titreScanner = new Scanner(System.in);
				String titre = titreScanner.nextLine();
				newLivre.editTitreLivre(titre);
				livres.add(newLivre);
				entree = 0;
			}
		}
	}
}
