package arreglos;

public class Texto {
	public static void main(String[] args) {
		String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit tortor nisl velit pretium aliquet habitant ligula feugiat, laoreet nulla et turpis posuere eget sociosqu hendrerit quisque nibh a blandit lacinia. Rhoncus convallis molestie tempor arcu enim nunc etiam vestibulum leo primis dictumst, ut mus tempus velit nostra egestas porta ad nec. Laoreet netus torquent porttitor bibendum tincidunt, nec aliquet nostra facilisi, risus odio in dictum. \r\n"
				+ " \r\n"
				+ "Platea integer sollicitudin phasellus vehicula torquent montes neque malesuada tortor fames, libero justo accumsan felis nullam senectus conubia aliquet non sed nisl, sagittis massa sociis odio cursus morbi iaculis euismod luctus. Potenti metus et magnis purus nullam sollicitudin cum pretium quam, senectus urna tellus volutpat netus mattis gravida nascetur, eleifend diam in imperdiet laoreet sem iaculis ridiculus. Augue class ligula laoreet cras orci habitasse, luctus hendrerit vivamus porttitor dignissim ad semper, lacus dictumst ante senectus etiam.";

		// System.out.println(texto.toLowerCase());
		String textoSepar = texto.toLowerCase();
		// System.out.println(textoSepar);

		int cont = 0, contE = 0, contVocal = 0, contCaract = 0;

		while (cont < textoSepar.length()) {

			if (textoSepar.charAt(cont) == 'a' || textoSepar.charAt(cont) == 'i' || textoSepar.charAt(cont) == 'o'
					|| textoSepar.charAt(cont) == 'u' || textoSepar.charAt(cont) == 'e') {

				if (textoSepar.charAt(cont) == 'e') {
					// System.out.println();
					contE++;
				}
				contVocal++;
			} else if (textoSepar.charAt(cont) == ' ' || textoSepar.charAt(cont) == ','
					    || textoSepar.charAt(cont) == '.') {

			} else {
				contCaract++;
			}

			cont++;
		}
		System.out.println("#Letras 'e': " + contE + " \n# Vocales: " + contVocal + "\n#Caracteres: " + contCaract);

//	------------------------------
		/*
		 * texto = texto.toLowerCase(); int contE=0; int contV=0; int contCons=0;
		 * //recorrer la totalidad del texto for (int i=0; i< texto.length(); i++) {
		 * if(texto.charAt(i)=='e') { contE++; contV++; }else if(texto.charAt(i)=='a' ||
		 * texto.charAt(i)=='i' || texto.charAt(i)=='o' || texto.charAt(i)=='u') {
		 * 
		 * contV++; }else if(texto.charAt(i)==',' || texto.charAt(i)==' ' ||
		 * texto.charAt(i)=='.' ) {
		 * 
		 * }else { contCons++; } }
		 * 
		 */

	}

}
