package LeerPaginaWeb;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LeerPaginaWeb {

    public String LeerPaginaUrl(String paginaUrl){
		URL url;
		String paginaString = "";
		try {
			url = new URL(paginaUrl);
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			InputStream es = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(es));
			StringBuffer sb = new StringBuffer();
			String line = null;
			while((line = br.readLine()) != null){
				sb.append(line + "\n");
				System.out.println(sb);
			}
			paginaString = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return paginaString;
	}

	// La información se escribe en el archivo
	public void writeStringToFile(String archivoRuta,String archivoSrt) throws IOException{
		File file = new File(archivoRuta);
		FileOutputStream fileout = new FileOutputStream(file);
		fileout.write(archivoSrt.getBytes());
		fileout.close();
	}

	// Generar página estática
	public void createStaticPage(String paginaUrl,String archivoRuta){
		String paginaStr = LeerPaginaUrl(paginaUrl);
		try {
			writeStringToFile(archivoRuta, paginaStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Prueba
	public static void main(String[] args) {
		LeerPaginaWeb demo = new LeerPaginaWeb();
		String pageUrl = "https://www.netflix.com/es/";
		String filePath = "Tema6/LeerPaginaWeb/db.text";
		try {
			demo.createStaticPage(pageUrl, filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}