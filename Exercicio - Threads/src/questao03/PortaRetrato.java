package questao03;

import java.io.File;

public class PortaRetrato implements Runnable
{
	private File diretorio;
	private FrameImagem frameImagem;
	private long tempo;

	public PortaRetrato(String imagensDir, long tempo) 
	{	this.diretorio = new File(imagensDir);
		this.tempo = tempo;
		this.frameImagem = new FrameImagem("Digital Portrait");
	}
	
	private File[] getArquivosImagens() 
	{	return diretorio.listFiles(new ImageFileFilter());
	}
	
	public void run () {
		while(true) {
			File[] arquivos = getArquivosImagens();
			for(int i = 0; i < arquivos.length;i++) {
				frameImagem.setImagem(arquivos[i]);
				try {
					Thread.sleep(this.tempo);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
