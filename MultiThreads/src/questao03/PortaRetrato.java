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

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
