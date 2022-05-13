package LeerPaginaWeb;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeerPaginaWeb {

    /*public String LeerPaginaUrl(String paginaUrl){
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
			e.printStackTrace();*/

    public static void main(String[] args) throws Exception {
        String content = extractContent("https://www.netflix.com/es/");
            showLinks(content);
        }
          
        private static String extractContent(String urlString) throws MalformedURLException, IOException {
            URL url = new URL(urlString);
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String content = "";
                String linea = br.readLine();
                while (null != linea) {
                   content += linea;
                   linea = br.readLine();
                }
                return content;
             }
          
        private static void showLinks(String content) {
            Pattern pattern = Pattern.compile("(?i)HREF\\s*=\\s*\"(.*?)\"");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }    
        }

        private static void descargarImagen() throws IOException{
            URL url = new URL("https://assets.nflxext.com/us/ffe/siteui/common/icons/nficon2016.png");
            InputStream in = new BufferedInputStream(url.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1!=(n=in.read(buf)))
            {
               out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();
            FileOutputStream fos = new FileOutputStream("Tema6/LeerPaginaWeb/Imagen.png");
            fos.write(response);
            fos.close();
        }
    }